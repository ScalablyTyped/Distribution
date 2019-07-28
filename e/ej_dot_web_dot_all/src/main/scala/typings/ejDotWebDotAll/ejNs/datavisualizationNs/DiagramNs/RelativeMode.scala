package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Mouse extends RelativeMode
  
  //Shows tooltip around the node
  @js.native
  sealed trait Object extends RelativeMode
  
  /* 1 */ val Mouse: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.RelativeMode.Mouse with Double = js.native
  /* 0 */ val Object: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.RelativeMode.Object with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelativeMode with Double] = js.native
}

