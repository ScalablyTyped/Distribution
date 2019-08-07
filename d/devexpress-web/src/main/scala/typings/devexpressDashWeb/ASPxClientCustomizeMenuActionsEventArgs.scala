package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeMenuActions, ASPxClientReportDesigner.PreviewCustomizeMenuActions and ASPxClientWebDocumentViewer.CustomizeMenuActions.
  */
@JSGlobal("ASPxClientCustomizeMenuActionsEventArgs")
@js.native
class ASPxClientCustomizeMenuActionsEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCustomizeMenuActionsEventArgs class with the specified settings.
    * @param actions An array of IAction objects. This array is assigned to the ASPxClientCustomizeMenuActionsEventArgs.Actions property.
    */
  def this(actions: js.Array[ASPxClientMenuAction]) = this()
  /**
    * Provides access to the collection of actions available in the toolbar and menu.
    */
  var Actions: js.Array[ASPxClientMenuAction] = js.native
  /**
    * Returns a menu action with the specified ID. An IAction object.
    * @param actionId A String value that specifies the action ID.
    */
  def GetById(actionId: String): ASPxClientMenuAction = js.native
}

