package typings.fineDashUploader.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreEvents extends js.Object {
  /**
    * Called when all submitted items have reached a point of termination.
    *
    * A file has reached a point of termination if it has been cancelled, rejected, or uploaded (failed or successful).
    *
    * For example, if a file in the group is paused, and all other files in the group have uploaded successfully the allComplete event will not be invoked for the group until that paused file is either continued and completes the uploading process, or canceled.
    *
    * This event will not be called if all files in the group have been cancelled or rejected (i.e. if none of the files have reached a status of `qq.status.UPLOAD_SUCCESSFUL` or `qq.status.UPLOAD_FAILED`)
    */
  var onAllComplete: js.UndefOr[OnAllComplete] = js.undefined
  /**
    * Called before each automatic retry attempt for a failed item
    */
  var onAutoRetry: js.UndefOr[OnAutoRetry] = js.undefined
  /**
    * Called when the item has been canceled. Return `false` to prevent the upload from being canceled.
    *
    * Also can return a promise if non-blocking work is required here. Calling `failure()` on the promise is equivalent to returning `false`.
    *
    * If using a Promise, then processing of the cancel request will be deferred until the promise is fullfilled.
    *
    * Since there is no way to 'pause' the upload in progress while waiting for the promise to be fullfilled the upload may actually complete until the promise has actually be fullfilled
    */
  var onCancel: js.UndefOr[OnCancel] = js.undefined
  /**
    * Called when the item has finished uploading.
    *
    * The `responseJSON` will contain the raw response from the server including the 'success' property which indicates whether the upload succeeded.
    */
  var onComplete: js.UndefOr[OnComplete] = js.undefined
  /**
    * Called just before a delete request is sent for the associated item.
    *
    * ###Note:
    * This is not the correct callback to influence the delete request.
    * To do that, use the `onSubmitDelete` callback instead
    */
  var onDelete: js.UndefOr[OnDelete] = js.undefined
  /**
    * Called just after receiving a response from the server for a delete file request
    */
  var onDeleteComplete: js.UndefOr[OnDeleteComplete] = js.undefined
  /**
    * Called whenever an exceptional condition occurs
    */
  var onError: js.UndefOr[OnError] = js.undefined
  /**
    * Called before each manual retry attempt.
    *
    * Return `false` to prevent this and all future retry attempts on the associated item
    */
  var onManualRetry: js.UndefOr[OnManualRetry] = js.undefined
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
  var onPasteReceived: js.UndefOr[OnPasteReceived] = js.undefined
  /**
    * Called during the upload, as it progresses, but only for the AJAX uploader.
    *
    * For chunked uploads, this will be called for each chunk.
    * Useful for implementing a progress bar
    */
  var onProgress: js.UndefOr[OnProgress] = js.undefined
  /**
    * Called just before an upload is resumed.
    *
    * See the `uploadChunk` event for more info on the `chunkData` object
    */
  var onResume: js.UndefOr[OnResume] = js.undefined
  /**
    * Invoked when a session request has completed.
    *
    * The `response` will be either an `Array` containing the response data or `null` if the response did not contain valid `JSON`.
    *
    * The `success` parameter will be `false` if ANY of the file items represented in the response could not be parsed (due to bad syntax, missing name/UUID property, etc)
    */
  var onSessionRequestComplete: js.UndefOr[OnSessionRequestComplete] = js.undefined
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
  var onStatusChange: js.UndefOr[OnStatusChange] = js.undefined
  /**
    * Called when the item has been selected and is a candidate for uploading
    *
    * This does not mean the item is going to be uploaded. Return `false` to prevent submission to the uploader.
    *
    * A promise can be used if non-blocking work is required. Processing of this item is deferred until the promise is fullfilled.
    *
    * If a promise is returned, a call to failure is the same as returning `false`
    */
  var onSubmit: js.UndefOr[OnSubmit] = js.undefined
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
  var onSubmitDelete: js.UndefOr[OnSubmitDelete] = js.undefined
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
  var onSubmitted: js.UndefOr[OnSubmitted] = js.undefined
  /**
    * Called during a batch of uploads, as they progress, but only for the AJAX uploader.
    *
    * This represents the total progress of all files in the batch. Useful for implementing an aggregate progress bar.
    */
  var onTotalProgress: js.UndefOr[OnTotalProgress] = js.undefined
  /**
    * Called just before an item begins uploading to the server.
    */
  var onUpload: js.UndefOr[OnUpload] = js.undefined
  /**
    * Called just before a chunk request is sent.
    */
  var onUploadChunk: js.UndefOr[OnUploadChunk] = js.undefined
  /**
    * This is similar to the `complete` event, except it is invoked after each chunk has been successfully uploaded.
    *
    * See the `uploadChunk` event for more information on the `chunkData` object
    */
  var onUploadChunkSuccess: js.UndefOr[OnUploadChunkSuccess] = js.undefined
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
  var onValidate: js.UndefOr[OnValidate] = js.undefined
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
  var onValidateBatch: js.UndefOr[OnValidateBatch] = js.undefined
}

