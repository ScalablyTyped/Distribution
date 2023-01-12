package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.SaveCommandExecute event.
  */
trait ASPxClientReportDesignerSaveCommandExecuteEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies whether or not the event was handled.
    */
  var handled: Boolean
}
object ASPxClientReportDesignerSaveCommandExecuteEventArgs {
  
  inline def apply(handled: Boolean): ASPxClientReportDesignerSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerSaveCommandExecuteEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientReportDesignerSaveCommandExecuteEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
