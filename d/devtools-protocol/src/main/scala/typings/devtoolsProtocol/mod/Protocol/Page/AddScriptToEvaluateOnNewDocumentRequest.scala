package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddScriptToEvaluateOnNewDocumentRequest extends StObject {
  
  var source: String
  
  /**
    * If specified, creates an isolated world with the given name and evaluates given script in it.
    * This world name will be used as the ExecutionContextDescription::name when the corresponding
    * event is emitted.
    */
  var worldName: js.UndefOr[String] = js.undefined
}
object AddScriptToEvaluateOnNewDocumentRequest {
  
  inline def apply(source: String): AddScriptToEvaluateOnNewDocumentRequest = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScriptToEvaluateOnNewDocumentRequest]
  }
  
  extension [Self <: AddScriptToEvaluateOnNewDocumentRequest](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setWorldName(value: String): Self = StObject.set(x, "worldName", value.asInstanceOf[js.Any])
    
    inline def setWorldNameUndefined: Self = StObject.set(x, "worldName", js.undefined)
  }
}
