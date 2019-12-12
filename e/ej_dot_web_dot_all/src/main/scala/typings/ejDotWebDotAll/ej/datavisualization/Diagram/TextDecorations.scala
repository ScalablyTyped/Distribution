package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextDecorations.LineThrough
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextDecorations.None
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextDecorations.Overline
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextDecorations.Underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDecorations extends js.Object

@JSGlobal("ej.datavisualization.Diagram.TextDecorations")
@js.native
object TextDecorations extends js.Object {
  //Used to set text decoration of the label as LineThrough
  @js.native
  sealed trait LineThrough extends TextDecorations
  
  //Used to set text decoration of the label as None
  @js.native
  sealed trait None extends TextDecorations
  
  //Used to set text decoration of the label as Overline
  @js.native
  sealed trait Overline extends TextDecorations
  
  //Used to set text decoration of the label as Underline
  @js.native
  sealed trait Underline extends TextDecorations
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDecorations with Double] = js.native
  /* 2 */ @js.native
  object LineThrough extends TopLevel[LineThrough with Double]
  
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Overline extends TopLevel[Overline with Double]
  
  /* 0 */ @js.native
  object Underline extends TopLevel[Underline with Double]
  
}

