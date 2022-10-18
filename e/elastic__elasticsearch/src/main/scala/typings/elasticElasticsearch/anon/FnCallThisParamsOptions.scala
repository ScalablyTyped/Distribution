package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.CreateRequest
import typings.elasticElasticsearch.libApiTypesMod.CreateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisParamsOptions extends StObject {
  
  def apply[TDocument](params: CreateRequest[TDocument]): js.Promise[CreateResponse] = js.native
  def apply[TDocument](params: CreateRequest[TDocument], options: TransportRequestOptions): js.Promise[CreateResponse] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CreateRequest[TDocument]): js.Promise[CreateResponse] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CreateRequest[TDocument],
    options: TransportRequestOptions
  ): js.Promise[CreateResponse] = js.native
}
