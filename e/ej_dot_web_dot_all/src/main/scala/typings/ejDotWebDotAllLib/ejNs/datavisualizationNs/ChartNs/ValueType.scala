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
  
  /* 1 */ val Category: Category with scala.Double = js.native
  /* 2 */ val DateTime: DateTime with scala.Double = js.native
  /* 0 */ val Double: Double with scala.Double = js.native
  /* 3 */ val Logarithmic: Logarithmic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ValueType with scala.Double] = js.native
}

