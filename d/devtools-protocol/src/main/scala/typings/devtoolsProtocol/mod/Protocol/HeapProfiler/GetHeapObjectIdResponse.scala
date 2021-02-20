package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHeapObjectIdResponse extends StObject {
  
  /**
    * Id of the heap snapshot object corresponding to the passed remote object id.
    */
  var heapSnapshotObjectId: HeapSnapshotObjectId = js.native
}
object GetHeapObjectIdResponse {
  
  @scala.inline
  def apply(heapSnapshotObjectId: HeapSnapshotObjectId): GetHeapObjectIdResponse = {
    val __obj = js.Dynamic.literal(heapSnapshotObjectId = heapSnapshotObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapObjectIdResponse]
  }
  
  @scala.inline
  implicit class GetHeapObjectIdResponseMutableBuilder[Self <: GetHeapObjectIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeapSnapshotObjectId(value: HeapSnapshotObjectId): Self = StObject.set(x, "heapSnapshotObjectId", value.asInstanceOf[js.Any])
  }
}
