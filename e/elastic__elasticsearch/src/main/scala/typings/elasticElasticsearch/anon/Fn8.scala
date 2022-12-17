package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ExistsSourceRequest
import typings.elasticElasticsearch.libApiTypesMod.ExistsSourceResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn8 extends StObject {
  
  def apply(params: ExistsSourceRequest): js.Promise[ExistsSourceResponse] = js.native
  def apply(params: ExistsSourceRequest, options: TransportRequestOptions): js.Promise[ExistsSourceResponse] = js.native
  def apply(params: ExistsSourceRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ExistsSourceResponse, Any]] = js.native
  def apply(params: ExistsSourceRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ExistsSourceResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsSourceRequest): js.Promise[ExistsSourceResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsSourceRequest,
    options: TransportRequestOptions
  ): js.Promise[ExistsSourceResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsSourceRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ExistsSourceResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsSourceRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ExistsSourceResponse] = js.native
}
