package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ScrollRequest
import typings.elasticElasticsearch.libApiTypesMod.ScrollResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn9 extends StObject {
  
  def apply[TDocument, TAggregations](params: ScrollRequest): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: ScrollRequest, options: TransportRequestOptions): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScrollRequest): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
  def apply[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScrollRequest,
    options: TransportRequestOptions
  ): js.Promise[ScrollResponse[TDocument, TAggregations]] = js.native
}
