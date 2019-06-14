package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Circle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortShapes
  
  //Used to set port shape as Path
  @js.native
  sealed trait Path
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortShapes
  
  //Used to set port shape as Square
  @js.native
  sealed trait Square
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortShapes
  
  //Used to set port shape as X
  @js.native
  sealed trait X
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortShapes
  
  /* 1 */ val Circle: Circle with scala.Double = js.native
  /* 3 */ val Path: Path with scala.Double = js.native
  /* 2 */ val Square: Square with scala.Double = js.native
  /* 0 */ val X: X with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortShapes with scala.Double
  ] = js.native
}

