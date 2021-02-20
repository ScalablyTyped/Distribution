package typings.fineUploader.coreMod

import typings.std.Blob
import typings.std.HTMLElement
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreEvents extends StObject {
  
  /**
    * Called when all submitted items have reached a point of termination.
    *
    * A file has reached a point of termination if it has been cancelled, rejected, or uploaded (failed or successful).
    *
    * For example, if a file in the group is paused, and all other files in the group have uploaded successfully the allComplete event will not be invoked for the group until that paused file is either continued and completes the uploading process, or canceled.
    *
    * This event will not be called if all files in the group have been cancelled or rejected (i.e. if none of the files have reached a status of `qq.status.UPLOAD_SUCCESSFUL` or `qq.status.UPLOAD_FAILED`)
    */
  var onAllComplete: js.UndefOr[OnAllComplete] = js.native
  
  /**
    * Called before each automatic retry attempt for a failed item
    */
  var onAutoRetry: js.UndefOr[OnAutoRetry] = js.native
  
  /**
    * Called when the item has been canceled. Return `false` to prevent the upload from being canceled.
    *
    * Also can return a promise if non-blocking work is required here. Calling `failure()` on the promise is equivalent to returning `false`.
    *
    * If using a Promise, then processing of the cancel request will be deferred until the promise is fullfilled.
    *
    * Since there is no way to 'pause' the upload in progress while waiting for the promise to be fullfilled the upload may actually complete until the promise has actually be fullfilled
    */
  var onCancel: js.UndefOr[OnCancel] = js.native
  
  /**
    * Called when the item has finished uploading.
    *
    * The `responseJSON` will contain the raw response from the server including the 'success' property which indicates whether the upload succeeded.
    */
  var onComplete: js.UndefOr[OnComplete] = js.native
  
  /**
    * Called just before a delete request is sent for the associated item.
    *
    * ###Note:
    * This is not the correct callback to influence the delete request.
    * To do that, use the `onSubmitDelete` callback instead
    */
  var onDelete: js.UndefOr[OnDelete] = js.native
  
  /**
    * Called just after receiving a response from the server for a delete file request
    */
  var onDeleteComplete: js.UndefOr[OnDeleteComplete] = js.native
  
  /**
    * Called whenever an exceptional condition occurs
    */
  var onError: js.UndefOr[OnError] = js.native
  
  /**
    * Called before each manual retry attempt.
    *
    * Return `false` to prevent this and all future retry attempts on the associated item
    */
  var onManualRetry: js.UndefOr[OnManualRetry] = js.native
  
  /**
    * Called when a pasted image has been received (before upload).
    *
    * The pasted image is represented as a `Blob`. Also can return a `Promise` if non-blocking work is required here.
    *
    * If using a `Promise` the value of the success parameter must be the name to associate with the pasted image.
    *
    * If the associated attempt is marked a failure then you should include a string explaining the reason in your failure callback for the `Promise`
    *
    * ###NOTE:
    * The `promptForName` option, if `true`, will effectively wipe away any custom implementation of this callback.
    *
    * The two are not meant to be used together. This callback is meant to provide an alternative means to provide a name for a pasted image.
    *
    * If you are using Fine Uploader Core mode then you can display your own prompt for the name by overriding the default implementation of this callback
    */
  var onPasteReceived: js.UndefOr[OnPasteReceived] = js.native
  
  /**
    * Called during the upload, as it progresses, but only for the AJAX uploader.
    *
    * For chunked uploads, this will be called for each chunk.
    * Useful for implementing a progress bar
    */
  var onProgress: js.UndefOr[OnProgress] = js.native
  
  /**
    * Called just before an upload is resumed.
    *
    * See the `uploadChunk` event for more info on the `chunkData` object
    */
  var onResume: js.UndefOr[OnResume] = js.native
  
  /**
    * Invoked when a session request has completed.
    *
    * The `response` will be either an `Array` containing the response data or `null` if the response did not contain valid `JSON`.
    *
    * The `success` parameter will be `false` if ANY of the file items represented in the response could not be parsed (due to bad syntax, missing name/UUID property, etc)
    */
  var onSessionRequestComplete: js.UndefOr[OnSessionRequestComplete] = js.native
  
  /**
    * Invoked whenever the status changes for any item submitted by the uploader.
    *
    * The status values correspond to those found in the `qq.status` object.
    *
    * For reference:
    * * `SUBMITTED`
    * * `QUEUED`
    * * `UPLOADING`
    * * `UPLOAD_RETRYING`
    * * `UPLOAD_FAILED`
    * * `UPLOAD_SUCCESSFUL`
    * * `CANCELED`
    * * `REJECTED`
    * * `DELETED`
    * * `DELETING`
    * * `DELETE_FAILED`
    * * `PAUSED`
    */
  var onStatusChange: js.UndefOr[OnStatusChange] = js.native
  
  /**
    * Called when the item has been selected and is a candidate for uploading
    *
    * This does not mean the item is going to be uploaded. Return `false` to prevent submission to the uploader.
    *
    * A promise can be used if non-blocking work is required. Processing of this item is deferred until the promise is fullfilled.
    *
    * If a promise is returned, a call to failure is the same as returning `false`
    */
  var onSubmit: js.UndefOr[OnSubmit] = js.native
  
  /**
    * Called before an item has been marked for deletion has been submitted to the uploader
    *
    * A promise can be used if non-blocking work is required.
    * Processing of this item is deferred until the promise is fullfilled.
    * If a promise is returned, a call to failure is the same as returning `false`.
    *
    * Use this callback to influence the delete request.
    * For example, you can change the custom parameters sent with the underlying delete request using the `setDeleteParams` API method
    */
  var onSubmitDelete: js.UndefOr[OnSubmitDelete] = js.native
  
  /**
    * Called when the item has been successfully submitted to the uploader.
    *
    * The file will upload immediately if there is:
    * * a) at least one free connection (see: maxConnections option) and
    * * b) autoUpload is set to true (see autoUpload option)
    *
    * The callback is invoked after the 'submit' event is handled without returning a false value.
    *
    * In Fine Uploader Core mode it is usually safe to assume that the associated elements in the UI representing the associated file have already been added to the DOM immediately before this callback is invoked
    */
  var onSubmitted: js.UndefOr[OnSubmitted] = js.native
  
  /**
    * Called during a batch of uploads, as they progress, but only for the AJAX uploader.
    *
    * This represents the total progress of all files in the batch. Useful for implementing an aggregate progress bar.
    */
  var onTotalProgress: js.UndefOr[OnTotalProgress] = js.native
  
  /**
    * Called just before an item begins uploading to the server.
    */
  var onUpload: js.UndefOr[OnUpload] = js.native
  
  /**
    * Called just before a chunk request is sent.
    */
  var onUploadChunk: js.UndefOr[OnUploadChunk] = js.native
  
  /**
    * This is similar to the `complete` event, except it is invoked after each chunk has been successfully uploaded.
    *
    * See the `uploadChunk` event for more information on the `chunkData` object
    */
  var onUploadChunkSuccess: js.UndefOr[OnUploadChunkSuccess] = js.native
  
  /**
    * Called once for each selected, dropped, or `addFiles` submitted file.
    *
    * This callback is always invoked before the default Fine Uploader validators execute.
    *
    * This event will not be called if you return `false` in your `validateBatch` event handler, or if the `stopOnFirstInvalidFile` validation option is `true` and the `validate` event handler has returned `false` for an item.
    *
    * A promise can be used if non-blocking work is required. Processing of this item is deferred until the promise is fullfilled.
    * If a promise is returned, a call to `failure` is the same as returning `false`.
    *
    * A buttonContainer element will be passed as the last argument, provided the file was submitted using a Fine Uploader tracked button.
    *
    * The `blobData` object has two properties: `name` and `size`. The `size` property will be undefined for browsers without File API support.
    */
  var onValidate: js.UndefOr[OnValidate] = js.native
  
  /**
    * This callback is always invoked before the default Fine Uploader validators execute.
    *
    * This event will not be called if you return `false` in your `validateBatch` event handler, or if the `stopOnFirstInvalidFile` validation option is `true` and the `validate` event handler has returned `false` for an item.
    *
    * A promise can be used if non-blocking work is required. Processing of this item is deferred until the promise is fullfilled. If a promise is returned, a call to `failure` is the same as returning `false`.
    *
    * A buttonContainer element will be passed as the last argument, provided the file was submitted using a Fine Uploader tracked button.
    *
    * The `fileOrBlobDataArray` object has two properties: `name` and `size`. The `size` property will be undefined for browsers without File API support.
    */
  var onValidateBatch: js.UndefOr[OnValidateBatch] = js.native
}
object CoreEvents {
  
