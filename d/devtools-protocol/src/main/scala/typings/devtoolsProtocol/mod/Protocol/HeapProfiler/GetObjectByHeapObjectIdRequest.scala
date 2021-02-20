package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectByHeapObjectIdRequest extends StObject {
  
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[String] = js.native
  
  var objectId: HeapSnapshotObjectId = js.native
}
object GetObjectByHeapObjectIdRequest {
  
  @scala.inline
  def apply(objectId: HeapSnapshotObjectId): GetObjectByHeapObjectIdRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectByHeapObjectIdRequest]
  }
  
  @scala.inline
  implicit class GetObjectByHeapObjectIdRequestMutableBuilder[Self <: GetObjectByHeapObjectIdRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectGroupUndefined: Self = StObject.set(x, "objectGroup", js.undefined)
    
    @scala.inline
    def setObjectId(value: HeapSnapshotObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
