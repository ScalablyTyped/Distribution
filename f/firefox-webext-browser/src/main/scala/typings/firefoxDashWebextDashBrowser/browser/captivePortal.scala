package typings.firefoxDashWebextDashBrowser.browser

import typings.firefoxDashWebextDashBrowser.Anon_State
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import typings.firefoxDashWebextDashBrowser.browser.captivePortal._Status
import typings.firefoxDashWebextDashBrowser.browser.captivePortal._UndefinedState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This API provides the ability detect the captive portal state of the users connection.
  *
  * Permissions: `captivePortal`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.captivePortal")
@js.native
object captivePortal extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.captive
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.clear
  */
  trait _Status extends js.Object
  
  /** The current captive portal state. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.unknown
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.not_captive
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.unlocked_portal
    - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.locked_portal
  */
  trait _UndefinedState extends js.Object
  
  /**
    * This notification will be emitted when the captive portal service has determined that we can connect to the
    * internet. The service will pass either `captive` if there is an unlocked captive portal present, or `clear` if
    * no captive portal was detected.
    */
  val onConnectivityAvailable: WebExtEvent[js.Function1[/* status */ _Status, Unit]] = js.native
  /* captivePortal events */
  /** Fired when the captive portal state changes. */
  val onStateChanged: WebExtEvent[js.Function1[/* details */ Anon_State, Unit]] = js.native
  /** Returns the time difference between NOW and the last time a request was completed in milliseconds. */
  def getLastChecked(): js.Promise[Double] = js.native
  /* captivePortal functions */
  /**
    * Returns the current portal state, one of `unknown`, `not_captive`, `unlocked_portal`, `locked_portal`.
    */
  def getState(): js.Promise[_UndefinedState] = js.native
}

