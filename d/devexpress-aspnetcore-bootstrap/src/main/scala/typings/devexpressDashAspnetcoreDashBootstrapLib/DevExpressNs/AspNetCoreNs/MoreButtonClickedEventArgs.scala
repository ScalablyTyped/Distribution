package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoreButtonClickedEventArgs extends ProcessingModeEventArgs {
  var handled: scala.Boolean
  val interval: BootstrapTimeInterval
  val resource: java.lang.String
  val targetDateTime: stdLib.Date
}

object MoreButtonClickedEventArgs {
  @scala.inline
  def apply(
    handled: scala.Boolean,
    interval: BootstrapTimeInterval,
    processOnServer: scala.Boolean,
    resource: java.lang.String,
    sender: Control,
    targetDateTime: stdLib.Date
  ): MoreButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("targetDateTime")(targetDateTime)
    __obj.asInstanceOf[MoreButtonClickedEventArgs]
  }
}

