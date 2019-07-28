package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ActionAvailabilityChanged event.
  */
trait ASPxClientActionAvailabilityChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item.
    * Value: A string value that is the component name of the dashboard item.
    */
  var ItemName: String
}

object ASPxClientActionAvailabilityChangedEventArgs {
  @scala.inline
  def apply(ItemName: String): ASPxClientActionAvailabilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName)
  
    __obj.asInstanceOf[ASPxClientActionAvailabilityChangedEventArgs]
  }
}

