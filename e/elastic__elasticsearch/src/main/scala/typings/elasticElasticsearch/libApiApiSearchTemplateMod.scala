package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.SearchTemplateRequest
import typings.elasticElasticsearch.libApiTypesMod.SearchTemplateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiSearchTemplateMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/search_template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument](): js.Promise[SearchTemplateResponse[TDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[SearchTemplateResponse[TDocument]]]
  inline def default[TDocument](params: Unit, options: TransportRequestOptions): js.Promise[SearchTemplateResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchTemplateResponse[TDocument]]]
  inline def default[TDocument](params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchTemplateResponse[TDocument], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[SearchTemplateResponse[TDocument], Any]]]
  inline def default[TDocument](params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchTemplateResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchTemplateResponse[TDocument]]]
  inline def default[TDocument](params: SearchTemplateRequest): js.Promise[SearchTemplateResponse[TDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchTemplateResponse[TDocument]]]
  inline def default[TDocument](params: SearchTemplateRequest, options: TransportRequestOptions): js.Promise[SearchTemplateResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchTemplateResponse[TDocument]]]
  inline def default[TDocument](params: SearchTemplateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchTemplateResponse[TDocument], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[SearchTemplateResponse[TDocument], Any]]]
  inline def default[TDocument](params: SearchTemplateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchTemplateResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchTemplateResponse[TDocument]]]
  inline def default[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTemplateRequest): js.Promise[SearchTemplateResponse[TDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchTemplateResponse[TDocument]]]
  inline def default[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTemplateRequest,
    options: TransportRequestOptions
  ): js.Promise[SearchTemplateResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchTemplateResponse[TDocument]]]
  inline def default[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTemplateRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[SearchTemplateResponse[TDocument], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[SearchTemplateResponse[TDocument], Any]]]
  inline def default[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTemplateRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[SearchTemplateResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchTemplateResponse[TDocument]]]
  
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
