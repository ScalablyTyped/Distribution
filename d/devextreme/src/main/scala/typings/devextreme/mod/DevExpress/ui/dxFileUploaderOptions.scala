package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.BytesLoaded
import typings.devextreme.anon.DropZoneElement
import typings.devextreme.anon.ElementError
import typings.devextreme.anon.EventFile
import typings.devextreme.anon.FileModel
import typings.devextreme.anon.PreviousValueValue
import typings.devextreme.anon.Request
import typings.devextreme.anon.`4`
import typings.devextreme.devextremeStrings.POST
import typings.devextreme.devextremeStrings.PUT
import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.useButtons
import typings.devextreme.devextremeStrings.useForm
import typings.devextreme.mod.DevExpress.fileManagement.UploadInfo
import typings.devextreme.mod.global.JQuery
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Element
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFileUploaderOptions extends EditorOptions[dxFileUploader] {
  
  /**
    * [descr:dxFileUploader.Options.abortUpload]
    */
  var abortUpload: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* uploadInfo */ js.UndefOr[UploadInfo], 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.native
  
  /**
    * [descr:dxFileUploader.Options.accept]
    */
  var accept: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.allowCanceling]
    */
  var allowCanceling: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxFileUploader.Options.allowedFileExtensions]
    */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [descr:dxFileUploader.Options.chunkSize]
    */
  var chunkSize: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxFileUploader.Options.dialogTrigger]
    */
  var dialogTrigger: js.UndefOr[String | Element | JQuery] = js.native
  
  /**
    * [descr:dxFileUploader.Options.dropZone]
    */
  var dropZone: js.UndefOr[String | Element | JQuery] = js.native
  
  /**
    * [descr:dxFileUploader.Options.inputAttr]
    */
  var inputAttr: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxFileUploader.Options.invalidFileExtensionMessage]
    */
  var invalidFileExtensionMessage: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.invalidMaxFileSizeMessage]
    */
  var invalidMaxFileSizeMessage: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.invalidMinFileSizeMessage]
    */
  var invalidMinFileSizeMessage: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.labelText]
    */
  var labelText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.maxFileSize]
    */
  var maxFileSize: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxFileUploader.Options.minFileSize]
    */
  var minFileSize: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxFileUploader.Options.multiple]
    */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxFileUploader.Options.name]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.onBeforeSend]
    */
  var onBeforeSend: js.UndefOr[js.Function1[/* e */ Request, _]] = js.native
  
  /**
    * [descr:dxFileUploader.Options.onDropZoneEnter]
    */
  var onDropZoneEnter: js.UndefOr[js.Function1[/* e */ DropZoneElement, _]] = js.native
  
  /**
    * [descr:dxFileUploader.Options.onDropZoneLeave]
    */
  var onDropZoneLeave: js.UndefOr[js.Function1[/* e */ DropZoneElement, _]] = js.native
  
  /**
    * [descr:dxFileUploader.Options.onFilesUploaded]
    */
  var onFilesUploaded: js.UndefOr[js.Function1[/* e */ `4`, _]] = js.native
  
  /**
    * [descr:dxFileUploader.Options.onProgress]
    */
  var onProgress: js.UndefOr[js.Function1[/* e */ BytesLoaded, _]] = js.native
  
  /**
    * [descr:dxFileUploader.Options.onUploadAborted]
    */
  var onUploadAborted: js.UndefOr[js.Function1[/* e */ EventFile, _]] = js.native
  
  /**
    * [descr:dxFileUploader.Options.onUploadError]
    */
  var onUploadError: js.UndefOr[js.Function1[/* e */ ElementError, _]] = js.native
  
  /**
    * [descr:dxFileUploader.Options.onUploadStarted]
    */
  var onUploadStarted: js.UndefOr[js.Function1[/* e */ FileModel, _]] = js.native
  
  /**
    * [descr:dxFileUploader.Options.onUploaded]
    */
  var onUploaded: js.UndefOr[js.Function1[/* e */ EventFile, _]] = js.native
  
  /**
    * [descr:dxFileUploader.Options.onValueChanged]
    */
  @JSName("onValueChanged")
  var onValueChanged_dxFileUploaderOptions: js.UndefOr[js.Function1[/* e */ PreviousValueValue, _]] = js.native
  
  /**
    * [descr:dxFileUploader.Options.progress]
    */
  var progress: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxFileUploader.Options.readyToUploadMessage]
    */
  var readyToUploadMessage: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.selectButtonText]
    */
  var selectButtonText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.showFileList]
    */
  var showFileList: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxFileUploader.Options.uploadAbortedMessage]
    */
  var uploadAbortedMessage: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.uploadButtonText]
    */
  var uploadButtonText: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.uploadChunk]
    */
  var uploadChunk: js.UndefOr[
    js.Function2[/* file */ File, /* uploadInfo */ UploadInfo, Promise[_] | JQueryPromise[_] | _]
  ] = js.native
  
  /**
    * [descr:dxFileUploader.Options.uploadCustomData]
    */
  var uploadCustomData: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxFileUploader.Options.uploadFailedMessage]
    */
  var uploadFailedMessage: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.uploadFile]
    */
  var uploadFile: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* progressCallback */ js.Function, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.native
  
  /**
    * [descr:dxFileUploader.Options.uploadHeaders]
    */
  var uploadHeaders: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxFileUploader.Options.uploadMethod]
    */
  var uploadMethod: js.UndefOr[POST | PUT] = js.native
  
  /**
    * [descr:dxFileUploader.Options.uploadMode]
    */
  var uploadMode: js.UndefOr[instantly | useButtons | useForm] = js.native
  
  /**
    * [descr:dxFileUploader.Options.uploadUrl]
    */
  var uploadUrl: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.uploadedMessage]
    */
  var uploadedMessage: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileUploader.Options.value]
    */
  @JSName("value")
  var value_dxFileUploaderOptions: js.UndefOr[js.Array[File]] = js.native
}
object dxFileUploaderOptions {
  
