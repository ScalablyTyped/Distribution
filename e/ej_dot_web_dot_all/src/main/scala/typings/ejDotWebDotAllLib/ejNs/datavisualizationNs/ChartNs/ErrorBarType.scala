package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorBarType extends js.Object

@JSGlobal("ej.datavisualization.Chart.ErrorBarType")
@js.native
object ErrorBarType extends js.Object {
  //string
  @js.native
  sealed trait FixedValue
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarType
  
  //string
  @js.native
  sealed trait Percentage
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarType
  
  //string
  @js.native
  sealed trait StandardDeviation
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarType
  
  //string
  @js.native
  sealed trait StandardError
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarType
  
  /* 0 */ val FixedValue: FixedValue with scala.Double = js.native
  /* 1 */ val Percentage: Percentage with scala.Double = js.native
  /* 2 */ val StandardDeviation: StandardDeviation with scala.Double = js.native
  /* 3 */ val StandardError: StandardError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarType with scala.Double
  ] = js.native
}

