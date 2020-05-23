package typings.ejWebAll.ej.ListView

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
  var model: js.UndefOr[Model] = js.undefined
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
    checkedItems: js.UndefOr[Double] = js.undefined,
    checkedItemsText: String = null,
    hasChild: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    item: String = null,
    model: Model = null,
    text: String = null,
    `type`: String = null
  ): MouseDownEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkedItems)) __obj.updateDynamic("checkedItems")(checkedItems.get.asInstanceOf[js.Any])
    if (checkedItemsText != null) __obj.updateDynamic("checkedItemsText")(checkedItemsText.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChild)) __obj.updateDynamic("hasChild")(hasChild.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.get.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseDownEventArgs]
  }
}

