package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.UpdateRequest
import typings.elasticElasticsearch.libApiTypesMod.UpdateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiUpdateMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument]): js.Promise[UpdateResponse[TDocumentR]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpdateResponse[TDocumentR]]]
  inline def default[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument], options: TransportRequestOptions): js.Promise[UpdateResponse[TDocumentR]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResponse[TDocumentR]]]
  inline def default[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument], options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[UpdateResponse[TDocumentR], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[UpdateResponse[TDocumentR], Any]]]
  inline def default[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument], options: TransportRequestOptionsWithOutMeta): js.Promise[UpdateResponse[TDocumentR]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResponse[TDocumentR]]]
  inline def default[TDocument, TPartialDocument, TDocumentR](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument]
  ): js.Promise[UpdateResponse[TDocumentR]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpdateResponse[TDocumentR]]]
  inline def default[TDocument, TPartialDocument, TDocumentR](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument],
    options: TransportRequestOptions
  ): js.Promise[UpdateResponse[TDocumentR]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResponse[TDocumentR]]]
  inline def default[TDocument, TPartialDocument, TDocumentR](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument],
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[UpdateResponse[TDocumentR], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[UpdateResponse[TDocumentR], Any]]]
  inline def default[TDocument, TPartialDocument, TDocumentR](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument],
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[UpdateResponse[TDocumentR]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResponse[TDocumentR]]]
  
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
