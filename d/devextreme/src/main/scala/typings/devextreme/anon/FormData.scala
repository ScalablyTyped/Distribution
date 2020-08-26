package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormData extends js.Object {
  var component: js.UndefOr[dxForm] = js.native
  var formData: js.UndefOr[js.Any] = js.native
}

object FormData {
  @scala.inline
  def apply(): FormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormData]
  }
  @scala.inline
  implicit class FormDataOps[Self <: FormData] (val x: Self) extends AnyVal {
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
    def setComponent(value: dxForm): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setFormData(value: js.Any): Self = this.set("formData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
  }
  
}

