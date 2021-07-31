package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddInspectedHeapObjectRequest extends StObject {
  
  /**
    * Heap snapshot object id to be accessible by means of $x command line API.
    */
  var heapObjectId: HeapSnapshotObjectId
}
object AddInspectedHeapObjectRequest {
  
  @scala.inline
  def apply(heapObjectId: HeapSnapshotObjectId): AddInspectedHeapObjectRequest = {
    val __obj = js.Dynamic.literal(heapObjectId = heapObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInspectedHeapObjectRequest]
  }
  
  @scala.inline
  implicit class AddInspectedHeapObjectRequestMutableBuilder[Self <: AddInspectedHeapObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeapObjectId(value: HeapSnapshotObjectId): Self = StObject.set(x, "heapObjectId", value.asInstanceOf[js.Any])
  }
}
