package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.fileManagement.UploadInfo
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.BeforeSendEvent
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.DropZoneEnterEvent
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.DropZoneLeaveEvent
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.FileUploadMode
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.FilesUploadedEvent
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.ProgressEvent
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.UploadAbortedEvent
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.UploadErrorEvent
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.UploadHttpMethod
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.UploadStartedEvent
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.UploadedEvent
import typings.devextreme.mod.DevExpress.ui.dxFileUploader.ValueChangedEvent
import typings.std.Element
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFileUploaderOptions
  extends StObject
     with EditorOptions[dxFileUploader] {
  
  /**
    * A function that cancels the file upload.
    */
  var abortUpload: js.UndefOr[
    js.Function2[/* file */ File, /* uploadInfo */ js.UndefOr[UploadInfo], js.Thenable[Any] | Any]
  ] = js.undefined
  
  /**
    * Specifies a file type or several types accepted by the UI component.
    */
  var accept: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if an end user can remove a file from the selection and interrupt uploading.
    */
  var allowCanceling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Restricts file extensions that can be uploaded to the server.
    */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies the chunk size in bytes. Applies only if uploadMode is &apos;instantly&apos; or &apos;useButtons&apos;. Requires a server that can process file chunks.
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the HTML element which invokes the file upload dialog.
    */
  var dialogTrigger: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Specifies the HTML element in which users can drag and drop files for upload.
    */
  var dropZone: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Specifies the attributes to be passed on to the underlying `` element of the `file` type.
    */
  var inputAttr: js.UndefOr[Any] = js.undefined
  
  /**
    * The text displayed when the extension of the file being uploaded is not an allowed file extension.
    */
  var invalidFileExtensionMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The text displayed when the size of the file being uploaded is greater than the maxFileSize.
    */
  var invalidMaxFileSizeMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The text displayed when the size of the file being uploaded is less than the minFileSize.
    */
  var invalidMinFileSizeMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text displayed on the area to which an end-user can drop a file.
    */
  var labelText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the maximum file size (in bytes) allowed for uploading. Applies only if uploadMode is &apos;instantly&apos; or &apos;useButtons&apos;.
    */
  var maxFileSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the minimum file size (in bytes) allowed for uploading. Applies only if uploadMode is &apos;instantly&apos; or &apos;useButtons&apos;.
    */
  var minFileSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the UI component enables an end-user to select a single file or multiple files.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the value passed to the name attribute of the underlying input element. Required to access uploaded files on the server.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A function that allows you to customize the request before it is sent to the server.
    */
  var onBeforeSend: js.UndefOr[js.Function1[/* e */ BeforeSendEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the mouse enters a drop zone while dragging a file.
    */
  var onDropZoneEnter: js.UndefOr[js.Function1[/* e */ DropZoneEnterEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the mouse leaves a drop zone as it drags a file.
    */
  var onDropZoneLeave: js.UndefOr[js.Function1[/* e */ DropZoneLeaveEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when all files are successfully uploaded.
    */
  var onFilesUploaded: js.UndefOr[js.Function1[/* e */ FilesUploadedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a file segment is uploaded.
    */
  var onProgress: js.UndefOr[js.Function1[/* e */ ProgressEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the file upload is aborted.
    */
  var onUploadAborted: js.UndefOr[js.Function1[/* e */ UploadAbortedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when an error occurs during the file upload.
    */
  var onUploadError: js.UndefOr[js.Function1[/* e */ UploadErrorEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the file upload is started.
    */
  var onUploadStarted: js.UndefOr[js.Function1[/* e */ UploadStartedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a file is successfully uploaded.
    */
  var onUploaded: js.UndefOr[js.Function1[/* e */ UploadedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when one or several files are added to or removed from the selection.
    */
  @JSName("onValueChanged")
  var onValueChanged_dxFileUploaderOptions: js.UndefOr[js.Function1[/* e */ ValueChangedEvent, Unit]] = js.undefined
  
  /**
    * Gets the current progress in percentages.
    */
  var progress: js.UndefOr[Double] = js.undefined
  
  /**
    * The message displayed by the UI component when it is ready to upload the specified files.
    */
  var readyToUploadMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The text displayed on the button that opens the file browser.
    */
  var selectButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not the UI component displays the list of selected files.
    */
  var showFileList: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The message displayed by the UI component when the file upload is cancelled.
    */
  var uploadAbortedMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The text displayed on the button that starts uploading.
    */
  var uploadButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * A function that uploads a file in chunks.
    */
  var uploadChunk: js.UndefOr[
    js.Function2[/* file */ File, /* uploadInfo */ UploadInfo, js.Thenable[Any] | Any]
  ] = js.undefined
  
  /**
    * Specifies custom data for the upload request.
    */
  var uploadCustomData: js.UndefOr[Any] = js.undefined
  
  /**
    * The message displayed by the UI component on uploading failure.
    */
  var uploadFailedMessage: js.UndefOr[String] = js.undefined
  
  /**
    * A function that uploads a file.
    */
  var uploadFile: js.UndefOr[
    js.Function2[/* file */ File, /* progressCallback */ js.Function, js.Thenable[Any] | Any]
  ] = js.undefined
  
  /**
    * Specifies headers for the upload request.
    */
  var uploadHeaders: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the method for the upload request.
    */
  var uploadMethod: js.UndefOr[UploadHttpMethod] = js.undefined
  
  /**
    * Specifies how the UI component uploads files.
    */
  var uploadMode: js.UndefOr[FileUploadMode] = js.undefined
  
  /**
    * Specifies a target Url for the upload request.
    */
  var uploadUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The message displayed by the UI component when uploading is finished.
    */
  var uploadedMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a File instance representing the selected file. Read-only when uploadMode is &apos;useForm&apos;.
    */
  @JSName("value")
  var value_dxFileUploaderOptions: js.UndefOr[js.Array[File]] = js.undefined
}
object dxFileUploaderOptions {
  
  inline def apply(): dxFileUploaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileUploaderOptions]
  }
  
  extension [Self <: dxFileUploaderOptions](x: Self) {
    
    inline def setAbortUpload(value: (/* file */ File, /* uploadInfo */ js.UndefOr[UploadInfo]) => js.Thenable[Any] | Any): Self = StObject.set(x, "abortUpload", js.Any.fromFunction2(value))
    
    inline def setAbortUploadUndefined: Self = StObject.set(x, "abortUpload", js.undefined)
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setAllowCanceling(value: Boolean): Self = StObject.set(x, "allowCanceling", value.asInstanceOf[js.Any])
    
    inline def setAllowCancelingUndefined: Self = StObject.set(x, "allowCanceling", js.undefined)
    
    inline def setAllowedFileExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setAllowedFileExtensionsUndefined: Self = StObject.set(x, "allowedFileExtensions", js.undefined)
    
    inline def setAllowedFileExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedFileExtensions", js.Array(value*))
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setDialogTrigger(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "dialogTrigger", value.asInstanceOf[js.Any])
    
    inline def setDialogTriggerUndefined: Self = StObject.set(x, "dialogTrigger", js.undefined)
    
    inline def setDropZone(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
    
    inline def setDropZoneUndefined: Self = StObject.set(x, "dropZone", js.undefined)
    
    inline def setInputAttr(value: Any): Self = StObject.set(x, "inputAttr", value.asInstanceOf[js.Any])
    
    inline def setInputAttrUndefined: Self = StObject.set(x, "inputAttr", js.undefined)
    
    inline def setInvalidFileExtensionMessage(value: String): Self = StObject.set(x, "invalidFileExtensionMessage", value.asInstanceOf[js.Any])
    
    inline def setInvalidFileExtensionMessageUndefined: Self = StObject.set(x, "invalidFileExtensionMessage", js.undefined)
    
    inline def setInvalidMaxFileSizeMessage(value: String): Self = StObject.set(x, "invalidMaxFileSizeMessage", value.asInstanceOf[js.Any])
    
    inline def setInvalidMaxFileSizeMessageUndefined: Self = StObject.set(x, "invalidMaxFileSizeMessage", js.undefined)
    
    inline def setInvalidMinFileSizeMessage(value: String): Self = StObject.set(x, "invalidMinFileSizeMessage", value.asInstanceOf[js.Any])
    
    inline def setInvalidMinFileSizeMessageUndefined: Self = StObject.set(x, "invalidMinFileSizeMessage", js.undefined)
    
    inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
    
    inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
    
    inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    inline def setMinFileSize(value: Double): Self = StObject.set(x, "minFileSize", value.asInstanceOf[js.Any])
    
    inline def setMinFileSizeUndefined: Self = StObject.set(x, "minFileSize", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnBeforeSend(value: /* e */ BeforeSendEvent => Unit): Self = StObject.set(x, "onBeforeSend", js.Any.fromFunction1(value))
    
    inline def setOnBeforeSendUndefined: Self = StObject.set(x, "onBeforeSend", js.undefined)
    
    inline def setOnDropZoneEnter(value: /* e */ DropZoneEnterEvent => Unit): Self = StObject.set(x, "onDropZoneEnter", js.Any.fromFunction1(value))
    
    inline def setOnDropZoneEnterUndefined: Self = StObject.set(x, "onDropZoneEnter", js.undefined)
    
    inline def setOnDropZoneLeave(value: /* e */ DropZoneLeaveEvent => Unit): Self = StObject.set(x, "onDropZoneLeave", js.Any.fromFunction1(value))
    
    inline def setOnDropZoneLeaveUndefined: Self = StObject.set(x, "onDropZoneLeave", js.undefined)
    
    inline def setOnFilesUploaded(value: /* e */ FilesUploadedEvent => Unit): Self = StObject.set(x, "onFilesUploaded", js.Any.fromFunction1(value))
    
    inline def setOnFilesUploadedUndefined: Self = StObject.set(x, "onFilesUploaded", js.undefined)
    
    inline def setOnProgress(value: /* e */ ProgressEvent => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnUploadAborted(value: /* e */ UploadAbortedEvent => Unit): Self = StObject.set(x, "onUploadAborted", js.Any.fromFunction1(value))
    
    inline def setOnUploadAbortedUndefined: Self = StObject.set(x, "onUploadAborted", js.undefined)
    
    inline def setOnUploadError(value: /* e */ UploadErrorEvent => Unit): Self = StObject.set(x, "onUploadError", js.Any.fromFunction1(value))
    
    inline def setOnUploadErrorUndefined: Self = StObject.set(x, "onUploadError", js.undefined)
    
    inline def setOnUploadStarted(value: /* e */ UploadStartedEvent => Unit): Self = StObject.set(x, "onUploadStarted", js.Any.fromFunction1(value))
    
    inline def setOnUploadStartedUndefined: Self = StObject.set(x, "onUploadStarted", js.undefined)
    
    inline def setOnUploaded(value: /* e */ UploadedEvent => Unit): Self = StObject.set(x, "onUploaded", js.Any.fromFunction1(value))
    
    inline def setOnUploadedUndefined: Self = StObject.set(x, "onUploaded", js.undefined)
    
    inline def setOnValueChanged(value: /* e */ ValueChangedEvent => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setReadyToUploadMessage(value: String): Self = StObject.set(x, "readyToUploadMessage", value.asInstanceOf[js.Any])
    
    inline def setReadyToUploadMessageUndefined: Self = StObject.set(x, "readyToUploadMessage", js.undefined)
    
    inline def setSelectButtonText(value: String): Self = StObject.set(x, "selectButtonText", value.asInstanceOf[js.Any])
    
    inline def setSelectButtonTextUndefined: Self = StObject.set(x, "selectButtonText", js.undefined)
    
    inline def setShowFileList(value: Boolean): Self = StObject.set(x, "showFileList", value.asInstanceOf[js.Any])
    
    inline def setShowFileListUndefined: Self = StObject.set(x, "showFileList", js.undefined)
    
    inline def setUploadAbortedMessage(value: String): Self = StObject.set(x, "uploadAbortedMessage", value.asInstanceOf[js.Any])
    
    inline def setUploadAbortedMessageUndefined: Self = StObject.set(x, "uploadAbortedMessage", js.undefined)
    
    inline def setUploadButtonText(value: String): Self = StObject.set(x, "uploadButtonText", value.asInstanceOf[js.Any])
    
    inline def setUploadButtonTextUndefined: Self = StObject.set(x, "uploadButtonText", js.undefined)
    
    inline def setUploadChunk(value: (/* file */ File, /* uploadInfo */ UploadInfo) => js.Thenable[Any] | Any): Self = StObject.set(x, "uploadChunk", js.Any.fromFunction2(value))
    
    inline def setUploadChunkUndefined: Self = StObject.set(x, "uploadChunk", js.undefined)
    
    inline def setUploadCustomData(value: Any): Self = StObject.set(x, "uploadCustomData", value.asInstanceOf[js.Any])
    
    inline def setUploadCustomDataUndefined: Self = StObject.set(x, "uploadCustomData", js.undefined)
    
    inline def setUploadFailedMessage(value: String): Self = StObject.set(x, "uploadFailedMessage", value.asInstanceOf[js.Any])
    
    inline def setUploadFailedMessageUndefined: Self = StObject.set(x, "uploadFailedMessage", js.undefined)
    
    inline def setUploadFile(value: (/* file */ File, /* progressCallback */ js.Function) => js.Thenable[Any] | Any): Self = StObject.set(x, "uploadFile", js.Any.fromFunction2(value))
    
    inline def setUploadFileUndefined: Self = StObject.set(x, "uploadFile", js.undefined)
    
    inline def setUploadHeaders(value: Any): Self = StObject.set(x, "uploadHeaders", value.asInstanceOf[js.Any])
    
    inline def setUploadHeadersUndefined: Self = StObject.set(x, "uploadHeaders", js.undefined)
    
    inline def setUploadMethod(value: UploadHttpMethod): Self = StObject.set(x, "uploadMethod", value.asInstanceOf[js.Any])
    
    inline def setUploadMethodUndefined: Self = StObject.set(x, "uploadMethod", js.undefined)
    
    inline def setUploadMode(value: FileUploadMode): Self = StObject.set(x, "uploadMode", value.asInstanceOf[js.Any])
    
    inline def setUploadModeUndefined: Self = StObject.set(x, "uploadMode", js.undefined)
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
    
    inline def setUploadedMessage(value: String): Self = StObject.set(x, "uploadedMessage", value.asInstanceOf[js.Any])
    
    inline def setUploadedMessageUndefined: Self = StObject.set(x, "uploadedMessage", js.undefined)
    
    inline def setValue(value: js.Array[File]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: File*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
