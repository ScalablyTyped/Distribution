package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.ContextMenu event.
  */
@JSGlobal("ASPxClientGridViewContextMenuEventArgs")
@js.native
class ASPxClientGridViewContextMenuEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewContextMenuEventArgs class with the specified settings.
    * @param objectType A string specifying a grid element that has been right clicked by the user.
    * @param index A zero-based integer index that is the processed element index.
    * @param htmlEvent An object that contains parameters associated with the event.
    * @param showBrowserMenu true, to display a browser context menu; otherwise, false.
    */
  def this(objectType: String, index: Double, htmlEvent: js.Any, showBrowserMenu: Boolean) = this()
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.ContextMenu event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Identifies the grid element being right clicked by the user.
    */
  var index: Double = js.native
  /**
    * Gets the currently processed menu object.
    */
  var menu: js.Any = js.native
  /**
    * Gets which grid element has been right clicked by the user.
    */
  var objectType: String = js.native
  /**
    * Specifies whether a browser context menu should be displayed.
    */
  var showBrowserMenu: Boolean = js.native
}

