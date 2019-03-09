package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds data about the current state of the upload task.
  */
trait UploadTaskSnapshot extends js.Object {
  /**
    * The number of bytes that have been successfully uploaded so far.
    */
  var bytesTransferred: scala.Double
  /**
    * @deprecated
    * Use Reference.getDownloadURL instead. This property will be removed in a
    * future release.
    */
  var downloadURL: java.lang.String | scala.Null
  /**
    * Before the upload completes, contains the metadata sent to the server.
    * After the upload completes, contains the metadata sent back from the server.
    */
  var metadata: FullMetadata
  /**
    * The reference that spawned this snapshot's upload task.
    */
  var ref: Reference
  /**
    * The current state of the task.
    */
  var state: TaskState
  /**
    * The task of which this is a snapshot.
    */
  var task: UploadTask
  /**
    * The total number of bytes to be uploaded.
    */
  var totalBytes: scala.Double
}

object UploadTaskSnapshot {
  @scala.inline
  def apply(
    bytesTransferred: scala.Double,
    metadata: FullMetadata,
    ref: Reference,
    state: TaskState,
    task: UploadTask,
    totalBytes: scala.Double,
    downloadURL: java.lang.String = null
  ): UploadTaskSnapshot = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred, metadata = metadata, ref = ref, state = state, task = task, totalBytes = totalBytes)
    if (downloadURL != null) __obj.updateDynamic("downloadURL")(downloadURL)
    __obj.asInstanceOf[UploadTaskSnapshot]
  }
}

