package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.GetRequest
import typings.elasticElasticsearch.libApiTypesMod.GetResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn1 extends StObject {
  
  def apply[TDocument](params: GetRequest): js.Promise[GetResponse[TDocument]] = js.native
  def apply[TDocument](params: GetRequest, options: TransportRequestOptions): js.Promise[GetResponse[TDocument]] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetRequest): js.Promise[GetResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.GetRequest,
    options: TransportRequestOptions
  ): js.Promise[GetResponse[TDocument]] = js.native
}
