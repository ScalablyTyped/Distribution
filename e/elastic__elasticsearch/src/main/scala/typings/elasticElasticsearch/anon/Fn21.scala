package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.MsearchTemplateRequest
import typings.elasticElasticsearch.libApiTypesMod.MsearchTemplateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn21 extends StObject {
  
  def apply[TDocument, TAggregations](params: MsearchTemplateRequest): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: MsearchTemplateRequest, options: TransportRequestOptions): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: MsearchTemplateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MsearchTemplateResponse[TDocument, TAggregations], Any]] = js.native
  def apply[TDocument, TAggregations](params: MsearchTemplateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchTemplateRequest): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchTemplateRequest,
    options: TransportRequestOptions
  ): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchTemplateRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[MsearchTemplateResponse[TDocument, TAggregations], Any]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchTemplateRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
}
