package typings.ejDotWebDotAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxBeforeLoadEventArgs extends js.Object {
  /** returns current AJAX content location
    */
  var URL: js.UndefOr[String] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the accordion model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Accordion.Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AjaxBeforeLoadEventArgs {
  @scala.inline
  def apply(
    URL: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.Accordion.Model = null,
    `type`: String = null
  ): AjaxBeforeLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
  }
}

