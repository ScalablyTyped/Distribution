package typings.ejDotWebDotAll.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditMode extends js.Object

@JSGlobal("ej.Kanban.EditMode")
@js.native
object EditMode extends js.Object {
  ///Creates Kanban with editMode as Dialog
  @js.native
  sealed trait Dialog extends EditMode
  
  ///Creates Kanban with editMode as DialogTemplate
  @js.native
  sealed trait DialogTemplate extends EditMode
  
  ///Creates Kanban with editMode as ExternalForm
  @js.native
  sealed trait ExternalForm extends EditMode
  
  ///Creates Kanban with editMode as ExternalFormTemplate
  @js.native
  sealed trait ExternalFormTemplate extends EditMode
  
  /* 0 */ val Dialog: typings.ejDotWebDotAll.ejNs.KanbanNs.EditMode.Dialog with Double = js.native
  /* 1 */ val DialogTemplate: typings.ejDotWebDotAll.ejNs.KanbanNs.EditMode.DialogTemplate with Double = js.native
  /* 2 */ val ExternalForm: typings.ejDotWebDotAll.ejNs.KanbanNs.EditMode.ExternalForm with Double = js.native
  /* 3 */ val ExternalFormTemplate: typings.ejDotWebDotAll.ejNs.KanbanNs.EditMode.ExternalFormTemplate with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditMode with Double] = js.native
}

