package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueType extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.ValueType")
@js.native
object ValueType extends js.Object {
  //string
  @js.native
  sealed trait DateTime
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.ValueType
  
  //string
  @js.native
  sealed trait Numeric
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.ValueType
  
  /* 1 */ val DateTime: DateTime with scala.Double = js.native
  /* 0 */ val Numeric: Numeric with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.ValueType with scala.Double
  ] = js.native
}

