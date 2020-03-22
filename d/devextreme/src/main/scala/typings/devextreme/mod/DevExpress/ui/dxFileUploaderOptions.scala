package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonBytesLoaded
import typings.devextreme.AnonBytesUploaded
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonFile
import typings.devextreme.AnonJQueryEventModel
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonRequest
import typings.devextreme.devextremeStrings.POST
import typings.devextreme.devextremeStrings.PUT
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.instantly
import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.useButtons
import typings.devextreme.devextremeStrings.useForm
import typings.devextreme.devextremeStrings.valid
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFileUploaderOptions extends EditorOptions[dxFileUploader] {
  /** A function that cancels the file upload. */
  var abortUpload: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* uploadInfo */ AnonBytesUploaded, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.undefined
  /** Specifies a file type or several types accepted by the widget. */
  var accept: js.UndefOr[String] = js.undefined
  /** Specifies if an end user can remove a file from the selection and interrupt uploading. */
  var allowCanceling: js.UndefOr[Boolean] = js.undefined
  /** Restricts file extensions that can be uploaded to the server. */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  /** Specifies the chunk size in bytes. Applies only if uploadMode is "instantly" or "useButtons". Requires a server that can process file chunks. */
  var chunkSize: js.UndefOr[Double] = js.undefined
  /** The text displayed when the extension of the file being uploaded is not an allowed file extension. */
  var invalidFileExtensionMessage: js.UndefOr[String] = js.undefined
  /** The text displayed when the size of the file being uploaded is greater than the maxFileSize. */
  var invalidMaxFileSizeMessage: js.UndefOr[String] = js.undefined
  /** The text displayed when the size of the file being uploaded is less than the minFileSize. */
  var invalidMinFileSizeMessage: js.UndefOr[String] = js.undefined
  /** Specifies the text displayed on the area to which an end-user can drop a file. */
  var labelText: js.UndefOr[String] = js.undefined
  /** Specifies the maximum file size (in bytes) allowed for uploading. Applies only if uploadMode is "instantly" or "useButtons". */
  var maxFileSize: js.UndefOr[Double] = js.undefined
  /** Specifies the minimum file size (in bytes) allowed for uploading. Applies only if uploadMode is "instantly" or "useButtons". */
  var minFileSize: js.UndefOr[Double] = js.undefined
  /** Specifies whether the widget enables an end-user to select a single file or multiple files. */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /** Specifies the value passed to the name attribute of the underlying input element. Required to access uploaded files on the server. */
  var name: js.UndefOr[String] = js.undefined
  /** A function that is executed when a file segment is uploaded. */
  var onProgress: js.UndefOr[js.Function1[/* e */ AnonBytesLoaded, _]] = js.undefined
  /** A function that is executed when the file upload is aborted. */
  var onUploadAborted: js.UndefOr[js.Function1[/* e */ AnonFile, _]] = js.undefined
  /** A function that is executed when an error occurs during the file upload. */
  var onUploadError: js.UndefOr[js.Function1[/* e */ AnonRequest, _]] = js.undefined
  /** A function that is executed when the file upload is started. */
  var onUploadStarted: js.UndefOr[js.Function1[/* e */ AnonFile, _]] = js.undefined
  /** A function that is executed when a file is successfully uploaded. */
  var onUploaded: js.UndefOr[js.Function1[/* e */ AnonFile, _]] = js.undefined
  /** A function that is executed when one or several files are added to or removed from the selection. */
  @JSName("onValueChanged")
  var onValueChanged_dxFileUploaderOptions: js.UndefOr[js.Function1[/* e */ AnonJQueryEventModel, _]] = js.undefined
  /** Gets the current progress in percentages. */
  var progress: js.UndefOr[Double] = js.undefined
  /** The message displayed by the widget when it is ready to upload the specified files. */
  var readyToUploadMessage: js.UndefOr[String] = js.undefined
  /** The text displayed on the button that opens the file browser. */
  var selectButtonText: js.UndefOr[String] = js.undefined
  /** Specifies whether or not the widget displays the list of selected files. */
  var showFileList: js.UndefOr[Boolean] = js.undefined
  /** The text displayed on the button that starts uploading. */
  var uploadButtonText: js.UndefOr[String] = js.undefined
  /** A function that uploads a file in chunks. */
  var uploadChunk: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* uploadInfo */ AnonBytesUploaded, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.undefined
  /** The message displayed by the widget on uploading failure. */
  var uploadFailedMessage: js.UndefOr[String] = js.undefined
  /** A function that uploads a file. */
  var uploadFile: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* progressCallback */ js.Function, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.undefined
  /** Specifies headers for the upload request. */
  var uploadHeaders: js.UndefOr[js.Any] = js.undefined
  /** Specifies the method for the upload request. */
  var uploadMethod: js.UndefOr[POST | PUT] = js.undefined
  /** Specifies how the widget uploads files. */
  var uploadMode: js.UndefOr[instantly | useButtons | useForm] = js.undefined
  /** Specifies a target Url for the upload request. */
  var uploadUrl: js.UndefOr[String] = js.undefined
  /** The message displayed by the widget when uploading is finished. */
  var uploadedMessage: js.UndefOr[String] = js.undefined
  /** Specifies a File instance representing the selected file. Read-only when uploadMode is "useForm". */
  @JSName("value")
  var value_dxFileUploaderOptions: js.UndefOr[js.Array[File]] = js.undefined
}

