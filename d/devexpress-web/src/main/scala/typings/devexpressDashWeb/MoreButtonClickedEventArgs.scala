package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MoreButtonClicked client-side event.
  */
trait MoreButtonClickedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets or sets whether an event is handled. If it is handled, default actions are not required.
    * Value: true if no default processing is required; otherwise, false.
    */
  var handled: Boolean
  /**
    * Gets the time interval of the cell where the button is located.
    * Value: An ASPxClientTimeInterval object representing the time interval of the cell which holds the button.
    */
  var interval: ASPxClientTimeInterval
  /**
    * Gets the resource identifier associated with the cell where the button is located.
    * Value: A string, corresponding to ResourceId.
    */
  var resource: String
  /**
    * Gets the Start or End values of the target appointment.
    * Value: A DateTime value representing the target appointment's boundary.
    */
  var targetDateTime: Date
}

object MoreButtonClickedEventArgs {
  @scala.inline
  def apply(
    handled: Boolean,
    interval: ASPxClientTimeInterval,
    processOnServer: Boolean,
    resource: String,
    targetDateTime: Date
  ): MoreButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, interval = interval, processOnServer = processOnServer, resource = resource, targetDateTime = targetDateTime)
  
    __obj.asInstanceOf[MoreButtonClickedEventArgs]
  }
}

