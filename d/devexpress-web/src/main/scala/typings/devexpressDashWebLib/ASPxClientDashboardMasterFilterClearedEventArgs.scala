package typings
package devexpressDashWebLib

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
  var ItemName: java.lang.String
}

object ASPxClientDashboardMasterFilterClearedEventArgs {
  @scala.inline
  def apply(ItemName: java.lang.String): ASPxClientDashboardMasterFilterClearedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ItemName")(ItemName)
    __obj.asInstanceOf[ASPxClientDashboardMasterFilterClearedEventArgs]
  }
}

