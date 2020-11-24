package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
