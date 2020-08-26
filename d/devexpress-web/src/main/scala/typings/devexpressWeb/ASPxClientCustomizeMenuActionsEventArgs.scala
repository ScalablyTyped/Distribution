package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeMenuActions, ASPxClientReportDesigner.PreviewCustomizeMenuActions and ASPxClientWebDocumentViewer.CustomizeMenuActions.
  */
@js.native
trait ASPxClientCustomizeMenuActionsEventArgs extends ASPxClientEventArgs {
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

object ASPxClientCustomizeMenuActionsEventArgs {
  @scala.inline
  def apply(Actions: js.Array[ASPxClientMenuAction], GetById: String => ASPxClientMenuAction): ASPxClientCustomizeMenuActionsEventArgs = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], GetById = js.Any.fromFunction1(GetById))
    __obj.asInstanceOf[ASPxClientCustomizeMenuActionsEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCustomizeMenuActionsEventArgsOps[Self <: ASPxClientCustomizeMenuActionsEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: ASPxClientMenuAction*): Self = this.set("Actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[ASPxClientMenuAction]): Self = this.set("Actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetById(value: String => ASPxClientMenuAction): Self = this.set("GetById", js.Any.fromFunction1(value))
  }
  
}

