package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait NoWrap
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextWrapping
  
  //Enables Line-break at normal word break points
  @js.native
  sealed trait Wrap
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextWrapping
  
  //Enables Line-break at normal word break points with longer word overflows
  @js.native
  sealed trait WrapWithOverflow
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextWrapping
  
  /* 0 */ val NoWrap: NoWrap with scala.Double = js.native
  /* 1 */ val Wrap: Wrap with scala.Double = js.native
  /* 2 */ val WrapWithOverflow: WrapWithOverflow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.TextWrapping with scala.Double
  ] = js.native
}

