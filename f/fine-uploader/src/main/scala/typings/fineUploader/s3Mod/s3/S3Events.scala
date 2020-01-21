package typings.fineUploader.s3Mod.s3

import typings.fineUploader.coreMod.BlobDataObject
import typings.fineUploader.coreMod.ChunkData
import typings.fineUploader.coreMod.CoreEvents
import typings.fineUploader.coreMod.PromiseOptions
import typings.std.Blob
import typings.std.HTMLElement
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Events extends CoreEvents {
  /**
    * Called before a request is sent to S3 if the temporary credentials have expired.
    *
    * You must return a promise. If your attempt to refresh the temporary credentials is successful, you must fulfill the promise via the success method, passing the new credentials object.
    * Otherwise, call failure with a descriptive reason.
    */
  var onCredentialsExpired: js.UndefOr[OnCredentialsExpired] = js.undefined
}

object S3Events {
  @scala.inline
  def apply(
    onAllComplete: (/* succeeded */ js.Array[Double], /* failed */ js.Array[Double]) => Unit = null,
    onAutoRetry: (/* id */ Double, /* name */ String, /* attemptNumber */ Double) => Unit = null,
    onCancel: (/* id */ Double, /* name */ String) => Boolean | PromiseOptions | Unit = null,
    onComplete: (/* id */ Double, /* name */ String, /* responseJSON */ js.Any, /* xhr */ XMLHttpRequest) => Unit = null,
    onCredentialsExpired: () => PromiseOptions = null,
    onDelete: /* id */ Double => Unit = null,
    onDeleteComplete: (/* id */ Double, /* xhr */ XMLHttpRequest, /* isError */ Boolean) => Unit = null,
    onError: (/* id */ Double, /* name */ String, /* errorReason */ String, /* xhr */ XMLHttpRequest) => Unit = null,
    onManualRetry: (/* id */ Double, /* name */ String) => Boolean | Unit = null,
    onPasteReceived: /* blob */ Blob => PromiseOptions | Unit = null,
    onProgress: (/* id */ Double, /* name */ String, /* uploadedBytes */ Double, /* totalBytes */ Double) => Unit = null,
    onResume: (/* id */ Double, /* name */ String, /* chunkData */ js.Any, /* customResumeData */ js.Any) => Unit | js.Promise[js.Any] = null,
    onSessionRequestComplete: (/* response */ js.Array[js.Any], /* success */ Boolean, /* xhrOrXdr */ XMLHttpRequest) => Unit = null,
    onStatusChange: (/* id */ Double, /* oldStatus */ String, /* newStatus */ String) => Unit = null,
    onSubmit: (/* id */ Double, /* name */ String) => Boolean | PromiseOptions | Unit = null,
    onSubmitDelete: /* id */ Double => PromiseOptions | Unit = null,
    onSubmitted: (/* id */ Double, /* name */ String) => Unit = null,
    onTotalProgress: (/* totalUploadedBytes */ Double, /* totalBytes */ Double) => Unit = null,
    onUpload: (/* id */ Double, /* name */ String) => Unit = null,
    onUploadChunk: (/* id */ Double, /* name */ String, /* chunkData */ ChunkData) => Unit | js.Promise[js.Any] = null,
    onUploadChunkSuccess: (/* id */ Double, /* chunkData */ ChunkData, /* responseJSON */ js.Any, /* xhr */ XMLHttpRequest) => Unit = null,
    onValidate: (/* data */ BlobDataObject, /* buttonContainer */ js.UndefOr[HTMLElement]) => PromiseOptions | Unit = null,
    onValidateBatch: (/* fileOrBlobDataArray */ js.Array[BlobDataObject], /* buttonContainer */ HTMLElement) => PromiseOptions | Unit = null
  ): S3Events = {
    val __obj = js.Dynamic.literal()
    if (onAllComplete != null) __obj.updateDynamic("onAllComplete")(js.Any.fromFunction2(onAllComplete))
    if (onAutoRetry != null) __obj.updateDynamic("onAutoRetry")(js.Any.fromFunction3(onAutoRetry))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2(onCancel))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction4(onComplete))
    if (onCredentialsExpired != null) __obj.updateDynamic("onCredentialsExpired")(js.Any.fromFunction0(onCredentialsExpired))
    if (onDelete != null) __obj.updateDynamic("onDelete")(js.Any.fromFunction1(onDelete))
    if (onDeleteComplete != null) __obj.updateDynamic("onDeleteComplete")(js.Any.fromFunction3(onDeleteComplete))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction4(onError))
    if (onManualRetry != null) __obj.updateDynamic("onManualRetry")(js.Any.fromFunction2(onManualRetry))
    if (onPasteReceived != null) __obj.updateDynamic("onPasteReceived")(js.Any.fromFunction1(onPasteReceived))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction4(onProgress))
    if (onResume != null) __obj.updateDynamic("onResume")(js.Any.fromFunction4(onResume))
    if (onSessionRequestComplete != null) __obj.updateDynamic("onSessionRequestComplete")(js.Any.fromFunction3(onSessionRequestComplete))
    if (onStatusChange != null) __obj.updateDynamic("onStatusChange")(js.Any.fromFunction3(onStatusChange))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction2(onSubmit))
    if (onSubmitDelete != null) __obj.updateDynamic("onSubmitDelete")(js.Any.fromFunction1(onSubmitDelete))
    if (onSubmitted != null) __obj.updateDynamic("onSubmitted")(js.Any.fromFunction2(onSubmitted))
    if (onTotalProgress != null) __obj.updateDynamic("onTotalProgress")(js.Any.fromFunction2(onTotalProgress))
    if (onUpload != null) __obj.updateDynamic("onUpload")(js.Any.fromFunction2(onUpload))
    if (onUploadChunk != null) __obj.updateDynamic("onUploadChunk")(js.Any.fromFunction3(onUploadChunk))
    if (onUploadChunkSuccess != null) __obj.updateDynamic("onUploadChunkSuccess")(js.Any.fromFunction4(onUploadChunkSuccess))
    if (onValidate != null) __obj.updateDynamic("onValidate")(js.Any.fromFunction2(onValidate))
    if (onValidateBatch != null) __obj.updateDynamic("onValidateBatch")(js.Any.fromFunction2(onValidateBatch))
    __obj.asInstanceOf[S3Events]
  }
}

