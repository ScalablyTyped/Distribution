package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DrillUpPerformed event.
  */
trait ASPxClientDashboardDrillUpPerformedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the dashboard item.
    * Value: A string that is the name of the dashboard item.
    */
  var ItemName: java.lang.String
}

object ASPxClientDashboardDrillUpPerformedEventArgs {
  @scala.inline
  def apply(ItemName: java.lang.String): ASPxClientDashboardDrillUpPerformedEventArgs = {
    val __obj = js.Dynamic.literal(ItemName = ItemName)
  
    __obj.asInstanceOf[ASPxClientDashboardDrillUpPerformedEventArgs]
  }
}

