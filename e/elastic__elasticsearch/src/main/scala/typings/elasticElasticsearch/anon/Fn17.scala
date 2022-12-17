package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.InfoRequest
import typings.elasticElasticsearch.libApiTypesMod.InfoResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn17 extends StObject {
  
  def apply(): js.Promise[InfoResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptions): js.Promise[InfoResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[InfoResponse, Any]] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[InfoResponse] = js.native
  def apply(params: InfoRequest): js.Promise[InfoResponse] = js.native
  def apply(params: InfoRequest, options: TransportRequestOptions): js.Promise[InfoResponse] = js.native
  def apply(params: InfoRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[InfoResponse, Any]] = js.native
  def apply(params: InfoRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[InfoResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.InfoRequest): js.Promise[InfoResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.InfoRequest,
    options: TransportRequestOptions
  ): js.Promise[InfoResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.InfoRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[InfoResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.InfoRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[InfoResponse] = js.native
}
