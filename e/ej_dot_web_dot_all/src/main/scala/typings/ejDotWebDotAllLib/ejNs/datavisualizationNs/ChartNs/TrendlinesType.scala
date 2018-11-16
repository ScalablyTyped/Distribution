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
  
  val Exponential: Exponential with java.lang.String = js.native
  val Linear: Linear with java.lang.String = js.native
  val Logarithmic: Logarithmic with java.lang.String = js.native
  val Polynomial: Polynomial with java.lang.String = js.native
  val Power: Power with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TrendlinesType with java.lang.String
  ] = js.native
}

