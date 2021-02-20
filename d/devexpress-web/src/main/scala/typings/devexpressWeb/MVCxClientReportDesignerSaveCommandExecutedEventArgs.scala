package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the MVCxClientReportDesigner.SaveCommandExecuted event.
  */
@js.native
trait MVCxClientReportDesignerSaveCommandExecutedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Returns the operation result.
    */
  var Result: String = js.native
}
object MVCxClientReportDesignerSaveCommandExecutedEventArgs {
  
  @scala.inline
  def apply(Result: String): MVCxClientReportDesignerSaveCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientReportDesignerSaveCommandExecutedEventArgs]
  }
  
  @scala.inline
  implicit class MVCxClientReportDesignerSaveCommandExecutedEventArgsMutableBuilder[Self <: MVCxClientReportDesignerSaveCommandExecutedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
