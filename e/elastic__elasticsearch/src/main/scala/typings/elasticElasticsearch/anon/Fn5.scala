package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.DeleteByQueryRethrottleRequest
import typings.elasticElasticsearch.libApiTypesMod.DeleteByQueryRethrottleResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn5 extends StObject {
  
  def apply(params: DeleteByQueryRethrottleRequest): js.Promise[DeleteByQueryRethrottleResponse] = js.native
  def apply(params: DeleteByQueryRethrottleRequest, options: TransportRequestOptions): js.Promise[DeleteByQueryRethrottleResponse] = js.native
  def apply(params: DeleteByQueryRethrottleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[DeleteByQueryRethrottleResponse, Any]] = js.native
  def apply(params: DeleteByQueryRethrottleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[DeleteByQueryRethrottleResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRethrottleRequest): js.Promise[DeleteByQueryRethrottleResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRethrottleRequest,
    options: TransportRequestOptions
  ): js.Promise[DeleteByQueryRethrottleResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRethrottleRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[DeleteByQueryRethrottleResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRethrottleRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[DeleteByQueryRethrottleResponse] = js.native
}
