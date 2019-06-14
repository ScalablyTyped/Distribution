package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait boxPlotMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.boxPlotMode")
@js.native
object boxPlotMode extends js.Object {
  //string
  @js.native
  sealed trait Exclusive
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.boxPlotMode
  
  //string
  @js.native
  sealed trait Inclusive
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.boxPlotMode
  
  //string
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.boxPlotMode
  
  /* 0 */ val Exclusive: Exclusive with scala.Double = js.native
  /* 1 */ val Inclusive: Inclusive with scala.Double = js.native
  /* 2 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.boxPlotMode with scala.Double] = js.native
}

