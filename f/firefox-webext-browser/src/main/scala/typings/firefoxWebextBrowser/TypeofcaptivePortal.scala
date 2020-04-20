package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.captivePortal.Status
import typings.firefoxWebextBrowser.browser.captivePortal.UndefinedState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcaptivePortal extends js.Object {
  /**
    * This notification will be emitted when the captive portal service has determined that we can connect to the
    * internet. The service will pass either `captive` if there is an unlocked captive portal present, or `clear` if
    * no captive portal was detected.
    */
  val onConnectivityAvailable: WebExtEvent[js.Function1[/* status */ Status, Unit]]
  /* captivePortal events */
  /** Fired when the captive portal state changes. */
  val onStateChanged: WebExtEvent[js.Function1[/* details */ AnonState, Unit]]
  /** Returns the time difference between NOW and the last time a request was completed in milliseconds. */
  def getLastChecked(): js.Promise[Double]
  /* captivePortal functions */
  /**
    * Returns the current portal state, one of `unknown`, `not_captive`, `unlocked_portal`, `locked_portal`.
    */
  def getState(): js.Promise[UndefinedState]
}

object TypeofcaptivePortal {
  @scala.inline
  def apply(
    getLastChecked: () => js.Promise[Double],
    getState: () => js.Promise[UndefinedState],
    onConnectivityAvailable: WebExtEvent[js.Function1[/* status */ Status, Unit]],
    onStateChanged: WebExtEvent[js.Function1[/* details */ AnonState, Unit]]
  ): TypeofcaptivePortal = {
    val __obj = js.Dynamic.literal(getLastChecked = js.Any.fromFunction0(getLastChecked), getState = js.Any.fromFunction0(getState), onConnectivityAvailable = onConnectivityAvailable.asInstanceOf[js.Any], onStateChanged = onStateChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofcaptivePortal]
  }
}

