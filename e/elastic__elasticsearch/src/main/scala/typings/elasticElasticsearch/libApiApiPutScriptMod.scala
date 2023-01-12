package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.PutScriptRequest
import typings.elasticElasticsearch.libApiTypesMod.PutScriptResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiPutScriptMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/put_script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: PutScriptRequest): js.Promise[PutScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PutScriptResponse]]
  inline def default(params: PutScriptRequest, options: TransportRequestOptions): js.Promise[PutScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutScriptResponse]]
  inline def default(params: PutScriptRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[PutScriptResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[PutScriptResponse, Any]]]
  inline def default(params: PutScriptRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[PutScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutScriptResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PutScriptRequest): js.Promise[PutScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PutScriptResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PutScriptRequest,
    options: TransportRequestOptions
  ): js.Promise[PutScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutScriptResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PutScriptRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[PutScriptResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[PutScriptResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PutScriptRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[PutScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutScriptResponse]]
  
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
