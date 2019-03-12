package typings
package atEgjsAxesLib.inputObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/InputObserver", "InputObserver")
@js.native
class InputObserver protected ()
  extends atEgjsAxesLib.inputTypeInputTypeMod.IInputTypeObserver {
  def this(options: atEgjsAxesLib.axesMod.AxesOption, itm: atEgjsAxesLib.interruptManagerMod.InterruptManager, em: atEgjsAxesLib.eventManagerMod.EventManager, axm: atEgjsAxesLib.axisManagerMod.AxisManager, am: atEgjsAxesLib.animationManagerMod.AnimationManager) = this()
  var am: js.Any = js.native
  var axm: js.Any = js.native
  var em: js.Any = js.native
  var isOutside: scala.Boolean = js.native
  var itm: js.Any = js.native
  var moveDistance: atEgjsAxesLib.axisManagerMod.Axis = js.native
  /* private */ def atOutside(pos: js.Any): js.Any = js.native
  def change(inputType: js.Any, event: js.Any, offset: atEgjsAxesLib.axisManagerMod.Axis): scala.Unit = js.native
}

