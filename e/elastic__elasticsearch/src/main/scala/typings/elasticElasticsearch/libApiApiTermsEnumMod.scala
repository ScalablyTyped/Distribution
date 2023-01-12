package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.TermsEnumRequest
import typings.elasticElasticsearch.libApiTypesMod.TermsEnumResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiTermsEnumMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/terms_enum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: TermsEnumRequest): js.Promise[TermsEnumResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TermsEnumResponse]]
  inline def default(params: TermsEnumRequest, options: TransportRequestOptions): js.Promise[TermsEnumResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TermsEnumResponse]]
  inline def default(params: TermsEnumRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TermsEnumResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[TermsEnumResponse, Any]]]
  inline def default(params: TermsEnumRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TermsEnumResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TermsEnumResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermsEnumRequest): js.Promise[TermsEnumResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TermsEnumResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermsEnumRequest,
    options: TransportRequestOptions
  ): js.Promise[TermsEnumResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TermsEnumResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermsEnumRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[TermsEnumResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[TermsEnumResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermsEnumRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[TermsEnumResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TermsEnumResponse]]
  
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
