package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the BatchEditSummaryDisplayText event.
  */
@JSGlobal("ASPxClientGridBatchEditSummaryDisplayTextEventArgs")
@js.native
open class ASPxClientGridBatchEditSummaryDisplayTextEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridBatchEditSummaryDisplayTextEventArgs {
  /**
    * Initializes a new instance of the class.
    * @param summaryInfo The summary information.
    * @param text The summary text.
    * @param groupRowVisibleIndex The group row's visible index.
    */
  def this(summaryInfo: Any, text: String, groupRowVisibleIndex: Double) = this()
  
  /**
    * Gets or sets the summary item's display text.
    */
  /* CompleteClass */
  var displayText: String = js.native
  
  /**
    * Specifies the group row's visible index.
    */
  /* CompleteClass */
  var groupRowVisibleIndex: Double = js.native
  
  /**
    * Specifies whether the processed summary is a group summary.
    */
  /* CompleteClass */
  var isGroupSummary: Boolean = js.native
  
  /**
    * Specifies whether the processed summary is a total summary.
    */
  /* CompleteClass */
  var isTotalSummary: Boolean = js.native
  
  /**
    * Gets the summary item's server value.
    */
  /* CompleteClass */
  var serverValue: Double = js.native
  
  /**
    * Gets the element that contains the summary item.
    */
  /* CompleteClass */
  var summaryElement: Any = js.native
  
  /**
    * Gets the summary item's field name.
    */
  /* CompleteClass */
  var summaryFieldName: String = js.native
  
  /**
    * Gets the summary item index.
    */
  /* CompleteClass */
  var summaryItemIndex: Double = js.native
  
  /**
    * Gets the summary type.
    */
  /* CompleteClass */
  var summaryType: typings.devexpressWeb.ASPxClientSummaryItemType = js.native
  
  /**
    * Specifies the summary item's value.
    */
  /* CompleteClass */
  var value: Double = js.native
}
