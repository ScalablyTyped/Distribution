package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.ContextMenuItemClick event.
  */
trait ASPxClientGridViewContextMenuItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Returns the processed element index.
    */
  var elementIndex: Double
  /**
    * Specifies whether default context menu item click is handled manually, so no default processing is required.
    */
  var handled: Boolean
  /**
    * Gets the clicked context menu item.
    */
  var item: ASPxClientMenuItem
  /**
    * Gets which grid element has been right clicked by the user.
    */
  var objectType: String
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    */
  var usePostBack: Boolean
}

object ASPxClientGridViewContextMenuItemClickEventArgs {
  @scala.inline
  def apply(
    elementIndex: Double,
    handled: Boolean,
    item: ASPxClientMenuItem,
    objectType: String,
    processOnServer: Boolean,
    usePostBack: Boolean
  ): ASPxClientGridViewContextMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(elementIndex = elementIndex.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewContextMenuItemClickEventArgs]
  }
}

