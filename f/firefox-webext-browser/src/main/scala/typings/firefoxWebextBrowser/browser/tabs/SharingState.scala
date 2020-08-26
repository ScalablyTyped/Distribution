package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tab sharing state for screen, microphone and camera. */
@js.native
trait SharingState extends js.Object {
  /** True if the tab is using the camera. */
  var camera: Boolean = js.native
  /** True if the tab is using the microphone. */
  var microphone: Boolean = js.native
  /**
    * If the tab is sharing the screen the value will be one of "Screen", "Window", or "Application", or undefined
    * if not screen sharing.
    */
  var screen: js.UndefOr[String] = js.native
}

object SharingState {
  @scala.inline
  def apply(camera: Boolean, microphone: Boolean): SharingState = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], microphone = microphone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharingState]
  }
  @scala.inline
  implicit class SharingStateOps[Self <: SharingState] (val x: Self) extends AnyVal {
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
    def setCamera(value: Boolean): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def setMicrophone(value: Boolean): Self = this.set("microphone", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreen(value: String): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreen: Self = this.set("screen", js.undefined)
  }
  
}

