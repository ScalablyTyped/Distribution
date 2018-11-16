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
  
  val Inside: Inside with java.lang.String = js.native
  val Outside: Outside with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TickLinesPosition with java.lang.String
  ] = js.native
}

