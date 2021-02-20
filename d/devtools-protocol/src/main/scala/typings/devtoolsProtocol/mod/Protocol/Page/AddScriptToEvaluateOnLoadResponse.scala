package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddScriptToEvaluateOnLoadResponse extends StObject {
  
  /**
    * Identifier of the added script.
    */
  var identifier: ScriptIdentifier = js.native
}
object AddScriptToEvaluateOnLoadResponse {
  
  @scala.inline
  def apply(identifier: ScriptIdentifier): AddScriptToEvaluateOnLoadResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScriptToEvaluateOnLoadResponse]
  }
  
  @scala.inline
  implicit class AddScriptToEvaluateOnLoadResponseMutableBuilder[Self <: AddScriptToEvaluateOnLoadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: ScriptIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
