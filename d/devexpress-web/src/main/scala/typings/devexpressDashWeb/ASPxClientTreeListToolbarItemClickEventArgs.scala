package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ToolbarItemClick event.
  */
trait ASPxClientTreeListToolbarItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the clicked menu item
    * Value: An ASPxClientMenu value that is the menu item.
    */
  var item: ASPxClientMenuItem
  /**
    * Gets the toolbar index related to the event.
    * Value: An integer value that is the toolbar index.
    */
  var toolbarIndex: Double
  /**
    * Gets the toolbar name.
    * Value: A string object that is the toolbar name.
    */
  var toolbarName: String
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    * Value: true to perform the round trip to the server side via postback; false to perform the round trip to the server side via callback.
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
    val __obj = js.Dynamic.literal(item = item, processOnServer = processOnServer, toolbarIndex = toolbarIndex, toolbarName = toolbarName, usePostBack = usePostBack)
  
    __obj.asInstanceOf[ASPxClientTreeListToolbarItemClickEventArgs]
  }
}

