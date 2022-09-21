package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditConfirmShowing event.
  */
@JSGlobal("ASPxClientCardViewBatchEditConfirmShowingEventArgs")
@js.native
open class ASPxClientCardViewBatchEditConfirmShowingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCardViewBatchEditConfirmShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditConfirmShowingEventArgs class.
    * @param requestTriggerID A string value specifying the client identifier of an object that initiates a request.
    */
  def this(requestTriggerID: String) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the client identifier of an object that initiates a send request.
    */
  /* CompleteClass */
  var requestTriggerID: String = js.native
}
