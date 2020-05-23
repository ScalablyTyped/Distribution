package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.HyperlinkClick event.
  */
trait ASPxClientSpreadsheetHyperlinkClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    */
  var handled: Boolean
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any
  /**
    * Gets a value identifying the clicked hyperlink type.
    */
  var hyperlinkType: ASPxClientOfficeDocumentLinkType
  /**
    * Gets the clicked link's URI.
    */
  var targetUri: String
}

object ASPxClientSpreadsheetHyperlinkClickEventArgs {
  @scala.inline
  def apply(
    handled: Boolean,
    htmlEvent: js.Any,
    hyperlinkType: ASPxClientOfficeDocumentLinkType,
    targetUri: String
  ): ASPxClientSpreadsheetHyperlinkClickEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], hyperlinkType = hyperlinkType.asInstanceOf[js.Any], targetUri = targetUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetHyperlinkClickEventArgs]
  }
}

