package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.IndexRequest
import typings.elasticElasticsearch.libApiTypesMod.IndexResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn3 extends StObject {
  
  def apply[TDocument](params: IndexRequest[TDocument]): js.Promise[IndexResponse] = js.native
  def apply[TDocument](params: IndexRequest[TDocument], options: TransportRequestOptions): js.Promise[IndexResponse] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexRequest[TDocument]): js.Promise[IndexResponse] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexRequest[TDocument],
    options: TransportRequestOptions
  ): js.Promise[IndexResponse] = js.native
}
