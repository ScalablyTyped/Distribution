package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.ScriptsPainlessExecuteRequest
import typings.elasticElasticsearch.libApiTypesMod.ScriptsPainlessExecuteResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn8 extends StObject {
  
  def apply[TResult](): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: Unit, options: TransportRequestOptions): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: ScriptsPainlessExecuteRequest): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: ScriptsPainlessExecuteRequest, options: TransportRequestOptions): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
  def apply[TResult](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest,
    options: TransportRequestOptions
  ): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = js.native
}
