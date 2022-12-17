package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.DeleteScriptRequest
import typings.elasticElasticsearch.libApiTypesMod.DeleteScriptResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn6 extends StObject {
  
  def apply(params: DeleteScriptRequest): js.Promise[DeleteScriptResponse] = js.native
  def apply(params: DeleteScriptRequest, options: TransportRequestOptions): js.Promise[DeleteScriptResponse] = js.native
  def apply(params: DeleteScriptRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[DeleteScriptResponse, Any]] = js.native
  def apply(params: DeleteScriptRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[DeleteScriptResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteScriptRequest): js.Promise[DeleteScriptResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteScriptRequest,
    options: TransportRequestOptions
  ): js.Promise[DeleteScriptResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteScriptRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[DeleteScriptResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteScriptRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[DeleteScriptResponse] = js.native
}
