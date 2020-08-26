package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseMoved
import typings.devtoolsProtocol.devtoolsProtocolStrings.mousePressed
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseReleased
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseWheel
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmulateTouchFromMouseEventRequest extends js.Object {
  /**
    * Mouse button. Only "none", "left", "right" are supported.
    */
  var button: MouseButton = js.native
  /**
    * Number of times the mouse button was clicked (default: 0).
    */
  var clickCount: js.UndefOr[integer] = js.native
  /**
    * X delta in DIP for mouse wheel event (default: 0).
    */
  var deltaX: js.UndefOr[Double] = js.native
  /**
    * Y delta in DIP for mouse wheel event (default: 0).
    */
  var deltaY: js.UndefOr[Double] = js.native
  /**
    * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
    * (default: 0).
    */
  var modifiers: js.UndefOr[integer] = js.native
  /**
    * Time at which the event occurred (default: current time).
    */
  var timestamp: js.UndefOr[TimeSinceEpoch] = js.native
  /**
    * Type of the mouse event. (EmulateTouchFromMouseEventRequestType enum)
    */
  var `type`: mousePressed | mouseReleased | mouseMoved | mouseWheel = js.native
  /**
    * X coordinate of the mouse pointer in DIP.
    */
  var x: integer = js.native
  /**
    * Y coordinate of the mouse pointer in DIP.
    */
  var y: integer = js.native
}

object EmulateTouchFromMouseEventRequest {
  @scala.inline
  def apply(
    button: MouseButton,
    `type`: mousePressed | mouseReleased | mouseMoved | mouseWheel,
    x: integer,
    y: integer
  ): EmulateTouchFromMouseEventRequest = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmulateTouchFromMouseEventRequest]
  }
  @scala.inline
  implicit class EmulateTouchFromMouseEventRequestOps[Self <: EmulateTouchFromMouseEventRequest] (val x: Self) extends AnyVal {
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
    def setButton(value: MouseButton): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: mousePressed | mouseReleased | mouseMoved | mouseWheel): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: integer): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: integer): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setClickCount(value: integer): Self = this.set("clickCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickCount: Self = this.set("clickCount", js.undefined)
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaX: Self = this.set("deltaX", js.undefined)
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaY: Self = this.set("deltaY", js.undefined)
    @scala.inline
    def setModifiers(value: integer): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setTimestamp(value: TimeSinceEpoch): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

