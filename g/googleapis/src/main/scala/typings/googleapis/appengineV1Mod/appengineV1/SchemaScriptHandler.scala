package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Executes a script to handle the request that matches the URL pattern.
  */
trait SchemaScriptHandler extends StObject {
  
  /**
    * Path to the script from the application root directory.
    */
  var scriptPath: js.UndefOr[String] = js.undefined
}
object SchemaScriptHandler {
  
  inline def apply(): SchemaScriptHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScriptHandler]
  }
  
  extension [Self <: SchemaScriptHandler](x: Self) {
    
    inline def setScriptPath(value: String): Self = StObject.set(x, "scriptPath", value.asInstanceOf[js.Any])
    
    inline def setScriptPathUndefined: Self = StObject.set(x, "scriptPath", js.undefined)
  }
}
