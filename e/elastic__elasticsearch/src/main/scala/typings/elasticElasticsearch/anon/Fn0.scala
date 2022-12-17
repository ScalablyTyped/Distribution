package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ClosePointInTimeRequest
import typings.elasticElasticsearch.libApiTypesMod.ClosePointInTimeResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn0 extends StObject {
  
  def apply(params: ClosePointInTimeRequest): js.Promise[ClosePointInTimeResponse] = js.native
  def apply(params: ClosePointInTimeRequest, options: TransportRequestOptions): js.Promise[ClosePointInTimeResponse] = js.native
  def apply(params: ClosePointInTimeRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClosePointInTimeResponse, Any]] = js.native
  def apply(params: ClosePointInTimeRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClosePointInTimeResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClosePointInTimeRequest): js.Promise[ClosePointInTimeResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClosePointInTimeRequest,
    options: TransportRequestOptions
  ): js.Promise[ClosePointInTimeResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClosePointInTimeRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ClosePointInTimeResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClosePointInTimeRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ClosePointInTimeResponse] = js.native
}
