package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.DeleteRequest
import typings.elasticElasticsearch.libApiTypesMod.DeleteResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiDeleteMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/delete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: DeleteRequest): js.Promise[DeleteResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteResponse]]
  inline def default(params: DeleteRequest, options: TransportRequestOptions): js.Promise[DeleteResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteRequest): js.Promise[DeleteResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteRequest,
    options: TransportRequestOptions
  ): js.Promise[DeleteResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteResponse]]
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    extension [Self <: That](x: Self) {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
