package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.FieldCapsRequest
import typings.elasticElasticsearch.libApiTypesMod.FieldCapsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn10 extends StObject {
  
  def apply(): js.Promise[FieldCapsResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptions): js.Promise[FieldCapsResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FieldCapsResponse, Any]] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[FieldCapsResponse] = js.native
  def apply(params: FieldCapsRequest): js.Promise[FieldCapsResponse] = js.native
  def apply(params: FieldCapsRequest, options: TransportRequestOptions): js.Promise[FieldCapsResponse] = js.native
  def apply(params: FieldCapsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FieldCapsResponse, Any]] = js.native
  def apply(params: FieldCapsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[FieldCapsResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FieldCapsRequest): js.Promise[FieldCapsResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FieldCapsRequest,
    options: TransportRequestOptions
  ): js.Promise[FieldCapsResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FieldCapsRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[FieldCapsResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FieldCapsRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[FieldCapsResponse] = js.native
}
