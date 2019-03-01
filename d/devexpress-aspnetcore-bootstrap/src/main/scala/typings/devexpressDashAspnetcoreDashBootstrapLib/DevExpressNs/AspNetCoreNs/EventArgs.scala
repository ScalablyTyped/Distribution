package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventArgs extends js.Object {
  val sender: Control
}

object EventArgs {
  @scala.inline
  def apply(sender: Control): EventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[EventArgs]
  }
}

