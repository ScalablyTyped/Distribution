package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.MgetRequest
import typings.elasticElasticsearch.libApiTypesMod.MgetResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn5 extends StObject {
  
  def apply[TDocument](): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: Unit, options: TransportRequestOptions): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: MgetRequest): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: MgetRequest, options: TransportRequestOptions): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetRequest): js.Promise[MgetResponse[TDocument]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetRequest,
    options: TransportRequestOptions
  ): js.Promise[MgetResponse[TDocument]] = js.native
}
