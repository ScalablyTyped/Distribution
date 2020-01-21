package typings.ejWebAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditMode with Double] = js.native
  /* 3 */ @js.native
  object Batch extends TopLevel[Batch with Double]
  
  /* 1 */ @js.native
  object Dialog extends TopLevel[Dialog with Double]
  
  /* 2 */ @js.native
  object DialogTemplate extends TopLevel[DialogTemplate with Double]
  
  /* 6 */ @js.native
  object ExternalForm extends TopLevel[ExternalForm with Double]
  
  /* 7 */ @js.native
  object ExternalFormTemplate extends TopLevel[ExternalFormTemplate with Double]
  
  /* 4 */ @js.native
  object InlineForm extends TopLevel[InlineForm with Double]
  
  /* 5 */ @js.native
  object InlineTemplateForm extends TopLevel[InlineTemplateForm with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}

