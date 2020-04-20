package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.networkStatus.NetworkLinkInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofnetworkStatus extends js.Object {
  /* networkStatus events */
  /** Fired when the network connection state changes. */
  val onConnectionChanged: WebExtEvent[js.Function1[/* details */ NetworkLinkInfo, Unit]]
  /* networkStatus functions */
  /** Returns the $(ref:NetworkLinkInfo} of the current network connection. */
  def getLinkInfo(): js.Promise[NetworkLinkInfo]
}

object TypeofnetworkStatus {
  @scala.inline
  def apply(
    getLinkInfo: () => js.Promise[NetworkLinkInfo],
    onConnectionChanged: WebExtEvent[js.Function1[/* details */ NetworkLinkInfo, Unit]]
  ): TypeofnetworkStatus = {
    val __obj = js.Dynamic.literal(getLinkInfo = js.Any.fromFunction0(getLinkInfo), onConnectionChanged = onConnectionChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofnetworkStatus]
  }
}

