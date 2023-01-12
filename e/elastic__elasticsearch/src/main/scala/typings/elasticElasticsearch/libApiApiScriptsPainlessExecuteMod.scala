package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.ScriptsPainlessExecuteRequest
import typings.elasticElasticsearch.libApiTypesMod.ScriptsPainlessExecuteResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiScriptsPainlessExecuteMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/scripts_painless_execute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TResult](): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](params: Unit, options: TransportRequestOptions): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ScriptsPainlessExecuteResponse[TResult], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[ScriptsPainlessExecuteResponse[TResult], Any]]]
  inline def default[TResult](params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](params: ScriptsPainlessExecuteRequest): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](params: ScriptsPainlessExecuteRequest, options: TransportRequestOptions): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](params: ScriptsPainlessExecuteRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ScriptsPainlessExecuteResponse[TResult], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[ScriptsPainlessExecuteResponse[TResult], Any]]]
  inline def default[TResult](params: ScriptsPainlessExecuteRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest,
    options: TransportRequestOptions
  ): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  inline def default[TResult](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ScriptsPainlessExecuteResponse[TResult], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[ScriptsPainlessExecuteResponse[TResult], Any]]]
  inline def default[TResult](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptsPainlessExecuteRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ScriptsPainlessExecuteResponse[TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptsPainlessExecuteResponse[TResult]]]
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: That] (val x: Self) extends AnyVal {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
