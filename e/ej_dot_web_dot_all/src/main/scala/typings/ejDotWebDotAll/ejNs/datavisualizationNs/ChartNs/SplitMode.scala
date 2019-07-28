package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SplitMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.SplitMode")
@js.native
object SplitMode extends js.Object {
  //string
  @js.native
  sealed trait Indexes extends SplitMode
  
  //string
  @js.native
  sealed trait Percentage extends SplitMode
  
  //string
  @js.native
  sealed trait Position extends SplitMode
  
  //string
  @js.native
  sealed trait Value extends SplitMode
  
  /* 3 */ val Indexes: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.SplitMode.Indexes with Double = js.native
  /* 2 */ val Percentage: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.SplitMode.Percentage with Double = js.native
  /* 0 */ val Position: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.SplitMode.Position with Double = js.native
  /* 1 */ val Value: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.SplitMode.Value with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SplitMode with Double] = js.native
}

