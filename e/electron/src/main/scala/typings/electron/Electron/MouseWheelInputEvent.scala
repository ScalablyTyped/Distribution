package typings.electron.Electron

import typings.electron.electronStrings.mouseWheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseWheelInputEvent extends MouseInputEvent {
  // Docs: http://electronjs.org/docs/api/structures/mouse-wheel-input-event
  var accelerationRatioX: js.UndefOr[Double] = js.native
  var accelerationRatioY: js.UndefOr[Double] = js.native
  var canScroll: js.UndefOr[Boolean] = js.native
  var deltaX: js.UndefOr[Double] = js.native
  var deltaY: js.UndefOr[Double] = js.native
  var hasPreciseScrollingDeltas: js.UndefOr[Boolean] = js.native
  /**
    * The type of the event, can be `mouseWheel`.
    */
  @JSName("type")
  var type_MouseWheelInputEvent: mouseWheel = js.native
  var wheelTicksX: js.UndefOr[Double] = js.native
  var wheelTicksY: js.UndefOr[Double] = js.native
}

object MouseWheelInputEvent {
  @scala.inline
  def apply(`type`: mouseWheel, x: Double, y: Double): MouseWheelInputEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelInputEvent]
  }
  @scala.inline
  implicit class MouseWheelInputEventOps[Self <: MouseWheelInputEvent] (val x: Self) extends AnyVal {
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
    def setType(value: mouseWheel): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccelerationRatioX(value: Double): Self = this.set("accelerationRatioX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerationRatioX: Self = this.set("accelerationRatioX", js.undefined)
    @scala.inline
    def setAccelerationRatioY(value: Double): Self = this.set("accelerationRatioY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerationRatioY: Self = this.set("accelerationRatioY", js.undefined)
    @scala.inline
    def setCanScroll(value: Boolean): Self = this.set("canScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanScroll: Self = this.set("canScroll", js.undefined)
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaX: Self = this.set("deltaX", js.undefined)
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaY: Self = this.set("deltaY", js.undefined)
    @scala.inline
    def setHasPreciseScrollingDeltas(value: Boolean): Self = this.set("hasPreciseScrollingDeltas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasPreciseScrollingDeltas: Self = this.set("hasPreciseScrollingDeltas", js.undefined)
    @scala.inline
    def setWheelTicksX(value: Double): Self = this.set("wheelTicksX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheelTicksX: Self = this.set("wheelTicksX", js.undefined)
    @scala.inline
    def setWheelTicksY(value: Double): Self = this.set("wheelTicksY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheelTicksY: Self = this.set("wheelTicksY", js.undefined)
  }
  
}

