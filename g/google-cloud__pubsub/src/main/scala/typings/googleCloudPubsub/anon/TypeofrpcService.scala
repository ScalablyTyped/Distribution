package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable1
import typings.googleGax.mod.fallback.protobufMinimal.rpc.Service
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofrpcService extends StObject {
  
  /** An RPC service as returned by {@link Service#create}. */
  var Service: Instantiable1[/* rpcImpl */ RPCImpl, typings.googleGax.mod.fallback.protobufMinimal.rpc.Service]
}
object TypeofrpcService {
  
  inline def apply(Service: Instantiable1[/* rpcImpl */ RPCImpl, Service]): TypeofrpcService = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofrpcService]
  }
  
  extension [Self <: TypeofrpcService](x: Self) {
    
    inline def setService(value: Instantiable1[/* rpcImpl */ RPCImpl, Service]): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
  }
}
