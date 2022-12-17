package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.UpdateRequest
import typings.elasticElasticsearch.libApiTypesMod.UpdateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn38 extends StObject {
  
  def apply[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument]): js.Promise[UpdateResponse[TDocumentR]] = js.native
  def apply[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument], options: TransportRequestOptions): js.Promise[UpdateResponse[TDocumentR]] = js.native
  def apply[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument], options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[UpdateResponse[TDocumentR], Any]] = js.native
  def apply[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument], options: TransportRequestOptionsWithOutMeta): js.Promise[UpdateResponse[TDocumentR]] = js.native
  def apply[TDocument, TPartialDocument, TDocumentR](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument]
  ): js.Promise[UpdateResponse[TDocumentR]] = js.native
  def apply[TDocument, TPartialDocument, TDocumentR](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument],
    options: TransportRequestOptions
  ): js.Promise[UpdateResponse[TDocumentR]] = js.native
  def apply[TDocument, TPartialDocument, TDocumentR](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument],
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[UpdateResponse[TDocumentR], Any]] = js.native
  def apply[TDocument, TPartialDocument, TDocumentR](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument],
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[UpdateResponse[TDocumentR]] = js.native
}
