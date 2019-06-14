package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelPlacement extends js.Object

@JSGlobal("ej.datavisualization.Chart.LabelPlacement")
@js.native
object LabelPlacement extends js.Object {
  //string
  @js.native
  sealed trait BetweenTicks
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelPlacement
  
  //string
  @js.native
  sealed trait OnTicks
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelPlacement
  
  /* 1 */ val BetweenTicks: BetweenTicks with scala.Double = js.native
  /* 0 */ val OnTicks: OnTicks with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelPlacement with scala.Double
  ] = js.native
}

