package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.TextPosition.Bottom
import typings.ejDotWebDotAll.ej.datavisualization.Chart.TextPosition.Middle
import typings.ejDotWebDotAll.ej.datavisualization.Chart.TextPosition.Top
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextPosition with Double] = js.native
  /* 1 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 2 */ @js.native
  object Middle extends TopLevel[Middle with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

