package typings
package devexpressDashWebLib

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
  var ItemName: java.lang.String
}

object ASPxClientActionAvailabilityChangedEventArgs {
  @scala.inline
  def apply(ItemName: java.lang.String): ASPxClientActionAvailabilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName)
  
    __obj.asInstanceOf[ASPxClientActionAvailabilityChangedEventArgs]
  }
}

