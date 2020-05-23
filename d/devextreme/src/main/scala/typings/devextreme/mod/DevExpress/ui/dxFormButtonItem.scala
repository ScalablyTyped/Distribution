package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.button
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.empty
import typings.devextreme.devextremeStrings.group
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.simple
import typings.devextreme.devextremeStrings.tabbed
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFormButtonItem extends js.Object {
  /** @deprecated */
  /** @name dxFormButtonItem.alignment */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  /** @name dxFormButtonItem.buttonOptions */
  var buttonOptions: js.UndefOr[dxButtonOptions] = js.undefined
  /** @name dxFormButtonItem.colSpan */
  var colSpan: js.UndefOr[Double] = js.undefined
  /** @name dxFormButtonItem.cssClass */
  var cssClass: js.UndefOr[String] = js.undefined
  /** @name dxFormButtonItem.horizontalAlignment */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  /** @name dxFormButtonItem.itemType */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.undefined
  /** @name dxFormButtonItem.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name dxFormButtonItem.verticalAlignment */
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.undefined
  /** @name dxFormButtonItem.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name dxFormButtonItem.visibleIndex */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}

object dxFormButtonItem {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    buttonOptions: dxButtonOptions = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    cssClass: String = null,
    horizontalAlignment: center | left | right = null,
    itemType: empty | group | simple | tabbed | button = null,
    name: String = null,
    verticalAlignment: bottom | center | top = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: js.UndefOr[Double] = js.undefined
  ): dxFormButtonItem = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (buttonOptions != null) __obj.updateDynamic("buttonOptions")(buttonOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleIndex)) __obj.updateDynamic("visibleIndex")(visibleIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormButtonItem]
  }
}

