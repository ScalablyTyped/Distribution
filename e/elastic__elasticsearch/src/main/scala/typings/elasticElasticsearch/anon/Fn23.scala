package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.OpenPointInTimeRequest
import typings.elasticElasticsearch.libApiTypesMod.OpenPointInTimeResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn23 extends StObject {
  
  def apply(params: OpenPointInTimeRequest): js.Promise[OpenPointInTimeResponse] = js.native
  def apply(params: OpenPointInTimeRequest, options: TransportRequestOptions): js.Promise[OpenPointInTimeResponse] = js.native
  def apply(params: OpenPointInTimeRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[OpenPointInTimeResponse, Any]] = js.native
  def apply(params: OpenPointInTimeRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[OpenPointInTimeResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.OpenPointInTimeRequest): js.Promise[OpenPointInTimeResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.OpenPointInTimeRequest,
    options: TransportRequestOptions
  ): js.Promise[OpenPointInTimeResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.OpenPointInTimeRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[OpenPointInTimeResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.OpenPointInTimeRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[OpenPointInTimeResponse] = js.native
}
