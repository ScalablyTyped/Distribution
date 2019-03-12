package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides delta element values.
  */
trait ASPxClientDashboardItemDataDeltaValue extends js.Object {
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
}

