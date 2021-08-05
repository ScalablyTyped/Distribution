package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.captivePortal.OnConnectivityAvailableStatus
import typings.firefoxWebextBrowser.browser.captivePortal.OnStateChangedDetails
import typings.firefoxWebextBrowser.browser.captivePortal.OnStateChangedDetailsState
import typings.firefoxWebextBrowser.browser.types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This API provides the ability detect the captive portal state of the users connection.
  *
  * Permissions: `captivePortal`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object captivePortal {
  
  @JSGlobal("browser.captivePortal")
  @js.native
  val ^ : js.Any = js.native
  
  /* captivePortal properties */
  /** Return the canonical captive-portal detection URL. Read-only. */
  @JSGlobal("browser.captivePortal.canonicalURL")
  @js.native
  val canonicalURL: Setting = js.native
  
  /** Returns the time difference between NOW and the last time a request was completed in milliseconds. */
  inline def getLastChecked(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastChecked")().asInstanceOf[js.Promise[Double]]
  
  /* captivePortal functions */
  /**
    * Returns the current portal state, one of `unknown`, `not_captive`, `unlocked_portal`, `locked_portal`.
    */
  inline def getState(): js.Promise[OnStateChangedDetailsState] = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")().asInstanceOf[js.Promise[OnStateChangedDetailsState]]
  
  /**
    * This notification will be emitted when the captive portal service has determined that we can connect to the internet. The service will pass either `captive` if there is an unlocked captive portal present, or `clear` if no captive portal was detected.
    */
  @JSGlobal("browser.captivePortal.onConnectivityAvailable")
  @js.native
  val onConnectivityAvailable: WebExtEvent[js.Function1[/* status */ OnConnectivityAvailableStatus, Unit]] = js.native
  
  /* captivePortal events */
  /** Fired when the captive portal state changes. */
  @JSGlobal("browser.captivePortal.onStateChanged")
  @js.native
  val onStateChanged: WebExtEvent[js.Function1[/* details */ OnStateChangedDetails, Unit]] = js.native
}
