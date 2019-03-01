package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeUploadSendEventArgs extends js.Object {
  /** if the event is cancelled; otherwise, false
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** selected FileList Object
    */
  var files: js.UndefOr[js.Any] = js.undefined
  /** returns the upload model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** XHR-AJAX Object for reference
    */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

object BeforeUploadSendEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    files: js.Any = null,
    model: js.Any = null,
    `type`: java.lang.String = null,
    xhr: js.Any = null
  ): BeforeUploadSendEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (files != null) __obj.updateDynamic("files")(files)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[BeforeUploadSendEventArgs]
  }
}

