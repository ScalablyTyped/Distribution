package typings.egjsAxes.axisManagerMod

import org.scalablytyped.runtime.StringDictionary
import typings.egjsAxes.axesMod.AxesOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@egjs/axes/AxisManager", "AxisManager")
@js.native
class AxisManager protected () extends js.Object {
  def this(axis: js.Any, options: AxesOption) = this()
  
  var _pos: js.Any = js.native
  
  var axis: js.Any = js.native
  
  def every(
    pos: Axis,
    callback: js.Function3[/* value */ Double, /* key */ String, /* options */ AxisOption, Boolean]
  ): Boolean = js.native
  
  def filter(
    pos: Axis,
    callback: js.Function3[/* value */ Double, /* key */ String, /* options */ AxisOption, Boolean]
  ): Axis = js.native
  
  def get(): Axis = js.native
  def get(axes: js.Array[String]): Axis = js.native
  def get(axes: Axis): Axis = js.native
  
  def getDelta(depaPos: Axis, destPos: Axis): Axis = js.native
  
  def isOutside(): Boolean = js.native
  def isOutside(axes: js.Array[String]): Boolean = js.native
  
  def map(
    pos: Axis,
    callback: js.Function3[/* value */ Double, /* key */ String, /* options */ AxisOption, _]
  ): js.Any = js.native
  
  def moveTo(pos: Axis): StringDictionary[Axis] = js.native
  
  var options: js.Any = js.native
  
  def set(pos: Axis): Unit = js.native
}
/* static members */
@JSImport("@egjs/axes/AxisManager", "AxisManager")
@js.native
object AxisManager extends js.Object {
  
  def equal(target: Axis, base: Axis): Boolean = js.native
}
