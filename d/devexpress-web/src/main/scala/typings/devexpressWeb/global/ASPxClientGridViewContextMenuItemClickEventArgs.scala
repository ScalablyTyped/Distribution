package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.ContextMenuItemClick event.
  */
@JSGlobal("ASPxClientGridViewContextMenuItemClickEventArgs")
@js.native
open class ASPxClientGridViewContextMenuItemClickEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewContextMenuItemClickEventArgs {
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
  var elementIndex: Double = js.native
  
  /**
    * Specifies whether default context menu item click is handled manually, so no default processing is required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets the clicked context menu item.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.ASPxClientMenuItem = js.native
  
  /**
    * Gets which grid element has been right clicked by the user.
    */
  /* CompleteClass */
  var objectType: String = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
  
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    */
  /* CompleteClass */
  var usePostBack: Boolean = js.native
}
