package typings.ejDotWebDotAll.ej.NavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxErrorEventArgs extends js.Object {
  /** URL of the content.
    */
  var URL: js.UndefOr[String] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Instance of the navigation drawer model object.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.NavigationDrawer.Model] = js.undefined
  /** Error page content.
    */
  var responseText: js.UndefOr[String] = js.undefined
  /** Error code.
    */
  var status: js.UndefOr[Double] = js.undefined
  /** The corresponding error description.
    */
  var statusText: js.UndefOr[String] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AjaxErrorEventArgs {
  @scala.inline
  def apply(
    URL: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.NavigationDrawer.Model = null,
    responseText: String = null,
    status: Int | Double = null,
    statusText: String = null,
    `type`: String = null
  ): AjaxErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (responseText != null) __obj.updateDynamic("responseText")(responseText.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxErrorEventArgs]
  }
}

