package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemEndUpdate event.
  */
trait ASPxClientItemEndUpdateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item.
    */
  var ItemName: String
}

object ASPxClientItemEndUpdateEventArgs {
  @scala.inline
  def apply(ItemName: String): ASPxClientItemEndUpdateEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientItemEndUpdateEventArgs]
  }
}

