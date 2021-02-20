package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.HyperlinkClick event.
  */
@js.native
trait ASPxClientSpreadsheetHyperlinkClickEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
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
  
  @scala.inline
  implicit class ASPxClientSpreadsheetHyperlinkClickEventArgsMutableBuilder[Self <: ASPxClientSpreadsheetHyperlinkClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkType(value: ASPxClientOfficeDocumentLinkType): Self = StObject.set(x, "hyperlinkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUri(value: String): Self = StObject.set(x, "targetUri", value.asInstanceOf[js.Any])
  }
}
