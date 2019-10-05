package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  sealed trait ZoomIn extends ZoomCommand
  
  //Used to zoom out the diagram
  @js.native
  sealed trait ZoomOut extends ZoomCommand
  
  /* 0 */ val ZoomIn: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ZoomCommand.ZoomIn with Double = js.native
  /* 1 */ val ZoomOut: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ZoomCommand.ZoomOut with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ZoomCommand with Double] = js.native
}