object dxFileUploaderOptions {
  @scala.inline
  def apply(
    abortUpload: (/* file */ File, /* uploadInfo */ AnonBytesUploaded) => Promise[_] | JQueryPromise[_] | _ = null,
    accept: String = null,
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowCanceling: js.UndefOr[Boolean] = js.undefined,
    allowedFileExtensions: js.Array[String] = null,
    bindingOptions: js.Any = null,
    chunkSize: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    invalidFileExtensionMessage: String = null,
    invalidMaxFileSizeMessage: String = null,
    invalidMinFileSizeMessage: String = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    labelText: String = null,
    maxFileSize: Int | Double = null,
    minFileSize: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onContentReady: /* e */ AnonComponentElement[dxFileUploader] => _ = null,
    onDisposing: /* e */ AnonModel[dxFileUploader] => _ = null,
    onInitialized: /* e */ AnonElement[dxFileUploader] => _ = null,
    onOptionChanged: /* e */ AnonName[dxFileUploader] => _ = null,
    onProgress: /* e */ AnonBytesLoaded => _ = null,
    onUploadAborted: /* e */ AnonFile => _ = null,
    onUploadError: /* e */ AnonRequest => _ = null,
    onUploadStarted: /* e */ AnonFile => _ = null,
    onUploaded: /* e */ AnonFile => _ = null,
    onValueChanged: /* e */ AnonJQueryEventModel => _ = null,
    progress: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    readyToUploadMessage: String = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectButtonText: String = null,
    showFileList: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    uploadButtonText: String = null,
    uploadChunk: (/* file */ File, /* uploadInfo */ AnonBytesUploaded) => Promise[_] | JQueryPromise[_] | _ = null,
    uploadFailedMessage: String = null,
    uploadFile: (/* file */ File, /* progressCallback */ js.Function) => Promise[_] | JQueryPromise[_] | _ = null,
    uploadHeaders: js.Any = null,
    uploadMethod: POST | PUT = null,
    uploadMode: instantly | useButtons | useForm = null,
    uploadUrl: String = null,
    uploadedMessage: String = null,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: js.Array[File] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxFileUploaderOptions = {
    val __obj = js.Dynamic.literal()
    if (abortUpload != null) __obj.updateDynamic("abortUpload")(js.Any.fromFunction2(abortUpload))
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCanceling)) __obj.updateDynamic("allowCanceling")(allowCanceling.asInstanceOf[js.Any])
    if (allowedFileExtensions != null) __obj.updateDynamic("allowedFileExtensions")(allowedFileExtensions.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (invalidFileExtensionMessage != null) __obj.updateDynamic("invalidFileExtensionMessage")(invalidFileExtensionMessage.asInstanceOf[js.Any])
    if (invalidMaxFileSizeMessage != null) __obj.updateDynamic("invalidMaxFileSizeMessage")(invalidMaxFileSizeMessage.asInstanceOf[js.Any])
    if (invalidMinFileSizeMessage != null) __obj.updateDynamic("invalidMinFileSizeMessage")(invalidMinFileSizeMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (labelText != null) __obj.updateDynamic("labelText")(labelText.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (minFileSize != null) __obj.updateDynamic("minFileSize")(minFileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onUploadAborted != null) __obj.updateDynamic("onUploadAborted")(js.Any.fromFunction1(onUploadAborted))
    if (onUploadError != null) __obj.updateDynamic("onUploadError")(js.Any.fromFunction1(onUploadError))
    if (onUploadStarted != null) __obj.updateDynamic("onUploadStarted")(js.Any.fromFunction1(onUploadStarted))
    if (onUploaded != null) __obj.updateDynamic("onUploaded")(js.Any.fromFunction1(onUploaded))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (readyToUploadMessage != null) __obj.updateDynamic("readyToUploadMessage")(readyToUploadMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectButtonText != null) __obj.updateDynamic("selectButtonText")(selectButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(showFileList)) __obj.updateDynamic("showFileList")(showFileList.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (uploadButtonText != null) __obj.updateDynamic("uploadButtonText")(uploadButtonText.asInstanceOf[js.Any])
    if (uploadChunk != null) __obj.updateDynamic("uploadChunk")(js.Any.fromFunction2(uploadChunk))
    if (uploadFailedMessage != null) __obj.updateDynamic("uploadFailedMessage")(uploadFailedMessage.asInstanceOf[js.Any])
    if (uploadFile != null) __obj.updateDynamic("uploadFile")(js.Any.fromFunction2(uploadFile))
    if (uploadHeaders != null) __obj.updateDynamic("uploadHeaders")(uploadHeaders.asInstanceOf[js.Any])
    if (uploadMethod != null) __obj.updateDynamic("uploadMethod")(uploadMethod.asInstanceOf[js.Any])
    if (uploadMode != null) __obj.updateDynamic("uploadMode")(uploadMode.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    if (uploadedMessage != null) __obj.updateDynamic("uploadedMessage")(uploadedMessage.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFileUploaderOptions]
  }
}

