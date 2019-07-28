package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

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
  sealed trait Auto extends RadiusMode
  
  //string
  @js.native
  sealed trait MinMax extends RadiusMode
  
  /* 1 */ val Auto: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.RadiusMode.Auto with Double = js.native
  /* 0 */ val MinMax: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.RadiusMode.MinMax with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RadiusMode with Double] = js.native
}

