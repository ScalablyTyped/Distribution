package typings
package ejDotWebDotAllLib.ejNs.ListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseUpEventArgs extends js.Object {
  /** returns true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the list of checked items.
    */
  var checkedItems: js.UndefOr[scala.Double] = js.undefined
  /** returns the current checked item text.
    */
  var checkedItemsText: js.UndefOr[java.lang.String] = js.undefined
  /** If the child element exist return true; otherwise, false.
    */
  var hasChild: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current Index of the item.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** If checked return true; otherwise, false.
    */
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current list item.
    */
  var item: js.UndefOr[java.lang.String] = js.undefined
  /** returns the model value of the control.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the current text of item.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MouseUpEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    checkedItems: scala.Int | scala.Double = null,
    checkedItemsText: java.lang.String = null,
    hasChild: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    isChecked: js.UndefOr[scala.Boolean] = js.undefined,
    item: java.lang.String = null,
    model: Model = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null
  ): MouseUpEventArgs = {
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
    __obj.asInstanceOf[MouseUpEventArgs]
  }
}

