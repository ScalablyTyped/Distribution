package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddScriptToEvaluateOnNewDocumentResponse extends StObject {
  
  /**
    * Identifier of the added script.
    */
  var identifier: ScriptIdentifier
}
object AddScriptToEvaluateOnNewDocumentResponse {
  
  inline def apply(identifier: ScriptIdentifier): AddScriptToEvaluateOnNewDocumentResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScriptToEvaluateOnNewDocumentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddScriptToEvaluateOnNewDocumentResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: ScriptIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
