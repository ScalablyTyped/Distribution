package typings.fineUploader.mod

import typings.fineUploader.coreMod.DeleteFileOptions
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
    if (confirmMessage != null) __obj.updateDynamic("confirmMessage")(confirmMessage.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (deletingFailedText != null) __obj.updateDynamic("deletingFailedText")(deletingFailedText.asInstanceOf[js.Any])
    if (deletingStatusText != null) __obj.updateDynamic("deletingStatusText")(deletingStatusText.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(forceConfirm)) __obj.updateDynamic("forceConfirm")(forceConfirm.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIDeleteFileOptions]
  }
}

