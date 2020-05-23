package typings.devexpressWeb.global

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.MoreButtonClicked client-side event.
  */
@JSGlobal("MoreButtonClickedEventArgs")
@js.native
class MoreButtonClickedEventArgs protected ()
  extends typings.devexpressWeb.MoreButtonClickedEventArgs {
  /**
    * Initializes a new instance of MoreButtonClickedEventArgs class with the specified parameters.
    * @param dateTime A DateTime value which corresponds to the top visible time of the target view.
    * @param resource A Resource associated with the time cell where the "More" button is located.
    */
  def this(dateTime: Date, resource: String) = this()
  /**
    * Gets or sets whether an event is handled. If it is handled, default actions are not required.
    */
  /* CompleteClass */
  override var handled: Boolean = js.native
  /**
    * Gets the time interval of the cell where the button is located.
    */
  /* CompleteClass */
  override var interval: typings.devexpressWeb.ASPxClientTimeInterval = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
  /**
    * Gets the resource identifier associated with the cell where the button is located.
    */
  /* CompleteClass */
  override var resource: String = js.native
  /**
    * Gets the Start or End values of the target appointment.
    */
  /* CompleteClass */
  override var targetDateTime: Date = js.native
}

