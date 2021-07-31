package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPopupControlBase.PinnedChanged event.
  */
@JSGlobal("ASPxClientPopupWindowPinnedChangedEventArgs")
@js.native
class ASPxClientPopupWindowPinnedChangedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientPopupWindowPinnedChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowPinnedChangedEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param pinned true if the window has been pinned; false if the window has been unpinned.
    */
  def this(window: typings.devexpressWeb.ASPxClientPopupWindow, pinned: Boolean) = this()
  
  /**
    * Gets a value indicating whether the processed popup window has been pinned.
    */
  /* CompleteClass */
  var pinned: Boolean = js.native
  
  /**
    * Gets the popup window object related to the event.
    */
  /* CompleteClass */
  var window: typings.devexpressWeb.ASPxClientPopupWindow = js.native
}
