package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeMenuActions, ASPxClientReportDesigner.PreviewCustomizeMenuActions and ASPxClientWebDocumentViewer.CustomizeMenuActions.
  */
trait ASPxClientCustomizeMenuActionsEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the collection of actions available in the toolbar and menu.
    */
  var Actions: js.Array[ASPxClientMenuAction]
  /**
    * Returns a menu action with the specified ID. An IAction object.
    * @param actionId A String value that specifies the action ID.
    */
  def GetById(actionId: String): ASPxClientMenuAction
}

object ASPxClientCustomizeMenuActionsEventArgs {
  @scala.inline
  def apply(Actions: js.Array[ASPxClientMenuAction], GetById: String => ASPxClientMenuAction): ASPxClientCustomizeMenuActionsEventArgs = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], GetById = js.Any.fromFunction1(GetById))
    __obj.asInstanceOf[ASPxClientCustomizeMenuActionsEventArgs]
  }
}

