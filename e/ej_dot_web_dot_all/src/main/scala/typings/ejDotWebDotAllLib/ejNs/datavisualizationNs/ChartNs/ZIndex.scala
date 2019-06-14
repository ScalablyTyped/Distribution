package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZIndex extends js.Object

@JSGlobal("ej.datavisualization.Chart.ZIndex")
@js.native
object ZIndex extends js.Object {
  //string
  @js.native
  sealed trait Inside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ZIndex
  
  //string
  @js.native
  sealed trait Over
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ZIndex
  
  /* 0 */ val Inside: Inside with scala.Double = js.native
  /* 1 */ val Over: Over with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ZIndex with scala.Double] = js.native
}

