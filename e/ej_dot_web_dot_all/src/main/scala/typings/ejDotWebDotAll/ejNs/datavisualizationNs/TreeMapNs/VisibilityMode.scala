package typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisibilityMode extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.VisibilityMode")
@js.native
object VisibilityMode extends js.Object {
  //specifies the hide on exceeded length mode
  @js.native
  sealed trait Hideonexceededlength extends VisibilityMode
  
  //specifies the visible mode
  @js.native
  sealed trait Top extends VisibilityMode
  
  /* 1 */ val Hideonexceededlength: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.VisibilityMode.Hideonexceededlength with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ejNs.datavisualizationNs.TreeMapNs.VisibilityMode.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisibilityMode with Double] = js.native
}

