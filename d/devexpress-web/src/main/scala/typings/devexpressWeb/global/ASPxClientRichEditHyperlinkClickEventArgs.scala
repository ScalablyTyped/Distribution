package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.HyperlinkClick event.
  */
@JSGlobal("ASPxClientRichEditHyperlinkClickEventArgs")
@js.native
class ASPxClientRichEditHyperlinkClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientRichEditHyperlinkClickEventArgs {
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
    hyperlinkType: typings.devexpressWeb.ASPxClientOfficeDocumentLinkType
  ) = this()
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
  /**
    * Gets a value identifying the clicked hyperlink type.
    */
  /* CompleteClass */
  override var hyperlinkType: typings.devexpressWeb.ASPxClientOfficeDocumentLinkType = js.native
  /**
    * Gets the clicked link's URI.
    */
  /* CompleteClass */
  override var targetUri: String = js.native
}

