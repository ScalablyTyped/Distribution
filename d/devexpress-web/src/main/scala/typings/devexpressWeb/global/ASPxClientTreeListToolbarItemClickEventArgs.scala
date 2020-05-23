package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxTreeList.ToolbarItemClick event.
  */
@JSGlobal("ASPxClientTreeListToolbarItemClickEventArgs")
@js.native
class ASPxClientTreeListToolbarItemClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTreeListToolbarItemClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListToolbarItemClickEventArgs class.
    * @param item An ASPxClientMenu object that should be clicked to fire the event.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(item: typings.devexpressWeb.ASPxClientMenuItem, processOnServer: Boolean) = this()
  /**
    * Gets the clicked menu item
    */
  /* CompleteClass */
  override var item: typings.devexpressWeb.ASPxClientMenuItem = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
  /**
    * Gets the toolbar index related to the event.
    */
  /* CompleteClass */
  override var toolbarIndex: Double = js.native
  /**
    * Gets the toolbar name.
    */
  /* CompleteClass */
  override var toolbarName: String = js.native
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    */
  /* CompleteClass */
  override var usePostBack: Boolean = js.native
}

