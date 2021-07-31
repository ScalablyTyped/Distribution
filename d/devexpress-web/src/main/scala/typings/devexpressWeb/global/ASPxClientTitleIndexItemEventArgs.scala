package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on the control's items.
  */
@JSGlobal("ASPxClientTitleIndexItemEventArgs")
@js.native
class ASPxClientTitleIndexItemEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTitleIndexItemEventArgs {
  /**
    * Initializes a new object of the ASPxClientTitleIndexItemEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param name A string value that represents the unique identifier name of an item related to the event.
    * @param htmlElement An HTML object that contains the processed item.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    */
  def this(processOnServer: Boolean, name: String, htmlElement: js.Any, htmlEvent: js.Any) = this()
  
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
    * Gets the name that uniquely identifies the processed item.
    */
  /* CompleteClass */
  var name: js.Any = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
