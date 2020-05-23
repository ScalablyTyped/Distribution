package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemCaptionToolbarUpdated event.
  */
trait ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a component name of the dashboard item.
    */
  var ItemName: String
  /**
    * Provides access to caption options of the dashboard item.
    */
  var Options: js.Any
}

object ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs {
  @scala.inline
  def apply(ItemName: String, Options: js.Any): ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs]
  }
}

