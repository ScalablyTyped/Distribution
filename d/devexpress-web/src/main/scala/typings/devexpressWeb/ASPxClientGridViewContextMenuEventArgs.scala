package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.ContextMenu event.
  */
trait ASPxClientGridViewContextMenuEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.ContextMenu event.
    */
  var htmlEvent: js.Any
  /**
    * Identifies the grid element being right clicked by the user.
    */
  var index: Double
  /**
    * Gets the currently processed menu object.
    */
  var menu: js.Any
  /**
    * Gets which grid element has been right clicked by the user.
    */
  var objectType: String
  /**
    * Specifies whether a browser context menu should be displayed.
    */
  var showBrowserMenu: Boolean
}

object ASPxClientGridViewContextMenuEventArgs {
  @scala.inline
  def apply(htmlEvent: js.Any, index: Double, menu: js.Any, objectType: String, showBrowserMenu: Boolean): ASPxClientGridViewContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], showBrowserMenu = showBrowserMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewContextMenuEventArgs]
  }
}

