package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmptyPointMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.EmptyPointMode")
@js.native
object EmptyPointMode extends js.Object {
  //string
  @js.native
  sealed trait Average extends EmptyPointMode
  
  //string
  @js.native
  sealed trait Gap extends EmptyPointMode
  
  //string
  @js.native
  sealed trait Zero extends EmptyPointMode
  
  /* 2 */ val Average: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.EmptyPointMode.Average with Double = js.native
  /* 0 */ val Gap: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.EmptyPointMode.Gap with Double = js.native
  /* 1 */ val Zero: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.EmptyPointMode.Zero with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmptyPointMode with Double] = js.native
}

