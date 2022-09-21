package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.KeyDown event.
  */
@JSGlobal("ASPxClientRichEditKeyDownEventArgs")
@js.native
open class ASPxClientRichEditKeyDownEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRichEditKeyDownEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditKeyDownEventArgs object. For internal use only.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    */
  def this(htmlEvent: Any, handled: Boolean) = this()
  
  /**
    * Gets or sets whether the event is handled manually, so no default processing is required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
}
