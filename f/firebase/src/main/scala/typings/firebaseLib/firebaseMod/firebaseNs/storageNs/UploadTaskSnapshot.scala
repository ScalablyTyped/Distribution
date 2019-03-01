package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadTaskSnapshot extends js.Object {
  var bytesTransferred: scala.Double
  /**
    * @deprecated
    * Use Reference.getDownloadURL instead. This property will be removed in a
    * future release.
    */
  var downloadURL: java.lang.String | scala.Null
  var metadata: FullMetadata
  var ref: Reference
  var state: TaskState
  var task: UploadTask
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytesTransferred")(bytesTransferred)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("ref")(ref)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("task")(task)
    __obj.updateDynamic("totalBytes")(totalBytes)
    if (downloadURL != null) __obj.updateDynamic("downloadURL")(downloadURL)
    __obj.asInstanceOf[UploadTaskSnapshot]
  }
}

