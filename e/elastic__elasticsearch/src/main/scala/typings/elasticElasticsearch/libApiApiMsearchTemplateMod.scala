package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.MsearchTemplateRequest
import typings.elasticElasticsearch.libApiTypesMod.MsearchTemplateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiMsearchTemplateMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/msearch_template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument, TAggregations](params: MsearchTemplateRequest): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MsearchTemplateResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: MsearchTemplateRequest, options: TransportRequestOptions): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MsearchTemplateResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchTemplateRequest): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MsearchTemplateResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchTemplateRequest,
    options: TransportRequestOptions
  ): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MsearchTemplateResponse[TDocument, TAggregations]]]
  
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
