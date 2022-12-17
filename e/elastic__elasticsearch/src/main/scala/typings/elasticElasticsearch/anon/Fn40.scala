package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.UpdateByQueryRethrottleRequest
import typings.elasticElasticsearch.libApiTypesMod.UpdateByQueryRethrottleResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn40 extends StObject {
  
  def apply(params: UpdateByQueryRethrottleRequest): js.Promise[UpdateByQueryRethrottleResponse] = js.native
  def apply(params: UpdateByQueryRethrottleRequest, options: TransportRequestOptions): js.Promise[UpdateByQueryRethrottleResponse] = js.native
  def apply(params: UpdateByQueryRethrottleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[UpdateByQueryRethrottleResponse, Any]] = js.native
  def apply(params: UpdateByQueryRethrottleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[UpdateByQueryRethrottleResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRethrottleRequest): js.Promise[UpdateByQueryRethrottleResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRethrottleRequest,
    options: TransportRequestOptions
  ): js.Promise[UpdateByQueryRethrottleResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRethrottleRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[UpdateByQueryRethrottleResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRethrottleRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[UpdateByQueryRethrottleResponse] = js.native
}
