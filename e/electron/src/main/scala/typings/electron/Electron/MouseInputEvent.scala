package typings.electron.Electron

import typings.electron.electronStrings.contextMenu
import typings.electron.electronStrings.left
import typings.electron.electronStrings.middle
import typings.electron.electronStrings.mouseDown
import typings.electron.electronStrings.mouseEnter
import typings.electron.electronStrings.mouseLeave
import typings.electron.electronStrings.mouseMove
import typings.electron.electronStrings.mouseUp
import typings.electron.electronStrings.mouseWheel
import typings.electron.electronStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseInputEvent extends InputEvent {
  // Docs: http://electronjs.org/docs/api/structures/mouse-input-event
  /**
    * The button pressed, can be `left`, `middle`, `right`.
    */
  var button: js.UndefOr[left | middle | right] = js.native
  var clickCount: js.UndefOr[Double] = js.native
  var globalX: js.UndefOr[Double] = js.native
  var globalY: js.UndefOr[Double] = js.native
  var movementX: js.UndefOr[Double] = js.native
  var movementY: js.UndefOr[Double] = js.native
  /**
    * The type of the event, can be `mouseDown`, `mouseUp`, `mouseEnter`,
    * `mouseLeave`, `contextMenu`, `mouseWheel` or `mouseMove`.
    */
  var `type`: mouseDown | mouseUp | mouseEnter | mouseLeave | contextMenu | mouseWheel | mouseMove = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object MouseInputEvent {
  @scala.inline
  def apply(
    `type`: mouseDown | mouseUp | mouseEnter | mouseLeave | contextMenu | mouseWheel | mouseMove,
    x: Double,
    y: Double
  ): MouseInputEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseInputEvent]
  }
  @scala.inline
  implicit class MouseInputEventOps[Self <: MouseInputEvent] (val x: Self) extends AnyVal {
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
    def setType(value: mouseDown | mouseUp | mouseEnter | mouseLeave | contextMenu | mouseWheel | mouseMove): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setButton(value: left | middle | right): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setClickCount(value: Double): Self = this.set("clickCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickCount: Self = this.set("clickCount", js.undefined)
    @scala.inline
    def setGlobalX(value: Double): Self = this.set("globalX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalX: Self = this.set("globalX", js.undefined)
    @scala.inline
    def setGlobalY(value: Double): Self = this.set("globalY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalY: Self = this.set("globalY", js.undefined)
    @scala.inline
    def setMovementX(value: Double): Self = this.set("movementX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovementX: Self = this.set("movementX", js.undefined)
    @scala.inline
    def setMovementY(value: Double): Self = this.set("movementY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovementY: Self = this.set("movementY", js.undefined)
  }
  
}

