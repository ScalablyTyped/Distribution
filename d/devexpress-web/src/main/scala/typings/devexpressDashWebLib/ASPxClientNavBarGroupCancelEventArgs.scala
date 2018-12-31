package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for cancellable events which concern manipulations on groups.
  */
trait ASPxClientNavBarGroupCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets the group object related to the event.
    * Value: An ASPxClientNavBarGroup object representing the group manipulations on which forced the navbar to raise the event.
    */
  var group: ASPxClientNavBarGroup
}

