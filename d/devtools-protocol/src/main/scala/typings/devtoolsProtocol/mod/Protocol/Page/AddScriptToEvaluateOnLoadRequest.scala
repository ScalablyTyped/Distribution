package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddScriptToEvaluateOnLoadRequest extends StObject {
  
  var scriptSource: String
}
object AddScriptToEvaluateOnLoadRequest {
  
  inline def apply(scriptSource: String): AddScriptToEvaluateOnLoadRequest = {
    val __obj = js.Dynamic.literal(scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScriptToEvaluateOnLoadRequest]
  }
  
  extension [Self <: AddScriptToEvaluateOnLoadRequest](x: Self) {
    
    inline def setScriptSource(value: String): Self = StObject.set(x, "scriptSource", value.asInstanceOf[js.Any])
  }
}
