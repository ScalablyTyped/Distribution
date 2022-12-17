package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ExistsRequest
import typings.elasticElasticsearch.libApiTypesMod.ExistsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn7 extends StObject {
  
  def apply(params: ExistsRequest): js.Promise[ExistsResponse] = js.native
  def apply(params: ExistsRequest, options: TransportRequestOptions): js.Promise[ExistsResponse] = js.native
  def apply(params: ExistsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ExistsResponse, Any]] = js.native
  def apply(params: ExistsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ExistsResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsRequest): js.Promise[ExistsResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsRequest,
    options: TransportRequestOptions
  ): js.Promise[ExistsResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ExistsResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ExistsResponse] = js.native
}
