package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

