package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ScriptsPainlessExecuteRequest
import typings.elasticElasticsearch.libApiTypesMod.ScriptsPainlessExecuteResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn30 extends StObject {
  
  def apply[TResult](): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: Unit, options: TransportRequestOptions): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ScriptsPainlessExecuteResponse[TResult], Any]] = js.native
  def apply[TResult](params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: ScriptsPainlessExecuteRequest): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: ScriptsPainlessExecuteRequest, options: TransportRequestOptions): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: ScriptsPainlessExecuteRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ScriptsPainlessExecuteResponse[TResult], Any]] = js.native
  def apply[TResult](params: ScriptsPainlessExecuteRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest,
    options: TransportRequestOptions
  ): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ScriptsPainlessExecuteResponse[TResult], Any]] = js.native
  def apply[TResult](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
}
