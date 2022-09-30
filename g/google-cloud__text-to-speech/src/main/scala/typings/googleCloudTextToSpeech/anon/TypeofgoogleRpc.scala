package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofgoogleRpc extends StObject {
  
  /** Namespace api. */
  val api: TypeofapiCustomHttpPatternHttp
  
  /** Namespace longrunning. */
  val longrunning: TypeoflongrunningCancelOperationRequest
  
  /** Namespace protobuf. */
  val protobuf: TypeofprotobufEmpty
  
  /** Namespace rpc. */
  val rpc: TypeofrpcStatusStatus
}
object TypeofgoogleRpc {
  
  inline def apply(
    api: TypeofapiCustomHttpPatternHttp,
    longrunning: TypeoflongrunningCancelOperationRequest,
    protobuf: TypeofprotobufEmpty,
    rpc: TypeofrpcStatusStatus
  ): TypeofgoogleRpc = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], longrunning = longrunning.asInstanceOf[js.Any], protobuf = protobuf.asInstanceOf[js.Any], rpc = rpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofgoogleRpc]
  }
  
  extension [Self <: TypeofgoogleRpc](x: Self) {
    
    inline def setApi(value: TypeofapiCustomHttpPatternHttp): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setLongrunning(value: TypeoflongrunningCancelOperationRequest): Self = StObject.set(x, "longrunning", value.asInstanceOf[js.Any])
    
    inline def setProtobuf(value: TypeofprotobufEmpty): Self = StObject.set(x, "protobuf", value.asInstanceOf[js.Any])
    
    inline def setRpc(value: TypeofrpcStatusStatus): Self = StObject.set(x, "rpc", value.asInstanceOf[js.Any])
  }
}
