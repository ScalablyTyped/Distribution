package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadOnly extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var component: js.UndefOr[dxTreeList] = js.undefined
  var dataField: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var editorElement: js.UndefOr[dxElement] = js.undefined
  var editorName: js.UndefOr[String] = js.undefined
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var parentType: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var row: js.UndefOr[dxTreeListRowObject] = js.undefined
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  var setValue: js.UndefOr[js.Any] = js.undefined
  var updateValueTimeout: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonReadOnly {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    component: dxTreeList = null,
    dataField: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editorElement: dxElement = null,
    editorName: String = null,
    editorOptions: js.Any = null,
    element: dxElement = null,
    model: js.Any = null,
    parentType: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    row: dxTreeListRowObject = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    setValue: js.Any = null,
    updateValueTimeout: Int | Double = null,
    value: js.Any = null,
    width: Int | Double = null
  ): AnonReadOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (editorElement != null) __obj.updateDynamic("editorElement")(editorElement.asInstanceOf[js.Any])
    if (editorName != null) __obj.updateDynamic("editorName")(editorName.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (parentType != null) __obj.updateDynamic("parentType")(parentType.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(setValue.asInstanceOf[js.Any])
    if (updateValueTimeout != null) __obj.updateDynamic("updateValueTimeout")(updateValueTimeout.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReadOnly]
  }
}

