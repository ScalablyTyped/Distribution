package typings.atEgjsAxes.atEgjsAxesMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.atEgjsAxes.TypeofClassPanInput
import typings.atEgjsAxes.axesMod.AxesOption
import typings.atEgjsAxes.axisManagerMod.Axis
import typings.atEgjsAxes.axisManagerMod.AxisOption
import typings.atEgjsAxes.constMod.DIRECTION
import typings.atEgjsAxes.inputTypePinchInputMod.PinchInputOption
import typings.atEgjsAxes.inputTypeWheelInputMod.WheelInputOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes", "default")
@js.native
class default protected ()
  extends typings.atEgjsAxes.axesMod.default {
  def this(axis: StringDictionary[AxisOption], options: AxesOption) = this()
  def this(axis: StringDictionary[AxisOption], options: AxesOption, startPos: Axis) = this()
}

/* static members */
@JSImport("@egjs/axes", "default")
@js.native
object default extends js.Object {
  var DIRECTION_ALL: DIRECTION = js.native
  var DIRECTION_DOWN: DIRECTION = js.native
  var DIRECTION_HORIZONTAL: DIRECTION = js.native
  var DIRECTION_LEFT: DIRECTION = js.native
  var DIRECTION_NONE: DIRECTION = js.native
  var DIRECTION_RIGHT: DIRECTION = js.native
  var DIRECTION_UP: DIRECTION = js.native
  var DIRECTION_VERTICAL: DIRECTION = js.native
  var PanInput: TypeofClassPanInput = js.native
  var PinchInput: Instantiable2[
    /* el */ js.Any, 
    js.UndefOr[/* options */ PinchInputOption], 
    typings.atEgjsAxes.inputTypePinchInputMod.PinchInput
  ] = js.native
  var TRANSFORM: String = js.native
  var VERSION: String = js.native
  var WheelInput: Instantiable2[
    /* el */ js.Any, 
    js.UndefOr[/* options */ WheelInputOption], 
    typings.atEgjsAxes.inputTypeWheelInputMod.WheelInput
  ] = js.native
}

