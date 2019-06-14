package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait LineThrough
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextDecorations
  
  //Used to set text decoration of the label as None
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextDecorations
  
  //Used to set text decoration of the label as Overline
  @js.native
  sealed trait Overline
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextDecorations
  
  //Used to set text decoration of the label as Underline
  @js.native
  sealed trait Underline
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextDecorations
  
  /* 2 */ val LineThrough: LineThrough with scala.Double = js.native
  /* 3 */ val None: None with scala.Double = js.native
  /* 1 */ val Overline: Overline with scala.Double = js.native
  /* 0 */ val Underline: Underline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextDecorations with scala.Double
  ] = js.native
}

