package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewSelectionEventArgs extends ProcessingModeEventArgs {
  val isAllRecordsOnPage: scala.Boolean
  val isChangedOnServer: scala.Boolean
  val isSelected: scala.Boolean
  val visibleIndex: scala.Double
}

object GridViewSelectionEventArgs {
  @scala.inline
  def apply(
    isAllRecordsOnPage: scala.Boolean,
    isChangedOnServer: scala.Boolean,
    isSelected: scala.Boolean,
    processOnServer: scala.Boolean,
    sender: Control,
    visibleIndex: scala.Double
  ): GridViewSelectionEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isAllRecordsOnPage")(isAllRecordsOnPage)
    __obj.updateDynamic("isChangedOnServer")(isChangedOnServer)
    __obj.updateDynamic("isSelected")(isSelected)
    __obj.updateDynamic("processOnServer")(processOnServer)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[GridViewSelectionEventArgs]
  }
}

