package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.DeleteRequest
import typings.elasticElasticsearch.libApiTypesMod.DeleteResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn3 extends StObject {
  
  def apply(params: DeleteRequest): js.Promise[DeleteResponse] = js.native
  def apply(params: DeleteRequest, options: TransportRequestOptions): js.Promise[DeleteResponse] = js.native
  def apply(params: DeleteRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[DeleteResponse, Any]] = js.native
  def apply(params: DeleteRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[DeleteResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteRequest): js.Promise[DeleteResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteRequest,
    options: TransportRequestOptions
  ): js.Promise[DeleteResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[DeleteResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[DeleteResponse] = js.native
}
