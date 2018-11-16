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
  
  val FixedValue: FixedValue with java.lang.String = js.native
  val Percentage: Percentage with java.lang.String = js.native
  val StandardDeviation: StandardDeviation with java.lang.String = js.native
  val StandardError: StandardError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarType with java.lang.String
  ] = js.native
}

