package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveScriptToEvaluateOnNewDocumentRequest extends StObject {
  
  var identifier: ScriptIdentifier
}
object RemoveScriptToEvaluateOnNewDocumentRequest {
  
  inline def apply(identifier: ScriptIdentifier): RemoveScriptToEvaluateOnNewDocumentRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveScriptToEvaluateOnNewDocumentRequest]
  }
  
  extension [Self <: RemoveScriptToEvaluateOnNewDocumentRequest](x: Self) {
    
    inline def setIdentifier(value: ScriptIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
