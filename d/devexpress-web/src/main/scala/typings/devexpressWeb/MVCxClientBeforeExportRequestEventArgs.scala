package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client BeforeExportRequest events.
  */
trait MVCxClientBeforeExportRequestEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  var customArgs: js.Any
}
object MVCxClientBeforeExportRequestEventArgs {
  
  @scala.inline
  def apply(customArgs: js.Any): MVCxClientBeforeExportRequestEventArgs = {
    val __obj = js.Dynamic.literal(customArgs = customArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientBeforeExportRequestEventArgs]
  }
  
  @scala.inline
  implicit class MVCxClientBeforeExportRequestEventArgsMutableBuilder[Self <: MVCxClientBeforeExportRequestEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomArgs(value: js.Any): Self = StObject.set(x, "customArgs", value.asInstanceOf[js.Any])
  }
}
