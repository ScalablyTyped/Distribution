package typings
package atEgjsAxesLib.axesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/Axes", JSImport.Default)
@js.native
class default protected () extends Axes {
  def this(axis: org.scalablytyped.runtime.StringDictionary[atEgjsAxesLib.axisManagerMod.AxisOption], options: AxesOption) = this()
  def this(axis: org.scalablytyped.runtime.StringDictionary[atEgjsAxesLib.axisManagerMod.AxisOption], options: AxesOption, startPos: atEgjsAxesLib.axisManagerMod.Axis) = this()
}

/* static members */
@JSImport("@egjs/axes/Axes", JSImport.Default)
@js.native
object default extends js.Object {
  var DIRECTION_ALL: atEgjsAxesLib.constMod.DIRECTION = js.native
  var DIRECTION_DOWN: atEgjsAxesLib.constMod.DIRECTION = js.native
  var DIRECTION_HORIZONTAL: atEgjsAxesLib.constMod.DIRECTION = js.native
  var DIRECTION_LEFT: atEgjsAxesLib.constMod.DIRECTION = js.native
  var DIRECTION_NONE: atEgjsAxesLib.constMod.DIRECTION = js.native
  var DIRECTION_RIGHT: atEgjsAxesLib.constMod.DIRECTION = js.native
  var DIRECTION_UP: atEgjsAxesLib.constMod.DIRECTION = js.native
  var DIRECTION_VERTICAL: atEgjsAxesLib.constMod.DIRECTION = js.native
  var PanInput: atEgjsAxesLib.Anon_Angle = js.native
  var PinchInput: org.scalablytyped.runtime.Instantiable2[
    /* el */ js.Any, 
    /* options */ js.UndefOr[/* options */ atEgjsAxesLib.inputTypePinchInputMod.PinchInputOption], 
    atEgjsAxesLib.inputTypePinchInputMod.PinchInput
  ] = js.native
  var TRANSFORM: java.lang.String = js.native
  var VERSION: java.lang.String = js.native
  var WheelInput: org.scalablytyped.runtime.Instantiable2[
    /* el */ js.Any, 
    /* options */ js.UndefOr[/* options */ atEgjsAxesLib.inputTypeWheelInputMod.WheelInputOption], 
    atEgjsAxesLib.inputTypeWheelInputMod.WheelInput
  ] = js.native
}

