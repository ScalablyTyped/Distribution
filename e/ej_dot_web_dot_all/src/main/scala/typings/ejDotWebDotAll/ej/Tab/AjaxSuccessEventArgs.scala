package typings.ejDotWebDotAll.ej.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSuccessEventArgs extends js.Object {
  /** returns AJAX URL
    */
  var URL: js.UndefOr[String] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns content of AJAX request.
    */
  var content: js.UndefOr[js.Any] = js.undefined
  /** return AJAX data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the tab model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Tab.Model] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AjaxSuccessEventArgs {
  @scala.inline
  def apply(
    URL: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    content: js.Any = null,
    data: js.Any = null,
    model: typings.ejDotWebDotAll.ej.Tab.Model = null,
    `type`: String = null
  ): AjaxSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (content != null) __obj.updateDynamic("content")(content)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxSuccessEventArgs]
  }
}

