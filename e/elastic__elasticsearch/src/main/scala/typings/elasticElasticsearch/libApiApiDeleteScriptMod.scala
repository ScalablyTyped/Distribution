package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.DeleteScriptRequest
import typings.elasticElasticsearch.libApiTypesMod.DeleteScriptResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiDeleteScriptMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/delete_script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: DeleteScriptRequest): js.Promise[DeleteScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteScriptResponse]]
  inline def default(params: DeleteScriptRequest, options: TransportRequestOptions): js.Promise[DeleteScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteScriptResponse]]
  inline def default(params: DeleteScriptRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[DeleteScriptResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[DeleteScriptResponse, Any]]]
  inline def default(params: DeleteScriptRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[DeleteScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteScriptResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteScriptRequest): js.Promise[DeleteScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteScriptResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteScriptRequest,
    options: TransportRequestOptions
  ): js.Promise[DeleteScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteScriptResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteScriptRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[DeleteScriptResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[DeleteScriptResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteScriptRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[DeleteScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteScriptResponse]]
  
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
