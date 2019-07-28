package typings.atEgjsAxes.inputTypeInputTypeMod

import typings.atEgjsAxes.atEgjsAxesStrings._EGJS_AXES_INPUTTYPE_
import typings.atEgjsAxes.axisManagerMod.Axis
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/inputType/InputType", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val SUPPORT_TOUCH: Boolean = js.native
  val UNIQUEKEY: _EGJS_AXES_INPUTTYPE_ = js.native
  def convertInputType(): js.Any = js.native
  def convertInputType(inputType: js.Array[String]): js.Any = js.native
  def createHammer(element: HTMLElement, recognizers: js.Any): js.Any = js.native
  def createHammer(element: HTMLElement, recognizers: js.Any, inputClass: js.Any): js.Any = js.native
  def toAxis(source: js.Array[String], offset: js.Array[Double]): Axis = js.native
}

