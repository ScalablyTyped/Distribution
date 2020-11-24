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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropzoneOptions extends js.Object {
  
  var accept: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit], 
      Unit
    ]
  ] = js.native
  
  var acceptedFiles: js.UndefOr[String] = js.native
  
  var addRemoveLinks: js.UndefOr[Boolean] = js.native
  
  var addedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  
  var addedfiles: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.native
  
  var autoProcessQueue: js.UndefOr[Boolean] = js.native
  
  var autoQueue: js.UndefOr[Boolean] = js.native
  
  var canceled: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  
  var canceledmultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.native
  
  var capture: js.UndefOr[String] = js.native
  
  var chunkSize: js.UndefOr[Double] = js.native
  
  var chunking: js.UndefOr[Boolean] = js.native
  
  var chunksUploaded: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit], 
      Unit
    ]
  ] = js.native
  
  var clickable: js.UndefOr[Boolean | String | HTMLElement | (js.Array[String | HTMLElement])] = js.native
  
  var complete: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  
  var completemultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.native
  
  var createImageThumbnails: js.UndefOr[Boolean] = js.native
  
  var dictCancelUpload: js.UndefOr[String] = js.native
  
  var dictCancelUploadConfirmation: js.UndefOr[String] = js.native
  
  var dictDefaultMessage: js.UndefOr[String] = js.native
  
  var dictFallbackMessage: js.UndefOr[String] = js.native
  
  var dictFallbackText: js.UndefOr[String] = js.native
  
  var dictFileSizeUnits: js.UndefOr[DropzoneDictFileSizeUnits] = js.native
  
  var dictFileTooBig: js.UndefOr[String] = js.native
  
  var dictInvalidFileType: js.UndefOr[String] = js.native
  
  var dictMaxFilesExceeded: js.UndefOr[String] = js.native
  
  var dictRemoveFile: js.UndefOr[String] = js.native
  
  var dictRemoveFileConfirmation: js.UndefOr[String] = js.native
  
  var dictResponseError: js.UndefOr[String] = js.native
  
  var dictUploadCanceled: js.UndefOr[String] = js.native
  
  var dragend: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  
  var dragenter: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  
  var dragleave: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  
  var dragover: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  
  var dragstart: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  
  var drop: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  
  var error: js.UndefOr[
    js.Function3[/* file */ DropzoneFile, /* message */ String | Error, /* xhr */ XMLHttpRequest, Unit]
  ] = js.native
  
  var errormultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* message */ String | Error, 
      /* xhr */ XMLHttpRequest, 
      Unit
    ]
  ] = js.native
  
  var fallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var filesizeBase: js.UndefOr[Double] = js.native
  
  var forceChunking: js.UndefOr[Boolean] = js.native
  
  var forceFallback: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var hiddenInputContainer: js.UndefOr[HTMLElement] = js.native
  
  var ignoreHiddenFiles: js.UndefOr[Boolean] = js.native
  
  var init: js.UndefOr[js.ThisFunction0[/* this */ Dropzone, Unit]] = js.native
  
  var maxFiles: js.UndefOr[Double] = js.native
  
  var maxFilesize: js.UndefOr[Double] = js.native
  
  var maxThumbnailFilesize: js.UndefOr[Double] = js.native
  
  var maxfilesexceeded: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  
  var maxfilesreached: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.native
  
  var method: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.native
  
  var parallelChunkUploads: js.UndefOr[Boolean] = js.native
  
  var parallelUploads: js.UndefOr[Double] = js.native
  
  var paramName: js.UndefOr[String] = js.native
  
  var params: js.UndefOr[js.Object] = js.native
  
  var paste: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  
  var previewTemplate: js.UndefOr[String] = js.native
  
  var previewsContainer: js.UndefOr[Boolean | String | HTMLElement] = js.native
  
  var processing: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  
  var processingmultiple: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.native
  
  var queuecomplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var removedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  
  var renameFilename: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
  
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
  
  var resize: js.UndefOr[
    js.Function4[
      /* file */ DropzoneFile, 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* resizeMethod */ js.UndefOr[String], 
      DropzoneResizeInfo
    ]
  ] = js.native
  
  var resizeHeight: js.UndefOr[Double] = js.native
  
  var resizeMethod: js.UndefOr[contain | crop] = js.native
  
  var resizeMimeType: js.UndefOr[String] = js.native
  
  var resizeQuality: js.UndefOr[Double] = js.native
  
  var resizeWidth: js.UndefOr[Double] = js.native
  
  var retryChunks: js.UndefOr[Boolean] = js.native
  
  var retryChunksLimit: js.UndefOr[Double] = js.native
  
  var sending: js.UndefOr[
    js.Function3[/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData, Unit]
  ] = js.native
  
  var sendingmultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* xhr */ XMLHttpRequest, 
      /* formData */ FormData, 
      Unit
    ]
  ] = js.native
  
  var success: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  
  var successmultiple: js.UndefOr[
    js.Function2[/* files */ js.Array[DropzoneFile], /* responseText */ String, Unit]
  ] = js.native
  
  var thumbnail: js.UndefOr[js.Function2[/* file */ DropzoneFile, /* dataUrl */ String, Unit]] = js.native
  
  var thumbnailHeight: js.UndefOr[Double] = js.native
  
  var thumbnailMethod: js.UndefOr[contain | crop] = js.native
  
  var thumbnailWidth: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var totaluploadprogress: js.UndefOr[
    js.Function3[/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double, Unit]
  ] = js.native
  
  var transformFile: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* file */ String | Blob, Unit], 
      Unit
    ]
  ] = js.native
  
  var uploadMultiple: js.UndefOr[Boolean] = js.native
  
  var uploadprogress: js.UndefOr[
    js.Function3[/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double, Unit]
  ] = js.native
  
  var url: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object DropzoneOptions {
  
  @scala.inline
  def apply(): DropzoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropzoneOptions]
  }
  
  @scala.inline
  implicit class DropzoneOptionsOps[Self <: DropzoneOptions] (val x: Self) extends AnyVal {
    
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
    def setAccept(
      value: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit]) => Unit
    ): Self = this.set("accept", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setAcceptedFiles(value: String): Self = this.set("acceptedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptedFiles: Self = this.set("acceptedFiles", js.undefined)
    
    @scala.inline
    def setAddRemoveLinks(value: Boolean): Self = this.set("addRemoveLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddRemoveLinks: Self = this.set("addRemoveLinks", js.undefined)
    
    @scala.inline
    def setAddedfile(value: /* file */ DropzoneFile => Unit): Self = this.set("addedfile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddedfile: Self = this.set("addedfile", js.undefined)
    
    @scala.inline
    def setAddedfiles(value: /* files */ js.Array[DropzoneFile] => Unit): Self = this.set("addedfiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddedfiles: Self = this.set("addedfiles", js.undefined)
    
    @scala.inline
    def setAutoProcessQueue(value: Boolean): Self = this.set("autoProcessQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoProcessQueue: Self = this.set("autoProcessQueue", js.undefined)
    
    @scala.inline
    def setAutoQueue(value: Boolean): Self = this.set("autoQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoQueue: Self = this.set("autoQueue", js.undefined)
    
    @scala.inline
    def setCanceled(value: /* file */ DropzoneFile => Unit): Self = this.set("canceled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCanceled: Self = this.set("canceled", js.undefined)
    
    @scala.inline
    def setCanceledmultiple(value: /* file */ js.Array[DropzoneFile] => Unit): Self = this.set("canceledmultiple", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCanceledmultiple: Self = this.set("canceledmultiple", js.undefined)
    
    @scala.inline
    def setCapture(value: String): Self = this.set("capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setChunking(value: Boolean): Self = this.set("chunking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunking: Self = this.set("chunking", js.undefined)
    
    @scala.inline
    def setChunksUploaded(
      value: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | Error], Unit]) => Unit
    ): Self = this.set("chunksUploaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteChunksUploaded: Self = this.set("chunksUploaded", js.undefined)
    
    @scala.inline
    def setClickableVarargs(value: (String | HTMLElement)*): Self = this.set("clickable", js.Array(value :_*))
    
    @scala.inline
    def setClickable(value: Boolean | String | HTMLElement | (js.Array[String | HTMLElement])): Self = this.set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    
    @scala.inline
    def setComplete(value: /* file */ DropzoneFile => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setCompletemultiple(value: /* file */ js.Array[DropzoneFile] => Unit): Self = this.set("completemultiple", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCompletemultiple: Self = this.set("completemultiple", js.undefined)
    
    @scala.inline
    def setCreateImageThumbnails(value: Boolean): Self = this.set("createImageThumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateImageThumbnails: Self = this.set("createImageThumbnails", js.undefined)
    
    @scala.inline
    def setDictCancelUpload(value: String): Self = this.set("dictCancelUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictCancelUpload: Self = this.set("dictCancelUpload", js.undefined)
    
    @scala.inline
    def setDictCancelUploadConfirmation(value: String): Self = this.set("dictCancelUploadConfirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictCancelUploadConfirmation: Self = this.set("dictCancelUploadConfirmation", js.undefined)
    
    @scala.inline
    def setDictDefaultMessage(value: String): Self = this.set("dictDefaultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictDefaultMessage: Self = this.set("dictDefaultMessage", js.undefined)
    
    @scala.inline
    def setDictFallbackMessage(value: String): Self = this.set("dictFallbackMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictFallbackMessage: Self = this.set("dictFallbackMessage", js.undefined)
    
    @scala.inline
    def setDictFallbackText(value: String): Self = this.set("dictFallbackText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictFallbackText: Self = this.set("dictFallbackText", js.undefined)
    
    @scala.inline
    def setDictFileSizeUnits(value: DropzoneDictFileSizeUnits): Self = this.set("dictFileSizeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictFileSizeUnits: Self = this.set("dictFileSizeUnits", js.undefined)
    
    @scala.inline
    def setDictFileTooBig(value: String): Self = this.set("dictFileTooBig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictFileTooBig: Self = this.set("dictFileTooBig", js.undefined)
    
    @scala.inline
    def setDictInvalidFileType(value: String): Self = this.set("dictInvalidFileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictInvalidFileType: Self = this.set("dictInvalidFileType", js.undefined)
    
    @scala.inline
    def setDictMaxFilesExceeded(value: String): Self = this.set("dictMaxFilesExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictMaxFilesExceeded: Self = this.set("dictMaxFilesExceeded", js.undefined)
    
    @scala.inline
    def setDictRemoveFile(value: String): Self = this.set("dictRemoveFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictRemoveFile: Self = this.set("dictRemoveFile", js.undefined)
    
    @scala.inline
    def setDictRemoveFileConfirmation(value: String): Self = this.set("dictRemoveFileConfirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictRemoveFileConfirmation: Self = this.set("dictRemoveFileConfirmation", js.undefined)
    
    @scala.inline
    def setDictResponseError(value: String): Self = this.set("dictResponseError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictResponseError: Self = this.set("dictResponseError", js.undefined)
    
    @scala.inline
    def setDictUploadCanceled(value: String): Self = this.set("dictUploadCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictUploadCanceled: Self = this.set("dictUploadCanceled", js.undefined)
    
    @scala.inline
    def setDragend(value: /* e */ DragEvent => Unit): Self = this.set("dragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    
    @scala.inline
    def setDragenter(value: /* e */ DragEvent => Unit): Self = this.set("dragenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragenter: Self = this.set("dragenter", js.undefined)
    
    @scala.inline
    def setDragleave(value: /* e */ DragEvent => Unit): Self = this.set("dragleave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragleave: Self = this.set("dragleave", js.undefined)
    
    @scala.inline
    def setDragover(value: /* e */ DragEvent => Unit): Self = this.set("dragover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragover: Self = this.set("dragover", js.undefined)
    
    @scala.inline
    def setDragstart(value: /* e */ DragEvent => Unit): Self = this.set("dragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ DragEvent => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setError(value: (/* file */ DropzoneFile, /* message */ String | Error, /* xhr */ XMLHttpRequest) => Unit): Self = this.set("error", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrormultiple(
      value: (/* files */ js.Array[DropzoneFile], /* message */ String | Error, /* xhr */ XMLHttpRequest) => Unit
    ): Self = this.set("errormultiple", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteErrormultiple: Self = this.set("errormultiple", js.undefined)
    
    @scala.inline
    def setFallback(value: () => Unit): Self = this.set("fallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setFilesizeBase(value: Double): Self = this.set("filesizeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilesizeBase: Self = this.set("filesizeBase", js.undefined)
    
    @scala.inline
    def setForceChunking(value: Boolean): Self = this.set("forceChunking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceChunking: Self = this.set("forceChunking", js.undefined)
    
    @scala.inline
    def setForceFallback(value: Boolean): Self = this.set("forceFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceFallback: Self = this.set("forceFallback", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHiddenInputContainer(value: HTMLElement): Self = this.set("hiddenInputContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenInputContainer: Self = this.set("hiddenInputContainer", js.undefined)
    
    @scala.inline
    def setIgnoreHiddenFiles(value: Boolean): Self = this.set("ignoreHiddenFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreHiddenFiles: Self = this.set("ignoreHiddenFiles", js.undefined)
    
    @scala.inline
    def setInit(value: js.ThisFunction0[/* this */ Dropzone, Unit]): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setMaxFiles(value: Double): Self = this.set("maxFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFiles: Self = this.set("maxFiles", js.undefined)
    
    @scala.inline
    def setMaxFilesize(value: Double): Self = this.set("maxFilesize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFilesize: Self = this.set("maxFilesize", js.undefined)
    
    @scala.inline
    def setMaxThumbnailFilesize(value: Double): Self = this.set("maxThumbnailFilesize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxThumbnailFilesize: Self = this.set("maxThumbnailFilesize", js.undefined)
    
    @scala.inline
    def setMaxfilesexceeded(value: /* file */ DropzoneFile => Unit): Self = this.set("maxfilesexceeded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMaxfilesexceeded: Self = this.set("maxfilesexceeded", js.undefined)
    
    @scala.inline
    def setMaxfilesreached(value: /* files */ js.Array[DropzoneFile] => Unit): Self = this.set("maxfilesreached", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMaxfilesreached: Self = this.set("maxfilesreached", js.undefined)
    
    @scala.inline
    def setMethodFunction1(value: /* files */ js.Array[DropzoneFile] => String): Self = this.set("method", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMethod(value: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setParallelChunkUploads(value: Boolean): Self = this.set("parallelChunkUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelChunkUploads: Self = this.set("parallelChunkUploads", js.undefined)
    
    @scala.inline
    def setParallelUploads(value: Double): Self = this.set("parallelUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelUploads: Self = this.set("parallelUploads", js.undefined)
    
    @scala.inline
    def setParamName(value: String): Self = this.set("paramName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamName: Self = this.set("paramName", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPaste(value: /* e */ DragEvent => Unit): Self = this.set("paste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    
    @scala.inline
    def setPreviewTemplate(value: String): Self = this.set("previewTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewTemplate: Self = this.set("previewTemplate", js.undefined)
    
    @scala.inline
    def setPreviewsContainer(value: Boolean | String | HTMLElement): Self = this.set("previewsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewsContainer: Self = this.set("previewsContainer", js.undefined)
    
    @scala.inline
    def setProcessing(value: /* file */ DropzoneFile => Unit): Self = this.set("processing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProcessing: Self = this.set("processing", js.undefined)
    
    @scala.inline
    def setProcessingmultiple(value: /* files */ js.Array[DropzoneFile] => Unit): Self = this.set("processingmultiple", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProcessingmultiple: Self = this.set("processingmultiple", js.undefined)
    
    @scala.inline
    def setQueuecomplete(value: () => Unit): Self = this.set("queuecomplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteQueuecomplete: Self = this.set("queuecomplete", js.undefined)
    
    @scala.inline
    def setRemovedfile(value: /* file */ DropzoneFile => Unit): Self = this.set("removedfile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemovedfile: Self = this.set("removedfile", js.undefined)
    
    @scala.inline
    def setRenameFilename(value: /* name */ String => String): Self = this.set("renameFilename", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenameFilename: Self = this.set("renameFilename", js.undefined)
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setResize(
      value: (/* file */ DropzoneFile, /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* resizeMethod */ js.UndefOr[String]) => DropzoneResizeInfo
    ): Self = this.set("resize", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setResizeHeight(value: Double): Self = this.set("resizeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeHeight: Self = this.set("resizeHeight", js.undefined)
    
    @scala.inline
    def setResizeMethod(value: contain | crop): Self = this.set("resizeMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeMethod: Self = this.set("resizeMethod", js.undefined)
    
    @scala.inline
    def setResizeMimeType(value: String): Self = this.set("resizeMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeMimeType: Self = this.set("resizeMimeType", js.undefined)
    
    @scala.inline
    def setResizeQuality(value: Double): Self = this.set("resizeQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeQuality: Self = this.set("resizeQuality", js.undefined)
    
    @scala.inline
    def setResizeWidth(value: Double): Self = this.set("resizeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeWidth: Self = this.set("resizeWidth", js.undefined)
    
    @scala.inline
    def setRetryChunks(value: Boolean): Self = this.set("retryChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryChunks: Self = this.set("retryChunks", js.undefined)
    
    @scala.inline
    def setRetryChunksLimit(value: Double): Self = this.set("retryChunksLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryChunksLimit: Self = this.set("retryChunksLimit", js.undefined)
    
    @scala.inline
    def setSending(value: (/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData) => Unit): Self = this.set("sending", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSending: Self = this.set("sending", js.undefined)
    
    @scala.inline
    def setSendingmultiple(
      value: (/* files */ js.Array[DropzoneFile], /* xhr */ XMLHttpRequest, /* formData */ FormData) => Unit
    ): Self = this.set("sendingmultiple", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSendingmultiple: Self = this.set("sendingmultiple", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* file */ DropzoneFile => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setSuccessmultiple(value: (/* files */ js.Array[DropzoneFile], /* responseText */ String) => Unit): Self = this.set("successmultiple", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSuccessmultiple: Self = this.set("successmultiple", js.undefined)
    
    @scala.inline
    def setThumbnail(value: (/* file */ DropzoneFile, /* dataUrl */ String) => Unit): Self = this.set("thumbnail", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    
    @scala.inline
    def setThumbnailHeight(value: Double): Self = this.set("thumbnailHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailHeight: Self = this.set("thumbnailHeight", js.undefined)
    
    @scala.inline
    def setThumbnailMethod(value: contain | crop): Self = this.set("thumbnailMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailMethod: Self = this.set("thumbnailMethod", js.undefined)
    
    @scala.inline
    def setThumbnailWidth(value: Double): Self = this.set("thumbnailWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailWidth: Self = this.set("thumbnailWidth", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTotaluploadprogress(value: (/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double) => Unit): Self = this.set("totaluploadprogress", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTotaluploadprogress: Self = this.set("totaluploadprogress", js.undefined)
    
    @scala.inline
    def setTransformFile(value: (/* file */ DropzoneFile, /* done */ js.Function1[/* file */ String | Blob, Unit]) => Unit): Self = this.set("transformFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTransformFile: Self = this.set("transformFile", js.undefined)
    
    @scala.inline
    def setUploadMultiple(value: Boolean): Self = this.set("uploadMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadMultiple: Self = this.set("uploadMultiple", js.undefined)
    
    @scala.inline
    def setUploadprogress(value: (/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double) => Unit): Self = this.set("uploadprogress", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUploadprogress: Self = this.set("uploadprogress", js.undefined)
    
    @scala.inline
    def setUrlFunction1(value: /* files */ js.Array[DropzoneFile] => String): Self = this.set("url", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrl(value: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
