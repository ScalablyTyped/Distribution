package typings
package ejDotWebDotAllLib.ejNs.ListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxErrorEventArgs extends js.Object {
  /** returns true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the error thrown in the AJAX post.
    */
  var errorThrown: js.UndefOr[js.Any] = js.undefined
  /** returns the current item index.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** returns the current list item.
    */
  var item: js.UndefOr[js.Any] = js.undefined
  /** returns the model value of the control.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the current item text.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** returns the status.
    */
  var textStatus: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AjaxErrorEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    errorThrown: js.Any = null,
    index: scala.Int | scala.Double = null,
    item: js.Any = null,
    model: Model = null,
    text: java.lang.String = null,
    textStatus: js.Any = null,
    `type`: java.lang.String = null
  ): AjaxErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (errorThrown != null) __obj.updateDynamic("errorThrown")(errorThrown)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item)
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textStatus != null) __obj.updateDynamic("textStatus")(textStatus)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxErrorEventArgs]
  }
}

