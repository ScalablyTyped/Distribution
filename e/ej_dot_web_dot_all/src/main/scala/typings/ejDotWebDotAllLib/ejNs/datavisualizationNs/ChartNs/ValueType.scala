package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueType extends js.Object

@JSGlobal("ej.datavisualization.Chart.ValueType")
@js.native
object ValueType extends js.Object {
  //string
  @js.native
  sealed trait Category
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ValueType
  
  //string
  @js.native
  sealed trait DateTime
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ValueType
  
  //string
  @js.native
  sealed trait Double
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ValueType
  
  //string
  @js.native
  sealed trait Logarithmic
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ValueType
  
  val Category: Category with java.lang.String = js.native
  val DateTime: DateTime with java.lang.String = js.native
  val Double: Double with java.lang.String = js.native
  val Logarithmic: Logarithmic with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ValueType with java.lang.String
  ] = js.native
}

