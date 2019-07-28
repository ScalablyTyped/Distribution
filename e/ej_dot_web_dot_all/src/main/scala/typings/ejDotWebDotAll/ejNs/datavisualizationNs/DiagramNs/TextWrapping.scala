package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextWrapping extends js.Object

@JSGlobal("ej.datavisualization.Diagram.TextWrapping")
@js.native
object TextWrapping extends js.Object {
  //Disables wrapping
  @js.native
  sealed trait NoWrap extends TextWrapping
  
  //Enables Line-break at normal word break points
  @js.native
  sealed trait Wrap extends TextWrapping
  
  //Enables Line-break at normal word break points with longer word overflows
  @js.native
  sealed trait WrapWithOverflow extends TextWrapping
  
  /* 0 */ val NoWrap: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.TextWrapping.NoWrap with Double = js.native
  /* 1 */ val Wrap: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.TextWrapping.Wrap with Double = js.native
  /* 2 */ val WrapWithOverflow: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.TextWrapping.WrapWithOverflow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextWrapping with Double] = js.native
}

