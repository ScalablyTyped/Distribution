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
  
  /* 1 */ val Arrow: Arrow with scala.Double = js.native
  /* 3 */ val Circle: Circle with scala.Double = js.native
  /* 4 */ val Diamond: Diamond with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val OpenArrow: OpenArrow with scala.Double = js.native
  /* 5 */ val Path: Path with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DecoratorShapes with scala.Double
  ] = js.native
}

