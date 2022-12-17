package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.PingRequest
import typings.elasticElasticsearch.libApiTypesMod.PingResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn24 extends StObject {
  
  def apply(): js.Promise[PingResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptions): js.Promise[PingResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[PingResponse, Any]] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[PingResponse] = js.native
  def apply(params: PingRequest): js.Promise[PingResponse] = js.native
  def apply(params: PingRequest, options: TransportRequestOptions): js.Promise[PingResponse] = js.native
  def apply(params: PingRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[PingResponse, Any]] = js.native
  def apply(params: PingRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[PingResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PingRequest): js.Promise[PingResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PingRequest,
    options: TransportRequestOptions
  ): js.Promise[PingResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PingRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[PingResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PingRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[PingResponse] = js.native
}
