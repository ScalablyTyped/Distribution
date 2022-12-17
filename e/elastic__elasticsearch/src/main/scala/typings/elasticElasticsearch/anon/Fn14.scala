package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.GetScriptLanguagesRequest
import typings.elasticElasticsearch.libApiTypesMod.GetScriptLanguagesResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn14 extends StObject {
  
  def apply(): js.Promise[GetScriptLanguagesResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptions): js.Promise[GetScriptLanguagesResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[GetScriptLanguagesResponse, Any]] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[GetScriptLanguagesResponse] = js.native
  def apply(params: GetScriptLanguagesRequest): js.Promise[GetScriptLanguagesResponse] = js.native
  def apply(params: GetScriptLanguagesRequest, options: TransportRequestOptions): js.Promise[GetScriptLanguagesResponse] = js.native
  def apply(params: GetScriptLanguagesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[GetScriptLanguagesResponse, Any]] = js.native
  def apply(params: GetScriptLanguagesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[GetScriptLanguagesResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptLanguagesRequest): js.Promise[GetScriptLanguagesResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptLanguagesRequest,
    options: TransportRequestOptions
  ): js.Promise[GetScriptLanguagesResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptLanguagesRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[GetScriptLanguagesResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetScriptLanguagesRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[GetScriptLanguagesResponse] = js.native
}
