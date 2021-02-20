package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.SaveCommandExecute event.
  */
@js.native
trait ASPxClientReportDesignerSaveCommandExecuteEventArgs extends ASPxClientEventArgs {
  
  /**
    * Specifies whether or not the event was handled.
    */
  var handled: Boolean = js.native
}
object ASPxClientReportDesignerSaveCommandExecuteEventArgs {
  
  @scala.inline
  def apply(handled: Boolean): ASPxClientReportDesignerSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerSaveCommandExecuteEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerSaveCommandExecuteEventArgsMutableBuilder[Self <: ASPxClientReportDesignerSaveCommandExecuteEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
