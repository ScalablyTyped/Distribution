package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result of a write to the local store. */
trait LocalWriteResult extends StObject {
  
  var batchId: BatchId
  
  var changes: DocumentMap
}
object LocalWriteResult {
  
  inline def apply(batchId: BatchId, changes: DocumentMap): LocalWriteResult = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalWriteResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalWriteResult] (val x: Self) extends AnyVal {
    
    inline def setBatchId(value: BatchId): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: DocumentMap): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
  }
}
