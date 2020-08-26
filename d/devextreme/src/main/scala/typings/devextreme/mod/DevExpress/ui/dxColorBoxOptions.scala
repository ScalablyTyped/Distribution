package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxColorBoxOptions extends dxDropDownEditorOptions[dxColorBox] {
  /** @name dxColorBox.Options.applyButtonText */
  var applyButtonText: js.UndefOr[String] = js.native
  /** @name dxColorBox.Options.cancelButtonText */
  var cancelButtonText: js.UndefOr[String] = js.native
  /** @name dxColorBox.Options.editAlphaChannel */
  var editAlphaChannel: js.UndefOr[Boolean] = js.native
  /** @name dxColorBox.Options.fieldTemplate */
  var fieldTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* value */ String, /* fieldElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** @name dxColorBox.Options.keyStep */
  var keyStep: js.UndefOr[Double] = js.native
}

object dxColorBoxOptions {
  @scala.inline
  def apply(): dxColorBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxColorBoxOptions]
  }
  @scala.inline
  implicit class dxColorBoxOptionsOps[Self <: dxColorBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplyButtonText(value: String): Self = this.set("applyButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyButtonText: Self = this.set("applyButtonText", js.undefined)
    @scala.inline
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonText: Self = this.set("cancelButtonText", js.undefined)
    @scala.inline
    def setEditAlphaChannel(value: Boolean): Self = this.set("editAlphaChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditAlphaChannel: Self = this.set("editAlphaChannel", js.undefined)
    @scala.inline
    def setFieldTemplateFunction2(value: (/* value */ String, /* fieldElement */ dxElement) => String | Element | JQuery): Self = this.set("fieldTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setFieldTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* value */ String, /* fieldElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("fieldTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldTemplate: Self = this.set("fieldTemplate", js.undefined)
    @scala.inline
    def setKeyStep(value: Double): Self = this.set("keyStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyStep: Self = this.set("keyStep", js.undefined)
  }
  
}

