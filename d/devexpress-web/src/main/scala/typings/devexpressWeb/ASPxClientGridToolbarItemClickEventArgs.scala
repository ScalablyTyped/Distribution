package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridBase.ToolbarItemClick event.
  */
trait ASPxClientGridToolbarItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the clicked menu item
    */
  var item: ASPxClientMenuItem
  /**
    * Gets the toolbar index.
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

object ASPxClientGridToolbarItemClickEventArgs {
  @scala.inline
  def apply(
    item: ASPxClientMenuItem,
    processOnServer: Boolean,
    toolbarIndex: Double,
    toolbarName: String,
    usePostBack: Boolean
  ): ASPxClientGridToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], toolbarIndex = toolbarIndex.asInstanceOf[js.Any], toolbarName = toolbarName.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridToolbarItemClickEventArgs]
  }
}

