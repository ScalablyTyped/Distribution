package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.DeleteByQueryRequest
import typings.elasticElasticsearch.libApiTypesMod.DeleteByQueryResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn4 extends StObject {
  
  def apply(params: DeleteByQueryRequest): js.Promise[DeleteByQueryResponse] = js.native
  def apply(params: DeleteByQueryRequest, options: TransportRequestOptions): js.Promise[DeleteByQueryResponse] = js.native
  def apply(params: DeleteByQueryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[DeleteByQueryResponse, Any]] = js.native
  def apply(params: DeleteByQueryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[DeleteByQueryResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRequest): js.Promise[DeleteByQueryResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRequest,
    options: TransportRequestOptions
  ): js.Promise[DeleteByQueryResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[DeleteByQueryResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[DeleteByQueryResponse] = js.native
}
