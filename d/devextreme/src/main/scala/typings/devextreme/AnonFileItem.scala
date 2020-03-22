package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxFileManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileItem extends js.Object {
  var component: js.UndefOr[dxFileManager] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var fileItem: js.UndefOr[js.Any] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonFileItem {
  @scala.inline
  def apply(
    component: dxFileManager = null,
    element: dxElement = null,
    fileItem: js.Any = null,
    model: js.Any = null
  ): AnonFileItem = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (fileItem != null) __obj.updateDynamic("fileItem")(fileItem.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileItem]
  }
}

