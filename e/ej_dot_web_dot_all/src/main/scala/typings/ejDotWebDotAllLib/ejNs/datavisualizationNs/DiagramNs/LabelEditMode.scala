package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelEditMode extends js.Object

@JSGlobal("ej.datavisualization.Diagram.LabelEditMode")
@js.native
object LabelEditMode extends js.Object {
  //Used to set label edit mode as edit
  @js.native
  sealed trait Edit
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelEditMode
  
  //Used to set label edit mode as view
  @js.native
  sealed trait View
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelEditMode
  
  /* 0 */ val Edit: Edit with scala.Double = js.native
  /* 1 */ val View: View with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelEditMode with scala.Double
  ] = js.native
}

