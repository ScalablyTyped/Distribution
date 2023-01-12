package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddScriptToEvaluateOnNewDocumentRequest extends StObject {
  
  /**
    * Specifies whether command line API should be available to the script, defaults
    * to false.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddScriptToEvaluateOnNewDocumentRequest] (val x: Self) extends AnyVal {
    
    inline def setIncludeCommandLineAPI(value: Boolean): Self = StObject.set(x, "includeCommandLineAPI", value.asInstanceOf[js.Any])
    
    inline def setIncludeCommandLineAPIUndefined: Self = StObject.set(x, "includeCommandLineAPI", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setWorldName(value: String): Self = StObject.set(x, "worldName", value.asInstanceOf[js.Any])
    
    inline def setWorldNameUndefined: Self = StObject.set(x, "worldName", js.undefined)
  }
}
