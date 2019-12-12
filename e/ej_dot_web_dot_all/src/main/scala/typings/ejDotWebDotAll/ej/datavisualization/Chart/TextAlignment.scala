package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.TextAlignment.MiddleBottom
import typings.ejDotWebDotAll.ej.datavisualization.Chart.TextAlignment.MiddleCenter
import typings.ejDotWebDotAll.ej.datavisualization.Chart.TextAlignment.MiddleTop
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlignment with Double] = js.native
  /* 2 */ @js.native
  object MiddleBottom extends TopLevel[MiddleBottom with Double]
  
  /* 1 */ @js.native
  object MiddleCenter extends TopLevel[MiddleCenter with Double]
  
  /* 0 */ @js.native
  object MiddleTop extends TopLevel[MiddleTop with Double]
  
}

