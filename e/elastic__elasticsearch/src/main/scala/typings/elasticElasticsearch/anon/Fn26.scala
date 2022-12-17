package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.RankEvalRequest
import typings.elasticElasticsearch.libApiTypesMod.RankEvalResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn26 extends StObject {
  
  def apply(params: RankEvalRequest): js.Promise[RankEvalResponse] = js.native
  def apply(params: RankEvalRequest, options: TransportRequestOptions): js.Promise[RankEvalResponse] = js.native
  def apply(params: RankEvalRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RankEvalResponse, Any]] = js.native
  def apply(params: RankEvalRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RankEvalResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RankEvalRequest): js.Promise[RankEvalResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RankEvalRequest,
    options: TransportRequestOptions
  ): js.Promise[RankEvalResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RankEvalRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[RankEvalResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RankEvalRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[RankEvalResponse] = js.native
}
