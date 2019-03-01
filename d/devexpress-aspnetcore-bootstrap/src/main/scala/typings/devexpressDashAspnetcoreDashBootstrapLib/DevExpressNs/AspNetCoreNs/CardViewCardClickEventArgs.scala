package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewCardClickEventArgs extends CancelEventArgs {
  val htmlEvent: js.Any
  val visibleIndex: scala.Double
}

object CardViewCardClickEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, htmlEvent: js.Any, sender: Control, visibleIndex: scala.Double): CardViewCardClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[CardViewCardClickEventArgs]
  }
}

