package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEditItemSelectedChangedEventArgs extends ProcessingModeEventArgs {
  val index: scala.Double
  val isSelected: scala.Boolean
}

object ListEditItemSelectedChangedEventArgs {
  @scala.inline
  def apply(index: scala.Double, isSelected: scala.Boolean, processOnServer: scala.Boolean, sender: Control): ListEditItemSelectedChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("isSelected")(isSelected)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[ListEditItemSelectedChangedEventArgs]
  }
}

