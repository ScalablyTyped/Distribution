package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.devtoolsProtocolStrings.touchCancel
import typings.devtoolsProtocol.devtoolsProtocolStrings.touchEnd
import typings.devtoolsProtocol.devtoolsProtocolStrings.touchMove
import typings.devtoolsProtocol.devtoolsProtocolStrings.touchStart
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DispatchTouchEventRequest extends js.Object {
  
  /**
    * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
    * (default: 0).
    */
  var modifiers: js.UndefOr[integer] = js.native
  
  /**
    * Time at which the event occurred.
    */
  var timestamp: js.UndefOr[TimeSinceEpoch] = js.native
  
  /**
    * Active touch points on the touch device. One event per any changed point (compared to
    * previous touch event in a sequence) is generated, emulating pressing/moving/releasing points
    * one by one.
    */
  var touchPoints: js.Array[TouchPoint] = js.native
  
  /**
    * Type of the touch event. TouchEnd and TouchCancel must not contain any touch points, while
    * TouchStart and TouchMove must contains at least one. (DispatchTouchEventRequestType enum)
    */
  var `type`: touchStart | touchEnd | touchMove | touchCancel = js.native
}
object DispatchTouchEventRequest {
  
  @scala.inline
  def apply(touchPoints: js.Array[TouchPoint], `type`: touchStart | touchEnd | touchMove | touchCancel): DispatchTouchEventRequest = {
    val __obj = js.Dynamic.literal(touchPoints = touchPoints.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchTouchEventRequest]
  }
  
  @scala.inline
  implicit class DispatchTouchEventRequestOps[Self <: DispatchTouchEventRequest] (val x: Self) extends AnyVal {
    
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
    def setTouchPointsVarargs(value: TouchPoint*): Self = this.set("touchPoints", js.Array(value :_*))
    
    @scala.inline
    def setTouchPoints(value: js.Array[TouchPoint]): Self = this.set("touchPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: touchStart | touchEnd | touchMove | touchCancel): Self = this.set("type", value.asInstanceOf[js.Any])
    
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
