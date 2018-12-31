package typings
package dropzoneLib.dropzoneMod.DropzoneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneOptions extends js.Object {
  var accept: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[java.lang.String | stdLib.Error], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var acceptedFiles: js.UndefOr[java.lang.String] = js.undefined
  var addRemoveLinks: js.UndefOr[scala.Boolean] = js.undefined
  var addedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var addedfiles: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], scala.Unit]] = js.undefined
  var autoProcessQueue: js.UndefOr[scala.Boolean] = js.undefined
  var autoQueue: js.UndefOr[scala.Boolean] = js.undefined
  var canceled: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var canceledmultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], scala.Unit]] = js.undefined
  var capture: js.UndefOr[java.lang.String] = js.undefined
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var chunking: js.UndefOr[scala.Boolean] = js.undefined
  var chunksUploaded: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[java.lang.String | stdLib.Error], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var clickable: js.UndefOr[
    scala.Boolean | java.lang.String | dropzoneLib.dropzoneMod.Global.HTMLElement | (js.Array[java.lang.String | dropzoneLib.dropzoneMod.Global.HTMLElement])
  ] = js.undefined
  var complete: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var completemultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], scala.Unit]] = js.undefined
  var createImageThumbnails: js.UndefOr[scala.Boolean] = js.undefined
  var dictCancelUpload: js.UndefOr[java.lang.String] = js.undefined
  var dictCancelUploadConfirmation: js.UndefOr[java.lang.String] = js.undefined
  var dictDefaultMessage: js.UndefOr[java.lang.String] = js.undefined
  var dictFallbackMessage: js.UndefOr[java.lang.String] = js.undefined
  var dictFallbackText: js.UndefOr[java.lang.String] = js.undefined
  var dictFileSizeUnits: js.UndefOr[DropzoneDictFileSizeUnits] = js.undefined
  var dictFileTooBig: js.UndefOr[java.lang.String] = js.undefined
  var dictInvalidFileType: js.UndefOr[java.lang.String] = js.undefined
  var dictMaxFilesExceeded: js.UndefOr[java.lang.String] = js.undefined
  var dictRemoveFile: js.UndefOr[java.lang.String] = js.undefined
  var dictRemoveFileConfirmation: js.UndefOr[java.lang.String] = js.undefined
  var dictResponseError: js.UndefOr[java.lang.String] = js.undefined
  var dictUploadCanceled: js.UndefOr[java.lang.String] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragenter: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragleave: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragover: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* file */ DropzoneFile, 
      /* message */ java.lang.String | stdLib.Error, 
      /* xhr */ stdLib.XMLHttpRequest, 
      scala.Unit
    ]
  ] = js.undefined
  var errormultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* message */ java.lang.String | stdLib.Error, 
      /* xhr */ stdLib.XMLHttpRequest, 
      scala.Unit
    ]
  ] = js.undefined
  var fallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var filesizeBase: js.UndefOr[scala.Double] = js.undefined
  var forceChunking: js.UndefOr[scala.Boolean] = js.undefined
  var forceFallback: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var hiddenInputContainer: js.UndefOr[dropzoneLib.dropzoneMod.Global.HTMLElement] = js.undefined
  var ignoreHiddenFiles: js.UndefOr[scala.Boolean] = js.undefined
  var init: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var maxFiles: js.UndefOr[scala.Double] = js.undefined
  var maxFilesize: js.UndefOr[scala.Double] = js.undefined
  var maxThumbnailFilesize: js.UndefOr[scala.Double] = js.undefined
  var maxfilesexceeded: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var maxfilesreached: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], scala.Unit]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var parallelChunkUploads: js.UndefOr[scala.Boolean] = js.undefined
  var parallelUploads: js.UndefOr[scala.Double] = js.undefined
  var paramName: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var paste: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var previewTemplate: js.UndefOr[java.lang.String] = js.undefined
  var previewsContainer: js.UndefOr[scala.Boolean | java.lang.String | dropzoneLib.dropzoneMod.Global.HTMLElement] = js.undefined
  var processing: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var processingmultiple: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], scala.Unit]] = js.undefined
  var queuecomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var removedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var renameFilename: js.UndefOr[js.Function1[/* name */ java.lang.String, java.lang.String]] = js.undefined
  var reset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var resize: js.UndefOr[
    js.Function4[
      /* file */ DropzoneFile, 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      /* resizeMethod */ js.UndefOr[java.lang.String], 
      DropzoneResizeInfo
    ]
  ] = js.undefined
  var resizeHeight: js.UndefOr[scala.Double] = js.undefined
  var resizeMethod: js.UndefOr[java.lang.String] = js.undefined
  var resizeMimeType: js.UndefOr[java.lang.String] = js.undefined
  var resizeQuality: js.UndefOr[scala.Double] = js.undefined
  var resizeWidth: js.UndefOr[scala.Double] = js.undefined
  var retryChunks: js.UndefOr[scala.Boolean] = js.undefined
  var retryChunksLimit: js.UndefOr[scala.Double] = js.undefined
  var sending: js.UndefOr[
    js.Function3[
      /* file */ DropzoneFile, 
      /* xhr */ stdLib.XMLHttpRequest, 
      /* formData */ stdLib.FormData, 
      scala.Unit
    ]
  ] = js.undefined
  var sendingmultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* xhr */ stdLib.XMLHttpRequest, 
      /* formData */ stdLib.FormData, 
      scala.Unit
    ]
  ] = js.undefined
  var success: js.UndefOr[
    js.Function2[/* file */ DropzoneFile, /* response */ js.Object | java.lang.String, scala.Unit]
  ] = js.undefined
  var successmultiple: js.UndefOr[
    js.Function2[/* files */ js.Array[DropzoneFile], /* responseText */ java.lang.String, scala.Unit]
  ] = js.undefined
  var thumbnail: js.UndefOr[
    js.Function2[/* file */ DropzoneFile, /* dataUrl */ java.lang.String, scala.Unit]
  ] = js.undefined
  var thumbnailHeight: js.UndefOr[scala.Double] = js.undefined
  var thumbnailMethod: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailWidth: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var totaluploadprogress: js.UndefOr[
    js.Function3[
      /* totalProgress */ scala.Double, 
      /* totalBytes */ scala.Double, 
      /* totalBytesSent */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var uploadMultiple: js.UndefOr[scala.Boolean] = js.undefined
  var uploadprogress: js.UndefOr[
    js.Function3[
      /* file */ DropzoneFile, 
      /* progress */ scala.Double, 
      /* bytesSent */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

