package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorElement extends js.Object {
  var component: js.UndefOr[dxFilterBuilder] = js.undefined
  var dataField: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var editorElement: js.UndefOr[dxElement] = js.undefined
  var editorName: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var filterOperation: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  var setValue: js.UndefOr[js.Any] = js.undefined
  var updateValueTimeout: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object EditorElement {
  @scala.inline
  def apply(
    component: dxFilterBuilder = null,
    dataField: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editorElement: dxElement = null,
    editorName: String = null,
    element: dxElement = null,
    filterOperation: String = null,
    model: js.Any = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    setValue: js.Any = null,
    updateValueTimeout: js.UndefOr[Double] = js.undefined,
    value: js.Any = null,
    width: js.UndefOr[Double] = js.undefined
  ): EditorElement = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (editorElement != null) __obj.updateDynamic("editorElement")(editorElement.asInstanceOf[js.Any])
    if (editorName != null) __obj.updateDynamic("editorName")(editorName.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (filterOperation != null) __obj.updateDynamic("filterOperation")(filterOperation.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(setValue.asInstanceOf[js.Any])
    if (!js.isUndefined(updateValueTimeout)) __obj.updateDynamic("updateValueTimeout")(updateValueTimeout.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorElement]
  }
}

