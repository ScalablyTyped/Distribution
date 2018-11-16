package typings
package devexpressDashWebLib

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
  var ItemName: java.lang.String
  /**
       * Returns whether or not the specified value is null.
       * @param value The specified value.
       */
  def IsNullValue(value: js.Object): scala.Boolean
  /**
       * Returns whether or not the specified value is 'others'.
       * @param value The specified value.
       */
  def IsOthersValue(value: js.Object): scala.Boolean
}

