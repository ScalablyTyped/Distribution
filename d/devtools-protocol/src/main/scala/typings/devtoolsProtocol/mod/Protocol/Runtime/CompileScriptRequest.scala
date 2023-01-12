package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileScriptRequest extends StObject {
  
  /**
    * Specifies in which execution context to perform script run. If the parameter is omitted the
    * evaluation will be performed in the context of the inspected page.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  
  /**
    * Expression to compile.
    */
  var expression: String
  
  /**
    * Specifies whether the compiled script should be persisted.
    */
  var persistScript: Boolean
  
  /**
    * Source url to be set for the script.
    */
  var sourceURL: String
}
object CompileScriptRequest {
  
  inline def apply(expression: String, persistScript: Boolean, sourceURL: String): CompileScriptRequest = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], persistScript = persistScript.asInstanceOf[js.Any], sourceURL = sourceURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileScriptRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompileScriptRequest] (val x: Self) extends AnyVal {
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setPersistScript(value: Boolean): Self = StObject.set(x, "persistScript", value.asInstanceOf[js.Any])
    
    inline def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
  }
}
