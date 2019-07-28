package typings.ejDotWebDotAll.ejNs.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxErrorEventArgs extends js.Object {
  /** returns the URL of AJAX request.
    */
  var URL: js.UndefOr[String] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns AJAX data details.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the tab model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.TabNs.Model] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AjaxErrorEventArgs {
  @scala.inline
  def apply(
    URL: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.TabNs.Model = null,
    `type`: String = null
  ): AjaxErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxErrorEventArgs]
  }
}

