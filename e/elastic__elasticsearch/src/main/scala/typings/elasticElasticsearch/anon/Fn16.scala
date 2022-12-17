package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.IndexRequest
import typings.elasticElasticsearch.libApiTypesMod.IndexResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn16 extends StObject {
  
  def apply[TDocument](params: IndexRequest[TDocument]): js.Promise[IndexResponse] = js.native
  def apply[TDocument](params: IndexRequest[TDocument], options: TransportRequestOptions): js.Promise[IndexResponse] = js.native
  def apply[TDocument](params: IndexRequest[TDocument], options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IndexResponse, Any]] = js.native
  def apply[TDocument](params: IndexRequest[TDocument], options: TransportRequestOptionsWithOutMeta): js.Promise[IndexResponse] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexRequest[TDocument]): js.Promise[IndexResponse] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexRequest[TDocument],
    options: TransportRequestOptions
  ): js.Promise[IndexResponse] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexRequest[TDocument],
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[IndexResponse, Any]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexRequest[TDocument],
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[IndexResponse] = js.native
}
