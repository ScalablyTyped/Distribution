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
  
  val Dialog: Dialog with java.lang.String = js.native
  val DialogTemplate: DialogTemplate with java.lang.String = js.native
  val ExternalForm: ExternalForm with java.lang.String = js.native
  val ExternalFormTemplate: ExternalFormTemplate with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.KanbanNs.EditMode with java.lang.String] = js.native
}

