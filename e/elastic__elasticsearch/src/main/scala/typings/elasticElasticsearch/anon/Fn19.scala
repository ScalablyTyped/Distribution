package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.MgetRequest
import typings.elasticElasticsearch.libApiTypesMod.MgetResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn19 extends StObject {
  
  def apply[TDocument](): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: Unit, options: TransportRequestOptions): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MgetResponse[TDocument], Any]] = js.native
  def apply[TDocument](params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: MgetRequest): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: MgetRequest, options: TransportRequestOptions): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: MgetRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MgetResponse[TDocument], Any]] = js.native
  def apply[TDocument](params: MgetRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetRequest): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetRequest,
    options: TransportRequestOptions
  ): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[MgetResponse[TDocument], Any]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[MgetResponse[TDocument]] = js.native
}
