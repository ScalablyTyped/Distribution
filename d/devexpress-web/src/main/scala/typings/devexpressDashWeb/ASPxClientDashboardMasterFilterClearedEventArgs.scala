package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MasterFilterCleared event.
  */
trait ASPxClientDashboardMasterFilterClearedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the dashboard item.
    * Value: A string value that is the component name of the dashboard item.
    */
  var ItemName: String
}

object ASPxClientDashboardMasterFilterClearedEventArgs {
  @scala.inline
  def apply(ItemName: String): ASPxClientDashboardMasterFilterClearedEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName)
  
    __obj.asInstanceOf[ASPxClientDashboardMasterFilterClearedEventArgs]
  }
}

