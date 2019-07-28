package typings.atEgjsAxes.inputTypeInputTypeMod

import typings.atEgjsAxes.axesMod.AxesOption
import typings.atEgjsAxes.axisManagerMod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInputTypeObserver extends js.Object {
  var options: AxesOption = js.native
  def change(inputType: IInputType, event: js.Any, offset: Axis): js.Any = js.native
  def hold(inputType: IInputType, event: js.Any): js.Any = js.native
  def release(inputType: IInputType, event: js.Any, offset: Axis): js.Any = js.native
  def release(inputType: IInputType, event: js.Any, offset: Axis, duration: Double): js.Any = js.native
}

