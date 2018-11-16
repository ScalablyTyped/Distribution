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
  
  val Edit: Edit with java.lang.String = js.native
  val View: View with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelEditMode with java.lang.String
  ] = js.native
}

