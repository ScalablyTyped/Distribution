package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ZoomCommand.ZoomIn
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ZoomCommand.ZoomOut
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ZoomCommand with Double] = js.native
  /* 0 */ @js.native
  object ZoomIn extends TopLevel[ZoomIn with Double]
  
  /* 1 */ @js.native
  object ZoomOut extends TopLevel[ZoomOut with Double]
  
}

