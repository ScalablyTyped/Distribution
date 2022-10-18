package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptsPainlessExecuteResponse[TResult] extends StObject {
  
  var result: TResult
}
object ScriptsPainlessExecuteResponse {
  
  inline def apply[TResult](result: TResult): ScriptsPainlessExecuteResponse[TResult] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptsPainlessExecuteResponse[TResult]]
  }
  
  extension [Self <: ScriptsPainlessExecuteResponse[?], TResult](x: Self & ScriptsPainlessExecuteResponse[TResult]) {
    
    inline def setResult(value: TResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
