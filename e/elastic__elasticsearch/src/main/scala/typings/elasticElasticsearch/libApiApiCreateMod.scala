package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.CreateRequest
import typings.elasticElasticsearch.libApiTypesMod.CreateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiCreateMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument](params: CreateRequest[TDocument]): js.Promise[CreateResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CreateResponse]]
  inline def default[TDocument](params: CreateRequest[TDocument], options: TransportRequestOptions): js.Promise[CreateResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CreateResponse]]
  inline def default[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CreateRequest[TDocument]): js.Promise[CreateResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CreateResponse]]
  inline def default[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CreateRequest[TDocument],
    options: TransportRequestOptions
  ): js.Promise[CreateResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CreateResponse]]
  
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
