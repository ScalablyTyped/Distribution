package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.TermvectorsRequest
import typings.elasticElasticsearch.libApiTypesMod.TermvectorsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn37 extends StObject {
  
  def apply[TDocument](params: TermvectorsRequest[TDocument]): js.Promise[TermvectorsResponse] = js.native
  def apply[TDocument](params: TermvectorsRequest[TDocument], options: TransportRequestOptions): js.Promise[TermvectorsResponse] = js.native
  def apply[TDocument](params: TermvectorsRequest[TDocument], options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TermvectorsResponse, Any]] = js.native
  def apply[TDocument](params: TermvectorsRequest[TDocument], options: TransportRequestOptionsWithOutMeta): js.Promise[TermvectorsResponse] = js.native
  def apply[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermvectorsRequest[TDocument]): js.Promise[TermvectorsResponse] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermvectorsRequest[TDocument],
    options: TransportRequestOptions
  ): js.Promise[TermvectorsResponse] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermvectorsRequest[TDocument],
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[TermvectorsResponse, Any]] = js.native
  def apply[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermvectorsRequest[TDocument],
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[TermvectorsResponse] = js.native
}
