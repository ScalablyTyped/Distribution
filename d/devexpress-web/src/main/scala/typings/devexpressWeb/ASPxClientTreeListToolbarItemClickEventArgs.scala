package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxTreeList.ToolbarItemClick event.
  */
trait ASPxClientTreeListToolbarItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the clicked menu item
    */
  var item: ASPxClientMenuItem
  /**
    * Gets the toolbar index related to the event.
    */
  var toolbarIndex: Double
  /**
    * Gets the toolbar name.
    */
  var toolbarName: String
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    */
  var usePostBack: Boolean
}

object ASPxClientTreeListToolbarItemClickEventArgs {
  @scala.inline
  def apply(
    item: ASPxClientMenuItem,
    processOnServer: Boolean,
    toolbarIndex: Double,
    toolbarName: String,
    usePostBack: Boolean
  ): ASPxClientTreeListToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], toolbarIndex = toolbarIndex.asInstanceOf[js.Any], toolbarName = toolbarName.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListToolbarItemClickEventArgs]
  }
}

