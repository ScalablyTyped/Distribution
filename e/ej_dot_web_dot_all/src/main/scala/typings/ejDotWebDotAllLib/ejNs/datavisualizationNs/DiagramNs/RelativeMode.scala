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
  
  val Mouse: Mouse with java.lang.String = js.native
  val Object: Object with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.RelativeMode with java.lang.String
  ] = js.native
}