  @scala.inline
  def apply(): dxFileUploaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileUploaderOptions]
  }
  
  @scala.inline
  implicit class dxFileUploaderOptionsOps[Self <: dxFileUploaderOptions] (val x: Self) extends AnyVal {
    
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
    def setAbortUpload(
      value: (/* file */ File, /* uploadInfo */ js.UndefOr[UploadInfo]) => Promise[_] | JQueryPromise[_] | _
    ): Self = this.set("abortUpload", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAbortUpload: Self = this.set("abortUpload", js.undefined)
    
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setAllowCanceling(value: Boolean): Self = this.set("allowCanceling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCanceling: Self = this.set("allowCanceling", js.undefined)
    
    @scala.inline
    def setAllowedFileExtensionsVarargs(value: String*): Self = this.set("allowedFileExtensions", js.Array(value :_*))
    
    @scala.inline
    def setAllowedFileExtensions(value: js.Array[String]): Self = this.set("allowedFileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedFileExtensions: Self = this.set("allowedFileExtensions", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setDialogTrigger(value: String | Element | JQuery): Self = this.set("dialogTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogTrigger: Self = this.set("dialogTrigger", js.undefined)
    
    @scala.inline
    def setDropZone(value: String | Element | JQuery): Self = this.set("dropZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropZone: Self = this.set("dropZone", js.undefined)
    
    @scala.inline
    def setInputAttr(value: js.Any): Self = this.set("inputAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAttr: Self = this.set("inputAttr", js.undefined)
    
    @scala.inline
    def setInvalidFileExtensionMessage(value: String): Self = this.set("invalidFileExtensionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidFileExtensionMessage: Self = this.set("invalidFileExtensionMessage", js.undefined)
    
    @scala.inline
    def setInvalidMaxFileSizeMessage(value: String): Self = this.set("invalidMaxFileSizeMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidMaxFileSizeMessage: Self = this.set("invalidMaxFileSizeMessage", js.undefined)
    
    @scala.inline
    def setInvalidMinFileSizeMessage(value: String): Self = this.set("invalidMinFileSizeMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidMinFileSizeMessage: Self = this.set("invalidMinFileSizeMessage", js.undefined)
    
    @scala.inline
    def setLabelText(value: String): Self = this.set("labelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelText: Self = this.set("labelText", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    
    @scala.inline
    def setMinFileSize(value: Double): Self = this.set("minFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFileSize: Self = this.set("minFileSize", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnBeforeSend(value: /* e */ Request => _): Self = this.set("onBeforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeSend: Self = this.set("onBeforeSend", js.undefined)
    
    @scala.inline
    def setOnDropZoneEnter(value: /* e */ DropZoneElement => _): Self = this.set("onDropZoneEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropZoneEnter: Self = this.set("onDropZoneEnter", js.undefined)
    
    @scala.inline
    def setOnDropZoneLeave(value: /* e */ DropZoneElement => _): Self = this.set("onDropZoneLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropZoneLeave: Self = this.set("onDropZoneLeave", js.undefined)
    
    @scala.inline
    def setOnFilesUploaded(value: /* e */ `4` => _): Self = this.set("onFilesUploaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilesUploaded: Self = this.set("onFilesUploaded", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* e */ BytesLoaded => _): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnUploadAborted(value: /* e */ EventFile => _): Self = this.set("onUploadAborted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUploadAborted: Self = this.set("onUploadAborted", js.undefined)
    
    @scala.inline
    def setOnUploadError(value: /* e */ ElementError => _): Self = this.set("onUploadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUploadError: Self = this.set("onUploadError", js.undefined)
    
    @scala.inline
    def setOnUploadStarted(value: /* e */ FileModel => _): Self = this.set("onUploadStarted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUploadStarted: Self = this.set("onUploadStarted", js.undefined)
    
    @scala.inline
    def setOnUploaded(value: /* e */ EventFile => _): Self = this.set("onUploaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUploaded: Self = this.set("onUploaded", js.undefined)
    
    @scala.inline
    def setOnValueChanged(value: /* e */ PreviousValueValue => _): Self = this.set("onValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChanged: Self = this.set("onValueChanged", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setReadyToUploadMessage(value: String): Self = this.set("readyToUploadMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyToUploadMessage: Self = this.set("readyToUploadMessage", js.undefined)
    
    @scala.inline
    def setSelectButtonText(value: String): Self = this.set("selectButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectButtonText: Self = this.set("selectButtonText", js.undefined)
    
    @scala.inline
    def setShowFileList(value: Boolean): Self = this.set("showFileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFileList: Self = this.set("showFileList", js.undefined)
    
    @scala.inline
    def setUploadAbortedMessage(value: String): Self = this.set("uploadAbortedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadAbortedMessage: Self = this.set("uploadAbortedMessage", js.undefined)
    
    @scala.inline
    def setUploadButtonText(value: String): Self = this.set("uploadButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadButtonText: Self = this.set("uploadButtonText", js.undefined)
    
    @scala.inline
    def setUploadChunk(value: (/* file */ File, /* uploadInfo */ UploadInfo) => Promise[_] | JQueryPromise[_] | _): Self = this.set("uploadChunk", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUploadChunk: Self = this.set("uploadChunk", js.undefined)
    
    @scala.inline
    def setUploadCustomData(value: js.Any): Self = this.set("uploadCustomData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadCustomData: Self = this.set("uploadCustomData", js.undefined)
    
    @scala.inline
    def setUploadFailedMessage(value: String): Self = this.set("uploadFailedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadFailedMessage: Self = this.set("uploadFailedMessage", js.undefined)
    
    @scala.inline
    def setUploadFile(value: (/* file */ File, /* progressCallback */ js.Function) => Promise[_] | JQueryPromise[_] | _): Self = this.set("uploadFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUploadFile: Self = this.set("uploadFile", js.undefined)
    
    @scala.inline
    def setUploadHeaders(value: js.Any): Self = this.set("uploadHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadHeaders: Self = this.set("uploadHeaders", js.undefined)
    
    @scala.inline
    def setUploadMethod(value: POST | PUT): Self = this.set("uploadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadMethod: Self = this.set("uploadMethod", js.undefined)
    
    @scala.inline
    def setUploadMode(value: instantly | useButtons | useForm): Self = this.set("uploadMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadMode: Self = this.set("uploadMode", js.undefined)
    
    @scala.inline
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
    
    @scala.inline
    def setUploadedMessage(value: String): Self = this.set("uploadedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadedMessage: Self = this.set("uploadedMessage", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: File*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[File]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
