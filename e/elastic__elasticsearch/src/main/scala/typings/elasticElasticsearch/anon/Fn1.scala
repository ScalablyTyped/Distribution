package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.CountRequest
import typings.elasticElasticsearch.libApiTypesMod.CountResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn1 extends StObject {
  
  def apply(): js.Promise[CountResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptions): js.Promise[CountResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CountResponse, Any]] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CountResponse] = js.native
  def apply(params: CountRequest): js.Promise[CountResponse] = js.native
  def apply(params: CountRequest, options: TransportRequestOptions): js.Promise[CountResponse] = js.native
  def apply(params: CountRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CountResponse, Any]] = js.native
  def apply(params: CountRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CountResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CountRequest): js.Promise[CountResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CountRequest,
    options: TransportRequestOptions
  ): js.Promise[CountResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CountRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[CountResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CountRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[CountResponse] = js.native
}
