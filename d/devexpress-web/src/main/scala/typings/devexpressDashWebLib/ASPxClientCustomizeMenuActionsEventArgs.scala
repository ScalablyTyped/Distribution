package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomizeMenuActions.
  */
trait ASPxClientCustomizeMenuActionsEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the collection of actions available in the toolbar and menu.
    * Value: An array of ASPxClientMenuAction objects.
    */
  var Actions: js.Array[ASPxClientMenuAction]
  /**
    * Returns a menu action with the specified ID.
    * @param actionId A String value that specifies the action ID.
    */
  def GetById(actionId: java.lang.String): ASPxClientMenuAction
}

object ASPxClientCustomizeMenuActionsEventArgs {
  @scala.inline
  def apply(
    Actions: js.Array[ASPxClientMenuAction],
    GetById: js.Function1[java.lang.String, ASPxClientMenuAction]
  ): ASPxClientCustomizeMenuActionsEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Actions")(Actions)
    __obj.updateDynamic("GetById")(GetById)
    __obj.asInstanceOf[ASPxClientCustomizeMenuActionsEventArgs]
  }
}

