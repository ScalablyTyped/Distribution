package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.networkStatus.NetworkLinkInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofnetworkStatus extends js.Object {
  /* networkStatus events */
  /** Fired when the network connection state changes. */
  val onConnectionChanged: WebExtEvent[js.Function1[/* details */ NetworkLinkInfo, Unit]] = js.native
  /* networkStatus functions */
  /** Returns the $(ref:NetworkLinkInfo} of the current network connection. */
  def getLinkInfo(): js.Promise[NetworkLinkInfo] = js.native
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
  @scala.inline
  implicit class TypeofnetworkStatusOps[Self <: TypeofnetworkStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetLinkInfo(value: () => js.Promise[NetworkLinkInfo]): Self = this.set("getLinkInfo", js.Any.fromFunction0(value))
    @scala.inline
    def setOnConnectionChanged(value: WebExtEvent[js.Function1[/* details */ NetworkLinkInfo, Unit]]): Self = this.set("onConnectionChanged", value.asInstanceOf[js.Any])
  }
  
}

