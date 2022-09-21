package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesLoaded extends StObject {
  
  var bytesLoaded: Double
  
  var documentsLoaded: Double
  
  var taskState: String
  
  var totalBytes: Double
  
  var totalDocuments: Double
}
object BytesLoaded {
  
  inline def apply(
    bytesLoaded: Double,
    documentsLoaded: Double,
    taskState: String,
    totalBytes: Double,
    totalDocuments: Double
  ): BytesLoaded = {
    val __obj = js.Dynamic.literal(bytesLoaded = bytesLoaded.asInstanceOf[js.Any], documentsLoaded = documentsLoaded.asInstanceOf[js.Any], taskState = taskState.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], totalDocuments = totalDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesLoaded]
  }
  
  extension [Self <: BytesLoaded](x: Self) {
    
    inline def setBytesLoaded(value: Double): Self = StObject.set(x, "bytesLoaded", value.asInstanceOf[js.Any])
    
    inline def setDocumentsLoaded(value: Double): Self = StObject.set(x, "documentsLoaded", value.asInstanceOf[js.Any])
    
    inline def setTaskState(value: String): Self = StObject.set(x, "taskState", value.asInstanceOf[js.Any])
    
    inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalDocuments(value: Double): Self = StObject.set(x, "totalDocuments", value.asInstanceOf[js.Any])
  }
}
