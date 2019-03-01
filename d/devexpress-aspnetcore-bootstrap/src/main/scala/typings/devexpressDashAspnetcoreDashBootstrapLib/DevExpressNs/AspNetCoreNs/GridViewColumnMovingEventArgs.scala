package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewColumnMovingEventArgs extends EventArgs {
  var allow: scala.Boolean
  val destinationColumn: BootstrapGridViewColumn
  val isDropBefore: scala.Boolean
  val isGroupPanel: scala.Boolean
  val sourceColumn: BootstrapGridViewColumn
}

object GridViewColumnMovingEventArgs {
  @scala.inline
  def apply(
    allow: scala.Boolean,
    destinationColumn: BootstrapGridViewColumn,
    isDropBefore: scala.Boolean,
    isGroupPanel: scala.Boolean,
    sender: Control,
    sourceColumn: BootstrapGridViewColumn
  ): GridViewColumnMovingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allow")(allow)
    __obj.updateDynamic("destinationColumn")(destinationColumn)
    __obj.updateDynamic("isDropBefore")(isDropBefore)
    __obj.updateDynamic("isGroupPanel")(isGroupPanel)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("sourceColumn")(sourceColumn)
    __obj.asInstanceOf[GridViewColumnMovingEventArgs]
  }
}

