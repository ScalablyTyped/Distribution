package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides delta element values.
  */
@js.native
trait ASPxClientDashboardItemDataDeltaValue extends js.Object {
  
  /**
    * Provides access to the absolute difference between the actual and target values.
    */
  def GetAbsoluteVariation(): ASPxClientDashboardItemDataMeasureValue = js.native
  
  /**
    * Provides access to the actual value displayed within the delta element.
    */
  def GetActualValue(): ASPxClientDashboardItemDataMeasureValue = js.native
  
  /**
    * Provides access to the first additional delta value.
    */
  def GetDisplaySubValue1(): ASPxClientDashboardItemDataMeasureValue = js.native
  
  /**
    * Provides access to the second additional delta value.
    */
  def GetDisplaySubValue2(): ASPxClientDashboardItemDataMeasureValue = js.native
  
  /**
    * Provides access to the main delta value.
    */
  def GetDisplayValue(): ASPxClientDashboardItemDataMeasureValue = js.native
  
  /**
    * Gets the type of delta indicator.
    */
  def GetIndicatorType(): ASPxClientDashboardItemDataMeasureValue = js.native
  
  /**
    * Gets the value specifying the condition for displaying the delta indication.
    */
  def GetIsGood(): ASPxClientDashboardItemDataMeasureValue = js.native
  
  /**
    * Provides access to the percentage of the actual value in the target value.
    */
  def GetPercentOfTarget(): ASPxClientDashboardItemDataMeasureValue = js.native
  
  /**
    * Provides access to the percent of variation between the actual and target values.
    */
  def GetPercentVariation(): ASPxClientDashboardItemDataMeasureValue = js.native
  
  /**
    * Provides access to the target value.
    */
  def GetTargetValue(): ASPxClientDashboardItemDataMeasureValue = js.native
}
object ASPxClientDashboardItemDataDeltaValue {
  
  @scala.inline
  def apply(
    GetAbsoluteVariation: () => ASPxClientDashboardItemDataMeasureValue,
    GetActualValue: () => ASPxClientDashboardItemDataMeasureValue,
    GetDisplaySubValue1: () => ASPxClientDashboardItemDataMeasureValue,
    GetDisplaySubValue2: () => ASPxClientDashboardItemDataMeasureValue,
    GetDisplayValue: () => ASPxClientDashboardItemDataMeasureValue,
    GetIndicatorType: () => ASPxClientDashboardItemDataMeasureValue,
    GetIsGood: () => ASPxClientDashboardItemDataMeasureValue,
    GetPercentOfTarget: () => ASPxClientDashboardItemDataMeasureValue,
    GetPercentVariation: () => ASPxClientDashboardItemDataMeasureValue,
    GetTargetValue: () => ASPxClientDashboardItemDataMeasureValue
  ): ASPxClientDashboardItemDataDeltaValue = {
    val __obj = js.Dynamic.literal(GetAbsoluteVariation = js.Any.fromFunction0(GetAbsoluteVariation), GetActualValue = js.Any.fromFunction0(GetActualValue), GetDisplaySubValue1 = js.Any.fromFunction0(GetDisplaySubValue1), GetDisplaySubValue2 = js.Any.fromFunction0(GetDisplaySubValue2), GetDisplayValue = js.Any.fromFunction0(GetDisplayValue), GetIndicatorType = js.Any.fromFunction0(GetIndicatorType), GetIsGood = js.Any.fromFunction0(GetIsGood), GetPercentOfTarget = js.Any.fromFunction0(GetPercentOfTarget), GetPercentVariation = js.Any.fromFunction0(GetPercentVariation), GetTargetValue = js.Any.fromFunction0(GetTargetValue))
    __obj.asInstanceOf[ASPxClientDashboardItemDataDeltaValue]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemDataDeltaValueOps[Self <: ASPxClientDashboardItemDataDeltaValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAbsoluteVariation(value: () => ASPxClientDashboardItemDataMeasureValue): Self = this.set("GetAbsoluteVariation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActualValue(value: () => ASPxClientDashboardItemDataMeasureValue): Self = this.set("GetActualValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplaySubValue1(value: () => ASPxClientDashboardItemDataMeasureValue): Self = this.set("GetDisplaySubValue1", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplaySubValue2(value: () => ASPxClientDashboardItemDataMeasureValue): Self = this.set("GetDisplaySubValue2", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayValue(value: () => ASPxClientDashboardItemDataMeasureValue): Self = this.set("GetDisplayValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndicatorType(value: () => ASPxClientDashboardItemDataMeasureValue): Self = this.set("GetIndicatorType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsGood(value: () => ASPxClientDashboardItemDataMeasureValue): Self = this.set("GetIsGood", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPercentOfTarget(value: () => ASPxClientDashboardItemDataMeasureValue): Self = this.set("GetPercentOfTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPercentVariation(value: () => ASPxClientDashboardItemDataMeasureValue): Self = this.set("GetPercentVariation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetValue(value: () => ASPxClientDashboardItemDataMeasureValue): Self = this.set("GetTargetValue", js.Any.fromFunction0(value))
  }
}
