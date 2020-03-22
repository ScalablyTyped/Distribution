package typings.electron.Electron

import typings.electron.electronStrings.alt
import typings.electron.electronStrings.capsLock
import typings.electron.electronStrings.cmd
import typings.electron.electronStrings.command
import typings.electron.electronStrings.control
import typings.electron.electronStrings.ctrl
import typings.electron.electronStrings.isAutoRepeat
import typings.electron.electronStrings.isKeypad
import typings.electron.electronStrings.left
import typings.electron.electronStrings.leftButtonDown
import typings.electron.electronStrings.meta
import typings.electron.electronStrings.middle
import typings.electron.electronStrings.middleButtonDown
import typings.electron.electronStrings.mouseWheel
import typings.electron.electronStrings.numLock
import typings.electron.electronStrings.right
import typings.electron.electronStrings.rightButtonDown
import typings.electron.electronStrings.shift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWheelInputEvent extends MouseInputEvent {
  // Docs: http://electronjs.org/docs/api/structures/mouse-wheel-input-event
  var accelerationRatioX: js.UndefOr[Double] = js.undefined
  var accelerationRatioY: js.UndefOr[Double] = js.undefined
  var canScroll: js.UndefOr[Boolean] = js.undefined
  var deltaX: js.UndefOr[Double] = js.undefined
  var deltaY: js.UndefOr[Double] = js.undefined
  var hasPreciseScrollingDeltas: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of the event, can be `mouseWheel`.
    */
  @JSName("type")
  var type_MouseWheelInputEvent: mouseWheel
  var wheelTicksX: js.UndefOr[Double] = js.undefined
  var wheelTicksY: js.UndefOr[Double] = js.undefined
}

object MouseWheelInputEvent {
  @scala.inline
  def apply(
    `type`: mouseWheel,
    x: Double,
    y: Double,
    accelerationRatioX: Int | Double = null,
    accelerationRatioY: Int | Double = null,
    button: left | middle | right = null,
    canScroll: js.UndefOr[Boolean] = js.undefined,
    clickCount: Int | Double = null,
    deltaX: Int | Double = null,
    deltaY: Int | Double = null,
    globalX: Int | Double = null,
    globalY: Int | Double = null,
    hasPreciseScrollingDeltas: js.UndefOr[Boolean] = js.undefined,
    modifiers: js.Array[
      shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
    ] = null,
    movementX: Int | Double = null,
    movementY: Int | Double = null,
    wheelTicksX: Int | Double = null,
    wheelTicksY: Int | Double = null
  ): MouseWheelInputEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accelerationRatioX != null) __obj.updateDynamic("accelerationRatioX")(accelerationRatioX.asInstanceOf[js.Any])
    if (accelerationRatioY != null) __obj.updateDynamic("accelerationRatioY")(accelerationRatioY.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (!js.isUndefined(canScroll)) __obj.updateDynamic("canScroll")(canScroll.asInstanceOf[js.Any])
    if (clickCount != null) __obj.updateDynamic("clickCount")(clickCount.asInstanceOf[js.Any])
    if (deltaX != null) __obj.updateDynamic("deltaX")(deltaX.asInstanceOf[js.Any])
    if (deltaY != null) __obj.updateDynamic("deltaY")(deltaY.asInstanceOf[js.Any])
    if (globalX != null) __obj.updateDynamic("globalX")(globalX.asInstanceOf[js.Any])
    if (globalY != null) __obj.updateDynamic("globalY")(globalY.asInstanceOf[js.Any])
    if (!js.isUndefined(hasPreciseScrollingDeltas)) __obj.updateDynamic("hasPreciseScrollingDeltas")(hasPreciseScrollingDeltas.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (movementX != null) __obj.updateDynamic("movementX")(movementX.asInstanceOf[js.Any])
    if (movementY != null) __obj.updateDynamic("movementY")(movementY.asInstanceOf[js.Any])
    if (wheelTicksX != null) __obj.updateDynamic("wheelTicksX")(wheelTicksX.asInstanceOf[js.Any])
    if (wheelTicksY != null) __obj.updateDynamic("wheelTicksY")(wheelTicksY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelInputEvent]
  }
}

