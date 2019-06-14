package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

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
  sealed trait Inside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TickLinesPosition
  
  //string
  @js.native
  sealed trait Outside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TickLinesPosition
  
  /* 0 */ val Inside: Inside with scala.Double = js.native
  /* 1 */ val Outside: Outside with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TickLinesPosition with scala.Double
  ] = js.native
}

