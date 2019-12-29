package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DecoratorShapes with Double] = js.native
  /* 1 */ @js.native
  object Arrow extends TopLevel[Arrow with Double]
  
  /* 3 */ @js.native
  object Circle extends TopLevel[Circle with Double]
  
  /* 4 */ @js.native
  object Diamond extends TopLevel[Diamond with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object OpenArrow extends TopLevel[OpenArrow with Double]
  
  /* 5 */ @js.native
  object Path extends TopLevel[Path with Double]
  
}

