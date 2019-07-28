package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.TextAlignment")
@js.native
object TextAlignment extends js.Object {
  //string
  @js.native
  sealed trait MiddleBottom extends TextAlignment
  
  //string
  @js.native
  sealed trait MiddleCenter extends TextAlignment
  
  //string
  @js.native
  sealed trait MiddleTop extends TextAlignment
  
  /* 2 */ val MiddleBottom: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.TextAlignment.MiddleBottom with Double = js.native
  /* 1 */ val MiddleCenter: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.TextAlignment.MiddleCenter with Double = js.native
  /* 0 */ val MiddleTop: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.TextAlignment.MiddleTop with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlignment with Double] = js.native
}

