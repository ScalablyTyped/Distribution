package typings.ejDotWebDotAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessEventArgs extends js.Object {
  /** AJAX event argument for reference.
    */
  var e: js.UndefOr[js.Any] = js.undefined
  /** Uploaded file list.
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the Uploadbox model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** response from the server.
    */
  var responseText: js.UndefOr[String] = js.undefined
  /** successfully uploaded files list.
    */
  var success: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** XHR-AJAX Object for reference.
    */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

object SuccessEventArgs {
  @scala.inline
  def apply(
    e: js.Any = null,
    files: js.Any = null,
    model: js.Any = null,
    responseText: String = null,
    success: js.Any = null,
    `type`: String = null,
    xhr: js.Any = null
  ): SuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (responseText != null) __obj.updateDynamic("responseText")(responseText.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessEventArgs]
  }
}

