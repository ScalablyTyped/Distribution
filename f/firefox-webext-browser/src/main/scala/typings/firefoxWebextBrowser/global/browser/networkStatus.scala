package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.networkStatus.NetworkLinkInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This API provides the ability to determine the status of and detect changes in the network connection. This API can only be used in privileged extensions.
  *
  * Permissions: `networkStatus`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object networkStatus {
  
  @JSGlobal("browser.networkStatus")
  @js.native
  val ^ : js.Any = js.native
  
  /* networkStatus functions */
  /** Returns the $(ref:NetworkLinkInfo} of the current network connection. */
  @scala.inline
  def getLinkInfo(): js.Promise[NetworkLinkInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkInfo")().asInstanceOf[js.Promise[NetworkLinkInfo]]
  
  /* networkStatus events */
  /** Fired when the network connection state changes. */
  @JSGlobal("browser.networkStatus.onConnectionChanged")
  @js.native
  val onConnectionChanged: WebExtEvent[js.Function1[/* details */ NetworkLinkInfo, Unit]] = js.native
}
