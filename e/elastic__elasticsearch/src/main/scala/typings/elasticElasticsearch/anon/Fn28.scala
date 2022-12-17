package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ReindexRethrottleRequest
import typings.elasticElasticsearch.libApiTypesMod.ReindexRethrottleResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn28 extends StObject {
  
  def apply(params: ReindexRethrottleRequest): js.Promise[ReindexRethrottleResponse] = js.native
  def apply(params: ReindexRethrottleRequest, options: TransportRequestOptions): js.Promise[ReindexRethrottleResponse] = js.native
  def apply(params: ReindexRethrottleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ReindexRethrottleResponse, Any]] = js.native
  def apply(params: ReindexRethrottleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ReindexRethrottleResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRethrottleRequest): js.Promise[ReindexRethrottleResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRethrottleRequest,
    options: TransportRequestOptions
  ): js.Promise[ReindexRethrottleResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRethrottleRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ReindexRethrottleResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRethrottleRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ReindexRethrottleResponse] = js.native
}
