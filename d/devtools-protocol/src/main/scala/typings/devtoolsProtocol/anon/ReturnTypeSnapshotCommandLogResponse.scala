package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.SnapshotCommandLogRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.SnapshotCommandLogResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSnapshotCommandLogResponse extends StObject {
  
  var paramsType: js.Array[SnapshotCommandLogRequest]
  
  var returnType: SnapshotCommandLogResponse
}
object ReturnTypeSnapshotCommandLogResponse {
  
  inline def apply(paramsType: js.Array[SnapshotCommandLogRequest], returnType: SnapshotCommandLogResponse): ReturnTypeSnapshotCommandLogResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSnapshotCommandLogResponse]
  }
  
  extension [Self <: ReturnTypeSnapshotCommandLogResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[SnapshotCommandLogRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SnapshotCommandLogRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: SnapshotCommandLogResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
