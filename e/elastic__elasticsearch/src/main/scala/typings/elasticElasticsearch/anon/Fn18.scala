package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.KnnSearchRequest
import typings.elasticElasticsearch.libApiTypesMod.KnnSearchResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn18 extends StObject {
  
  def apply[TDocument](params: KnnSearchRequest): js.Promise[KnnSearchResponse[TDocument]] = js.native
  def apply[TDocument](params: KnnSearchRequest, options: TransportRequestOptions): js.Promise[KnnSearchResponse[TDocument]] = js.native
  def apply[TDocument](params: KnnSearchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[KnnSearchResponse[TDocument], Any]] = js.native
  def apply[TDocument](params: KnnSearchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[KnnSearchResponse[TDocument]] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.KnnSearchRequest): js.Promise[KnnSearchResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.KnnSearchRequest,
    options: TransportRequestOptions
  ): js.Promise[KnnSearchResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.KnnSearchRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[KnnSearchResponse[TDocument], Any]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.KnnSearchRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[KnnSearchResponse[TDocument]] = js.native
}
