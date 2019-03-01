package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEditItemFilteringEventArgs extends EventArgs {
  val filter: java.lang.String
  var isFit: scala.Boolean
  val item: BootstrapListBoxItem
}

object ListEditItemFilteringEventArgs {
  @scala.inline
  def apply(filter: java.lang.String, isFit: scala.Boolean, item: BootstrapListBoxItem, sender: Control): ListEditItemFilteringEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("isFit")(isFit)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[ListEditItemFilteringEventArgs]
  }
}

