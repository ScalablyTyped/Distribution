package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends VerticalAlignment
  
  //string
  @js.native
  sealed trait Middle extends VerticalAlignment
  
  //string
  @js.native
  sealed trait Top extends VerticalAlignment
  
  /* 1 */ val Bottom: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.VerticalAlignment.Bottom with Double = js.native
  /* 2 */ val Middle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.VerticalAlignment.Middle with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.VerticalAlignment.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalAlignment with Double] = js.native
}

