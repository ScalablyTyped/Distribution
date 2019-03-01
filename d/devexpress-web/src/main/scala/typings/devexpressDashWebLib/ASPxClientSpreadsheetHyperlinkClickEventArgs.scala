package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the HyperlinkClick event.
  */
trait ASPxClientSpreadsheetHyperlinkClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    * Value: true, if if the event is completely handled by custom code and no default processing is required; otherwise, false.
    */
  var handled: scala.Boolean
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
  var targetUri: java.lang.String
}

object ASPxClientSpreadsheetHyperlinkClickEventArgs {
  @scala.inline
  def apply(
    handled: scala.Boolean,
    htmlEvent: js.Object,
    hyperlinkType: ASPxClientOfficeDocumentLinkType,
    targetUri: java.lang.String
  ): ASPxClientSpreadsheetHyperlinkClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handled")(handled)
    __obj.updateDynamic("htmlEvent")(htmlEvent)
    __obj.updateDynamic("hyperlinkType")(hyperlinkType)
    __obj.updateDynamic("targetUri")(targetUri)
    __obj.asInstanceOf[ASPxClientSpreadsheetHyperlinkClickEventArgs]
  }
}

