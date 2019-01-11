package typings
package atEgjsAxesLib.axismanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/AxisManager", "AxisManager")
@js.native
class AxisManager protected () extends js.Object {
  def this(axis: js.Any, options: atEgjsAxesLib.axesMod.AxesOption) = this()
  var _pos: js.Any = js.native
  var axis: js.Any = js.native
  var options: js.Any = js.native
  def every(
    pos: Axis,
    callback: js.Function3[
      /* value */ scala.Double, 
      /* key */ java.lang.String, 
      /* options */ AxisOption, 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def filter(
    pos: Axis,
    callback: js.Function3[
      /* value */ scala.Double, 
      /* key */ java.lang.String, 
      /* options */ AxisOption, 
      scala.Boolean
    ]
  ): Axis = js.native
  def get(): Axis = js.native
  def get(axes: Axis): Axis = js.native
  def get(axes: js.Array[java.lang.String]): Axis = js.native
  def getDelta(depaPos: Axis, destPos: Axis): Axis = js.native
  def isOutside(): scala.Boolean = js.native
  def isOutside(axes: js.Array[java.lang.String]): scala.Boolean = js.native
  def map(
    pos: Axis,
    callback: js.Function3[/* value */ scala.Double, /* key */ java.lang.String, /* options */ AxisOption, _]
  ): js.Any = js.native
  def moveTo(pos: Axis): org.scalablytyped.runtime.StringDictionary[Axis] = js.native
  def set(pos: Axis): scala.Unit = js.native
}

@JSImport("@egjs/axes/AxisManager", "AxisManager")
@js.native
object AxisManager extends js.Object {
  def equal(target: atEgjsAxesLib.axismanagerMod.Axis, base: atEgjsAxesLib.axismanagerMod.Axis): scala.Boolean = js.native
}

