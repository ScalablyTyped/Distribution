package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewBatchEditConfirmShowingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val requestTriggerID: String
}
object GridViewBatchEditConfirmShowingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, requestTriggerID: String, sender: Control): GridViewBatchEditConfirmShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], requestTriggerID = requestTriggerID.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditConfirmShowingEventArgs]
  }
  
  @scala.inline
  implicit class GridViewBatchEditConfirmShowingEventArgsMutableBuilder[Self <: GridViewBatchEditConfirmShowingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestTriggerID(value: String): Self = StObject.set(x, "requestTriggerID", value.asInstanceOf[js.Any])
  }
}
