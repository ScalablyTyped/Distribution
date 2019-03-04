package typings
package devexpressDashWebLib

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
  var handled: scala.Boolean
  /**
    * Gets the time interval of the cell where the button is located.
    * Value: An ASPxClientTimeInterval object representing the time interval of the cell which holds the button.
    */
  var interval: ASPxClientTimeInterval
  /**
    * Gets the resource identifier associated with the cell where the button is located.
    * Value: A string, corresponding to ResourceId.
    */
  var resource: java.lang.String
  /**
    * Gets the Start or End values of the target appointment.
    * Value: A DateTime value representing the target appointment's boundary.
    */
  var targetDateTime: stdLib.Date
}

object MoreButtonClickedEventArgs {
  @scala.inline
  def apply(
    handled: scala.Boolean,
    interval: ASPxClientTimeInterval,
    processOnServer: scala.Boolean,
    resource: java.lang.String,
    targetDateTime: stdLib.Date
  ): MoreButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, interval = interval, processOnServer = processOnServer, resource = resource, targetDateTime = targetDateTime)
  
    __obj.asInstanceOf[MoreButtonClickedEventArgs]
  }
}

