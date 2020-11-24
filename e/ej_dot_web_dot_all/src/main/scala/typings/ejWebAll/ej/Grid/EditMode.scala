package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
