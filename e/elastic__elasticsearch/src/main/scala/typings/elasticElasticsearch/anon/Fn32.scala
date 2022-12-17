package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.SearchRequest
import typings.elasticElasticsearch.libApiTypesMod.SearchResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn32 extends StObject {
  
  def apply[TDocument, TAggregations](): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: Unit, options: TransportRequestOptions): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchResponse[TDocument, TAggregations], Any]] = js.native
  def apply[TDocument, TAggregations](params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: SearchRequest): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: SearchRequest, options: TransportRequestOptions): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: SearchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchResponse[TDocument, TAggregations], Any]] = js.native
  def apply[TDocument, TAggregations](params: SearchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchRequest): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchRequest,
    options: TransportRequestOptions
  ): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[SearchResponse[TDocument, TAggregations], Any]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[SearchResponse[TDocument, TAggregations]] = js.native
}
