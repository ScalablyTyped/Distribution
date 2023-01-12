package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.GetScriptRequest
import typings.elasticElasticsearch.libApiTypesMod.GetScriptResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiGetScriptMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/get_script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: GetScriptRequest): js.Promise[GetScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetScriptResponse]]
  inline def default(params: GetScriptRequest, options: TransportRequestOptions): js.Promise[GetScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptResponse]]
  inline def default(params: GetScriptRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[GetScriptResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[GetScriptResponse, Any]]]
  inline def default(params: GetScriptRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[GetScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptRequest): js.Promise[GetScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetScriptResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptRequest,
    options: TransportRequestOptions
  ): js.Promise[GetScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[GetScriptResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[GetScriptResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[GetScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptResponse]]
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: That] (val x: Self) extends AnyVal {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
