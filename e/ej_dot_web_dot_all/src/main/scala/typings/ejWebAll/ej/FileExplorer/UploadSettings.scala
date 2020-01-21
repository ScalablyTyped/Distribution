package typings.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadSettings extends js.Object {
  /** Enables or disables the multiple files upload. When it is enabled, you can upload multiple files at a time and when disabled, you can upload only one file at a time.
    * @Default {true}
    */
  var allowMultipleFile: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the auto upload option while uploading files in FileExplorer control.
    * @Default {false}
    */
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  /** Specifies the actions for upload dialog during initialization.
    * @Default {{ modal:false, closeOnComplete:false, content:null, drag:true }}
    */
  var dialogAction: js.UndefOr[js.Any] = js.undefined
  /** Specifies the position at which the upload dialog is displayed using X and Y values. X: Sets the left position value for dialog. Y: Sets the top position value for dialog.
    * @Default {null}
    */
  var dialogPosition: js.UndefOr[js.Any] = js.undefined
  /** Specifies the maximum file size allowed to upload. It accepts the value in bytes.
    * @Default {31457280}
    */
  var maxFileSize: js.UndefOr[Double] = js.undefined
  /** Specifies the file details which are to be displayed when selected for upload by setting the showFileDetails to true.
    * @Default {true}
    */
  var showFileDetails: js.UndefOr[Boolean] = js.undefined
}

object UploadSettings {
  @scala.inline
  def apply(
    allowMultipleFile: js.UndefOr[Boolean] = js.undefined,
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    dialogAction: js.Any = null,
    dialogPosition: js.Any = null,
    maxFileSize: Int | Double = null,
    showFileDetails: js.UndefOr[Boolean] = js.undefined
  ): UploadSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultipleFile)) __obj.updateDynamic("allowMultipleFile")(allowMultipleFile.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.asInstanceOf[js.Any])
    if (dialogAction != null) __obj.updateDynamic("dialogAction")(dialogAction.asInstanceOf[js.Any])
    if (dialogPosition != null) __obj.updateDynamic("dialogPosition")(dialogPosition.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showFileDetails)) __obj.updateDynamic("showFileDetails")(showFileDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSettings]
  }
}

