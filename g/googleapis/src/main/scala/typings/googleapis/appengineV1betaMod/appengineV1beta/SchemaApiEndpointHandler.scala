package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Uses Google Cloud Endpoints to handle requests.
  */
@js.native
trait SchemaApiEndpointHandler extends StObject {
  
  /**
    * Path to the script from the application root directory.
    */
  var scriptPath: js.UndefOr[String] = js.native
}
object SchemaApiEndpointHandler {
  
  @scala.inline
  def apply(): SchemaApiEndpointHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiEndpointHandler]
  }
  
  @scala.inline
  implicit class SchemaApiEndpointHandlerMutableBuilder[Self <: SchemaApiEndpointHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScriptPath(value: String): Self = StObject.set(x, "scriptPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptPathUndefined: Self = StObject.set(x, "scriptPath", js.undefined)
  }
}
