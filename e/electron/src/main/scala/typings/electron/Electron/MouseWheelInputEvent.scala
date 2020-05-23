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
    accelerationRatioX: js.UndefOr[Double] = js.undefined,
    accelerationRatioY: js.UndefOr[Double] = js.undefined,
    button: left | middle | right = null,
    canScroll: js.UndefOr[Boolean] = js.undefined,
    clickCount: js.UndefOr[Double] = js.undefined,
    deltaX: js.UndefOr[Double] = js.undefined,
    deltaY: js.UndefOr[Double] = js.undefined,
    globalX: js.UndefOr[Double] = js.undefined,
    globalY: js.UndefOr[Double] = js.undefined,
    hasPreciseScrollingDeltas: js.UndefOr[Boolean] = js.undefined,
    modifiers: js.Array[
      shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
    ] = null,
    movementX: js.UndefOr[Double] = js.undefined,
    movementY: js.UndefOr[Double] = js.undefined,
    wheelTicksX: js.UndefOr[Double] = js.undefined,
    wheelTicksY: js.UndefOr[Double] = js.undefined
  ): MouseWheelInputEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(accelerationRatioX)) __obj.updateDynamic("accelerationRatioX")(accelerationRatioX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(accelerationRatioY)) __obj.updateDynamic("accelerationRatioY")(accelerationRatioY.get.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (!js.isUndefined(canScroll)) __obj.updateDynamic("canScroll")(canScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickCount)) __obj.updateDynamic("clickCount")(clickCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaX)) __obj.updateDynamic("deltaX")(deltaX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaY)) __obj.updateDynamic("deltaY")(deltaY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(globalX)) __obj.updateDynamic("globalX")(globalX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(globalY)) __obj.updateDynamic("globalY")(globalY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasPreciseScrollingDeltas)) __obj.updateDynamic("hasPreciseScrollingDeltas")(hasPreciseScrollingDeltas.get.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(movementX)) __obj.updateDynamic("movementX")(movementX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(movementY)) __obj.updateDynamic("movementY")(movementY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelTicksX)) __obj.updateDynamic("wheelTicksX")(wheelTicksX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelTicksY)) __obj.updateDynamic("wheelTicksY")(wheelTicksY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelInputEvent]
  }
}

