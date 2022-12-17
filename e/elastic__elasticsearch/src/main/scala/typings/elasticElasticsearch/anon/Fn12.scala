package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.GetScriptRequest
import typings.elasticElasticsearch.libApiTypesMod.GetScriptResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn12 extends StObject {
  
  def apply(params: GetScriptRequest): js.Promise[GetScriptResponse] = js.native
  def apply(params: GetScriptRequest, options: TransportRequestOptions): js.Promise[GetScriptResponse] = js.native
  def apply(params: GetScriptRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[GetScriptResponse, Any]] = js.native
  def apply(params: GetScriptRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[GetScriptResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptRequest): js.Promise[GetScriptResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptRequest,
    options: TransportRequestOptions
  ): js.Promise[GetScriptResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[GetScriptResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[GetScriptResponse] = js.native
}
