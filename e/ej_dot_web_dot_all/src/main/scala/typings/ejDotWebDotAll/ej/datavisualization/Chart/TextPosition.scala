package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextPosition extends js.Object

@JSGlobal("ej.datavisualization.Chart.TextPosition")
@js.native
object TextPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends TextPosition
  
  //string
  @js.native
  sealed trait Middle extends TextPosition
  
  //string
  @js.native
  sealed trait Top extends TextPosition
  
  /* 1 */ val Bottom: typings.ejDotWebDotAll.ej.datavisualization.Chart.TextPosition.Bottom with Double = js.native
  /* 2 */ val Middle: typings.ejDotWebDotAll.ej.datavisualization.Chart.TextPosition.Middle with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ej.datavisualization.Chart.TextPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextPosition with Double] = js.native
}

