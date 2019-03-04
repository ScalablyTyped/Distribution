package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides dimension values at the specified axis point.
  */
trait ASPxClientDashboardItemDataDimensionValue extends js.Object {
  /**
    * Gets the display text for the current dimension value.
    */
  def GetDisplayText(): java.lang.String
  /**
    * Gets the unique value for the current dimension value.
    */
  def GetUniqueValue(): js.Object
  /**
    * Gets the current dimension value.
    */
  def GetValue(): js.Object
}

object ASPxClientDashboardItemDataDimensionValue {
  @scala.inline
  def apply(
    GetDisplayText: js.Function0[java.lang.String],
    GetUniqueValue: js.Function0[js.Object],
    GetValue: js.Function0[js.Object]
  ): ASPxClientDashboardItemDataDimensionValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = GetDisplayText, GetUniqueValue = GetUniqueValue, GetValue = GetValue)
  
    __obj.asInstanceOf[ASPxClientDashboardItemDataDimensionValue]
  }
}

