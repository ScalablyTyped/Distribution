package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ExplainRequest
import typings.elasticElasticsearch.libApiTypesMod.ExplainResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn0 extends StObject {
  
  def apply[TDocument](params: ExplainRequest): js.Promise[ExplainResponse[TDocument]] = js.native
  def apply[TDocument](params: ExplainRequest, options: TransportRequestOptions): js.Promise[ExplainResponse[TDocument]] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExplainRequest): js.Promise[ExplainResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExplainRequest,
    options: TransportRequestOptions
  ): js.Promise[ExplainResponse[TDocument]] = js.native
}
