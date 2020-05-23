package typings.firebase.mod.storage

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
  var bytesTransferred: Double
  /**
    * @deprecated
    * Use Reference.getDownloadURL instead. This property will be removed in a
    * future release.
    */
  var downloadURL: String | Null
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
  var totalBytes: Double
}

object UploadTaskSnapshot {
  @scala.inline
  def apply(
    bytesTransferred: Double,
    metadata: FullMetadata,
    ref: Reference,
    state: TaskState,
    task: UploadTask,
    totalBytes: Double,
    downloadURL: String = null
  ): UploadTaskSnapshot = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], downloadURL = downloadURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTaskSnapshot]
  }
}

