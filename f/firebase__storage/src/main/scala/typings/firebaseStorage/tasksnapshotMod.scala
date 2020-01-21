package typings.firebaseStorage

import typings.firebaseStorage.referenceMod.Reference
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.taskMod.UploadTask
import typings.firebaseStorage.taskenumsMod.TaskState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/tasksnapshot", JSImport.Namespace)
@js.native
object tasksnapshotMod extends js.Object {
  @js.native
  class UploadTaskSnapshot protected () extends js.Object {
    def this(
      bytesTransferred: Double,
      totalBytes: Double,
      state: TaskState,
      metadata: Null,
      task: UploadTask,
      ref: Reference
    ) = this()
    def this(
      bytesTransferred: Double,
      totalBytes: Double,
      state: TaskState,
      metadata: Metadata,
      task: UploadTask,
      ref: Reference
    ) = this()
    val bytesTransferred: Double = js.native
    val metadata: Metadata | Null = js.native
    val ref: Reference = js.native
    val state: TaskState = js.native
    val task: UploadTask = js.native
    val totalBytes: Double = js.native
  }
  
}

