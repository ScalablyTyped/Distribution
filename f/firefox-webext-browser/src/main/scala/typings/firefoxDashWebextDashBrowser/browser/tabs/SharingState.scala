package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tab sharing state for screen, microphone and camera. */
trait SharingState extends js.Object {
  /** True if the tab is using the camera. */
  var camera: Boolean
  /** True if the tab is using the microphone. */
  var microphone: Boolean
  /**
    * If the tab is sharing the screen the value will be one of "Screen", "Window", or "Application", or undefined
    * if not screen sharing.
    */
  var screen: js.UndefOr[String] = js.undefined
}

object SharingState {
  @scala.inline
  def apply(camera: Boolean, microphone: Boolean, screen: String = null): SharingState = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], microphone = microphone.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharingState]
  }
}

