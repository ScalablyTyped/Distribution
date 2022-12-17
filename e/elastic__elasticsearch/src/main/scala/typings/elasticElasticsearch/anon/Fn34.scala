package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.SearchShardsRequest
import typings.elasticElasticsearch.libApiTypesMod.SearchShardsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn34 extends StObject {
  
  def apply(): js.Promise[SearchShardsResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptions): js.Promise[SearchShardsResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchShardsResponse, Any]] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchShardsResponse] = js.native
  def apply(params: SearchShardsRequest): js.Promise[SearchShardsResponse] = js.native
  def apply(params: SearchShardsRequest, options: TransportRequestOptions): js.Promise[SearchShardsResponse] = js.native
  def apply(params: SearchShardsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchShardsResponse, Any]] = js.native
  def apply(params: SearchShardsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchShardsResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchShardsRequest): js.Promise[SearchShardsResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchShardsRequest,
    options: TransportRequestOptions
  ): js.Promise[SearchShardsResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchShardsRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[SearchShardsResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchShardsRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[SearchShardsResponse] = js.native
}
