package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.RankEvalRequest
import typings.elasticElasticsearch.libApiTypesMod.RankEvalResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiRankEvalMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/rank_eval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: RankEvalRequest): js.Promise[RankEvalResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RankEvalResponse]]
  inline def default(params: RankEvalRequest, options: TransportRequestOptions): js.Promise[RankEvalResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RankEvalResponse]]
  inline def default(params: RankEvalRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RankEvalResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[RankEvalResponse, Any]]]
  inline def default(params: RankEvalRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RankEvalResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RankEvalResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RankEvalRequest): js.Promise[RankEvalResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RankEvalResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RankEvalRequest,
    options: TransportRequestOptions
  ): js.Promise[RankEvalResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RankEvalResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RankEvalRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[RankEvalResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[RankEvalResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RankEvalRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[RankEvalResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RankEvalResponse]]
  
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
