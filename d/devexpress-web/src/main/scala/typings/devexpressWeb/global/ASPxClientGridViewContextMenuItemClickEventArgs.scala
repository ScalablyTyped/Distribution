package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
