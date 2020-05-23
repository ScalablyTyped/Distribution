package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditSummaryDisplayText event.
  */
@JSGlobal("ASPxClientGridBatchEditSummaryDisplayTextEventArgs")
@js.native
class ASPxClientGridBatchEditSummaryDisplayTextEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGridBatchEditSummaryDisplayTextEventArgs {
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
  /* CompleteClass */
  override var displayText: String = js.native
  /**
    * Specifies the group row's visible index.
    */
  /* CompleteClass */
  override var groupRowVisibleIndex: Double = js.native
  /**
    * Specifies whether the processed summary is a group summary.
    */
  /* CompleteClass */
  override var isGroupSummary: Boolean = js.native
  /**
    * Specifies whether the processed summary is a total summary.
    */
  /* CompleteClass */
  override var isTotalSummary: Boolean = js.native
  /**
    * Gets the summary item's server value.
    */
  /* CompleteClass */
  override var serverValue: Double = js.native
  /**
    * Gets the element that contains the summary item.
    */
  /* CompleteClass */
  override var summaryElement: js.Any = js.native
  /**
    * Gets the summary item's field name.
    */
  /* CompleteClass */
  override var summaryFieldName: String = js.native
  /**
    * Gets the summary item index.
    */
  /* CompleteClass */
  override var summaryItemIndex: Double = js.native
  /**
    * Gets the summary type.
    */
  /* CompleteClass */
  override var summaryType: typings.devexpressWeb.ASPxClientSummaryItemType = js.native
  /**
    * Specifies the summary item's value.
    */
  /* CompleteClass */
  override var value: Double = js.native
}

