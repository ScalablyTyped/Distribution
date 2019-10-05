package typings.ejDotWebDotAll.ej.datavisualization.Chart

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
  
  /* 2 */ val MiddleBottom: typings.ejDotWebDotAll.ej.datavisualization.Chart.TextAlignment.MiddleBottom with Double = js.native
  /* 1 */ val MiddleCenter: typings.ejDotWebDotAll.ej.datavisualization.Chart.TextAlignment.MiddleCenter with Double = js.native
  /* 0 */ val MiddleTop: typings.ejDotWebDotAll.ej.datavisualization.Chart.TextAlignment.MiddleTop with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlignment with Double] = js.native
}

