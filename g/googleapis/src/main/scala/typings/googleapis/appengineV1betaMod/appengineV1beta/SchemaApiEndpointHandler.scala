package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Uses Google Cloud Endpoints to handle requests.
  */
trait SchemaApiEndpointHandler extends StObject {
  
  /**
    * Path to the script from the application root directory.
    */
  var scriptPath: js.UndefOr[String] = js.undefined
}
object SchemaApiEndpointHandler {
  
  inline def apply(): SchemaApiEndpointHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiEndpointHandler]
  }
  
  extension [Self <: SchemaApiEndpointHandler](x: Self) {
    
    inline def setScriptPath(value: String): Self = StObject.set(x, "scriptPath", value.asInstanceOf[js.Any])
    
    inline def setScriptPathUndefined: Self = StObject.set(x, "scriptPath", js.undefined)
  }
}
