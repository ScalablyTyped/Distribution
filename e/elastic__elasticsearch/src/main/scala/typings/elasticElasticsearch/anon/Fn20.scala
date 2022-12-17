package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.MsearchRequest
import typings.elasticElasticsearch.libApiTypesMod.MsearchResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn20 extends StObject {
  
  def apply[TDocument, TAggregations](params: MsearchRequest): js.Promise[MsearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: MsearchRequest, options: TransportRequestOptions): js.Promise[MsearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: MsearchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MsearchResponse[TDocument, TAggregations], Any]] = js.native
  def apply[TDocument, TAggregations](params: MsearchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MsearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest): js.Promise[MsearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest,
    options: TransportRequestOptions
  ): js.Promise[MsearchResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[MsearchResponse[TDocument, TAggregations], Any]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[MsearchResponse[TDocument, TAggregations]] = js.native
}
