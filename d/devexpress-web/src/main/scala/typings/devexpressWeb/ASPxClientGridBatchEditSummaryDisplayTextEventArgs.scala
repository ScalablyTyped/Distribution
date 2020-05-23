package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditSummaryDisplayText event.
  */
trait ASPxClientGridBatchEditSummaryDisplayTextEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets the summary item's display text.
    */
  var displayText: String
  /**
    * Specifies the group row's visible index.
    */
  var groupRowVisibleIndex: Double
  /**
    * Specifies whether the processed summary is a group summary.
    */
  var isGroupSummary: Boolean
  /**
    * Specifies whether the processed summary is a total summary.
    */
  var isTotalSummary: Boolean
  /**
    * Gets the summary item's server value.
    */
  var serverValue: Double
  /**
    * Gets the element that contains the summary item.
    */
  var summaryElement: js.Any
  /**
    * Gets the summary item's field name.
    */
  var summaryFieldName: String
  /**
    * Gets the summary item index.
    */
  var summaryItemIndex: Double
  /**
    * Gets the summary type.
    */
  var summaryType: ASPxClientSummaryItemType
  /**
    * Specifies the summary item's value.
    */
  var value: Double
}

object ASPxClientGridBatchEditSummaryDisplayTextEventArgs {
  @scala.inline
  def apply(
    displayText: String,
    groupRowVisibleIndex: Double,
    isGroupSummary: Boolean,
    isTotalSummary: Boolean,
    serverValue: Double,
    summaryElement: js.Any,
    summaryFieldName: String,
    summaryItemIndex: Double,
    summaryType: ASPxClientSummaryItemType,
    value: Double
  ): ASPxClientGridBatchEditSummaryDisplayTextEventArgs = {
    val __obj = js.Dynamic.literal(displayText = displayText.asInstanceOf[js.Any], groupRowVisibleIndex = groupRowVisibleIndex.asInstanceOf[js.Any], isGroupSummary = isGroupSummary.asInstanceOf[js.Any], isTotalSummary = isTotalSummary.asInstanceOf[js.Any], serverValue = serverValue.asInstanceOf[js.Any], summaryElement = summaryElement.asInstanceOf[js.Any], summaryFieldName = summaryFieldName.asInstanceOf[js.Any], summaryItemIndex = summaryItemIndex.asInstanceOf[js.Any], summaryType = summaryType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridBatchEditSummaryDisplayTextEventArgs]
  }
}

