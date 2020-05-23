package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base class for classes that provide data for client-side events related to dashboard items.
  */
trait ASPxClientDashboardItemEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item.
    */
  var ItemName: String
  /**
    * Returns whether the specified value is null. true, if the specified value is null; otherwise, false.
    * @param value The specified value.
    */
  def IsNullValue(value: js.Any): Boolean
  /**
    * Returns whether the specified value is 'others'. true, if the specified value is 'others'; otherwise, false.
    * @param value The specified value.
    */
  def IsOthersValue(value: js.Any): Boolean
}

object ASPxClientDashboardItemEventArgs {
  @scala.inline
  def apply(IsNullValue: js.Any => Boolean, IsOthersValue: js.Any => Boolean, ItemName: String): ASPxClientDashboardItemEventArgs = {
    val __obj = js.Dynamic.literal(IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemEventArgs]
  }
}

