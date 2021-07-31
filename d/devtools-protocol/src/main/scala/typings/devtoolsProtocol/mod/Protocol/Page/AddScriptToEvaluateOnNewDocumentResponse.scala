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
  
  @scala.inline
  def apply(identifier: ScriptIdentifier): AddScriptToEvaluateOnNewDocumentResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScriptToEvaluateOnNewDocumentResponse]
  }
  
  @scala.inline
  implicit class AddScriptToEvaluateOnNewDocumentResponseMutableBuilder[Self <: AddScriptToEvaluateOnNewDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: ScriptIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
