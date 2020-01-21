package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.PopupMenuShowing event.
  */
@JSGlobal("ASPxClientRichEditPopupMenuShowingEventArgs")
@js.native
class ASPxClientRichEditPopupMenuShowingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditPopupMenuShowingEventArgs object. For internal use only.
    * @param menuItems Provides access to the context menu's item collection.
    */
  def this(menuItems: ASPxClientRichEditPopupMenuItemCollection) = this()
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    */
  var menuItems: ASPxClientRichEditPopupMenuItemCollection = js.native
}

