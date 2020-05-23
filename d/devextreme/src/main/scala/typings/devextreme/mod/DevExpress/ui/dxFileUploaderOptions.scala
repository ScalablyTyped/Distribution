package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.BytesLoaded
import typings.devextreme.anon.BytesUploaded
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Element
import typings.devextreme.anon.JQueryEventModel
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.Request
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
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFileUploaderOptions extends EditorOptions[dxFileUploader] {
  /** @name dxFileUploader.Options.abortUpload */
  var abortUpload: js.UndefOr[
    js.Function2[/* file */ File, /* uploadInfo */ BytesUploaded, Promise[_] | JQueryPromise[_] | _]
  ] = js.undefined
  /** @name dxFileUploader.Options.accept */
  var accept: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.allowCanceling */
  var allowCanceling: js.UndefOr[Boolean] = js.undefined
  /** @name dxFileUploader.Options.allowedFileExtensions */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  /** @name dxFileUploader.Options.chunkSize */
  var chunkSize: js.UndefOr[Double] = js.undefined
  /** @name dxFileUploader.Options.inputAttr */
  var inputAttr: js.UndefOr[js.Any] = js.undefined
  /** @name dxFileUploader.Options.invalidFileExtensionMessage */
  var invalidFileExtensionMessage: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.invalidMaxFileSizeMessage */
  var invalidMaxFileSizeMessage: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.invalidMinFileSizeMessage */
  var invalidMinFileSizeMessage: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.labelText */
  var labelText: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.maxFileSize */
  var maxFileSize: js.UndefOr[Double] = js.undefined
  /** @name dxFileUploader.Options.minFileSize */
  var minFileSize: js.UndefOr[Double] = js.undefined
  /** @name dxFileUploader.Options.multiple */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /** @name dxFileUploader.Options.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.onProgress */
  var onProgress: js.UndefOr[js.Function1[/* e */ BytesLoaded, _]] = js.undefined
  /** @name dxFileUploader.Options.onUploadAborted */
  var onUploadAborted: js.UndefOr[js.Function1[/* e */ typings.devextreme.anon.File, _]] = js.undefined
  /** @name dxFileUploader.Options.onUploadError */
  var onUploadError: js.UndefOr[js.Function1[/* e */ Request, _]] = js.undefined
  /** @name dxFileUploader.Options.onUploadStarted */
  var onUploadStarted: js.UndefOr[js.Function1[/* e */ typings.devextreme.anon.File, _]] = js.undefined
  /** @name dxFileUploader.Options.onUploaded */
  var onUploaded: js.UndefOr[js.Function1[/* e */ typings.devextreme.anon.File, _]] = js.undefined
  /** @name dxFileUploader.Options.onValueChanged */
  @JSName("onValueChanged")
  var onValueChanged_dxFileUploaderOptions: js.UndefOr[js.Function1[/* e */ JQueryEventModel, _]] = js.undefined
  /** @name dxFileUploader.Options.progress */
  var progress: js.UndefOr[Double] = js.undefined
  /** @name dxFileUploader.Options.readyToUploadMessage */
  var readyToUploadMessage: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.selectButtonText */
  var selectButtonText: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.showFileList */
  var showFileList: js.UndefOr[Boolean] = js.undefined
  /** @name dxFileUploader.Options.uploadButtonText */
  var uploadButtonText: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.uploadChunk */
  var uploadChunk: js.UndefOr[
    js.Function2[/* file */ File, /* uploadInfo */ BytesUploaded, Promise[_] | JQueryPromise[_] | _]
  ] = js.undefined
  /** @name dxFileUploader.Options.uploadFailedMessage */
  var uploadFailedMessage: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.uploadFile */
  var uploadFile: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* progressCallback */ js.Function, 
      Promise[_] | JQueryPromise[_] | _
    ]
  ] = js.undefined
  /** @name dxFileUploader.Options.uploadHeaders */
  var uploadHeaders: js.UndefOr[js.Any] = js.undefined
  /** @name dxFileUploader.Options.uploadMethod */
  var uploadMethod: js.UndefOr[POST | PUT] = js.undefined
  /** @name dxFileUploader.Options.uploadMode */
  var uploadMode: js.UndefOr[instantly | useButtons | useForm] = js.undefined
  /** @name dxFileUploader.Options.uploadUrl */
  var uploadUrl: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.uploadedMessage */
  var uploadedMessage: js.UndefOr[String] = js.undefined
  /** @name dxFileUploader.Options.value */
  @JSName("value")
  var value_dxFileUploaderOptions: js.UndefOr[js.Array[File]] = js.undefined
}

object dxFileUploaderOptions {
  @scala.inline
  def apply(
    abortUpload: (/* file */ File, /* uploadInfo */ BytesUploaded) => Promise[_] | JQueryPromise[_] | _ = null,
    accept: String = null,
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowCanceling: js.UndefOr[Boolean] = js.undefined,
    allowedFileExtensions: js.Array[String] = null,
    bindingOptions: js.Any = null,
    chunkSize: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    inputAttr: js.Any = null,
    invalidFileExtensionMessage: String = null,
    invalidMaxFileSizeMessage: String = null,
    invalidMinFileSizeMessage: String = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    labelText: String = null,
    maxFileSize: js.UndefOr[Double] = js.undefined,
    minFileSize: js.UndefOr[Double] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onContentReady: /* e */ ComponentElement[dxFileUploader] => _ = null,
    onDisposing: /* e */ Model[dxFileUploader] => _ = null,
    onInitialized: /* e */ Element[dxFileUploader] => _ = null,
    onOptionChanged: /* e */ Name[dxFileUploader] => _ = null,
    onProgress: /* e */ BytesLoaded => _ = null,
    onUploadAborted: /* e */ typings.devextreme.anon.File => _ = null,
    onUploadError: /* e */ Request => _ = null,
    onUploadStarted: /* e */ typings.devextreme.anon.File => _ = null,
    onUploaded: /* e */ typings.devextreme.anon.File => _ = null,
    onValueChanged: /* e */ JQueryEventModel => _ = null,
    progress: js.UndefOr[Double] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    readyToUploadMessage: String = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectButtonText: String = null,
    showFileList: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    uploadButtonText: String = null,
    uploadChunk: (/* file */ File, /* uploadInfo */ BytesUploaded) => Promise[_] | JQueryPromise[_] | _ = null,
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
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCanceling)) __obj.updateDynamic("allowCanceling")(allowCanceling.get.asInstanceOf[js.Any])
    if (allowedFileExtensions != null) __obj.updateDynamic("allowedFileExtensions")(allowedFileExtensions.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (invalidFileExtensionMessage != null) __obj.updateDynamic("invalidFileExtensionMessage")(invalidFileExtensionMessage.asInstanceOf[js.Any])
    if (invalidMaxFileSizeMessage != null) __obj.updateDynamic("invalidMaxFileSizeMessage")(invalidMaxFileSizeMessage.asInstanceOf[js.Any])
    if (invalidMinFileSizeMessage != null) __obj.updateDynamic("invalidMinFileSizeMessage")(invalidMinFileSizeMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.get.asInstanceOf[js.Any])
    if (labelText != null) __obj.updateDynamic("labelText")(labelText.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minFileSize)) __obj.updateDynamic("minFileSize")(minFileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (readyToUploadMessage != null) __obj.updateDynamic("readyToUploadMessage")(readyToUploadMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (selectButtonText != null) __obj.updateDynamic("selectButtonText")(selectButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(showFileList)) __obj.updateDynamic("showFileList")(showFileList.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFileUploaderOptions]
  }
}

