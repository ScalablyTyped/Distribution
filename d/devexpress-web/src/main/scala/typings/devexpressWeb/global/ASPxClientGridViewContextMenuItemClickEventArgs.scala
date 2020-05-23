package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.ContextMenuItemClick event.
  */
@JSGlobal("ASPxClientGridViewContextMenuItemClickEventArgs")
@js.native
class ASPxClientGridViewContextMenuItemClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientGridViewContextMenuItemClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewContextMenuItemClickEventArgs class with the specified settings.
    * @param item An ASPxClientMenuItem object specifying an item that has been right clicked by the user.
    * @param objectType A string specifying a grid element that has been right clicked by the user.
    * @param elementIndex A zero-based integer index that identifies the grid element being right clicked by the user.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(
    item: typings.devexpressWeb.ASPxClientMenuItem,
    objectType: String,
    elementIndex: Double,
    processOnServer: Boolean
  ) = this()
  /**
    * Returns the processed element index.
    */
  /* CompleteClass */
  override var elementIndex: Double = js.native
  /**
    * Specifies whether default context menu item click is handled manually, so no default processing is required.
    */
  /* CompleteClass */
  override var handled: Boolean = js.native
  /**
    * Gets the clicked context menu item.
    */
  /* CompleteClass */
  override var item: typings.devexpressWeb.ASPxClientMenuItem = js.native
  /**
    * Gets which grid element has been right clicked by the user.
    */
  /* CompleteClass */
  override var objectType: String = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    */
  /* CompleteClass */
  override var usePostBack: Boolean = js.native
}

