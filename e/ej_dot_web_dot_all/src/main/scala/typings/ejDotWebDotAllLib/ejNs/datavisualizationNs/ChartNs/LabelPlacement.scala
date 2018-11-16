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
  
  val BetweenTicks: BetweenTicks with java.lang.String = js.native
  val OnTicks: OnTicks with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelPlacement with java.lang.String
  ] = js.native
}

