package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client ASPxGridView.
  */
@JSGlobal("ASPxClientGridBase")
@js.native
class ASPxClientGridBase () extends ASPxClientControl {
  /**
    * Fires when a user changes the summary item value.
    */
  var BatchEditSummaryDisplayText: ASPxClientEvent[ASPxClientGridBatchEditSummaryDisplayTextEventHandler[ASPxClientGridBase]] = js.native
  /**
    * Fires after a toolbar item has been clicked.
    */
  var ToolbarItemClick: ASPxClientEvent[ASPxClientGridToolbarItemClickEventHandler[ASPxClientGridBase]] = js.native
  /**
    * Returns a grid's toolbar specified by its index. An ASPxClientMenu object that is the toolbar located at the specified index within the control's Toolbars collection.
    * @param index An integer value specifying the zero-based index of the toolbar object to retrieve.
    */
  def GetToolbar(index: Double): ASPxClientMenu = js.native
  /**
    * Returns a toolbar specified by its name. An ASPxClientMenu object that is the toolbar with the specified name.
    * @param name A string value specifying the toolbar name.
    */
  def GetToolbarByName(name: String): ASPxClientMenu = js.native
}

