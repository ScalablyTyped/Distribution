package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.MsearchTemplateRequest
import typings.elasticElasticsearch.libApiTypesMod.MsearchTemplateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn7 extends StObject {
  
  def apply[TDocument, TAggregations](params: MsearchTemplateRequest): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: MsearchTemplateRequest, options: TransportRequestOptions): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchTemplateRequest): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchTemplateRequest,
    options: TransportRequestOptions
  ): js.Promise[MsearchTemplateResponse[TDocument, TAggregations]] = js.native
}
