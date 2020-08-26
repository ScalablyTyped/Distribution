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
}

