package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxTreeList.ToolbarItemClick event.
  */
@JSGlobal("ASPxClientTreeListToolbarItemClickEventArgs")
@js.native
class ASPxClientTreeListToolbarItemClickEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListToolbarItemClickEventArgs class.
    * @param item An ASPxClientMenu object that should be clicked to fire the event.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(item: ASPxClientMenuItem, processOnServer: Boolean) = this()
  /**
    * Gets the clicked menu item
    */
  var item: ASPxClientMenuItem = js.native
  /**
    * Gets the toolbar index related to the event.
    */
  var toolbarIndex: Double = js.native
  /**
    * Gets the toolbar name.
    */
  var toolbarName: String = js.native
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    */
  var usePostBack: Boolean = js.native
}

