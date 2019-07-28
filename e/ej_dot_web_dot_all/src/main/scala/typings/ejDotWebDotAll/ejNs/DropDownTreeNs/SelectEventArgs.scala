package typings.ejDotWebDotAll.ejNs.DropDownTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** If the event has to be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the selected item with checkbox checked or not.
    */
  var isChecked: js.UndefOr[Boolean] = js.undefined
  /** Selected item's ID.
    */
  var itemId: js.UndefOr[String] = js.undefined
  /** DropDownTreeView model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Selected item's text.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Event name
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Selected item's value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object SelectEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    itemId: String = null,
    model: js.Any = null,
    text: String = null,
    `type`: String = null,
    value: String = null
  ): SelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SelectEventArgs]
  }
}

