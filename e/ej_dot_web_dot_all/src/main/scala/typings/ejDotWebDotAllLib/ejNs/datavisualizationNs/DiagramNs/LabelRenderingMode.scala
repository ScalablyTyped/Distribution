package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelRenderingMode extends js.Object

@JSGlobal("ej.datavisualization.Diagram.LabelRenderingMode")
@js.native
object LabelRenderingMode extends js.Object {
  //Sets the labelRenderingMode as HTML
  @js.native
  sealed trait HTML
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelRenderingMode
  
  //Sets the labelRenderingMode as SVG
  @js.native
  sealed trait SVG
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelRenderingMode
  
  val HTML: HTML with java.lang.String = js.native
  val SVG: SVG with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelRenderingMode with java.lang.String
  ] = js.native
}

