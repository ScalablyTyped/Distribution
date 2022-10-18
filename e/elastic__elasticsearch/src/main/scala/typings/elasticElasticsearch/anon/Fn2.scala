package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.GetSourceRequest
import typings.elasticElasticsearch.libApiTypesMod.GetSourceResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn2 extends StObject {
  
  def apply[TDocument](params: GetSourceRequest): js.Promise[GetSourceResponse[TDocument]] = js.native
  def apply[TDocument](params: GetSourceRequest, options: TransportRequestOptions): js.Promise[GetSourceResponse[TDocument]] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetSourceRequest): js.Promise[GetSourceResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetSourceRequest,
    options: TransportRequestOptions
  ): js.Promise[GetSourceResponse[TDocument]] = js.native
}
