package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the client-side ActiveViewChanging event.
 */

trait ActiveViewChangingEventArgs extends ASPxClientEventArgs {
  /**
       * Gets or sets whether the change of active view should be canceled.
       * Value: true to cancel the operation; otherwise, false.
       */
  var cancel: scala.Boolean
  /**
       * Gets the new value of the ActiveView property.
       * Value: A string, which is the SchedulerViewType enumeration value.
       */
  var newView: ASPxSchedulerViewType
  /**
       * Gets the value of the ActiveView property before modification.
       * Value: A SchedulerViewType enumeration.
       */
  var oldView: ASPxSchedulerViewType
}

