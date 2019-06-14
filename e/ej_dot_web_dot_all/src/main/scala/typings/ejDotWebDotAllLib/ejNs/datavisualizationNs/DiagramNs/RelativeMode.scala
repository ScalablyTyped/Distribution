package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelativeMode extends js.Object

@JSGlobal("ej.datavisualization.Diagram.RelativeMode")
@js.native
object RelativeMode extends js.Object {
  //Shows tooltip at the mouse position
  @js.native
  sealed trait Mouse
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.RelativeMode
  
  //Shows tooltip around the node
  @js.native
  sealed trait Object
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.RelativeMode
  
  /* 1 */ val Mouse: Mouse with scala.Double = js.native
  /* 0 */ val Object: Object with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.RelativeMode with scala.Double
  ] = js.native
}

