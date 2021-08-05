package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileScriptResponse extends StObject {
  
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  
  /**
    * Id of the script.
    */
  var scriptId: js.UndefOr[ScriptId] = js.undefined
}
object CompileScriptResponse {
  
  inline def apply(): CompileScriptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileScriptResponse]
  }
  
  extension [Self <: CompileScriptResponse](x: Self) {
    
    inline def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    inline def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
  }
}
