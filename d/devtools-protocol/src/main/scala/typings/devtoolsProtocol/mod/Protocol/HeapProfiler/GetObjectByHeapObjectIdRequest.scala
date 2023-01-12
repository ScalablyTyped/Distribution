package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectByHeapObjectIdRequest extends StObject {
  
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[String] = js.undefined
  
  var objectId: HeapSnapshotObjectId
}
object GetObjectByHeapObjectIdRequest {
  
  inline def apply(objectId: HeapSnapshotObjectId): GetObjectByHeapObjectIdRequest = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectByHeapObjectIdRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetObjectByHeapObjectIdRequest] (val x: Self) extends AnyVal {
    
    inline def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
    
    inline def setObjectGroupUndefined: Self = StObject.set(x, "objectGroup", js.undefined)
    
    inline def setObjectId(value: HeapSnapshotObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
