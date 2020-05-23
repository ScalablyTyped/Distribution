package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the measure value and display text.
  */
trait ASPxClientDashboardItemDataMeasureValue extends js.Object {
  /**
    * Gets the measure display text.
    */
  def GetDisplayText(): String
  /**
    * Gets the measure value.
    */
  def GetValue(): js.Any
}

object ASPxClientDashboardItemDataMeasureValue {
  @scala.inline
  def apply(GetDisplayText: () => String, GetValue: () => js.Any): ASPxClientDashboardItemDataMeasureValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[ASPxClientDashboardItemDataMeasureValue]
  }
}

