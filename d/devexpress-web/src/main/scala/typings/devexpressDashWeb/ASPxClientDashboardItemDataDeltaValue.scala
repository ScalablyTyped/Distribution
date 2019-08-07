package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides delta element values.
  */
@JSGlobal("ASPxClientDashboardItemDataDeltaValue")
@js.native
class ASPxClientDashboardItemDataDeltaValue () extends js.Object {
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