object CoreEvents {
  @scala.inline
  def apply(
    onAllComplete: OnAllComplete = null,
    onAutoRetry: OnAutoRetry = null,
    onCancel: OnCancel = null,
    onComplete: OnComplete = null,
    onDelete: OnDelete = null,
    onDeleteComplete: OnDeleteComplete = null,
    onError: OnError = null,
    onManualRetry: OnManualRetry = null,
    onPasteReceived: OnPasteReceived = null,
    onProgress: OnProgress = null,
    onResume: OnResume = null,
    onSessionRequestComplete: OnSessionRequestComplete = null,
    onStatusChange: OnStatusChange = null,
    onSubmit: OnSubmit = null,
    onSubmitDelete: OnSubmitDelete = null,
    onSubmitted: OnSubmitted = null,
    onTotalProgress: OnTotalProgress = null,
    onUpload: OnUpload = null,
    onUploadChunk: OnUploadChunk = null,
    onUploadChunkSuccess: OnUploadChunkSuccess = null,
    onValidate: OnValidate = null,
    onValidateBatch: OnValidateBatch = null
  ): CoreEvents = {
    val __obj = js.Dynamic.literal()
    if (onAllComplete != null) __obj.updateDynamic("onAllComplete")(onAllComplete)
    if (onAutoRetry != null) __obj.updateDynamic("onAutoRetry")(onAutoRetry)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (onDeleteComplete != null) __obj.updateDynamic("onDeleteComplete")(onDeleteComplete)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onManualRetry != null) __obj.updateDynamic("onManualRetry")(onManualRetry)
    if (onPasteReceived != null) __obj.updateDynamic("onPasteReceived")(onPasteReceived)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (onResume != null) __obj.updateDynamic("onResume")(onResume)
    if (onSessionRequestComplete != null) __obj.updateDynamic("onSessionRequestComplete")(onSessionRequestComplete)
    if (onStatusChange != null) __obj.updateDynamic("onStatusChange")(onStatusChange)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (onSubmitDelete != null) __obj.updateDynamic("onSubmitDelete")(onSubmitDelete)
    if (onSubmitted != null) __obj.updateDynamic("onSubmitted")(onSubmitted)
    if (onTotalProgress != null) __obj.updateDynamic("onTotalProgress")(onTotalProgress)
    if (onUpload != null) __obj.updateDynamic("onUpload")(onUpload)
    if (onUploadChunk != null) __obj.updateDynamic("onUploadChunk")(onUploadChunk)
    if (onUploadChunkSuccess != null) __obj.updateDynamic("onUploadChunkSuccess")(onUploadChunkSuccess)
    if (onValidate != null) __obj.updateDynamic("onValidate")(onValidate)
    if (onValidateBatch != null) __obj.updateDynamic("onValidateBatch")(onValidateBatch)
    __obj.asInstanceOf[CoreEvents]
  }
}

