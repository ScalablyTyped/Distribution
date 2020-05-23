package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

