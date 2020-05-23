package typings.devexpressWeb

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
  def GetDisplayText(): String
  /**
    * Gets the unique value for the current dimension value.
    */
  def GetUniqueValue(): js.Any
  /**
    * Gets the current dimension value.
    */
  def GetValue(): js.Any
}

object ASPxClientDashboardItemDataDimensionValue {
  @scala.inline
  def apply(GetDisplayText: () => String, GetUniqueValue: () => js.Any, GetValue: () => js.Any): ASPxClientDashboardItemDataDimensionValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetUniqueValue = js.Any.fromFunction0(GetUniqueValue), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[ASPxClientDashboardItemDataDimensionValue]
  }
}

