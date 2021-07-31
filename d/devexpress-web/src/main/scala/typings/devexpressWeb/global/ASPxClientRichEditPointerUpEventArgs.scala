package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.PointerUp event.
  */
@JSGlobal("ASPxClientRichEditPointerUpEventArgs")
@js.native
class ASPxClientRichEditPointerUpEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRichEditPointerUpEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditPointerUpEventArgs object. For internal use only.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    */
  def this(htmlEvent: js.Any, handled: js.Any) = this()
  
  /**
    * Gets or sets whether the event is handled manually, so no default processing is required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  var htmlEvent: js.Any = js.native
}
