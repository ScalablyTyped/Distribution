package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

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
  sealed trait Dialog
    extends ejDotWebDotAllLib.ejNs.KanbanNs.EditMode
  
  ///Creates Kanban with editMode as DialogTemplate
  @js.native
  sealed trait DialogTemplate
    extends ejDotWebDotAllLib.ejNs.KanbanNs.EditMode
  
  ///Creates Kanban with editMode as ExternalForm
  @js.native
  sealed trait ExternalForm
    extends ejDotWebDotAllLib.ejNs.KanbanNs.EditMode
  
  ///Creates Kanban with editMode as ExternalFormTemplate
  @js.native
  sealed trait ExternalFormTemplate
    extends ejDotWebDotAllLib.ejNs.KanbanNs.EditMode
  
  /* 0 */ val Dialog: Dialog with scala.Double = js.native
  /* 1 */ val DialogTemplate: DialogTemplate with scala.Double = js.native
  /* 2 */ val ExternalForm: ExternalForm with scala.Double = js.native
  /* 3 */ val ExternalFormTemplate: ExternalFormTemplate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.KanbanNs.EditMode with scala.Double] = js.native
}

