package typings.egjsAxes.inputTypeMod

import typings.egjsAxes.axesMod.AxesOption
import typings.egjsAxes.axisManagerMod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInputTypeObserver extends js.Object {
  
  def change(inputType: IInputType, event: js.Any, offset: Axis): js.Any = js.native
  
  def hold(inputType: IInputType, event: js.Any): js.Any = js.native
  
  var options: AxesOption = js.native
  
  def release(inputType: IInputType, event: js.Any, offset: Axis): js.Any = js.native
  def release(inputType: IInputType, event: js.Any, offset: Axis, duration: Double): js.Any = js.native
}
