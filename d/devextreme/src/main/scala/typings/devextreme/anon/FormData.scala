package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormData extends js.Object {
  var component: js.UndefOr[dxForm] = js.undefined
  var formData: js.UndefOr[js.Any] = js.undefined
}

object FormData {
  @scala.inline
  def apply(component: dxForm = null, formData: js.Any = null): FormData = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormData]
  }
}

