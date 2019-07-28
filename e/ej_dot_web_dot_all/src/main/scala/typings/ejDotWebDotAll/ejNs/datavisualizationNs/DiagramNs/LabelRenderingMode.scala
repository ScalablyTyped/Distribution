package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait HTML extends LabelRenderingMode
  
  //Sets the labelRenderingMode as SVG
  @js.native
  sealed trait SVG extends LabelRenderingMode
  
  /* 0 */ val HTML: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.LabelRenderingMode.HTML with Double = js.native
  /* 1 */ val SVG: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.LabelRenderingMode.SVG with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelRenderingMode with Double] = js.native
}

