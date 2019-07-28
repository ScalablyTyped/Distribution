package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base class for classes that provide data for client-side events related to dashboard items.
  */
trait ASPxClientDashboardItemEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item.
    * Value: A string value that is the component name of the dashboard item.
    */
  var ItemName: String
  /**
    * Returns whether or not the specified value is null.
    * @param value The specified value.
    */
  def IsNullValue(value: js.Object): Boolean
  /**
    * Returns whether or not the specified value is 'others'.
    * @param value The specified value.
    */
  def IsOthersValue(value: js.Object): Boolean
}

object ASPxClientDashboardItemEventArgs {
  @scala.inline
  def apply(IsNullValue: js.Object => Boolean, IsOthersValue: js.Object => Boolean, ItemName: String): ASPxClientDashboardItemEventArgs = {
    val __obj = js.Dynamic.literal(IsNullValue = js.Any.fromFunction1(IsNullValue), IsOthersValue = js.Any.fromFunction1(IsOthersValue), ItemName = ItemName)
  
    __obj.asInstanceOf[ASPxClientDashboardItemEventArgs]
  }
}

