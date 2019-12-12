package typings.ejDotWebDotAll.ej.Kanban

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Kanban.EditMode.DialogTemplate
import typings.ejDotWebDotAll.ej.Kanban.EditMode.ExternalForm
import typings.ejDotWebDotAll.ej.Kanban.EditMode.ExternalFormTemplate
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditMode with Double] = js.native
  /* 0 */ @js.native
  object Dialog
    extends TopLevel[typings.ejDotWebDotAll.ej.Kanban.EditMode.Dialog with Double]
  
  /* 1 */ @js.native
  object DialogTemplate extends TopLevel[DialogTemplate with Double]
  
  /* 2 */ @js.native
  object ExternalForm extends TopLevel[ExternalForm with Double]
  
  /* 3 */ @js.native
  object ExternalFormTemplate extends TopLevel[ExternalFormTemplate with Double]
  
}

