package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActiveTool extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ActiveTool")
@js.native
object ActiveTool extends js.Object {
  //Activate the port tool to drag when the mouse is moved over the port
  @js.native
  sealed trait Drag
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ActiveTool
  
  //Activate the draw tool to draw when the mouse is moved over the port
  @js.native
  sealed trait Draw
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ActiveTool
  
  //Set the default Tool
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ActiveTool
  
  /* 1 */ val Drag: Drag with scala.Double = js.native
  /* 2 */ val Draw: Draw with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ActiveTool with scala.Double
  ] = js.native
}

