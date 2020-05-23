package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ActionAvailabilityChanged event.
  */
trait ASPxClientActionAvailabilityChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item.
    */
  var ItemName: String
}

object ASPxClientActionAvailabilityChangedEventArgs {
  @scala.inline
  def apply(ItemName: String): ASPxClientActionAvailabilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientActionAvailabilityChangedEventArgs]
  }
}

