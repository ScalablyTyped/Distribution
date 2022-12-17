package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ReindexRequest
import typings.elasticElasticsearch.libApiTypesMod.ReindexResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn27 extends StObject {
  
  def apply(params: ReindexRequest): js.Promise[ReindexResponse] = js.native
  def apply(params: ReindexRequest, options: TransportRequestOptions): js.Promise[ReindexResponse] = js.native
  def apply(params: ReindexRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ReindexResponse, Any]] = js.native
  def apply(params: ReindexRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ReindexResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRequest): js.Promise[ReindexResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRequest,
    options: TransportRequestOptions
  ): js.Promise[ReindexResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ReindexResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ReindexResponse] = js.native
}
