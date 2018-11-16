package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DecoratorShapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.DecoratorShapes")
@js.native
object DecoratorShapes extends js.Object {
  //Used to set decorator shape as Arrow
  @js.native
  sealed trait Arrow
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DecoratorShapes
  
  //Used to set decorator shape as Circle
  @js.native
  sealed trait Circle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DecoratorShapes
  
  //Used to set decorator shape as Diamond
  @js.native
  sealed trait Diamond
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DecoratorShapes
  
  //Used to set decorator shape as none
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DecoratorShapes
  
  //Used to set decorator shape as Open Arrow
  @js.native
  sealed trait OpenArrow
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DecoratorShapes
  
  //Used to set decorator shape as path
  @js.native
  sealed trait Path
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DecoratorShapes
  
  val Arrow: Arrow with java.lang.String = js.native
  val Circle: Circle with java.lang.String = js.native
  val Diamond: Diamond with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val OpenArrow: OpenArrow with java.lang.String = js.native
  val Path: Path with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DecoratorShapes with java.lang.String
  ] = js.native
}

