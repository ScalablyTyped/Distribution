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
  /** Specifies the number of columns spanned by the item. */
  var colSpan: js.UndefOr[Double] = js.undefined
  /** Specifies a CSS class to be applied to the form item. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies the item's type. Set it to "empty" to create an empty item. */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.undefined
  /** Specifies a name that identifies the form item. */
  var name: js.UndefOr[String] = js.undefined
  /** Specifies whether or not the current form item is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the sequence number of the item in a form, group or tab. */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}

object dxFormEmptyItem {
  @scala.inline
  def apply(
    colSpan: Int | Double = null,
    cssClass: String = null,
    itemType: empty | group | simple | tabbed | button = null,
    name: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: Int | Double = null
  ): dxFormEmptyItem = {
    val __obj = js.Dynamic.literal()
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visibleIndex != null) __obj.updateDynamic("visibleIndex")(visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormEmptyItem]
  }
}

