package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditConfirmShowing event.
  */
@JSGlobal("ASPxClientTreeListBatchEditConfirmShowingEventArgs")
@js.native
class ASPxClientTreeListBatchEditConfirmShowingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListBatchEditConfirmShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditConfirmShowingEventArgs class.
    * @param requestTriggerID A string value specifying the client identifier of an object that initiates a request.
    */
  def this(requestTriggerID: String) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the client identifier of an object that initiates a send request.
    */
  /* CompleteClass */
  var requestTriggerID: String = js.native
}
