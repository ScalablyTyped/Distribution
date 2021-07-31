package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancelable client-side events which allow the event's processing to be passed to the server side.
  */
@JSGlobal("ASPxClientProcessingModeCancelEventArgs")
@js.native
class ASPxClientProcessingModeCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientProcessingModeCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientProcessingModeCancelEventArgs object.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side. Initializes the ASPxClientProcessingModeEventArgs.processOnServer property.
    */
  def this(processOnServer: Boolean) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