  @scala.inline
  def apply(): CoreEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreEvents]
  }
  
  @scala.inline
  implicit class CoreEventsMutableBuilder[Self <: CoreEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnAllComplete(value: (/* succeeded */ js.Array[Double], /* failed */ js.Array[Double]) => Unit): Self = StObject.set(x, "onAllComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnAllCompleteUndefined: Self = StObject.set(x, "onAllComplete", js.undefined)
    
    @scala.inline
    def setOnAutoRetry(value: (/* id */ Double, /* name */ String, /* attemptNumber */ Double) => Unit): Self = StObject.set(x, "onAutoRetry", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnAutoRetryUndefined: Self = StObject.set(x, "onAutoRetry", js.undefined)
    
    @scala.inline
    def setOnCancel(value: (/* id */ Double, /* name */ String) => Boolean | PromiseOptions | Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    @scala.inline
    def setOnComplete(
      value: (/* id */ Double, /* name */ String, /* responseJSON */ js.Any, /* xhr */ XMLHttpRequest) => Unit
    ): Self = StObject.set(x, "onComplete", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    @scala.inline
    def setOnDelete(value: /* id */ Double => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDeleteComplete(value: (/* id */ Double, /* xhr */ XMLHttpRequest, /* isError */ Boolean) => Unit): Self = StObject.set(x, "onDeleteComplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnDeleteCompleteUndefined: Self = StObject.set(x, "onDeleteComplete", js.undefined)
    
    @scala.inline
    def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    @scala.inline
    def setOnError(
      value: (/* id */ Double, /* name */ String, /* errorReason */ String, /* xhr */ XMLHttpRequest) => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnManualRetry(value: (/* id */ Double, /* name */ String) => Boolean | Unit): Self = StObject.set(x, "onManualRetry", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnManualRetryUndefined: Self = StObject.set(x, "onManualRetry", js.undefined)
    
    @scala.inline
    def setOnPasteReceived(value: /* blob */ Blob => PromiseOptions | Unit): Self = StObject.set(x, "onPasteReceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPasteReceivedUndefined: Self = StObject.set(x, "onPasteReceived", js.undefined)
    
    @scala.inline
    def setOnProgress(
      value: (/* id */ Double, /* name */ String, /* uploadedBytes */ Double, /* totalBytes */ Double) => Unit
    ): Self = StObject.set(x, "onProgress", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnResume(
      value: (/* id */ Double, /* name */ String, /* chunkData */ js.Any, /* customResumeData */ js.Any) => Unit | js.Promise[js.Any]
    ): Self = StObject.set(x, "onResume", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
    
    @scala.inline
    def setOnSessionRequestComplete(
      value: (/* response */ js.Array[js.Any], /* success */ Boolean, /* xhrOrXdr */ XMLHttpRequest) => Unit
    ): Self = StObject.set(x, "onSessionRequestComplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSessionRequestCompleteUndefined: Self = StObject.set(x, "onSessionRequestComplete", js.undefined)
    
    @scala.inline
    def setOnStatusChange(value: (/* id */ Double, /* oldStatus */ String, /* newStatus */ String) => Unit): Self = StObject.set(x, "onStatusChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnStatusChangeUndefined: Self = StObject.set(x, "onStatusChange", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: (/* id */ Double, /* name */ String) => Boolean | PromiseOptions | Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSubmitDelete(value: /* id */ Double => PromiseOptions | Unit): Self = StObject.set(x, "onSubmitDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSubmitDeleteUndefined: Self = StObject.set(x, "onSubmitDelete", js.undefined)
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setOnSubmitted(value: (/* id */ Double, /* name */ String) => Unit): Self = StObject.set(x, "onSubmitted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSubmittedUndefined: Self = StObject.set(x, "onSubmitted", js.undefined)
    
    @scala.inline
    def setOnTotalProgress(value: (/* totalUploadedBytes */ Double, /* totalBytes */ Double) => Unit): Self = StObject.set(x, "onTotalProgress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnTotalProgressUndefined: Self = StObject.set(x, "onTotalProgress", js.undefined)
    
    @scala.inline
    def setOnUpload(value: (/* id */ Double, /* name */ String) => Unit): Self = StObject.set(x, "onUpload", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUploadChunk(
      value: (/* id */ Double, /* name */ String, /* chunkData */ ChunkData) => Unit | js.Promise[js.Any]
    ): Self = StObject.set(x, "onUploadChunk", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnUploadChunkSuccess(
      value: (/* id */ Double, /* chunkData */ ChunkData, /* responseJSON */ js.Any, /* xhr */ XMLHttpRequest) => Unit
    ): Self = StObject.set(x, "onUploadChunkSuccess", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnUploadChunkSuccessUndefined: Self = StObject.set(x, "onUploadChunkSuccess", js.undefined)
    
    @scala.inline
    def setOnUploadChunkUndefined: Self = StObject.set(x, "onUploadChunk", js.undefined)
    
    @scala.inline
    def setOnUploadUndefined: Self = StObject.set(x, "onUpload", js.undefined)
    
    @scala.inline
    def setOnValidate(
      value: (/* data */ BlobDataObject, /* buttonContainer */ js.UndefOr[HTMLElement]) => PromiseOptions | Unit
    ): Self = StObject.set(x, "onValidate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValidateBatch(
      value: (/* fileOrBlobDataArray */ js.Array[BlobDataObject], /* buttonContainer */ HTMLElement) => PromiseOptions | Unit
    ): Self = StObject.set(x, "onValidateBatch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnValidateBatchUndefined: Self = StObject.set(x, "onValidateBatch", js.undefined)
    
    @scala.inline
    def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
  }
}
