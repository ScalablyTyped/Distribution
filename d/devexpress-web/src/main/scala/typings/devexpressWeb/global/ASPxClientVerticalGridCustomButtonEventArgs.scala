package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.CustomButtonClick event.
  */
@JSGlobal("ASPxClientVerticalGridCustomButtonEventArgs")
@js.native
open class ASPxClientVerticalGridCustomButtonEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridCustomButtonEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridCustomButtonEventArgs class.
    * @param visibleIndex An integer value that identifies the record whose custom button has been clicked. This value is assigned to the ASPxClientVerticalGridCustomButtonEventArgs.visibleIndex property.
    * @param buttonID An integer value that identifies the clicked custom button. This value is assigned to the ASPxClientVerticalGridCustomButtonEventArgs.buttonID property.
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
    * Gets the value which identifies the record whose custom button has been clicked.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
