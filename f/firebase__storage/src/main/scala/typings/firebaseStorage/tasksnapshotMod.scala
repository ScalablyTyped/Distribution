package typings.firebaseStorage

import typings.firebaseStorage.referenceMod.ReferenceCompat
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.taskMod.UploadTaskCompat
import typings.firebaseStorageTypes.mod.UploadTaskSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasksnapshotMod {
  
  @JSImport("@firebase/storage/dist/compat/tasksnapshot", "UploadTaskSnapshotCompat")
  @js.native
  class UploadTaskSnapshotCompat protected () extends UploadTaskSnapshot {
    def this(
      _delegate: typings.firebaseStorage.srcTasksnapshotMod.UploadTaskSnapshot,
      task: UploadTaskCompat,
      ref: ReferenceCompat
    ) = this()
    
    val _delegate: typings.firebaseStorage.srcTasksnapshotMod.UploadTaskSnapshot = js.native
    
    @JSName("bytesTransferred")
    def bytesTransferred_MUploadTaskSnapshotCompat: Double = js.native
    
    @JSName("metadata")
    def metadata_MUploadTaskSnapshotCompat: Metadata = js.native
    
    @JSName("ref")
    val ref_UploadTaskSnapshotCompat: ReferenceCompat = js.native
    
    @JSName("state")
    def state_MUploadTaskSnapshotCompat: String = js.native
    
    @JSName("task")
    val task_UploadTaskSnapshotCompat: UploadTaskCompat = js.native
    
    @JSName("totalBytes")
    def totalBytes_MUploadTaskSnapshotCompat: Double = js.native
  }
}
