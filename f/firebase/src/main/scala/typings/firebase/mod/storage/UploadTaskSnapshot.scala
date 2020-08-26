package typings.firebase.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds data about the current state of the upload task.
  */
@js.native
trait UploadTaskSnapshot extends js.Object {
  /**
    * The number of bytes that have been successfully uploaded so far.
    */
  var bytesTransferred: Double = js.native
  /**
    * @deprecated
    * Use Reference.getDownloadURL instead. This property will be removed in a
    * future release.
    */
  var downloadURL: String | Null = js.native
  /**
    * Before the upload completes, contains the metadata sent to the server.
    * After the upload completes, contains the metadata sent back from the server.
    */
  var metadata: FullMetadata = js.native
  /**
    * The reference that spawned this snapshot's upload task.
    */
  var ref: Reference = js.native
  /**
    * The current state of the task.
    */
  var state: TaskState = js.native
  /**
    * The task of which this is a snapshot.
    */
  var task: UploadTask = js.native
  /**
    * The total number of bytes to be uploaded.
    */
  var totalBytes: Double = js.native
}

object UploadTaskSnapshot {
  @scala.inline
  def apply(
    bytesTransferred: Double,
    metadata: FullMetadata,
    ref: Reference,
    state: TaskState,
    task: UploadTask,
    totalBytes: Double
  ): UploadTaskSnapshot = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTaskSnapshot]
  }
  @scala.inline
  implicit class UploadTaskSnapshotOps[Self <: UploadTaskSnapshot] (val x: Self) extends AnyVal {
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
    def setBytesTransferred(value: Double): Self = this.set("bytesTransferred", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: FullMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: Reference): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: TaskState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTask(value: UploadTask): Self = this.set("task", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytes(value: Double): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadURL(value: String): Self = this.set("downloadURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadURLNull: Self = this.set("downloadURL", null)
  }
  
}

