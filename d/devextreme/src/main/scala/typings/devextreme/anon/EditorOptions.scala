package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions extends js.Object {
  var component: js.UndefOr[dxForm] = js.undefined
  var dataField: js.UndefOr[String] = js.undefined
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  var editorType: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object EditorOptions {
  @scala.inline
  def apply(
    component: dxForm = null,
    dataField: String = null,
    editorOptions: js.Any = null,
    editorType: String = null,
    name: String = null
  ): EditorOptions = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (editorType != null) __obj.updateDynamic("editorType")(editorType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
}

