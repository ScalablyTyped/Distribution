package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.GetScriptLanguagesRequest
import typings.elasticElasticsearch.libApiTypesMod.GetScriptLanguagesResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiGetScriptLanguagesMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/get_script_languages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[GetScriptLanguagesResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[GetScriptLanguagesResponse]]
  inline def default(params: Unit, options: TransportRequestOptions): js.Promise[GetScriptLanguagesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptLanguagesResponse]]
  inline def default(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[GetScriptLanguagesResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[GetScriptLanguagesResponse, Any]]]
  inline def default(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[GetScriptLanguagesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptLanguagesResponse]]
  inline def default(params: GetScriptLanguagesRequest): js.Promise[GetScriptLanguagesResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetScriptLanguagesResponse]]
  inline def default(params: GetScriptLanguagesRequest, options: TransportRequestOptions): js.Promise[GetScriptLanguagesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptLanguagesResponse]]
  inline def default(params: GetScriptLanguagesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[GetScriptLanguagesResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[GetScriptLanguagesResponse, Any]]]
  inline def default(params: GetScriptLanguagesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[GetScriptLanguagesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptLanguagesResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptLanguagesRequest): js.Promise[GetScriptLanguagesResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetScriptLanguagesResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptLanguagesRequest,
    options: TransportRequestOptions
  ): js.Promise[GetScriptLanguagesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptLanguagesResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptLanguagesRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[GetScriptLanguagesResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[GetScriptLanguagesResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptLanguagesRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[GetScriptLanguagesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetScriptLanguagesResponse]]
  
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
