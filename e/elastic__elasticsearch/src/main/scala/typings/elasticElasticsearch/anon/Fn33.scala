package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.SearchMvtRequest
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn33 extends StObject {
  
  def apply(params: SearchMvtRequest): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def apply(params: SearchMvtRequest, options: TransportRequestOptions): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def apply(params: SearchMvtRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[js.typedarray.ArrayBuffer, Any]] = js.native
  def apply(params: SearchMvtRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchMvtRequest): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchMvtRequest,
    options: TransportRequestOptions
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchMvtRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[js.typedarray.ArrayBuffer, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchMvtRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
}
