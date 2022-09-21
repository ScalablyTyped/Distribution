package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBundleTaskProgress extends StObject {
  
  var bytesLoaded: Double
  
  var documentsLoaded: Double
  
  var taskState: TaskState
  
  var totalBytes: Double
  
  var totalDocuments: Double
}
object LoadBundleTaskProgress {
  
  inline def apply(
    bytesLoaded: Double,
    documentsLoaded: Double,
    taskState: TaskState,
    totalBytes: Double,
    totalDocuments: Double
  ): LoadBundleTaskProgress = {
    val __obj = js.Dynamic.literal(bytesLoaded = bytesLoaded.asInstanceOf[js.Any], documentsLoaded = documentsLoaded.asInstanceOf[js.Any], taskState = taskState.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], totalDocuments = totalDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBundleTaskProgress]
  }
  
  extension [Self <: LoadBundleTaskProgress](x: Self) {
    
    inline def setBytesLoaded(value: Double): Self = StObject.set(x, "bytesLoaded", value.asInstanceOf[js.Any])
    
    inline def setDocumentsLoaded(value: Double): Self = StObject.set(x, "documentsLoaded", value.asInstanceOf[js.Any])
    
    inline def setTaskState(value: TaskState): Self = StObject.set(x, "taskState", value.asInstanceOf[js.Any])
    
    inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalDocuments(value: Double): Self = StObject.set(x, "totalDocuments", value.asInstanceOf[js.Any])
  }
}
