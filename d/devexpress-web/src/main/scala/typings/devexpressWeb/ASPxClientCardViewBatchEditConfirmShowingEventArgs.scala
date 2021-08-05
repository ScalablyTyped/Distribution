package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditConfirmShowing event.
  */
trait ASPxClientCardViewBatchEditConfirmShowingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the client identifier of an object that initiates a send request.
    */
  var requestTriggerID: String
}
object ASPxClientCardViewBatchEditConfirmShowingEventArgs {
  
  inline def apply(cancel: Boolean, requestTriggerID: String): ASPxClientCardViewBatchEditConfirmShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], requestTriggerID = requestTriggerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditConfirmShowingEventArgs]
  }
  
  extension [Self <: ASPxClientCardViewBatchEditConfirmShowingEventArgs](x: Self) {
    
    inline def setRequestTriggerID(value: String): Self = StObject.set(x, "requestTriggerID", value.asInstanceOf[js.Any])
  }
}
