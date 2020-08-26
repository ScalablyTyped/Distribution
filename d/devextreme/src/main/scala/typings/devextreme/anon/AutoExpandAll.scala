package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoExpandAll extends js.Object {
  var autoExpandAll: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* detailElement */ dxElement, /* detailInfo */ Watch, _])
  ] = js.native
}

object AutoExpandAll {
  @scala.inline
  def apply(): AutoExpandAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoExpandAll]
  }
  @scala.inline
  implicit class AutoExpandAllOps[Self <: AutoExpandAll] (val x: Self) extends AnyVal {
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
    def setAutoExpandAll(value: Boolean): Self = this.set("autoExpandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoExpandAll: Self = this.set("autoExpandAll", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setTemplateFunction2(value: (/* detailElement */ dxElement, /* detailInfo */ Watch) => _): Self = this.set("template", js.Any.fromFunction2(value))
    @scala.inline
    def setTemplate(value: template | (js.Function2[/* detailElement */ dxElement, /* detailInfo */ Watch, _])): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

