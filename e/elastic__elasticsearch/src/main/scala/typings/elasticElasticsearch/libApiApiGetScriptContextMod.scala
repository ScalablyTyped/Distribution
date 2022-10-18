package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.GetScriptContextRequest
import typings.elasticElasticsearch.libApiTypesMod.GetScriptContextResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiGetScriptContextMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/get_script_context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[GetScriptContextResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[GetScriptContextResponse]]
  inline def default(params: Unit, options: TransportRequestOptions): js.Promise[GetScriptContextResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptContextResponse]]
  inline def default(params: GetScriptContextRequest): js.Promise[GetScriptContextResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetScriptContextResponse]]
  inline def default(params: GetScriptContextRequest, options: TransportRequestOptions): js.Promise[GetScriptContextResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptContextResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptContextRequest): js.Promise[GetScriptContextResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetScriptContextResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptContextRequest,
    options: TransportRequestOptions
  ): js.Promise[GetScriptContextResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptContextResponse]]
  
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
