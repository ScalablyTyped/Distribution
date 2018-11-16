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
  
  val DateTime: DateTime with java.lang.String = js.native
  val Numeric: Numeric with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.ValueType with java.lang.String
  ] = js.native
}

