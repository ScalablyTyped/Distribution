package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoreButtonClickedEventArgs extends ProcessingModeEventArgs {
  var handled: Boolean
  val interval: BootstrapTimeInterval
  val resource: String
  val targetDateTime: Date
}

object MoreButtonClickedEventArgs {
  @scala.inline
  def apply(
    handled: Boolean,
    interval: BootstrapTimeInterval,
    processOnServer: Boolean,
    resource: String,
    sender: Control,
    targetDateTime: Date
  ): MoreButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, interval = interval, processOnServer = processOnServer, resource = resource, sender = sender, targetDateTime = targetDateTime)
  
    __obj.asInstanceOf[MoreButtonClickedEventArgs]
  }
}

