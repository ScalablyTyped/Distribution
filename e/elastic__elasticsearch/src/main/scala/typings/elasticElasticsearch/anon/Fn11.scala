package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.SearchTemplateRequest
import typings.elasticElasticsearch.libApiTypesMod.SearchTemplateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn11 extends StObject {
  
  def apply[TDocument](): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](params: Unit, options: TransportRequestOptions): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](params: SearchTemplateRequest): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](params: SearchTemplateRequest, options: TransportRequestOptions): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTemplateRequest): js.Promise[SearchTemplateResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTemplateRequest,
    options: TransportRequestOptions
  ): js.Promise[SearchTemplateResponse[TDocument]] = js.native
}
