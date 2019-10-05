package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditMode extends js.Object

@JSGlobal("ej.Grid.EditMode")
@js.native
object EditMode extends js.Object {
  ///Edit mode is batch.
  @js.native
  sealed trait Batch extends EditMode
  
  ///Edit mode is dialog.
  @js.native
  sealed trait Dialog extends EditMode
  
  ///Edit mode is dialog template.
  @js.native
  sealed trait DialogTemplate extends EditMode
  
  ///Edit mode is external form.
  @js.native
  sealed trait ExternalForm extends EditMode
  
  ///Edit mode is external form template.
  @js.native
  sealed trait ExternalFormTemplate extends EditMode
  
  ///Edit mode is inline form.
  @js.native
  sealed trait InlineForm extends EditMode
  
  ///Edit mode is inline template form.
  @js.native
  sealed trait InlineTemplateForm extends EditMode
  
  ///Edit mode is normal.
  @js.native
  sealed trait Normal extends EditMode
  
  /* 3 */ val Batch: typings.ejDotWebDotAll.ej.Grid.EditMode.Batch with Double = js.native
  /* 1 */ val Dialog: typings.ejDotWebDotAll.ej.Grid.EditMode.Dialog with Double = js.native
  /* 2 */ val DialogTemplate: typings.ejDotWebDotAll.ej.Grid.EditMode.DialogTemplate with Double = js.native
  /* 6 */ val ExternalForm: typings.ejDotWebDotAll.ej.Grid.EditMode.ExternalForm with Double = js.native
  /* 7 */ val ExternalFormTemplate: typings.ejDotWebDotAll.ej.Grid.EditMode.ExternalFormTemplate with Double = js.native
  /* 4 */ val InlineForm: typings.ejDotWebDotAll.ej.Grid.EditMode.InlineForm with Double = js.native
  /* 5 */ val InlineTemplateForm: typings.ejDotWebDotAll.ej.Grid.EditMode.InlineTemplateForm with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ej.Grid.EditMode.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditMode with Double] = js.native
}

