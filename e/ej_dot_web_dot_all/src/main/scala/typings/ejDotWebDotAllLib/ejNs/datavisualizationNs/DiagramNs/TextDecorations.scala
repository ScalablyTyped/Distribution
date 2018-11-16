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
  
  val LineThrough: LineThrough with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Overline: Overline with java.lang.String = js.native
  val Underline: Underline with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextDecorations with java.lang.String
  ] = js.native
}

