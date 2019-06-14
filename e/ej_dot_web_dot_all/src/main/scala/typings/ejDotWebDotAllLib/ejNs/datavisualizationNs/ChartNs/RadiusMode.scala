package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RadiusMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.RadiusMode")
@js.native
object RadiusMode extends js.Object {
  //string
  @js.native
  sealed trait Auto
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RadiusMode
  
  //string
  @js.native
  sealed trait MinMax
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RadiusMode
  
  /* 1 */ val Auto: Auto with scala.Double = js.native
  /* 0 */ val MinMax: MinMax with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RadiusMode with scala.Double] = js.native
}

