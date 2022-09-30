package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofgoogleLongrunning extends StObject {
  
  /** Namespace api. */
  val api: TypeofapiHttpRule
  
  /** Namespace longrunning. */
  val longrunning: Typeoflongrunning
  
  /** Namespace protobuf. */
  val protobuf: TypeofprotobufDuration
  
  /** Namespace rpc. */
  val rpc: TypeofrpcStatus
}
object TypeofgoogleLongrunning {
  
  inline def apply(
    api: TypeofapiHttpRule,
    longrunning: Typeoflongrunning,
    protobuf: TypeofprotobufDuration,
    rpc: TypeofrpcStatus
  ): TypeofgoogleLongrunning = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], longrunning = longrunning.asInstanceOf[js.Any], protobuf = protobuf.asInstanceOf[js.Any], rpc = rpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofgoogleLongrunning]
  }
  
  extension [Self <: TypeofgoogleLongrunning](x: Self) {
    
    inline def setApi(value: TypeofapiHttpRule): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setLongrunning(value: Typeoflongrunning): Self = StObject.set(x, "longrunning", value.asInstanceOf[js.Any])
    
    inline def setProtobuf(value: TypeofprotobufDuration): Self = StObject.set(x, "protobuf", value.asInstanceOf[js.Any])
    
    inline def setRpc(value: TypeofrpcStatus): Self = StObject.set(x, "rpc", value.asInstanceOf[js.Any])
  }
}
