package typings.ejDotWebDotAll.ejNs.ListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseDownEventArgs extends js.Object {
  /** returns true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the list of checked items.
    */
  var checkedItems: js.UndefOr[Double] = js.undefined
  /** returns the current checked item text.
    */
  var checkedItemsText: js.UndefOr[String] = js.undefined
  /** If the child element exist return true; otherwise, false.
    */
  var hasChild: js.UndefOr[Boolean] = js.undefined
  /** returns the current Index of the item.
    */
  var index: js.UndefOr[Double] = js.undefined
  /** If checked return true; otherwise, false.
    */
  var isChecked: js.UndefOr[Boolean] = js.undefined
  /** returns the current list item.
    */
  var item: js.UndefOr[String] = js.undefined
  /** returns the model value of the control.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.ListViewNs.Model] = js.undefined
  /** returns the current text of item.
    */
  var text: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MouseDownEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    checkedItems: Int | Double = null,
    checkedItemsText: String = null,
    hasChild: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    item: String = null,
    model: typings.ejDotWebDotAll.ejNs.ListViewNs.Model = null,
    text: String = null,
    `type`: String = null
  ): MouseDownEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (checkedItems != null) __obj.updateDynamic("checkedItems")(checkedItems.asInstanceOf[js.Any])
    if (checkedItemsText != null) __obj.updateDynamic("checkedItemsText")(checkedItemsText)
    if (!js.isUndefined(hasChild)) __obj.updateDynamic("hasChild")(hasChild)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked)
    if (item != null) __obj.updateDynamic("item")(item)
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MouseDownEventArgs]
  }
}

