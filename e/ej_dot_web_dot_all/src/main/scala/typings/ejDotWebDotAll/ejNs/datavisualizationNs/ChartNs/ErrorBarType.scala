package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

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
  sealed trait FixedValue extends ErrorBarType
  
  //string
  @js.native
  sealed trait Percentage extends ErrorBarType
  
  //string
  @js.native
  sealed trait StandardDeviation extends ErrorBarType
  
  //string
  @js.native
  sealed trait StandardError extends ErrorBarType
  
  /* 0 */ val FixedValue: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ErrorBarType.FixedValue with Double = js.native
  /* 1 */ val Percentage: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ErrorBarType.Percentage with Double = js.native
  /* 2 */ val StandardDeviation: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ErrorBarType.StandardDeviation with Double = js.native
  /* 3 */ val StandardError: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ErrorBarType.StandardError with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorBarType with Double] = js.native
}

