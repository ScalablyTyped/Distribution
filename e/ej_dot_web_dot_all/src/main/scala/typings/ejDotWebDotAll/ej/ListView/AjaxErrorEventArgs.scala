package typings.ejDotWebDotAll.ej.ListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxErrorEventArgs extends js.Object {
  /** returns true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the error thrown in the AJAX post.
    */
  var errorThrown: js.UndefOr[js.Any] = js.undefined
  /** returns the current item index.
    */
  var index: js.UndefOr[Double] = js.undefined
  /** returns the current list item.
    */
  var item: js.UndefOr[js.Any] = js.undefined
  /** returns the model value of the control.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the current item text.
    */
  var text: js.UndefOr[String] = js.undefined
  /** returns the status.
    */
  var textStatus: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AjaxErrorEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    errorThrown: js.Any = null,
    index: Int | Double = null,
    item: js.Any = null,
    model: Model = null,
    text: String = null,
    textStatus: js.Any = null,
    `type`: String = null
  ): AjaxErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (errorThrown != null) __obj.updateDynamic("errorThrown")(errorThrown.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textStatus != null) __obj.updateDynamic("textStatus")(textStatus.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxErrorEventArgs]
  }
}

