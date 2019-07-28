package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemEndUpdate event.
  */
trait ASPxClientItemEndUpdateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item.
    * Value: A string value that is the component name of the dashboard item.
    */
  var ItemName: String
}

object ASPxClientItemEndUpdateEventArgs {
  @scala.inline
  def apply(ItemName: String): ASPxClientItemEndUpdateEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName)
  
    __obj.asInstanceOf[ASPxClientItemEndUpdateEventArgs]
  }
}

