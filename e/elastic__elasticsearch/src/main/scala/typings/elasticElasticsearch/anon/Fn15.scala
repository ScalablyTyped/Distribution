package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.GetSourceRequest
import typings.elasticElasticsearch.libApiTypesMod.GetSourceResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn15 extends StObject {
  
  def apply[TDocument](params: GetSourceRequest): js.Promise[GetSourceResponse[TDocument]] = js.native
  def apply[TDocument](params: GetSourceRequest, options: TransportRequestOptions): js.Promise[GetSourceResponse[TDocument]] = js.native
  def apply[TDocument](params: GetSourceRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[GetSourceResponse[TDocument], Any]] = js.native
  def apply[TDocument](params: GetSourceRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[GetSourceResponse[TDocument]] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetSourceRequest): js.Promise[GetSourceResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetSourceRequest,
    options: TransportRequestOptions
  ): js.Promise[GetSourceResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetSourceRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[GetSourceResponse[TDocument], Any]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetSourceRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[GetSourceResponse[TDocument]] = js.native
}
