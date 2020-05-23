package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BridgeDirection extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BridgeDirection")
@js.native
object BridgeDirection extends js.Object {
  //Used to set the direction of line bridges as bottom
  @js.native
  sealed trait Bottom extends BridgeDirection
  
  //Used to set the direction of line bridges as left
  @js.native
  sealed trait Left extends BridgeDirection
  
  //Used to set the direction of line bridges as right
  @js.native
  sealed trait Right extends BridgeDirection
  
  //Used to set the direction of line bridges as top
  @js.native
  sealed trait Top extends BridgeDirection
  
}

