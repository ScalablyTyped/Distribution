package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BridgeDirection
  
  //Used to set the direction of line bridges as left
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BridgeDirection
  
  //Used to set the direction of line bridges as right
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BridgeDirection
  
  //Used to set the direction of line bridges as top
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BridgeDirection
  
  val Bottom: Bottom with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BridgeDirection with java.lang.String
  ] = js.native
}

