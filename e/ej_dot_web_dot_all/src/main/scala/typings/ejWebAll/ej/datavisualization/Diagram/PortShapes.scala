package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
