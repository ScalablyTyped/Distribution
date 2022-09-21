package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.PopupMenuShowing event.
  */
@JSGlobal("ASPxClientRichEditPopupMenuShowingEventArgs")
@js.native
open class ASPxClientRichEditPopupMenuShowingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRichEditPopupMenuShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditPopupMenuShowingEventArgs object. For internal use only.
    * @param menuItems Provides access to the context menu's item collection.
    */
  def this(menuItems: typings.devexpressWeb.ASPxClientRichEditPopupMenuItemCollection) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides access to a collection of menu items in the context menu being invoked.
    */
  /* CompleteClass */
  var menuItems: typings.devexpressWeb.ASPxClientRichEditPopupMenuItemCollection = js.native
}
