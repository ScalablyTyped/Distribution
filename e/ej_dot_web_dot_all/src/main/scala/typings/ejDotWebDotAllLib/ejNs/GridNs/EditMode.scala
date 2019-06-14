package typings
package ejDotWebDotAllLib.ejNs.GridNs

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
  sealed trait Batch
    extends ejDotWebDotAllLib.ejNs.GridNs.EditMode
  
  ///Edit mode is dialog.
  @js.native
  sealed trait Dialog
    extends ejDotWebDotAllLib.ejNs.GridNs.EditMode
  
  ///Edit mode is dialog template.
  @js.native
  sealed trait DialogTemplate
    extends ejDotWebDotAllLib.ejNs.GridNs.EditMode
  
  ///Edit mode is external form.
  @js.native
  sealed trait ExternalForm
    extends ejDotWebDotAllLib.ejNs.GridNs.EditMode
  
  ///Edit mode is external form template.
  @js.native
  sealed trait ExternalFormTemplate
    extends ejDotWebDotAllLib.ejNs.GridNs.EditMode
  
  ///Edit mode is inline form.
  @js.native
  sealed trait InlineForm
    extends ejDotWebDotAllLib.ejNs.GridNs.EditMode
  
  ///Edit mode is inline template form.
  @js.native
  sealed trait InlineTemplateForm
    extends ejDotWebDotAllLib.ejNs.GridNs.EditMode
  
  ///Edit mode is normal.
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.GridNs.EditMode
  
  /* 3 */ val Batch: Batch with scala.Double = js.native
  /* 1 */ val Dialog: Dialog with scala.Double = js.native
  /* 2 */ val DialogTemplate: DialogTemplate with scala.Double = js.native
  /* 6 */ val ExternalForm: ExternalForm with scala.Double = js.native
  /* 7 */ val ExternalFormTemplate: ExternalFormTemplate with scala.Double = js.native
  /* 4 */ val InlineForm: InlineForm with scala.Double = js.native
  /* 5 */ val InlineTemplateForm: InlineTemplateForm with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.EditMode with scala.Double] = js.native
}

