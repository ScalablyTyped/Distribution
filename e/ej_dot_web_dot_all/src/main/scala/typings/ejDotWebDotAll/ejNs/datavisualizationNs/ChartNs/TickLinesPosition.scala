package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TickLinesPosition extends js.Object

@JSGlobal("ej.datavisualization.Chart.TickLinesPosition")
@js.native
object TickLinesPosition extends js.Object {
  //string
  @js.native
  sealed trait Inside extends TickLinesPosition
  
  //string
  @js.native
  sealed trait Outside extends TickLinesPosition
  
  /* 0 */ val Inside: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.TickLinesPosition.Inside with Double = js.native
  /* 1 */ val Outside: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.TickLinesPosition.Outside with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TickLinesPosition with Double] = js.native
}

