package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.UpdateByQueryRequest
import typings.elasticElasticsearch.libApiTypesMod.UpdateByQueryResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn39 extends StObject {
  
  def apply(params: UpdateByQueryRequest): js.Promise[UpdateByQueryResponse] = js.native
  def apply(params: UpdateByQueryRequest, options: TransportRequestOptions): js.Promise[UpdateByQueryResponse] = js.native
  def apply(params: UpdateByQueryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[UpdateByQueryResponse, Any]] = js.native
  def apply(params: UpdateByQueryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[UpdateByQueryResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRequest): js.Promise[UpdateByQueryResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRequest,
    options: TransportRequestOptions
  ): js.Promise[UpdateByQueryResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[UpdateByQueryResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[UpdateByQueryResponse] = js.native
}
