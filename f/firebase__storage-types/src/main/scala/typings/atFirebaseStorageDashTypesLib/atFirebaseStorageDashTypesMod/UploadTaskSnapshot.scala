package typings
package atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadTaskSnapshot extends js.Object {
  var bytesTransferred: scala.Double
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
    totalBytes: scala.Double
  ): UploadTaskSnapshot = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred, metadata = metadata, ref = ref, state = state, task = task, totalBytes = totalBytes)
  
    __obj.asInstanceOf[UploadTaskSnapshot]
  }
}

