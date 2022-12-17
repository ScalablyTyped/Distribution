package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ClearScrollRequest
import typings.elasticElasticsearch.libApiTypesMod.ClearScrollResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisParamsOptions extends StObject {
  
  def apply(): js.Promise[ClearScrollResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptions): js.Promise[ClearScrollResponse] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClearScrollResponse, Any]] = js.native
  def apply(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClearScrollResponse] = js.native
  def apply(params: ClearScrollRequest): js.Promise[ClearScrollResponse] = js.native
  def apply(params: ClearScrollRequest, options: TransportRequestOptions): js.Promise[ClearScrollResponse] = js.native
  def apply(params: ClearScrollRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClearScrollResponse, Any]] = js.native
  def apply(params: ClearScrollRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClearScrollResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClearScrollRequest): js.Promise[ClearScrollResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClearScrollRequest,
    options: TransportRequestOptions
  ): js.Promise[ClearScrollResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClearScrollRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ClearScrollResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClearScrollRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ClearScrollResponse] = js.native
}
