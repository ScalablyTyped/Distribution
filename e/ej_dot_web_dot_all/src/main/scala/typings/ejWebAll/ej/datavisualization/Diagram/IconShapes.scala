package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconShapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.IconShapes")
@js.native
object IconShapes extends js.Object {
  //Used to set collapse icon shape as Arrow(Up/Down)
  @js.native
  sealed trait Arrow extends IconShapes
  
  //Used to set icon shape as image
  @js.native
  sealed trait Image extends IconShapes
  
  //Used to set collapse icon shape as Minus
  @js.native
  sealed trait Minus extends IconShapes
  
  //Used to set collapse icon shape as none
  @js.native
  sealed trait None extends IconShapes
  
  //Used to set collapse icon shape as path
  @js.native
  sealed trait Path extends IconShapes
  
  //Used to set collapse icon shape as Plus
  @js.native
  sealed trait Plus extends IconShapes
  
  //Used to set icon shape as template
  @js.native
  sealed trait Template extends IconShapes
  
}

