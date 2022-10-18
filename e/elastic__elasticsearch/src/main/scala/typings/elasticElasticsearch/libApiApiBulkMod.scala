package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.BulkRequest
import typings.elasticElasticsearch.libApiTypesMod.BulkResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiBulkMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/bulk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument, TPartialDocument](params: BulkRequest[TDocument, TPartialDocument]): js.Promise[BulkResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BulkResponse]]
  inline def default[TDocument, TPartialDocument](params: BulkRequest[TDocument, TPartialDocument], options: TransportRequestOptions): js.Promise[BulkResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BulkResponse]]
  inline def default[TDocument, TPartialDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.BulkRequest[TDocument, TPartialDocument]
  ): js.Promise[BulkResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BulkResponse]]
  inline def default[TDocument, TPartialDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.BulkRequest[TDocument, TPartialDocument],
    options: TransportRequestOptions
  ): js.Promise[BulkResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BulkResponse]]
  
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
