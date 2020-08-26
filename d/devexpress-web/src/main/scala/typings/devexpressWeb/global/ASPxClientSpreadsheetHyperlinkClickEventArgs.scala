package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.HyperlinkClick event.
  */
@JSGlobal("ASPxClientSpreadsheetHyperlinkClickEventArgs")
@js.native
class ASPxClientSpreadsheetHyperlinkClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientSpreadsheetHyperlinkClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetHyperlinkClickEventArgs object. For internal use only.
    * @param htmlEvent A DHTML event object that relates to the processed event.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    * @param hyperlinkType One of the ASPxClientOfficeDocumentLinkType values.
    * @param targetUri A sting value specifying the link's URI.
    */
  def this(
    htmlEvent: js.Any,
    handled: Boolean,
    hyperlinkType: typings.devexpressWeb.ASPxClientOfficeDocumentLinkType,
    targetUri: String
  ) = this()
}

