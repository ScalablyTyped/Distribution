package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddScriptToEvaluateOnLoadResponse extends StObject {
  
  /**
    * Identifier of the added script.
    */
  var identifier: ScriptIdentifier
}
object AddScriptToEvaluateOnLoadResponse {
  
  inline def apply(identifier: ScriptIdentifier): AddScriptToEvaluateOnLoadResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScriptToEvaluateOnLoadResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddScriptToEvaluateOnLoadResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: ScriptIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
