package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.button
import typings.devextreme.devextremeStrings.empty
import typings.devextreme.devextremeStrings.group
import typings.devextreme.devextremeStrings.simple
import typings.devextreme.devextremeStrings.tabbed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFormEmptyItem extends js.Object {
  /** @name dxFormEmptyItem.colSpan */
  var colSpan: js.UndefOr[Double] = js.undefined
  /** @name dxFormEmptyItem.cssClass */
  var cssClass: js.UndefOr[String] = js.undefined
  /** @name dxFormEmptyItem.itemType */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.undefined
  /** @name dxFormEmptyItem.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name dxFormEmptyItem.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name dxFormEmptyItem.visibleIndex */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}

object dxFormEmptyItem {
  @scala.inline
  def apply(
    colSpan: js.UndefOr[Double] = js.undefined,
    cssClass: String = null,
    itemType: empty | group | simple | tabbed | button = null,
    name: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: js.UndefOr[Double] = js.undefined
  ): dxFormEmptyItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleIndex)) __obj.updateDynamic("visibleIndex")(visibleIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormEmptyItem]
  }
}

