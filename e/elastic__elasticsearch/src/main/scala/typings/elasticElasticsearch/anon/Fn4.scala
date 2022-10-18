package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.KnnSearchRequest
import typings.elasticElasticsearch.libApiTypesMod.KnnSearchResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn4 extends StObject {
  
  def apply[TDocument](params: KnnSearchRequest): js.Promise[KnnSearchResponse[TDocument]] = js.native
  def apply[TDocument](params: KnnSearchRequest, options: TransportRequestOptions): js.Promise[KnnSearchResponse[TDocument]] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.KnnSearchRequest): js.Promise[KnnSearchResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.KnnSearchRequest,
    options: TransportRequestOptions
  ): js.Promise[KnnSearchResponse[TDocument]] = js.native
}
