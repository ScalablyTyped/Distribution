package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.captivePortal.Status
import typings.firefoxWebextBrowser.browser.captivePortal.UndefinedState
import typings.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofcaptivePortal extends js.Object {
  /* captivePortal properties */
  /** Return the canonical captive-portal detection URL. Read-only. */
  val canonicalURL: Setting = js.native
  /**
    * This notification will be emitted when the captive portal service has determined that we can connect to the
    * internet. The service will pass either `captive` if there is an unlocked captive portal present, or `clear` if
    * no captive portal was detected.
    */
  val onConnectivityAvailable: WebExtEvent[js.Function1[/* status */ Status, Unit]] = js.native
  /* captivePortal events */
  /** Fired when the captive portal state changes. */
  val onStateChanged: WebExtEvent[js.Function1[/* details */ State, Unit]] = js.native
  /** Returns the time difference between NOW and the last time a request was completed in milliseconds. */
  def getLastChecked(): js.Promise[Double] = js.native
  /* captivePortal functions */
  /**
    * Returns the current portal state, one of `unknown`, `not_captive`, `unlocked_portal`, `locked_portal`.
    */
  def getState(): js.Promise[UndefinedState] = js.native
}

object TypeofcaptivePortal {
  @scala.inline
  def apply(
    canonicalURL: Setting,
    getLastChecked: () => js.Promise[Double],
    getState: () => js.Promise[UndefinedState],
    onConnectivityAvailable: WebExtEvent[js.Function1[/* status */ Status, Unit]],
    onStateChanged: WebExtEvent[js.Function1[/* details */ State, Unit]]
  ): TypeofcaptivePortal = {
    val __obj = js.Dynamic.literal(canonicalURL = canonicalURL.asInstanceOf[js.Any], getLastChecked = js.Any.fromFunction0(getLastChecked), getState = js.Any.fromFunction0(getState), onConnectivityAvailable = onConnectivityAvailable.asInstanceOf[js.Any], onStateChanged = onStateChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofcaptivePortal]
  }
  @scala.inline
  implicit class TypeofcaptivePortalOps[Self <: TypeofcaptivePortal] (val x: Self) extends AnyVal {
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
    def setCanonicalURL(value: Setting): Self = this.set("canonicalURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLastChecked(value: () => js.Promise[Double]): Self = this.set("getLastChecked", js.Any.fromFunction0(value))
    @scala.inline
    def setGetState(value: () => js.Promise[UndefinedState]): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setOnConnectivityAvailable(value: WebExtEvent[js.Function1[/* status */ Status, Unit]]): Self = this.set("onConnectivityAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnStateChanged(value: WebExtEvent[js.Function1[/* details */ State, Unit]]): Self = this.set("onStateChanged", value.asInstanceOf[js.Any])
  }
  
}

