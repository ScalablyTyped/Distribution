package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetSnapshotResponse extends StObject {
  
  var paramsType: js.Array[GetSnapshotRequest]
  
  var returnType: GetSnapshotResponse
}
object ReturnTypeGetSnapshotResponse {
  
  inline def apply(paramsType: js.Array[GetSnapshotRequest], returnType: GetSnapshotResponse): ReturnTypeGetSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSnapshotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetSnapshotResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetSnapshotRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetSnapshotRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetSnapshotResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
