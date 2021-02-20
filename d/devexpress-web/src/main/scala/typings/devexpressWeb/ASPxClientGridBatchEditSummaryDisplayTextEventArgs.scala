package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the BatchEditSummaryDisplayText event.
  */
@js.native
trait ASPxClientGridBatchEditSummaryDisplayTextEventArgs extends ASPxClientEventArgs {
  
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
  
  @scala.inline
  implicit class ASPxClientGridBatchEditSummaryDisplayTextEventArgsMutableBuilder[Self <: ASPxClientGridBatchEditSummaryDisplayTextEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupRowVisibleIndex(value: Double): Self = StObject.set(x, "groupRowVisibleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroupSummary(value: Boolean): Self = StObject.set(x, "isGroupSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTotalSummary(value: Boolean): Self = StObject.set(x, "isTotalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerValue(value: Double): Self = StObject.set(x, "serverValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryElement(value: js.Any): Self = StObject.set(x, "summaryElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryFieldName(value: String): Self = StObject.set(x, "summaryFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryItemIndex(value: Double): Self = StObject.set(x, "summaryItemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryType(value: ASPxClientSummaryItemType): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
