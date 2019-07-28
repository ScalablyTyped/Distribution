package typings.ejDotWebDotAll.ejNs.AccordionNs

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
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.AccordionNs.Model] = js.undefined
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
    model: typings.ejDotWebDotAll.ejNs.AccordionNs.Model = null,
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

