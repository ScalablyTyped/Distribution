package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  
  /* 3 */ val Bottom: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.BridgeDirection.Bottom with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.BridgeDirection.Left with Double = js.native
  /* 1 */ val Right: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.BridgeDirection.Right with Double = js.native
  /* 2 */ val Top: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.BridgeDirection.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BridgeDirection with Double] = js.native
}

