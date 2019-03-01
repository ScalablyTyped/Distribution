package typings
package devexpressDashWebLib

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
  def GetDisplayText(): java.lang.String
  /**
    * Gets the measure value.
    */
  def GetValue(): js.Object
}

object ASPxClientDashboardItemDataMeasureValue {
  @scala.inline
  def apply(GetDisplayText: js.Function0[java.lang.String], GetValue: js.Function0[js.Object]): ASPxClientDashboardItemDataMeasureValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetDisplayText")(GetDisplayText)
    __obj.updateDynamic("GetValue")(GetValue)
    __obj.asInstanceOf[ASPxClientDashboardItemDataMeasureValue]
  }
}

