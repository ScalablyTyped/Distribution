package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  
  /* 2 */ val LineThrough: typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextDecorations.LineThrough with Double = js.native
  /* 3 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextDecorations.None with Double = js.native
  /* 1 */ val Overline: typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextDecorations.Overline with Double = js.native
  /* 0 */ val Underline: typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextDecorations.Underline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDecorations with Double] = js.native
}

