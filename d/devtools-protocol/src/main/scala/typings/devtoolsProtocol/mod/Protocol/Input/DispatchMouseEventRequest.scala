package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.devtoolsProtocolStrings.mouse
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseMoved
import typings.devtoolsProtocol.devtoolsProtocolStrings.mousePressed
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseReleased
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseWheel
import typings.devtoolsProtocol.devtoolsProtocolStrings.pen
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatchMouseEventRequest extends js.Object {
  /**
    * Mouse button (default: "none").
    */
  var button: js.UndefOr[MouseButton] = js.native
  /**
    * A number indicating which buttons are pressed on the mouse when a mouse event is triggered.
    * Left=1, Right=2, Middle=4, Back=8, Forward=16, None=0.
    */
  var buttons: js.UndefOr[integer] = js.native
  /**
    * Number of times the mouse button was clicked (default: 0).
    */
  var clickCount: js.UndefOr[integer] = js.native
  /**
    * X delta in CSS pixels for mouse wheel event (default: 0).
    */
  var deltaX: js.UndefOr[Double] = js.native
  /**
    * Y delta in CSS pixels for mouse wheel event (default: 0).
    */
  var deltaY: js.UndefOr[Double] = js.native
  /**
    * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
    * (default: 0).
    */
  var modifiers: js.UndefOr[integer] = js.native
  /**
    * Pointer type (default: "mouse"). (DispatchMouseEventRequestPointerType enum)
    */
  var pointerType: js.UndefOr[mouse | pen] = js.native
  /**
    * Time at which the event occurred.
    */
  var timestamp: js.UndefOr[TimeSinceEpoch] = js.native
  /**
    * Type of the mouse event. (DispatchMouseEventRequestType enum)
    */
  var `type`: mousePressed | mouseReleased | mouseMoved | mouseWheel = js.native
  /**
    * X coordinate of the event relative to the main frame's viewport in CSS pixels.
    */
  var x: Double = js.native
  /**
    * Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0 refers to
    * the top of the viewport and Y increases as it proceeds towards the bottom of the viewport.
    */
  var y: Double = js.native
}

object DispatchMouseEventRequest {
  @scala.inline
  def apply(`type`: mousePressed | mouseReleased | mouseMoved | mouseWheel, x: Double, y: Double): DispatchMouseEventRequest = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchMouseEventRequest]
  }
  @scala.inline
  implicit class DispatchMouseEventRequestOps[Self <: DispatchMouseEventRequest] (val x: Self) extends AnyVal {
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
    def setType(value: mousePressed | mouseReleased | mouseMoved | mouseWheel): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setButton(value: MouseButton): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setButtons(value: integer): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
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
    def setPointerType(value: mouse | pen): Self = this.set("pointerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerType: Self = this.set("pointerType", js.undefined)
    @scala.inline
    def setTimestamp(value: TimeSinceEpoch): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

