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
  
  val Batch: Batch with java.lang.String = js.native
  val Dialog: Dialog with java.lang.String = js.native
  val DialogTemplate: DialogTemplate with java.lang.String = js.native
  val ExternalForm: ExternalForm with java.lang.String = js.native
  val ExternalFormTemplate: ExternalFormTemplate with java.lang.String = js.native
  val InlineForm: InlineForm with java.lang.String = js.native
  val InlineTemplateForm: InlineTemplateForm with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.EditMode with java.lang.String] = js.native
}

