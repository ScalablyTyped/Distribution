package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the MVCxClientReportDesigner.SaveCommandExecuted event.
  */
trait MVCxClientReportDesignerSaveCommandExecutedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Returns the operation result.
    */
  var Result: String
}
object MVCxClientReportDesignerSaveCommandExecutedEventArgs {
  
  inline def apply(Result: String): MVCxClientReportDesignerSaveCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientReportDesignerSaveCommandExecutedEventArgs]
  }
  
  extension [Self <: MVCxClientReportDesignerSaveCommandExecutedEventArgs](x: Self) {
    
    inline def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
