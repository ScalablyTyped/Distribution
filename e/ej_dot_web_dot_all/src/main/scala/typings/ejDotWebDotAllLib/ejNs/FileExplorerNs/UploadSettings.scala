package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UploadSettings extends js.Object {
  /** Enables or disables the multiple files upload. When it is enabled, you can upload multiple files at a time and when disabled, you can upload only one file at a time.
               * @Default {true}
               */
  var allowMultipleFile: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the auto upload option while uploading files in FileExplorer control.
               * @Default {false}
               */
  var autoUpload: js.UndefOr[scala.Boolean] = js.undefined
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
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the file details which are to be displayed when selected for upload by setting the showFileDetails to true.
               * @Default {true}
               */
  var showFileDetails: js.UndefOr[scala.Boolean] = js.undefined
}

