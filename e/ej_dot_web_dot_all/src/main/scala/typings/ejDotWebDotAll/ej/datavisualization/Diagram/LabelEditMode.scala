package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  sealed trait Edit extends LabelEditMode
  
  //Used to set label edit mode as view
  @js.native
  sealed trait View extends LabelEditMode
  
  /* 0 */ val Edit: typings.ejDotWebDotAll.ej.datavisualization.Diagram.LabelEditMode.Edit with Double = js.native
  /* 1 */ val View: typings.ejDotWebDotAll.ej.datavisualization.Diagram.LabelEditMode.View with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelEditMode with Double] = js.native
}

