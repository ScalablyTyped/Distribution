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
  
  val Drag: Drag with java.lang.String = js.native
  val Draw: Draw with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ActiveTool with java.lang.String
  ] = js.native
}

