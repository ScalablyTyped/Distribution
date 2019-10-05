package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewSelectionEventArgs extends ProcessingModeEventArgs {
  val isAllRecordsOnPage: Boolean
  val isChangedOnServer: Boolean
  val isSelected: Boolean
  val visibleIndex: Double
}

object GridViewSelectionEventArgs {
  @scala.inline
  def apply(
    isAllRecordsOnPage: Boolean,
    isChangedOnServer: Boolean,
    isSelected: Boolean,
    processOnServer: Boolean,
    sender: Control,
    visibleIndex: Double
  ): GridViewSelectionEventArgs = {
    val __obj = js.Dynamic.literal(isAllRecordsOnPage = isAllRecordsOnPage, isChangedOnServer = isChangedOnServer, isSelected = isSelected, processOnServer = processOnServer, sender = sender, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[GridViewSelectionEventArgs]
  }
}

