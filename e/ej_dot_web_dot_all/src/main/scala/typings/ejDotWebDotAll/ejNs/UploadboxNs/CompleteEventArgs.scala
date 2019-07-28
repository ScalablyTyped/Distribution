package typings.ejDotWebDotAll.ejNs.UploadboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteEventArgs extends js.Object {
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
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** XHR-AJAX Object for reference.
    */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

object CompleteEventArgs {
  @scala.inline
  def apply(
    e: js.Any = null,
    files: js.Any = null,
    model: js.Any = null,
    responseText: String = null,
    `type`: String = null,
    xhr: js.Any = null
  ): CompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (e != null) __obj.updateDynamic("e")(e)
    if (files != null) __obj.updateDynamic("files")(files)
    if (model != null) __obj.updateDynamic("model")(model)
    if (responseText != null) __obj.updateDynamic("responseText")(responseText)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[CompleteEventArgs]
  }
}

