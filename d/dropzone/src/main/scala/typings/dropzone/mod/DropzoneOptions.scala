package typings.dropzone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dropzone.dropzoneStrings.contain
import typings.dropzone.dropzoneStrings.crop
import typings.dropzone.mod.global.HTMLElement
import typings.std.Blob
import typings.std.DragEvent
import typings.std.Error
import typings.std.FormData
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneOptions extends js.Object {
  var accept: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit], 
      Unit
    ]
  ] = js.undefined
  var acceptedFiles: js.UndefOr[String] = js.undefined
  var addRemoveLinks: js.UndefOr[Boolean] = js.undefined
  var addedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var addedfiles: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.undefined
  var autoProcessQueue: js.UndefOr[Boolean] = js.undefined
  var autoQueue: js.UndefOr[Boolean] = js.undefined
  var canceled: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var canceledmultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.undefined
  var capture: js.UndefOr[String] = js.undefined
  var chunkSize: js.UndefOr[Double] = js.undefined
  var chunking: js.UndefOr[Boolean] = js.undefined
  var chunksUploaded: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit], 
      Unit
    ]
  ] = js.undefined
  var clickable: js.UndefOr[Boolean | String | HTMLElement | (js.Array[String | HTMLElement])] = js.undefined
  var complete: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var completemultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.undefined
  var createImageThumbnails: js.UndefOr[Boolean] = js.undefined
  var dictCancelUpload: js.UndefOr[String] = js.undefined
  var dictCancelUploadConfirmation: js.UndefOr[String] = js.undefined
  var dictDefaultMessage: js.UndefOr[String] = js.undefined
  var dictFallbackMessage: js.UndefOr[String] = js.undefined
  var dictFallbackText: js.UndefOr[String] = js.undefined
  var dictFileSizeUnits: js.UndefOr[DropzoneDictFileSizeUnits] = js.undefined
  var dictFileTooBig: js.UndefOr[String] = js.undefined
  var dictInvalidFileType: js.UndefOr[String] = js.undefined
  var dictMaxFilesExceeded: js.UndefOr[String] = js.undefined
  var dictRemoveFile: js.UndefOr[String] = js.undefined
  var dictRemoveFileConfirmation: js.UndefOr[String] = js.undefined
  var dictResponseError: js.UndefOr[String] = js.undefined
  var dictUploadCanceled: js.UndefOr[String] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var dragenter: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var dragleave: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var dragover: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var error: js.UndefOr[
    js.Function3[/* file */ DropzoneFile, /* message */ String | Error, /* xhr */ XMLHttpRequest, Unit]
  ] = js.undefined
  var errormultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* message */ String | Error, 
      /* xhr */ XMLHttpRequest, 
      Unit
    ]
  ] = js.undefined
  var fallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var filesizeBase: js.UndefOr[Double] = js.undefined
  var forceChunking: js.UndefOr[Boolean] = js.undefined
  var forceFallback: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var hiddenInputContainer: js.UndefOr[HTMLElement] = js.undefined
  var ignoreHiddenFiles: js.UndefOr[Boolean] = js.undefined
  var init: js.UndefOr[js.ThisFunction0[/* this */ Dropzone, Unit]] = js.undefined
  var maxFiles: js.UndefOr[Double] = js.undefined
  var maxFilesize: js.UndefOr[Double] = js.undefined
  var maxThumbnailFilesize: js.UndefOr[Double] = js.undefined
  var maxfilesexceeded: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var maxfilesreached: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.undefined
  var method: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.undefined
  var parallelChunkUploads: js.UndefOr[Boolean] = js.undefined
  var parallelUploads: js.UndefOr[Double] = js.undefined
  var paramName: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var paste: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var previewTemplate: js.UndefOr[String] = js.undefined
  var previewsContainer: js.UndefOr[Boolean | String | HTMLElement] = js.undefined
  var processing: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var processingmultiple: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.undefined
  var queuecomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var renameFilename: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  var resize: js.UndefOr[
    js.Function4[
      /* file */ DropzoneFile, 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* resizeMethod */ js.UndefOr[String], 
      DropzoneResizeInfo
    ]
  ] = js.undefined
  var resizeHeight: js.UndefOr[Double] = js.undefined
  var resizeMethod: js.UndefOr[contain | crop] = js.undefined
  var resizeMimeType: js.UndefOr[String] = js.undefined
  var resizeQuality: js.UndefOr[Double] = js.undefined
  var resizeWidth: js.UndefOr[Double] = js.undefined
  var retryChunks: js.UndefOr[Boolean] = js.undefined
  var retryChunksLimit: js.UndefOr[Double] = js.undefined
  var sending: js.UndefOr[
    js.Function3[/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData, Unit]
  ] = js.undefined
  var sendingmultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* xhr */ XMLHttpRequest, 
      /* formData */ FormData, 
      Unit
    ]
  ] = js.undefined
  var success: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var successmultiple: js.UndefOr[
    js.Function2[/* files */ js.Array[DropzoneFile], /* responseText */ String, Unit]
  ] = js.undefined
  var thumbnail: js.UndefOr[js.Function2[/* file */ DropzoneFile, /* dataUrl */ String, Unit]] = js.undefined
  var thumbnailHeight: js.UndefOr[Double] = js.undefined
  var thumbnailMethod: js.UndefOr[contain | crop] = js.undefined
  var thumbnailWidth: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var totaluploadprogress: js.UndefOr[
    js.Function3[/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double, Unit]
  ] = js.undefined
  var transformFile: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* file */ String | Blob, Unit], 
      Unit
    ]
  ] = js.undefined
  var uploadMultiple: js.UndefOr[Boolean] = js.undefined
  var uploadprogress: js.UndefOr[
    js.Function3[/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double, Unit]
  ] = js.undefined
  var url: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object DropzoneOptions {
  @scala.inline
  def apply(
    accept: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit]) => Unit = null,
    acceptedFiles: String = null,
    addRemoveLinks: js.UndefOr[Boolean] = js.undefined,
    addedfile: /* file */ DropzoneFile => Unit = null,
    addedfiles: /* files */ js.Array[DropzoneFile] => Unit = null,
    autoProcessQueue: js.UndefOr[Boolean] = js.undefined,
    autoQueue: js.UndefOr[Boolean] = js.undefined,
    canceled: /* file */ DropzoneFile => Unit = null,
    canceledmultiple: /* file */ js.Array[DropzoneFile] => Unit = null,
    capture: String = null,
    chunkSize: js.UndefOr[Double] = js.undefined,
    chunking: js.UndefOr[Boolean] = js.undefined,
    chunksUploaded: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit]) => Unit = null,
    clickable: Boolean | String | HTMLElement | (js.Array[String | HTMLElement]) = null,
    complete: /* file */ DropzoneFile => Unit = null,
    completemultiple: /* file */ js.Array[DropzoneFile] => Unit = null,
    createImageThumbnails: js.UndefOr[Boolean] = js.undefined,
    dictCancelUpload: String = null,
    dictCancelUploadConfirmation: String = null,
    dictDefaultMessage: String = null,
    dictFallbackMessage: String = null,
    dictFallbackText: String = null,
    dictFileSizeUnits: DropzoneDictFileSizeUnits = null,
    dictFileTooBig: String = null,
    dictInvalidFileType: String = null,
    dictMaxFilesExceeded: String = null,
    dictRemoveFile: String = null,
    dictRemoveFileConfirmation: String = null,
    dictResponseError: String = null,
    dictUploadCanceled: String = null,
    dragend: /* e */ DragEvent => Unit = null,
    dragenter: /* e */ DragEvent => Unit = null,
    dragleave: /* e */ DragEvent => Unit = null,
    dragover: /* e */ DragEvent => Unit = null,
    dragstart: /* e */ DragEvent => Unit = null,
    drop: /* e */ DragEvent => Unit = null,
    error: (/* file */ DropzoneFile, /* message */ String | Error, /* xhr */ XMLHttpRequest) => Unit = null,
    errormultiple: (/* files */ js.Array[DropzoneFile], /* message */ String | Error, /* xhr */ XMLHttpRequest) => Unit = null,
    fallback: () => Unit = null,
    filesizeBase: js.UndefOr[Double] = js.undefined,
    forceChunking: js.UndefOr[Boolean] = js.undefined,
    forceFallback: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    hiddenInputContainer: HTMLElement = null,
    ignoreHiddenFiles: js.UndefOr[Boolean] = js.undefined,
    init: js.ThisFunction0[/* this */ Dropzone, Unit] = null,
    maxFiles: js.UndefOr[Double] = js.undefined,
    maxFilesize: js.UndefOr[Double] = js.undefined,
    maxThumbnailFilesize: js.UndefOr[Double] = js.undefined,
    maxfilesexceeded: /* file */ DropzoneFile => Unit = null,
    maxfilesreached: /* files */ js.Array[DropzoneFile] => Unit = null,
    method: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String = null,
    parallelChunkUploads: js.UndefOr[Boolean] = js.undefined,
    parallelUploads: js.UndefOr[Double] = js.undefined,
    paramName: String = null,
    params: js.Object = null,
    paste: /* e */ DragEvent => Unit = null,
    previewTemplate: String = null,
    previewsContainer: Boolean | String | HTMLElement = null,
    processing: /* file */ DropzoneFile => Unit = null,
    processingmultiple: /* files */ js.Array[DropzoneFile] => Unit = null,
    queuecomplete: () => Unit = null,
    removedfile: /* file */ DropzoneFile => Unit = null,
    renameFilename: /* name */ String => String = null,
    reset: () => Unit = null,
    resize: (/* file */ DropzoneFile, /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* resizeMethod */ js.UndefOr[String]) => DropzoneResizeInfo = null,
    resizeHeight: js.UndefOr[Double] = js.undefined,
    resizeMethod: contain | crop = null,
    resizeMimeType: String = null,
    resizeQuality: js.UndefOr[Double] = js.undefined,
    resizeWidth: js.UndefOr[Double] = js.undefined,
    retryChunks: js.UndefOr[Boolean] = js.undefined,
    retryChunksLimit: js.UndefOr[Double] = js.undefined,
    sending: (/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData) => Unit = null,
    sendingmultiple: (/* files */ js.Array[DropzoneFile], /* xhr */ XMLHttpRequest, /* formData */ FormData) => Unit = null,
    success: /* file */ DropzoneFile => Unit = null,
    successmultiple: (/* files */ js.Array[DropzoneFile], /* responseText */ String) => Unit = null,
    thumbnail: (/* file */ DropzoneFile, /* dataUrl */ String) => Unit = null,
    thumbnailHeight: js.UndefOr[Double] = js.undefined,
    thumbnailMethod: contain | crop = null,
    thumbnailWidth: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    totaluploadprogress: (/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double) => Unit = null,
    transformFile: (/* file */ DropzoneFile, /* done */ js.Function1[/* file */ String | Blob, Unit]) => Unit = null,
    uploadMultiple: js.UndefOr[Boolean] = js.undefined,
    uploadprogress: (/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double) => Unit = null,
    url: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): DropzoneOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(js.Any.fromFunction2(accept))
    if (acceptedFiles != null) __obj.updateDynamic("acceptedFiles")(acceptedFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(addRemoveLinks)) __obj.updateDynamic("addRemoveLinks")(addRemoveLinks.get.asInstanceOf[js.Any])
    if (addedfile != null) __obj.updateDynamic("addedfile")(js.Any.fromFunction1(addedfile))
    if (addedfiles != null) __obj.updateDynamic("addedfiles")(js.Any.fromFunction1(addedfiles))
    if (!js.isUndefined(autoProcessQueue)) __obj.updateDynamic("autoProcessQueue")(autoProcessQueue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoQueue)) __obj.updateDynamic("autoQueue")(autoQueue.get.asInstanceOf[js.Any])
    if (canceled != null) __obj.updateDynamic("canceled")(js.Any.fromFunction1(canceled))
    if (canceledmultiple != null) __obj.updateDynamic("canceledmultiple")(js.Any.fromFunction1(canceledmultiple))
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chunking)) __obj.updateDynamic("chunking")(chunking.get.asInstanceOf[js.Any])
    if (chunksUploaded != null) __obj.updateDynamic("chunksUploaded")(js.Any.fromFunction2(chunksUploaded))
    if (clickable != null) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (completemultiple != null) __obj.updateDynamic("completemultiple")(js.Any.fromFunction1(completemultiple))
    if (!js.isUndefined(createImageThumbnails)) __obj.updateDynamic("createImageThumbnails")(createImageThumbnails.get.asInstanceOf[js.Any])
    if (dictCancelUpload != null) __obj.updateDynamic("dictCancelUpload")(dictCancelUpload.asInstanceOf[js.Any])
    if (dictCancelUploadConfirmation != null) __obj.updateDynamic("dictCancelUploadConfirmation")(dictCancelUploadConfirmation.asInstanceOf[js.Any])
    if (dictDefaultMessage != null) __obj.updateDynamic("dictDefaultMessage")(dictDefaultMessage.asInstanceOf[js.Any])
    if (dictFallbackMessage != null) __obj.updateDynamic("dictFallbackMessage")(dictFallbackMessage.asInstanceOf[js.Any])
    if (dictFallbackText != null) __obj.updateDynamic("dictFallbackText")(dictFallbackText.asInstanceOf[js.Any])
    if (dictFileSizeUnits != null) __obj.updateDynamic("dictFileSizeUnits")(dictFileSizeUnits.asInstanceOf[js.Any])
    if (dictFileTooBig != null) __obj.updateDynamic("dictFileTooBig")(dictFileTooBig.asInstanceOf[js.Any])
    if (dictInvalidFileType != null) __obj.updateDynamic("dictInvalidFileType")(dictInvalidFileType.asInstanceOf[js.Any])
    if (dictMaxFilesExceeded != null) __obj.updateDynamic("dictMaxFilesExceeded")(dictMaxFilesExceeded.asInstanceOf[js.Any])
    if (dictRemoveFile != null) __obj.updateDynamic("dictRemoveFile")(dictRemoveFile.asInstanceOf[js.Any])
    if (dictRemoveFileConfirmation != null) __obj.updateDynamic("dictRemoveFileConfirmation")(dictRemoveFileConfirmation.asInstanceOf[js.Any])
    if (dictResponseError != null) __obj.updateDynamic("dictResponseError")(dictResponseError.asInstanceOf[js.Any])
    if (dictUploadCanceled != null) __obj.updateDynamic("dictUploadCanceled")(dictUploadCanceled.asInstanceOf[js.Any])
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1(dragend))
    if (dragenter != null) __obj.updateDynamic("dragenter")(js.Any.fromFunction1(dragenter))
    if (dragleave != null) __obj.updateDynamic("dragleave")(js.Any.fromFunction1(dragleave))
    if (dragover != null) __obj.updateDynamic("dragover")(js.Any.fromFunction1(dragover))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1(dragstart))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1(drop))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (errormultiple != null) __obj.updateDynamic("errormultiple")(js.Any.fromFunction3(errormultiple))
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction0(fallback))
    if (!js.isUndefined(filesizeBase)) __obj.updateDynamic("filesizeBase")(filesizeBase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceChunking)) __obj.updateDynamic("forceChunking")(forceChunking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFallback)) __obj.updateDynamic("forceFallback")(forceFallback.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hiddenInputContainer != null) __obj.updateDynamic("hiddenInputContainer")(hiddenInputContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHiddenFiles)) __obj.updateDynamic("ignoreHiddenFiles")(ignoreHiddenFiles.get.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFiles)) __obj.updateDynamic("maxFiles")(maxFiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFilesize)) __obj.updateDynamic("maxFilesize")(maxFilesize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxThumbnailFilesize)) __obj.updateDynamic("maxThumbnailFilesize")(maxThumbnailFilesize.get.asInstanceOf[js.Any])
    if (maxfilesexceeded != null) __obj.updateDynamic("maxfilesexceeded")(js.Any.fromFunction1(maxfilesexceeded))
    if (maxfilesreached != null) __obj.updateDynamic("maxfilesreached")(js.Any.fromFunction1(maxfilesreached))
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(parallelChunkUploads)) __obj.updateDynamic("parallelChunkUploads")(parallelChunkUploads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parallelUploads)) __obj.updateDynamic("parallelUploads")(parallelUploads.get.asInstanceOf[js.Any])
    if (paramName != null) __obj.updateDynamic("paramName")(paramName.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1(paste))
    if (previewTemplate != null) __obj.updateDynamic("previewTemplate")(previewTemplate.asInstanceOf[js.Any])
    if (previewsContainer != null) __obj.updateDynamic("previewsContainer")(previewsContainer.asInstanceOf[js.Any])
    if (processing != null) __obj.updateDynamic("processing")(js.Any.fromFunction1(processing))
    if (processingmultiple != null) __obj.updateDynamic("processingmultiple")(js.Any.fromFunction1(processingmultiple))
    if (queuecomplete != null) __obj.updateDynamic("queuecomplete")(js.Any.fromFunction0(queuecomplete))
    if (removedfile != null) __obj.updateDynamic("removedfile")(js.Any.fromFunction1(removedfile))
    if (renameFilename != null) __obj.updateDynamic("renameFilename")(js.Any.fromFunction1(renameFilename))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction4(resize))
    if (!js.isUndefined(resizeHeight)) __obj.updateDynamic("resizeHeight")(resizeHeight.get.asInstanceOf[js.Any])
    if (resizeMethod != null) __obj.updateDynamic("resizeMethod")(resizeMethod.asInstanceOf[js.Any])
    if (resizeMimeType != null) __obj.updateDynamic("resizeMimeType")(resizeMimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeQuality)) __obj.updateDynamic("resizeQuality")(resizeQuality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeWidth)) __obj.updateDynamic("resizeWidth")(resizeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryChunks)) __obj.updateDynamic("retryChunks")(retryChunks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryChunksLimit)) __obj.updateDynamic("retryChunksLimit")(retryChunksLimit.get.asInstanceOf[js.Any])
    if (sending != null) __obj.updateDynamic("sending")(js.Any.fromFunction3(sending))
    if (sendingmultiple != null) __obj.updateDynamic("sendingmultiple")(js.Any.fromFunction3(sendingmultiple))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (successmultiple != null) __obj.updateDynamic("successmultiple")(js.Any.fromFunction2(successmultiple))
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(js.Any.fromFunction2(thumbnail))
    if (!js.isUndefined(thumbnailHeight)) __obj.updateDynamic("thumbnailHeight")(thumbnailHeight.get.asInstanceOf[js.Any])
    if (thumbnailMethod != null) __obj.updateDynamic("thumbnailMethod")(thumbnailMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbnailWidth)) __obj.updateDynamic("thumbnailWidth")(thumbnailWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (totaluploadprogress != null) __obj.updateDynamic("totaluploadprogress")(js.Any.fromFunction3(totaluploadprogress))
    if (transformFile != null) __obj.updateDynamic("transformFile")(js.Any.fromFunction2(transformFile))
    if (!js.isUndefined(uploadMultiple)) __obj.updateDynamic("uploadMultiple")(uploadMultiple.get.asInstanceOf[js.Any])
    if (uploadprogress != null) __obj.updateDynamic("uploadprogress")(js.Any.fromFunction3(uploadprogress))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropzoneOptions]
  }
}

