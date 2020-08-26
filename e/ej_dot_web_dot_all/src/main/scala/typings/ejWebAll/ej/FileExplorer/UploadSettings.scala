package typings.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSettings extends js.Object {
  /** Enables or disables the multiple files upload. When it is enabled, you can upload multiple files at a time and when disabled, you can upload only one file at a time.
    * @Default {true}
    */
  var allowMultipleFile: js.UndefOr[Boolean] = js.native
  /** Enables or disables the auto upload option while uploading files in FileExplorer control.
    * @Default {false}
    */
  var autoUpload: js.UndefOr[Boolean] = js.native
  /** Specifies the actions for upload dialog during initialization.
    * @Default {{ modal:false, closeOnComplete:false, content:null, drag:true }}
    */
  var dialogAction: js.UndefOr[js.Any] = js.native
  /** Specifies the position at which the upload dialog is displayed using X and Y values. X: Sets the left position value for dialog. Y: Sets the top position value for dialog.
    * @Default {null}
    */
  var dialogPosition: js.UndefOr[js.Any] = js.native
  /** Specifies the maximum file size allowed to upload. It accepts the value in bytes.
    * @Default {31457280}
    */
  var maxFileSize: js.UndefOr[Double] = js.native
  /** Specifies the file details which are to be displayed when selected for upload by setting the showFileDetails to true.
    * @Default {true}
    */
  var showFileDetails: js.UndefOr[Boolean] = js.native
}

object UploadSettings {
  @scala.inline
  def apply(): UploadSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSettings]
  }
  @scala.inline
  implicit class UploadSettingsOps[Self <: UploadSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowMultipleFile(value: Boolean): Self = this.set("allowMultipleFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultipleFile: Self = this.set("allowMultipleFile", js.undefined)
    @scala.inline
    def setAutoUpload(value: Boolean): Self = this.set("autoUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpload: Self = this.set("autoUpload", js.undefined)
    @scala.inline
    def setDialogAction(value: js.Any): Self = this.set("dialogAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogAction: Self = this.set("dialogAction", js.undefined)
    @scala.inline
    def setDialogPosition(value: js.Any): Self = this.set("dialogPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogPosition: Self = this.set("dialogPosition", js.undefined)
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    @scala.inline
    def setShowFileDetails(value: Boolean): Self = this.set("showFileDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFileDetails: Self = this.set("showFileDetails", js.undefined)
  }
  
}

