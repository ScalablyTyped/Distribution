package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.PointerUp event.
  */
@JSGlobal("ASPxClientRichEditPointerUpEventArgs")
@js.native
class ASPxClientRichEditPointerUpEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientRichEditPointerUpEventArgs {
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
  override var handled: Boolean = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  override var htmlEvent: js.Any = js.native
}

