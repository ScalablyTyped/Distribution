package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on groups.
  */
trait ASPxClientNavBarGroupEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the group object related to the event.
    * Value: An ASPxClientNavBarGroup object, manipulations on which forced the event to be raised.
    */
  var group: ASPxClientNavBarGroup
}

object ASPxClientNavBarGroupEventArgs {
  @scala.inline
  def apply(group: ASPxClientNavBarGroup): ASPxClientNavBarGroupEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[ASPxClientNavBarGroupEventArgs]
  }
}

