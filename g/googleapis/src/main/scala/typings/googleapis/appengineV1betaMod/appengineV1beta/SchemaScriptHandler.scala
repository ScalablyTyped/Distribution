package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScriptHandler extends StObject {
  
  /**
    * Path to the script from the application root directory.
    */
  var scriptPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaScriptHandler {
  
  inline def apply(): SchemaScriptHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScriptHandler]
  }
  
  extension [Self <: SchemaScriptHandler](x: Self) {
    
    inline def setScriptPath(value: String): Self = StObject.set(x, "scriptPath", value.asInstanceOf[js.Any])
    
    inline def setScriptPathNull: Self = StObject.set(x, "scriptPath", null)
    
    inline def setScriptPathUndefined: Self = StObject.set(x, "scriptPath", js.undefined)
  }
}
