package typings.ejDotWebDotAll.ejNs.GridNs

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
  
  /* 3 */ val Batch: typings.ejDotWebDotAll.ejNs.GridNs.EditMode.Batch with Double = js.native
  /* 1 */ val Dialog: typings.ejDotWebDotAll.ejNs.GridNs.EditMode.Dialog with Double = js.native
  /* 2 */ val DialogTemplate: typings.ejDotWebDotAll.ejNs.GridNs.EditMode.DialogTemplate with Double = js.native
  /* 6 */ val ExternalForm: typings.ejDotWebDotAll.ejNs.GridNs.EditMode.ExternalForm with Double = js.native
  /* 7 */ val ExternalFormTemplate: typings.ejDotWebDotAll.ejNs.GridNs.EditMode.ExternalFormTemplate with Double = js.native
  /* 4 */ val InlineForm: typings.ejDotWebDotAll.ejNs.GridNs.EditMode.InlineForm with Double = js.native
  /* 5 */ val InlineTemplateForm: typings.ejDotWebDotAll.ejNs.GridNs.EditMode.InlineTemplateForm with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ejNs.GridNs.EditMode.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditMode with Double] = js.native
}

