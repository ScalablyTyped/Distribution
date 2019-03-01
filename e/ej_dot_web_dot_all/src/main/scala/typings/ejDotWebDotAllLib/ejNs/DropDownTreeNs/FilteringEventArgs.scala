package typings
package ejDotWebDotAllLib.ejNs.DropDownTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteringEventArgs extends js.Object {
  /** If the event has to be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data items of theDropDownTreeView.
    */
  var items: js.UndefOr[js.Any] = js.undefined
  /** DropDownTreeView model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the search string typed in the search box.
    */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Selected item's text.
    */
  var selectedText: js.UndefOr[java.lang.String] = js.undefined
  /** Event name
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object FilteringEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    items: js.Any = null,
    model: js.Any = null,
    searchString: java.lang.String = null,
    selectedText: java.lang.String = null,
    `type`: java.lang.String = null
  ): FilteringEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (items != null) __obj.updateDynamic("items")(items)
    if (model != null) __obj.updateDynamic("model")(model)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (selectedText != null) __obj.updateDynamic("selectedText")(selectedText)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FilteringEventArgs]
  }
}

