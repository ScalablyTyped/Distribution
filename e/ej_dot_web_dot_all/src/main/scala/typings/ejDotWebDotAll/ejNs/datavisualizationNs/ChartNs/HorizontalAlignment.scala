package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Left extends HorizontalAlignment
  
  //string
  @js.native
  sealed trait Middle extends HorizontalAlignment
  
  //string
  @js.native
  sealed trait Right extends HorizontalAlignment
  
  /* 0 */ val Left: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.HorizontalAlignment.Left with Double = js.native
  /* 2 */ val Middle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.HorizontalAlignment.Middle with Double = js.native
  /* 1 */ val Right: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.HorizontalAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalAlignment with Double] = js.native
}

