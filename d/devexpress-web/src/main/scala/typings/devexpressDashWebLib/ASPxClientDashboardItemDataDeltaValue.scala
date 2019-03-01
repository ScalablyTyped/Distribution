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
    GetAbsoluteVariation: js.Function0[ASPxClientDashboardItemDataMeasureValue],
    GetActualValue: js.Function0[ASPxClientDashboardItemDataMeasureValue],
    GetDisplaySubValue1: js.Function0[ASPxClientDashboardItemDataMeasureValue],
    GetDisplaySubValue2: js.Function0[ASPxClientDashboardItemDataMeasureValue],
    GetDisplayValue: js.Function0[ASPxClientDashboardItemDataMeasureValue],
    GetIndicatorType: js.Function0[ASPxClientDashboardItemDataMeasureValue],
    GetIsGood: js.Function0[ASPxClientDashboardItemDataMeasureValue],
    GetPercentOfTarget: js.Function0[ASPxClientDashboardItemDataMeasureValue],
    GetPercentVariation: js.Function0[ASPxClientDashboardItemDataMeasureValue],
    GetTargetValue: js.Function0[ASPxClientDashboardItemDataMeasureValue]
  ): ASPxClientDashboardItemDataDeltaValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetAbsoluteVariation")(GetAbsoluteVariation)
    __obj.updateDynamic("GetActualValue")(GetActualValue)
    __obj.updateDynamic("GetDisplaySubValue1")(GetDisplaySubValue1)
    __obj.updateDynamic("GetDisplaySubValue2")(GetDisplaySubValue2)
    __obj.updateDynamic("GetDisplayValue")(GetDisplayValue)
    __obj.updateDynamic("GetIndicatorType")(GetIndicatorType)
    __obj.updateDynamic("GetIsGood")(GetIsGood)
    __obj.updateDynamic("GetPercentOfTarget")(GetPercentOfTarget)
    __obj.updateDynamic("GetPercentVariation")(GetPercentVariation)
    __obj.updateDynamic("GetTargetValue")(GetTargetValue)
    __obj.asInstanceOf[ASPxClientDashboardItemDataDeltaValue]
  }
}

