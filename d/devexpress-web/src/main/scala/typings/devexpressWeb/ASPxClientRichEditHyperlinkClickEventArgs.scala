package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.HyperlinkClick event.
  */
@JSGlobal("ASPxClientRichEditHyperlinkClickEventArgs")
@js.native
class ASPxClientRichEditHyperlinkClickEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditHyperlinkClickEventArgs object. For internal use only.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    * @param targetUri The target URI.
    * @param hyperlinkType The document link type.
    */
  def this(
    htmlEvent: js.Any,
    handled: Boolean,
    targetUri: String,
    hyperlinkType: ASPxClientOfficeDocumentLinkType
  ) = this()
  /**
    * Gets or sets whether the event is handled manually, so no default processing is required.
    */
  var handled: Boolean = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Gets a value identifying the clicked hyperlink type.
    */
  var hyperlinkType: ASPxClientOfficeDocumentLinkType = js.native
  /**
    * Gets the clicked link's URI.
    */
  var targetUri: String = js.native
}

