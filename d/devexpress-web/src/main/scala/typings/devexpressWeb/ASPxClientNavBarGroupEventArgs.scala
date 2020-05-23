package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on groups.
  */
trait ASPxClientNavBarGroupEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the group object related to the event.
    */
  var group: ASPxClientNavBarGroup
}

object ASPxClientNavBarGroupEventArgs {
  @scala.inline
  def apply(group: ASPxClientNavBarGroup): ASPxClientNavBarGroupEventArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarGroupEventArgs]
  }
}

