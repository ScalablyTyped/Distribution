package typings.firebaseStorage

import typings.firebaseStorage.referenceMod.ReferenceCompat
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.taskMod.UploadTaskCompat
import typings.firebaseStorageTypes.mod.FullMetadata
import typings.firebaseStorageTypes.mod.Reference
import typings.firebaseStorageTypes.mod.TaskState
import typings.firebaseStorageTypes.mod.UploadTask
import typings.firebaseStorageTypes.mod.UploadTaskSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasksnapshotMod {
  
  @JSImport("@firebase/storage/dist/compat/tasksnapshot", "UploadTaskSnapshotCompat")
  @js.native
  class UploadTaskSnapshotCompat protected ()
    extends StObject
       with UploadTaskSnapshot {
    def this(
      _delegate: typings.firebaseStorage.srcTasksnapshotMod.UploadTaskSnapshot,
      task: UploadTaskCompat,
      ref: ReferenceCompat
    ) = this()
    
    val _delegate: typings.firebaseStorage.srcTasksnapshotMod.UploadTaskSnapshot = js.native
    
    /* CompleteClass */
    var bytesTransferred: Double = js.native
    @JSName("bytesTransferred")
    def bytesTransferred_MUploadTaskSnapshotCompat: Double = js.native
    
    /* CompleteClass */
    var metadata: FullMetadata = js.native
    @JSName("metadata")
    def metadata_MUploadTaskSnapshotCompat: Metadata = js.native
    
    /* CompleteClass */
    var ref: Reference = js.native
    @JSName("ref")
    val ref_UploadTaskSnapshotCompat: ReferenceCompat = js.native
    
    /* CompleteClass */
    var state: TaskState = js.native
    @JSName("state")
    def state_MUploadTaskSnapshotCompat: String = js.native
    
    /* CompleteClass */
    var task: UploadTask = js.native
    @JSName("task")
    val task_UploadTaskSnapshotCompat: UploadTaskCompat = js.native
    
    /* CompleteClass */
    var totalBytes: Double = js.native
    @JSName("totalBytes")
    def totalBytes_MUploadTaskSnapshotCompat: Double = js.native
  }
}
