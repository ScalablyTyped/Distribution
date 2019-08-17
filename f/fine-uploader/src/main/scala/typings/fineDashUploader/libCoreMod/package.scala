package typings.fineDashUploader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreMod {
  import typings.std.Blob
  import typings.std.HTMLElement
  import typings.std.XMLHttpRequest

  type CustomResizerCallBack = js.Function1[/* resizeInfo */ ResizeInfo, PromiseOptions]
  type FormatFileNameFuncton = js.Function1[/* fileOrBlobName */ String, String]
  type OnAllComplete = js.Function2[/* succeeded */ js.Array[Double], /* failed */ js.Array[Double], Unit]
  type OnAutoRetry = js.Function3[/* id */ Double, /* name */ String, /* attemptNumber */ Double, Unit]
  type OnCancel = js.Function2[/* id */ Double, /* name */ String, Boolean | PromiseOptions | Unit]
  type OnComplete = js.Function4[
    /* id */ Double, 
    /* name */ String, 
    /* responseJSON */ js.Any, 
    /* xhr */ XMLHttpRequest, 
    Unit
  ]
  type OnDelete = js.Function1[/* id */ Double, Unit]
  type OnDeleteComplete = js.Function3[/* id */ Double, /* xhr */ XMLHttpRequest, /* isError */ Boolean, Unit]
  type OnError = js.Function4[
    /* id */ Double, 
    /* name */ String, 
    /* errorReason */ String, 
    /* xhr */ XMLHttpRequest, 
    Unit
  ]
  type OnManualRetry = js.Function2[/* id */ Double, /* name */ String, Boolean | Unit]
  type OnPasteReceived = js.Function1[/* blob */ Blob, PromiseOptions | Unit]
  type OnProgress = js.Function4[
    /* id */ Double, 
    /* name */ String, 
    /* uploadedBytes */ Double, 
    /* totalBytes */ Double, 
    Unit
  ]
  type OnResume = js.Function4[
    /* id */ Double, 
    /* name */ String, 
    /* chunkData */ js.Any, 
    /* customResumeData */ js.Any, 
    Unit | js.Promise[js.Any]
  ]
  type OnSessionRequestComplete = js.Function3[
    /* response */ js.Array[js.Any], 
    /* success */ Boolean, 
    /* xhrOrXdr */ XMLHttpRequest, 
    Unit
  ]
  type OnStatusChange = js.Function3[/* id */ Double, /* oldStatus */ String, /* newStatus */ String, Unit]
  type OnSubmit = js.Function2[/* id */ Double, /* name */ String, Boolean | PromiseOptions | Unit]
  type OnSubmitDelete = js.Function1[/* id */ Double, PromiseOptions | Unit]
  type OnSubmitted = js.Function2[/* id */ Double, /* name */ String, Unit]
  type OnTotalProgress = js.Function2[/* totalUploadedBytes */ Double, /* totalBytes */ Double, Unit]
  type OnUpload = js.Function2[/* id */ Double, /* name */ String, Unit]
  type OnUploadChunk = js.Function3[
    /* id */ Double, 
    /* name */ String, 
    /* chunkData */ ChunkData, 
    Unit | js.Promise[js.Any]
  ]
  type OnUploadChunkSuccess = js.Function4[
    /* id */ Double, 
    /* chunkData */ ChunkData, 
    /* responseJSON */ js.Any, 
    /* xhr */ XMLHttpRequest, 
    Unit
  ]
  type OnValidate = js.Function2[
    /* data */ BlobDataObject, 
    /* buttonContainer */ js.UndefOr[HTMLElement], 
    PromiseOptions | Unit
  ]
  type OnValidateBatch = js.Function2[
    /* fileOrBlobDataArray */ js.Array[BlobDataObject], 
    /* buttonContainer */ HTMLElement, 
    PromiseOptions | Unit
  ]
}
