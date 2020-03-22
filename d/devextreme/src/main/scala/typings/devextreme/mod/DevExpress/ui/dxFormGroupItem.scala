package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonFormData
import typings.devextreme.devextremeStrings.button
import typings.devextreme.devextremeStrings.empty
import typings.devextreme.devextremeStrings.group
import typings.devextreme.devextremeStrings.simple
import typings.devextreme.devextremeStrings.tabbed
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFormGroupItem extends js.Object {
  /** Specifies whether or not all group item labels are aligned. */
  var alignItemLabels: js.UndefOr[Boolean] = js.undefined
  /** Specifies the group caption. */
  var caption: js.UndefOr[String] = js.undefined
  /** The count of columns in the group layout. */
  var colCount: js.UndefOr[Double] = js.undefined
  /** Specifies the relation between the screen size qualifier and the number of columns in the grouped layout. */
  var colCountByScreen: js.UndefOr[js.Any] = js.undefined
  /** Specifies the number of columns spanned by the item. */
  var colSpan: js.UndefOr[Double] = js.undefined
  /** Specifies a CSS class to be applied to the form item. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies the item's type. Set it to "group" to create a group item. */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.undefined
  /** Holds an array of form items displayed within the group. */
  var items: js.UndefOr[
    js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ]
  ] = js.undefined
  /** Specifies a name that identifies the form item. */
  var name: js.UndefOr[String] = js.undefined
  /** A template to be used for rendering a group item. */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* data */ AnonFormData, /* itemElement */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** Specifies whether or not the current form item is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the sequence number of the item in a form, group or tab. */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}

object dxFormGroupItem {
  @scala.inline
  def apply(
    alignItemLabels: js.UndefOr[Boolean] = js.undefined,
    caption: String = null,
    colCount: Int | Double = null,
    colCountByScreen: js.Any = null,
    colSpan: Int | Double = null,
    cssClass: String = null,
    itemType: empty | group | simple | tabbed | button = null,
    items: js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ] = null,
    name: String = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* data */ AnonFormData, /* itemElement */ dxElement, String | Element | JQuery]) = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: Int | Double = null
  ): dxFormGroupItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignItemLabels)) __obj.updateDynamic("alignItemLabels")(alignItemLabels.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (colCount != null) __obj.updateDynamic("colCount")(colCount.asInstanceOf[js.Any])
    if (colCountByScreen != null) __obj.updateDynamic("colCountByScreen")(colCountByScreen.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visibleIndex != null) __obj.updateDynamic("visibleIndex")(visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormGroupItem]
  }
}

