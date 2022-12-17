package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.CreateRequest
import typings.elasticElasticsearch.libApiTypesMod.CreateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn2 extends StObject {
  
  def apply[TDocument](params: CreateRequest[TDocument]): js.Promise[CreateResponse] = js.native
  def apply[TDocument](params: CreateRequest[TDocument], options: TransportRequestOptions): js.Promise[CreateResponse] = js.native
  def apply[TDocument](params: CreateRequest[TDocument], options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CreateResponse, Any]] = js.native
  def apply[TDocument](params: CreateRequest[TDocument], options: TransportRequestOptionsWithOutMeta): js.Promise[CreateResponse] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CreateRequest[TDocument]): js.Promise[CreateResponse] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CreateRequest[TDocument],
    options: TransportRequestOptions
  ): js.Promise[CreateResponse] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CreateRequest[TDocument],
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[CreateResponse, Any]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CreateRequest[TDocument],
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[CreateResponse] = js.native
}
