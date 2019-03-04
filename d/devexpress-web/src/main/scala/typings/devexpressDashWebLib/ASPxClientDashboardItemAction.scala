package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an interactivity action in the dashboard item.
  */
trait ASPxClientDashboardItemAction extends js.Object {
  /**
    * Gets interactivity actions performed on a dashboard item.
    * Value: An array of ASPxClientDashboardAction values that specify interactivity actions performed on a dashboard item.
    */
  var Actions: js.Array[_]
  /**
    * Gets the name of the dashboard item.
    * Value: A string that specifies the name of the dashboard item.
    */
  var ItemName: java.lang.String
}

object ASPxClientDashboardItemAction {
  @scala.inline
  def apply(Actions: js.Array[_], ItemName: java.lang.String): ASPxClientDashboardItemAction = {
    val __obj = js.Dynamic.literal(Actions = Actions, ItemName = ItemName)
  
    __obj.asInstanceOf[ASPxClientDashboardItemAction]
  }
}

