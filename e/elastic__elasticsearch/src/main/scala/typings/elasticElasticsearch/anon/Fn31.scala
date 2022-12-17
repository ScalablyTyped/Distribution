package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ScrollRequest
import typings.elasticElasticsearch.libApiTypesMod.ScrollResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn31 extends StObject {
  
  def apply[TDocument, TAggregations](params: ScrollRequest): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: ScrollRequest, options: TransportRequestOptions): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: ScrollRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ScrollResponse[TDocument, TAggregations], Any]] = js.native
  def apply[TDocument, TAggregations](params: ScrollRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScrollRequest): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScrollRequest,
    options: TransportRequestOptions
  ): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScrollRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ScrollResponse[TDocument, TAggregations], Any]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScrollRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
}
