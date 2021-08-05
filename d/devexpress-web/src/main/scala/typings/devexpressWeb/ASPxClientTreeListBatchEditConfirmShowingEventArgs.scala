package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditConfirmShowing event.
  */
trait ASPxClientTreeListBatchEditConfirmShowingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets the client identifier of an object that initiates a send request.
    */
  var requestTriggerID: String
}
object ASPxClientTreeListBatchEditConfirmShowingEventArgs {
  
  inline def apply(cancel: Boolean, requestTriggerID: String): ASPxClientTreeListBatchEditConfirmShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], requestTriggerID = requestTriggerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditConfirmShowingEventArgs]
  }
  
  extension [Self <: ASPxClientTreeListBatchEditConfirmShowingEventArgs](x: Self) {
    
    inline def setRequestTriggerID(value: String): Self = StObject.set(x, "requestTriggerID", value.asInstanceOf[js.Any])
  }
}
