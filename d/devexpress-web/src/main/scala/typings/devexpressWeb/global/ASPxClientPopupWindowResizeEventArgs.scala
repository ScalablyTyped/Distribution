package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPopupControlBase.Resize event.
  */
@JSGlobal("ASPxClientPopupWindowResizeEventArgs")
@js.native
open class ASPxClientPopupWindowResizeEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientPopupWindowResizeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowResizeEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param resizeState The integer value determining the window state.
    */
  def this(window: typings.devexpressWeb.ASPxClientPopupWindow, resizeState: Double) = this()
  
  /**
    * Returns the value indicating the window state after resizing.
    */
  /* CompleteClass */
  var resizeState: Double = js.native
  
  /**
    * Gets the popup window object related to the event.
    */
  /* CompleteClass */
  var window: typings.devexpressWeb.ASPxClientPopupWindow = js.native
}
