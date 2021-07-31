package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern clicking on the control's items.
  */
@JSGlobal("ASPxClientMenuItemClickEventArgs")
@js.native
class ASPxClientMenuItemClickEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientMenuItemClickEventArgs {
  /**
    * Initializes a new object of the ASPxClientMenuItemClickEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param item An ASPxClientMenuItem object that represents an item related to the event.
    * @param htmlElement An HTML object that contains the processed item.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(
    processOnServer: Boolean,
    item: typings.devexpressWeb.ASPxClientMenuItem,
    htmlElement: js.Any,
    htmlEvent: js.Any
  ) = this()
  
  /**
    * Gets the HTML object that contains the processed item.
    */
  /* CompleteClass */
  var htmlElement: js.Any = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  var htmlEvent: js.Any = js.native
  
  /**
    * Gets the menu item object related to the event.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.ASPxClientMenuItem = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
