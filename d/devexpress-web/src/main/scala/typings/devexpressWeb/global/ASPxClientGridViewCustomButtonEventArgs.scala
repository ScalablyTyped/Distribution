package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.CustomButtonClick event.
  */
@JSGlobal("ASPxClientGridViewCustomButtonEventArgs")
@js.native
class ASPxClientGridViewCustomButtonEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewCustomButtonEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewCustomButtonEventArgs class.
    * @param visibleIndex An integer value that identifies the row whose custom button has been clicked. This value is assigned to the ASPxClientGridViewCustomButtonEventArgs.visibleIndex property.
    * @param buttonID An integer value that identifies the clicked custom button. This value is assigned to the ASPxClientGridViewCustomButtonEventArgs.buttonID property.
    */
  def this(visibleIndex: Double, buttonID: String) = this()
  
  /**
    * Gets the value that identifies the custom button.
    */
  /* CompleteClass */
  var buttonID: String = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
  
  /**
    * Gets the value that identifies the row whose custom button has been clicked.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
