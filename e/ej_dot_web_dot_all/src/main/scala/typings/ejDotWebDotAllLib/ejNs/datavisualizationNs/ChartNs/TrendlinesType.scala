package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrendlinesType extends js.Object

@JSGlobal("ej.datavisualization.Chart.TrendlinesType")
@js.native
object TrendlinesType extends js.Object {
  //string
  @js.native
  sealed trait Exponential
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TrendlinesType
  
  //string
  @js.native
  sealed trait Linear
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TrendlinesType
  
  //string
  @js.native
  sealed trait Logarithmic
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TrendlinesType
  
  //string
  @js.native
  sealed trait Polynomial
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TrendlinesType
  
  //string
  @js.native
  sealed trait Power
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TrendlinesType
  
  /* 1 */ val Exponential: Exponential with scala.Double = js.native
  /* 0 */ val Linear: Linear with scala.Double = js.native
  /* 2 */ val Logarithmic: Logarithmic with scala.Double = js.native
  /* 4 */ val Polynomial: Polynomial with scala.Double = js.native
  /* 3 */ val Power: Power with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TrendlinesType with scala.Double
  ] = js.native
}

