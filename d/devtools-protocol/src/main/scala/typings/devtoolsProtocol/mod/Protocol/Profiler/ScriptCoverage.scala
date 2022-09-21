package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptCoverage extends StObject {
  
  /**
    * Functions contained in the script that has coverage data.
    */
  var functions: js.Array[FunctionCoverage]
  
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId
  
  /**
    * JavaScript script name or url.
    */
  var url: String
}
object ScriptCoverage {
  
  inline def apply(functions: js.Array[FunctionCoverage], scriptId: ScriptId, url: String): ScriptCoverage = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptCoverage]
  }
  
  extension [Self <: ScriptCoverage](x: Self) {
    
    inline def setFunctions(value: js.Array[FunctionCoverage]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsVarargs(value: FunctionCoverage*): Self = StObject.set(x, "functions", js.Array(value*))
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
