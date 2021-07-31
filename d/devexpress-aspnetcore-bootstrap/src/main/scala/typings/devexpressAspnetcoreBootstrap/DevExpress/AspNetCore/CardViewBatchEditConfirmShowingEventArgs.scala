package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewBatchEditConfirmShowingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val requestTriggerID: String
}
object CardViewBatchEditConfirmShowingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, requestTriggerID: String, sender: Control): CardViewBatchEditConfirmShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], requestTriggerID = requestTriggerID.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBatchEditConfirmShowingEventArgs]
  }
  
  @scala.inline
  implicit class CardViewBatchEditConfirmShowingEventArgsMutableBuilder[Self <: CardViewBatchEditConfirmShowingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestTriggerID(value: String): Self = StObject.set(x, "requestTriggerID", value.asInstanceOf[js.Any])
  }
}
