package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditSummaryDisplayText event.
  */
@JSGlobal("ASPxClientGridBatchEditSummaryDisplayTextEventArgs")
@js.native
class ASPxClientGridBatchEditSummaryDisplayTextEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the class.
    * @param summaryInfo The summary information.
    * @param text The summary text.
    * @param groupRowVisibleIndex The group row's visible index.
    */
  def this(summaryInfo: js.Any, text: String, groupRowVisibleIndex: Double) = this()
  /**
    * Gets or sets the summary item's display text.
    */
  var displayText: String = js.native
  /**
    * Specifies the group row's visible index.
    */
  var groupRowVisibleIndex: Double = js.native
  /**
    * Specifies whether the processed summary is a group summary.
    */
  var isGroupSummary: Boolean = js.native
  /**
    * Specifies whether the processed summary is a total summary.
    */
  var isTotalSummary: Boolean = js.native
  /**
    * Gets the summary item's server value.
    */
  var serverValue: Double = js.native
  /**
    * Gets the element that contains the summary item.
    */
  var summaryElement: js.Any = js.native
  /**
    * Gets the summary item's field name.
    */
  var summaryFieldName: String = js.native
  /**
    * Gets the summary item index.
    */
  var summaryItemIndex: Double = js.native
  /**
    * Gets the summary type.
    */
  var summaryType: ASPxClientSummaryItemType = js.native
  /**
    * Specifies the summary item's value.
    */
  var value: Double = js.native
}

