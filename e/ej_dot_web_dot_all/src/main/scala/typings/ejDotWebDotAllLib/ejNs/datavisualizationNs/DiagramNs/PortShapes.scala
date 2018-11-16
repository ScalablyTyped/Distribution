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
  
  val Circle: Circle with java.lang.String = js.native
  val Path: Path with java.lang.String = js.native
  val Square: Square with java.lang.String = js.native
  val X: X with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.PortShapes with java.lang.String
  ] = js.native
}

