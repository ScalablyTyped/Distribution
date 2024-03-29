package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApiEndpointHandler extends StObject {
  
  /**
    * Path to the script from the application root directory.
    */
  var scriptPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaApiEndpointHandler {
  
  inline def apply(): SchemaApiEndpointHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiEndpointHandler]
  }
  
  extension [Self <: SchemaApiEndpointHandler](x: Self) {
    
    inline def setScriptPath(value: String): Self = StObject.set(x, "scriptPath", value.asInstanceOf[js.Any])
    
    inline def setScriptPathNull: Self = StObject.set(x, "scriptPath", null)
    
    inline def setScriptPathUndefined: Self = StObject.set(x, "scriptPath", js.undefined)
  }
}
