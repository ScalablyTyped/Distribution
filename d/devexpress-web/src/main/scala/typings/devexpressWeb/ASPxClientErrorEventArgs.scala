package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.OnServerError, ASPxClientReportDesigner.OnServerError and ASPxClientQueryBuilder.OnServerError events.
  */
@js.native
trait ASPxClientErrorEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides access to information about a server-side error.
    */
  var Error: js.Any = js.native
}
object ASPxClientErrorEventArgs {
  
  @scala.inline
  def apply(Error: js.Any): ASPxClientErrorEventArgs = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientErrorEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientErrorEventArgsMutableBuilder[Self <: ASPxClientErrorEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
  }
}
