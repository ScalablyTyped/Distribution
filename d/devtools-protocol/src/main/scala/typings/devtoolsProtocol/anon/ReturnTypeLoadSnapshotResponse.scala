package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.LoadSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.LoadSnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeLoadSnapshotResponse extends StObject {
  
  var paramsType: js.Array[LoadSnapshotRequest]
  
  var returnType: LoadSnapshotResponse
}
object ReturnTypeLoadSnapshotResponse {
  
  inline def apply(paramsType: js.Array[LoadSnapshotRequest], returnType: LoadSnapshotResponse): ReturnTypeLoadSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeLoadSnapshotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeLoadSnapshotResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[LoadSnapshotRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: LoadSnapshotRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: LoadSnapshotResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
