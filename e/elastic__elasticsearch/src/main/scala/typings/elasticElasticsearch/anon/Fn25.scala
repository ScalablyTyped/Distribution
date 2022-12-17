package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.PutScriptRequest
import typings.elasticElasticsearch.libApiTypesMod.PutScriptResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn25 extends StObject {
  
  def apply(params: PutScriptRequest): js.Promise[PutScriptResponse] = js.native
  def apply(params: PutScriptRequest, options: TransportRequestOptions): js.Promise[PutScriptResponse] = js.native
  def apply(params: PutScriptRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[PutScriptResponse, Any]] = js.native
  def apply(params: PutScriptRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[PutScriptResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PutScriptRequest): js.Promise[PutScriptResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PutScriptRequest,
    options: TransportRequestOptions
  ): js.Promise[PutScriptResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PutScriptRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[PutScriptResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PutScriptRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[PutScriptResponse] = js.native
}
