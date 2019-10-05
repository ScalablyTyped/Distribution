package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  sealed trait Arrow extends DecoratorShapes
  
  //Used to set decorator shape as Circle
  @js.native
  sealed trait Circle extends DecoratorShapes
  
  //Used to set decorator shape as Diamond
  @js.native
  sealed trait Diamond extends DecoratorShapes
  
  //Used to set decorator shape as none
  @js.native
  sealed trait None extends DecoratorShapes
  
  //Used to set decorator shape as Open Arrow
  @js.native
  sealed trait OpenArrow extends DecoratorShapes
  
  //Used to set decorator shape as path
  @js.native
  sealed trait Path extends DecoratorShapes
  
  /* 1 */ val Arrow: typings.ejDotWebDotAll.ej.datavisualization.Diagram.DecoratorShapes.Arrow with Double = js.native
  /* 3 */ val Circle: typings.ejDotWebDotAll.ej.datavisualization.Diagram.DecoratorShapes.Circle with Double = js.native
  /* 4 */ val Diamond: typings.ejDotWebDotAll.ej.datavisualization.Diagram.DecoratorShapes.Diamond with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.DecoratorShapes.None with Double = js.native
  /* 2 */ val OpenArrow: typings.ejDotWebDotAll.ej.datavisualization.Diagram.DecoratorShapes.OpenArrow with Double = js.native
  /* 5 */ val Path: typings.ejDotWebDotAll.ej.datavisualization.Diagram.DecoratorShapes.Path with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DecoratorShapes with Double] = js.native
}

