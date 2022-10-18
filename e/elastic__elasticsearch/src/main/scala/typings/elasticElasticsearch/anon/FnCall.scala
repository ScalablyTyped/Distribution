package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.BulkRequest
import typings.elasticElasticsearch.libApiTypesMod.BulkResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[TDocument, TPartialDocument](params: BulkRequest[TDocument, TPartialDocument]): js.Promise[BulkResponse] = js.native
  def apply[TDocument, TPartialDocument](params: BulkRequest[TDocument, TPartialDocument], options: TransportRequestOptions): js.Promise[BulkResponse] = js.native
  def apply[TDocument, TPartialDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.BulkRequest[TDocument, TPartialDocument]
  ): js.Promise[BulkResponse] = js.native
  def apply[TDocument, TPartialDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.BulkRequest[TDocument, TPartialDocument],
    options: TransportRequestOptions
  ): js.Promise[BulkResponse] = js.native
}
