package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.MoreButtonClicked client-side event.
  */
@JSGlobal("MoreButtonClickedEventArgs")
@js.native
open class MoreButtonClickedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.MoreButtonClickedEventArgs {
  /**
    * Initializes a new instance of MoreButtonClickedEventArgs class with the specified parameters.
    * @param dateTime A DateTime value which corresponds to the top visible time of the target view.
    * @param resource A Resource associated with the time cell where the "More" button is located.
    */
  def this(dateTime: js.Date, resource: String) = this()
  
  /**
    * Gets or sets whether an event is handled. If it is handled, default actions are not required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets the time interval of the cell where the button is located.
    */
  /* CompleteClass */
  var interval: typings.devexpressWeb.ASPxClientTimeInterval = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
  
  /**
    * Gets the resource identifier associated with the cell where the button is located.
    */
  /* CompleteClass */
  var resource: String = js.native
  
  /**
    * Gets the Start or End values of the target appointment.
    */
  /* CompleteClass */
  var targetDateTime: js.Date = js.native
}
