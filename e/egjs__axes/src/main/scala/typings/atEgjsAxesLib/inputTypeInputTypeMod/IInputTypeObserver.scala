package typings
package atEgjsAxesLib.inputTypeInputTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputTypeObserver extends js.Object {
  var options: atEgjsAxesLib.axesMod.AxesOption = js.native
  def change(inputType: IInputType, event: js.Any, offset: atEgjsAxesLib.axisManagerMod.Axis): js.Any = js.native
  def hold(inputType: IInputType, event: js.Any): js.Any = js.native
  def release(inputType: IInputType, event: js.Any, offset: atEgjsAxesLib.axisManagerMod.Axis): js.Any = js.native
  def release(
    inputType: IInputType,
    event: js.Any,
    offset: atEgjsAxesLib.axisManagerMod.Axis,
    duration: scala.Double
  ): js.Any = js.native
}

