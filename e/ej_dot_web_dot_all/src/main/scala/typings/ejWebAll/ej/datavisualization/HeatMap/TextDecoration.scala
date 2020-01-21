package typings.ejWebAll.ej.datavisualization.HeatMap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDecoration extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.TextDecoration")
@js.native
object TextDecoration extends js.Object {
  //Defines a line through the text
  @js.native
  sealed trait LineThrough extends TextDecoration
  
  //Defines a normal text. This is default
  @js.native
  sealed trait None extends TextDecoration
  
  //Defines a line above the text
  @js.native
  sealed trait Overline extends TextDecoration
  
  //Defines a line below the text
  @js.native
  sealed trait Underline extends TextDecoration
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDecoration with Double] = js.native
  /* 2 */ @js.native
  object LineThrough extends TopLevel[LineThrough with Double]
  
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Overline extends TopLevel[Overline with Double]
  
  /* 0 */ @js.native
  object Underline extends TopLevel[Underline with Double]
  
}

