package typings.fineDashUploader.fineDashUploaderMod

import typings.fineDashUploader.libCoreMod.DeleteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIDeleteFileOptions extends DeleteFileOptions {
  /**
    * The message displayed in the confirm delete dialog
    *
    * @default `'Are you sure you want to delete {filename}?'`
    */
  var confirmMessage: js.UndefOr[String] = js.undefined
  /**
    * The status message to appear next to a file that has failed to delete
    *
    * @default `'Delete failed'`
    */
  var deletingFailedText: js.UndefOr[String] = js.undefined
  /**
    * The status message to appear next to a file that is pending deletion
    *
    * @default `'Deleting...'`
    */
  var deletingStatusText: js.UndefOr[String] = js.undefined
  /**
    * If this value is set to `true`, the user will be required to confirm the file delete request via a confirmation dialog
    *
    * @default `false`
    */
  var forceConfirm: js.UndefOr[Boolean] = js.undefined
}

object UIDeleteFileOptions {
  @scala.inline
  def apply(
    confirmMessage: String = null,
    customHeaders: js.Any = null,
    deletingFailedText: String = null,
    deletingStatusText: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    endpoint: String = null,
    forceConfirm: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    params: js.Any = null
  ): UIDeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    if (confirmMessage != null) __obj.updateDynamic("confirmMessage")(confirmMessage)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (deletingFailedText != null) __obj.updateDynamic("deletingFailedText")(deletingFailedText)
    if (deletingStatusText != null) __obj.updateDynamic("deletingStatusText")(deletingStatusText)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (!js.isUndefined(forceConfirm)) __obj.updateDynamic("forceConfirm")(forceConfirm)
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[UIDeleteFileOptions]
  }
}

