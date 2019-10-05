package typings.ejDotWebDotAll.ej.DropDownList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the data bound to the DropDownList.
    */
  var items: js.UndefOr[js.Any] = js.undefined
  /** returns the DropDownList model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the search string typed in search box.
    */
  var searchString: js.UndefOr[String] = js.undefined
  /** Returns the selected item text.
    */
  var selectedText: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SearchEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    items: js.Any = null,
    model: js.Any = null,
    searchString: String = null,
    selectedText: String = null,
    `type`: String = null
  ): SearchEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (items != null) __obj.updateDynamic("items")(items)
    if (model != null) __obj.updateDynamic("model")(model)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (selectedText != null) __obj.updateDynamic("selectedText")(selectedText)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SearchEventArgs]
  }
}

