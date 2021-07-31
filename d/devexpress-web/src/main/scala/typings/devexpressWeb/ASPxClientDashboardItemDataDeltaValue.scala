package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides delta element values.
  */
trait ASPxClientDashboardItemDataDeltaValue extends StObject {
  
  /**
    * Provides access to the absolute difference between the actual and target values.
    */
  def GetAbsoluteVariation(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the actual value displayed within the delta element.
    */
  def GetActualValue(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the first additional delta value.
    */
  def GetDisplaySubValue1(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the second additional delta value.
    */
  def GetDisplaySubValue2(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the main delta value.
    */
  def GetDisplayValue(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Gets the type of delta indicator.
    */
  def GetIndicatorType(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Gets the value specifying the condition for displaying the delta indication.
    */
  def GetIsGood(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the percentage of the actual value in the target value.
    */
  def GetPercentOfTarget(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the percent of variation between the actual and target values.
    */
  def GetPercentVariation(): ASPxClientDashboardItemDataMeasureValue
  
  /**
    * Provides access to the target value.
    */
  def GetTargetValue(): ASPxClientDashboardItemDataMeasureValue
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
  implicit class ASPxClientDashboardItemDataDeltaValueMutableBuilder[Self <: ASPxClientDashboardItemDataDeltaValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAbsoluteVariation(value: () => ASPxClientDashboardItemDataMeasureValue): Self = StObject.set(x, "GetAbsoluteVariation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActualValue(value: () => ASPxClientDashboardItemDataMeasureValue): Self = StObject.set(x, "GetActualValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplaySubValue1(value: () => ASPxClientDashboardItemDataMeasureValue): Self = StObject.set(x, "GetDisplaySubValue1", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplaySubValue2(value: () => ASPxClientDashboardItemDataMeasureValue): Self = StObject.set(x, "GetDisplaySubValue2", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayValue(value: () => ASPxClientDashboardItemDataMeasureValue): Self = StObject.set(x, "GetDisplayValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndicatorType(value: () => ASPxClientDashboardItemDataMeasureValue): Self = StObject.set(x, "GetIndicatorType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsGood(value: () => ASPxClientDashboardItemDataMeasureValue): Self = StObject.set(x, "GetIsGood", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPercentOfTarget(value: () => ASPxClientDashboardItemDataMeasureValue): Self = StObject.set(x, "GetPercentOfTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPercentVariation(value: () => ASPxClientDashboardItemDataMeasureValue): Self = StObject.set(x, "GetPercentVariation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetValue(value: () => ASPxClientDashboardItemDataMeasureValue): Self = StObject.set(x, "GetTargetValue", js.Any.fromFunction0(value))
  }
}
