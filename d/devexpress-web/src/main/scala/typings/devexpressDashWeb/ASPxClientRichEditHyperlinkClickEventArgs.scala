package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the HyperlinkClick event.
  */
trait ASPxClientRichEditHyperlinkClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the event is handled manually, so no default processing is required.
    * Value: true if the event is handled and no default processing is required; otherwise false.
    */
  var handled: Boolean
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: An object that maintains DHTML event-specific information.
    */
  var htmlEvent: js.Object
  /**
    * Gets a value identifying the clicked hyperlink type.
    * Value: One of the <see cref="ASPxClientOfficeDocumentLinkType" /> values.
    */
  var hyperlinkType: ASPxClientOfficeDocumentLinkType
  /**
    * Gets the clicked link's URI.
    * Value: A sting value specifying the link's URI.
    */
  var targetUri: String
}

object ASPxClientRichEditHyperlinkClickEventArgs {
  @scala.inline
  def apply(
    handled: Boolean,
    htmlEvent: js.Object,
    hyperlinkType: ASPxClientOfficeDocumentLinkType,
    targetUri: String
  ): ASPxClientRichEditHyperlinkClickEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, htmlEvent = htmlEvent, hyperlinkType = hyperlinkType, targetUri = targetUri)
  
    __obj.asInstanceOf[ASPxClientRichEditHyperlinkClickEventArgs]
  }
}

