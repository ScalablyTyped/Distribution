package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientButton.Click event.
  */
@JSGlobal("ASPxClientButtonClickEventArgs")
@js.native
open class ASPxClientButtonClickEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientButtonClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientButtonClickEventArgs class with the specified settings.
    * @param processOnServer true to process the event on the server side; false to handle it completely on the client side. Initializes the ASPxClientProcessingModeEventArgs.processOnServer property.
    * @param cancelEventAndBubble true to cancel both the event's default action and the event's bubbling upon the hierarchy of event handlers; otherwise, false. Initializes the ASPxClientButtonClickEventArgs.cancelEventAndBubble property.
    */
  def this(processOnServer: Boolean, cancelEventAndBubble: Boolean) = this()
  
  /**
    * Specifies whether both the event's default action and the event's bubbling upon the hierarchy of event handlers should be canceled.
    */
  /* CompleteClass */
  var cancelEventAndBubble: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
