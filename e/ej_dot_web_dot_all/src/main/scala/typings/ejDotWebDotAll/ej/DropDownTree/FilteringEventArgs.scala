package typings.ejDotWebDotAll.ej.DropDownTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteringEventArgs extends js.Object {
  /** If the event has to be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the data items of theDropDownTreeView.
    */
  var items: js.UndefOr[js.Any] = js.undefined
  /** DropDownTreeView model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the search string typed in the search box.
    */
  var searchString: js.UndefOr[String] = js.undefined
  /** Selected item's text.
    */
  var selectedText: js.UndefOr[String] = js.undefined
  /** Event name
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object FilteringEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    items: js.Any = null,
    model: js.Any = null,
    searchString: String = null,
    selectedText: String = null,
    `type`: String = null
  ): FilteringEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (selectedText != null) __obj.updateDynamic("selectedText")(selectedText.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteringEventArgs]
  }
}

