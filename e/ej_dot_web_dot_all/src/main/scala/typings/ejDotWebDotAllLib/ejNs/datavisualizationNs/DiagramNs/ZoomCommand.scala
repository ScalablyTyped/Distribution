package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZoomCommand extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ZoomCommand")
@js.native
object ZoomCommand extends js.Object {
  //Used to zoom in the Diagram
  @js.native
  sealed trait ZoomIn
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ZoomCommand
  
  //Used to zoom out the diagram
  @js.native
  sealed trait ZoomOut
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ZoomCommand
  
  val ZoomIn: ZoomIn with java.lang.String = js.native
  val ZoomOut: ZoomOut with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ZoomCommand with java.lang.String
  ] = js.native
}

