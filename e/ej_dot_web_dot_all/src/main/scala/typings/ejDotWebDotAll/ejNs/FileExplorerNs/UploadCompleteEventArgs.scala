package typings.ejDotWebDotAll.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadCompleteEventArgs extends js.Object {
  /** AJAX event argument for reference
    */
  var e: js.UndefOr[js.Any] = js.undefined
  /** details about the error information
    */
  var error: js.UndefOr[String] = js.undefined
  /** uploaded file list
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the Upload model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** response from the server
    */
  var responseText: js.UndefOr[String] = js.undefined
  /** successfully uploaded files list
    */
  var success: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** XHR-AJAX Object for reference
    */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

object UploadCompleteEventArgs {
  @scala.inline
  def apply(
    e: js.Any = null,
    error: String = null,
    files: js.Any = null,
    model: js.Any = null,
    responseText: String = null,
    success: js.Any = null,
    `type`: String = null,
    xhr: js.Any = null
  ): UploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (e != null) __obj.updateDynamic("e")(e)
    if (error != null) __obj.updateDynamic("error")(error)
    if (files != null) __obj.updateDynamic("files")(files)
    if (model != null) __obj.updateDynamic("model")(model)
    if (responseText != null) __obj.updateDynamic("responseText")(responseText)
    if (success != null) __obj.updateDynamic("success")(success)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[UploadCompleteEventArgs]
  }
}

