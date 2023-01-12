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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveScriptToEvaluateOnLoadRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: ScriptIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
