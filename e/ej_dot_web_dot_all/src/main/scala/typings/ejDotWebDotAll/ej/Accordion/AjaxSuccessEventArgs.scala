package typings.ejDotWebDotAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSuccessEventArgs extends js.Object {
  /** returns current AJAX content location
    */
  var URL: js.UndefOr[String] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the AJAX content.
    */
  var content: js.UndefOr[String] = js.undefined
  /** returns the successful data sent.
    */
  var data: js.UndefOr[String] = js.undefined
  /** returns the accordion model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AjaxSuccessEventArgs {
  @scala.inline
  def apply(
    URL: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    data: String = null,
    model: Model = null,
    `type`: String = null
  ): AjaxSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSuccessEventArgs]
  }
}

