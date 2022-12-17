package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.GetScriptContextRequest
import typings.elasticElasticsearch.libApiTypesMod.GetScriptContextResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn13 extends StObject {
  
  def apply(): js.Promise[GetScriptContextResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptions): js.Promise[GetScriptContextResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[GetScriptContextResponse, Any]] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[GetScriptContextResponse] = js.native
  def apply(params: GetScriptContextRequest): js.Promise[GetScriptContextResponse] = js.native
  def apply(params: GetScriptContextRequest, options: TransportRequestOptions): js.Promise[GetScriptContextResponse] = js.native
  def apply(params: GetScriptContextRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[GetScriptContextResponse, Any]] = js.native
  def apply(params: GetScriptContextRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[GetScriptContextResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptContextRequest): js.Promise[GetScriptContextResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptContextRequest,
    options: TransportRequestOptions
  ): js.Promise[GetScriptContextResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptContextRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[GetScriptContextResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptContextRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[GetScriptContextResponse] = js.native
}
