package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveScriptToEvaluateOnLoadRequest extends StObject {
  
  var identifier: ScriptIdentifier
}
object RemoveScriptToEvaluateOnLoadRequest {
  
  inline def apply(identifier: ScriptIdentifier): RemoveScriptToEvaluateOnLoadRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveScriptToEvaluateOnLoadRequest]
  }
  
  extension [Self <: RemoveScriptToEvaluateOnLoadRequest](x: Self) {
    
    inline def setIdentifier(value: ScriptIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
