package typings.ejDotWebDotAll.ej.ListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSuccessEventArgs extends js.Object {
  /** returns the current URL of the AJAX post.
    */
  var URL: js.UndefOr[String] = js.undefined
  /** returns true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the AJAX current content.
    */
  var content: js.UndefOr[String] = js.undefined
  /** returns the current item index.
    */
  var index: js.UndefOr[Double] = js.undefined
  /** returns the current list item.
    */
  var item: js.UndefOr[js.Any] = js.undefined
  /** returns the model value of the control.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.ListView.Model] = js.undefined
  /** returns the current item text.
    */
  var text: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AjaxSuccessEventArgs {
  @scala.inline
  def apply(
    URL: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    index: Int | Double = null,
    item: js.Any = null,
    model: typings.ejDotWebDotAll.ej.ListView.Model = null,
    text: String = null,
    `type`: String = null
  ): AjaxSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (content != null) __obj.updateDynamic("content")(content)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item)
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxSuccessEventArgs]
  }
}

