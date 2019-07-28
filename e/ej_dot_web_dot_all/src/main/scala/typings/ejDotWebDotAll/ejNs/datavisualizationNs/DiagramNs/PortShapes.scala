package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PortShapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.PortShapes")
@js.native
object PortShapes extends js.Object {
  //Used to set port shape as Circle
  @js.native
  sealed trait Circle extends PortShapes
  
  //Used to set port shape as Path
  @js.native
  sealed trait Path extends PortShapes
  
  //Used to set port shape as Square
  @js.native
  sealed trait Square extends PortShapes
  
  //Used to set port shape as X
  @js.native
  sealed trait X extends PortShapes
  
  /* 1 */ val Circle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.PortShapes.Circle with Double = js.native
  /* 3 */ val Path: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.PortShapes.Path with Double = js.native
  /* 2 */ val Square: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.PortShapes.Square with Double = js.native
  /* 0 */ val X: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.PortShapes.X with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PortShapes with Double] = js.native
}

