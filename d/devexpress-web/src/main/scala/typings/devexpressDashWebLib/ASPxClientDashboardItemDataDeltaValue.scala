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

