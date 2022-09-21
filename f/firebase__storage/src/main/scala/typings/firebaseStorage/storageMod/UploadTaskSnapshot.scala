package typings.firebaseStorage.storageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadTaskSnapshot extends StObject {
  
  /**
    * The number of bytes that have been successfully uploaded so far.
    */
  var bytesTransferred: Double
  
  /**
    * Before the upload completes, contains the metadata sent to the server.
    * After the upload completes, contains the metadata sent back from the server.
    */
  var metadata: FullMetadata
  
  /**
    * The reference that spawned this snapshot's upload task.
    */
  var ref: StorageReference
  
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
  
  inline def apply(
    bytesTransferred: Double,
    metadata: FullMetadata,
    ref: StorageReference,
    state: TaskState,
    task: UploadTask,
    totalBytes: Double
  ): UploadTaskSnapshot = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTaskSnapshot]
  }
  
  extension [Self <: UploadTaskSnapshot](x: Self) {
    
    inline def setBytesTransferred(value: Double): Self = StObject.set(x, "bytesTransferred", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: FullMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setRef(value: StorageReference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTask(value: UploadTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
  }
}
