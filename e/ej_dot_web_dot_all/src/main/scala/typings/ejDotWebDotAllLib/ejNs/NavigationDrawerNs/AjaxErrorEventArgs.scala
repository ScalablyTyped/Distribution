package typings
package ejDotWebDotAllLib.ejNs.NavigationDrawerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxErrorEventArgs extends js.Object {
  /** URL of the content.
    */
  var URL: js.UndefOr[java.lang.String] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Instance of the navigation drawer model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Error page content.
    */
  var responseText: js.UndefOr[java.lang.String] = js.undefined
  /** Error code.
    */
  var status: js.UndefOr[scala.Double] = js.undefined
  /** The corresponding error description.
    */
  var statusText: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AjaxErrorEventArgs {
  @scala.inline
  def apply(
    URL: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    responseText: java.lang.String = null,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null,
    `type`: java.lang.String = null
  ): AjaxErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (responseText != null) __obj.updateDynamic("responseText")(responseText)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxErrorEventArgs]
  }
}

