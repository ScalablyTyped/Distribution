package typings.ejDotWebDotAll.ejNs.UploadboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeSendEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Selected FileList Object.
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the Uploadbox model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** XHR-AJAX Object for reference.
    */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

object BeforeSendEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    files: js.Any = null,
    model: js.Any = null,
    `type`: String = null,
    xhr: js.Any = null
  ): BeforeSendEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (files != null) __obj.updateDynamic("files")(files)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[BeforeSendEventArgs]
  }
}

