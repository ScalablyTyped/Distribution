package typings
package ejDotWebDotAllLib.ejNs.NavigationDrawerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxCompleteEventArgs extends js.Object {
  /** URL of the content.
    */
  var URL: js.UndefOr[java.lang.String] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Response content.
    */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Instance of the navigation drawer model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AjaxCompleteEventArgs {
  @scala.inline
  def apply(
    URL: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: java.lang.String = null,
    model: Model = null,
    `type`: java.lang.String = null
  ): AjaxCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxCompleteEventArgs]
  }
}

