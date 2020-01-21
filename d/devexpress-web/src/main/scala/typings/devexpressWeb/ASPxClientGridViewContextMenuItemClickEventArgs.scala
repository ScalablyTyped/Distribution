package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.ContextMenuItemClick event.
  */
@JSGlobal("ASPxClientGridViewContextMenuItemClickEventArgs")
@js.native
class ASPxClientGridViewContextMenuItemClickEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewContextMenuItemClickEventArgs class with the specified settings.
    * @param item An ASPxClientMenuItem object specifying an item that has been right clicked by the user.
    * @param objectType A string specifying a grid element that has been right clicked by the user.
    * @param elementIndex A zero-based integer index that identifies the grid element being right clicked by the user.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(item: ASPxClientMenuItem, objectType: String, elementIndex: Double, processOnServer: Boolean) = this()
  /**
    * Returns the processed element index.
    */
  var elementIndex: Double = js.native
  /**
    * Specifies whether default context menu item click is handled manually, so no default processing is required.
    */
  var handled: Boolean = js.native
  /**
    * Gets the clicked context menu item.
    */
  var item: ASPxClientMenuItem = js.native
  /**
    * Gets which grid element has been right clicked by the user.
    */
  var objectType: String = js.native
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    */
  var usePostBack: Boolean = js.native
}

