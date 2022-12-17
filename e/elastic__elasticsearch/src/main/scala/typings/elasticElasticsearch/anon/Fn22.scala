package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.MtermvectorsRequest
import typings.elasticElasticsearch.libApiTypesMod.MtermvectorsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn22 extends StObject {
  
  def apply(): js.Promise[MtermvectorsResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptions): js.Promise[MtermvectorsResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MtermvectorsResponse, Any]] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[MtermvectorsResponse] = js.native
  def apply(params: MtermvectorsRequest): js.Promise[MtermvectorsResponse] = js.native
  def apply(params: MtermvectorsRequest, options: TransportRequestOptions): js.Promise[MtermvectorsResponse] = js.native
  def apply(params: MtermvectorsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MtermvectorsResponse, Any]] = js.native
  def apply(params: MtermvectorsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MtermvectorsResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MtermvectorsRequest): js.Promise[MtermvectorsResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MtermvectorsRequest,
    options: TransportRequestOptions
  ): js.Promise[MtermvectorsResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MtermvectorsRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[MtermvectorsResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MtermvectorsRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[MtermvectorsResponse] = js.native
}
