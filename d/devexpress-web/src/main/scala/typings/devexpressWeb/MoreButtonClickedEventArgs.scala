package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.MoreButtonClicked client-side event.
  */
@js.native
trait MoreButtonClickedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets or sets whether an event is handled. If it is handled, default actions are not required.
    */
  var handled: Boolean = js.native
  /**
    * Gets the time interval of the cell where the button is located.
    */
  var interval: ASPxClientTimeInterval = js.native
  /**
    * Gets the resource identifier associated with the cell where the button is located.
    */
  var resource: String = js.native
  /**
    * Gets the Start or End values of the target appointment.
    */
  var targetDateTime: Date = js.native
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
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], targetDateTime = targetDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreButtonClickedEventArgs]
  }
  @scala.inline
  implicit class MoreButtonClickedEventArgsOps[Self <: MoreButtonClickedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: ASPxClientTimeInterval): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDateTime(value: Date): Self = this.set("targetDateTime", value.asInstanceOf[js.Any])
  }
  
}

