package typings.ejDotWebDotAll.ej.datavisualization.Chart

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
  sealed trait Exclusive extends boxPlotMode
  
  //string
  @js.native
  sealed trait Inclusive extends boxPlotMode
  
  //string
  @js.native
  sealed trait Normal extends boxPlotMode
  
  /* 0 */ val Exclusive: typings.ejDotWebDotAll.ej.datavisualization.Chart.boxPlotMode.Exclusive with Double = js.native
  /* 1 */ val Inclusive: typings.ejDotWebDotAll.ej.datavisualization.Chart.boxPlotMode.Inclusive with Double = js.native
  /* 2 */ val Normal: typings.ejDotWebDotAll.ej.datavisualization.Chart.boxPlotMode.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[boxPlotMode with Double] = js.native
}

