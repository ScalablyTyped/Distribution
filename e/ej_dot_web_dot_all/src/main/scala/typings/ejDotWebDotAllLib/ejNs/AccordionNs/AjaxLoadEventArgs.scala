package typings
package ejDotWebDotAllLib.ejNs.AccordionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxLoadEventArgs extends js.Object {
  /** returns the name of the URL
    */
  var URL: js.UndefOr[java.lang.String] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the accordion model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AjaxLoadEventArgs {
  @scala.inline
  def apply(
    URL: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    `type`: java.lang.String = null
  ): AjaxLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxLoadEventArgs]
  }
}

