package typings.firebaseStorageCompat

import typings.firebaseStorageCompat.distSrcReferenceMod.ReferenceCompat
import typings.firebaseStorageCompat.distSrcTaskMod.UploadTaskCompat
import typings.firebaseStorageTypes.mod.FullMetadata
import typings.firebaseStorageTypes.mod.Reference
import typings.firebaseStorageTypes.mod.TaskState
import typings.firebaseStorageTypes.mod.UploadTask
import typings.firebaseStorageTypes.mod.UploadTaskSnapshot
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTasksnapshotMod {
  
  @JSImport("@firebase/storage-compat/dist/src/tasksnapshot", "UploadTaskSnapshotCompat")
  @js.native
  open class UploadTaskSnapshotCompat protected ()
    extends StObject
       with UploadTaskSnapshot
       with Compat[typings.firebaseStorage.mod.UploadTaskSnapshot] {
    def this(
      _delegate: typings.firebaseStorage.mod.UploadTaskSnapshot,
      task: UploadTaskCompat,
      ref: ReferenceCompat
    ) = this()
    
    /* CompleteClass */
    var _delegate: typings.firebaseStorage.mod.UploadTaskSnapshot = js.native
    
    /* CompleteClass */
    var bytesTransferred: Double = js.native
    @JSName("bytesTransferred")
    def bytesTransferred_MUploadTaskSnapshotCompat: Double = js.native
    
    /* CompleteClass */
    var metadata: FullMetadata = js.native
    @JSName("metadata")
    def metadata_MUploadTaskSnapshotCompat: FullMetadata = js.native
    
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
