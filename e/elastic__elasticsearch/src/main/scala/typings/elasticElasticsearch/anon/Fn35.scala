package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.SearchTemplateRequest
import typings.elasticElasticsearch.libApiTypesMod.SearchTemplateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn35 extends StObject {
  
  def apply[TDocument](): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](params: Unit, options: TransportRequestOptions): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchTemplateResponse[TDocument], Any]] = js.native
  def apply[TDocument](params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](params: SearchTemplateRequest): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](params: SearchTemplateRequest, options: TransportRequestOptions): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](params: SearchTemplateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchTemplateResponse[TDocument], Any]] = js.native
  def apply[TDocument](params: SearchTemplateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTemplateRequest): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTemplateRequest,
    options: TransportRequestOptions
  ): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTemplateRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[SearchTemplateResponse[TDocument], Any]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTemplateRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[SearchTemplateResponse[TDocument]] = js.native
}
