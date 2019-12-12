package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.LabelRenderingMode.HTML
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.LabelRenderingMode.SVG
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelRenderingMode with Double] = js.native
  /* 0 */ @js.native
  object HTML extends TopLevel[HTML with Double]
  
  /* 1 */ @js.native
  object SVG extends TopLevel[SVG with Double]
  
}

