package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ExplainRequest
import typings.elasticElasticsearch.libApiTypesMod.ExplainResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn9 extends StObject {
  
  def apply[TDocument](params: ExplainRequest): js.Promise[ExplainResponse[TDocument]] = js.native
  def apply[TDocument](params: ExplainRequest, options: TransportRequestOptions): js.Promise[ExplainResponse[TDocument]] = js.native
  def apply[TDocument](params: ExplainRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ExplainResponse[TDocument], Any]] = js.native
  def apply[TDocument](params: ExplainRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ExplainResponse[TDocument]] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExplainRequest): js.Promise[ExplainResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExplainRequest,
    options: TransportRequestOptions
  ): js.Promise[ExplainResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExplainRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ExplainResponse[TDocument], Any]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExplainRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ExplainResponse[TDocument]] = js.native
}
