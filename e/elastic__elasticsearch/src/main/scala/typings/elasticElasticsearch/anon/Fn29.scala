package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.RenderSearchTemplateRequest
import typings.elasticElasticsearch.libApiTypesMod.RenderSearchTemplateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn29 extends StObject {
  
  def apply(): js.Promise[RenderSearchTemplateResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptions): js.Promise[RenderSearchTemplateResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RenderSearchTemplateResponse, Any]] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[RenderSearchTemplateResponse] = js.native
  def apply(params: RenderSearchTemplateRequest): js.Promise[RenderSearchTemplateResponse] = js.native
  def apply(params: RenderSearchTemplateRequest, options: TransportRequestOptions): js.Promise[RenderSearchTemplateResponse] = js.native
  def apply(params: RenderSearchTemplateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RenderSearchTemplateResponse, Any]] = js.native
  def apply(params: RenderSearchTemplateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RenderSearchTemplateResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RenderSearchTemplateRequest): js.Promise[RenderSearchTemplateResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RenderSearchTemplateRequest,
    options: TransportRequestOptions
  ): js.Promise[RenderSearchTemplateResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RenderSearchTemplateRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[RenderSearchTemplateResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.RenderSearchTemplateRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[RenderSearchTemplateResponse] = js.native
}
