package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemBeginUpdate event.
  */
trait ASPxClientItemBeginUpdateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item.
    * Value: A string value that is the component name of the dashboard item.
    */
  var ItemName: String
}

object ASPxClientItemBeginUpdateEventArgs {
  @scala.inline
  def apply(ItemName: String): ASPxClientItemBeginUpdateEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName)
  
    __obj.asInstanceOf[ASPxClientItemBeginUpdateEventArgs]
  }
}

