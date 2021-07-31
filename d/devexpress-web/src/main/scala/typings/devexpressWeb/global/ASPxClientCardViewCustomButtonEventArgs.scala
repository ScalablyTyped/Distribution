package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.CustomButtonClick event.
  */
@JSGlobal("ASPxClientCardViewCustomButtonEventArgs")
@js.native
class ASPxClientCardViewCustomButtonEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCardViewCustomButtonEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewCustomButtonEventArgs class.
    * @param visibleIndex An integer value that identifies the card whose custom button has been clicked. This value is assigned to the ASPxClientCardViewCustomButtonEventArgs.visibleIndex property.
    * @param buttonID An integer value that identifies the clicked custom button. This value is assigned to the ASPxClientCardViewCustomButtonEventArgs.buttonID property.
    */
  def this(visibleIndex: Double, buttonID: String) = this()
  
  /**
    * Gets the value which identifies the custom button.
    */
  /* CompleteClass */
  var buttonID: String = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
  
  /**
    * Gets the value which identifies the card whose custom button has been clicked.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
