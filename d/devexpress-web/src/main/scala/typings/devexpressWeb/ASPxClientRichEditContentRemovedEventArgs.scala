package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.ContentRemoved event.
  */
trait ASPxClientRichEditContentRemovedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the text buffer interval related to the removed content.
    */
  var interval: Interval
  
  /**
    * Returns the recently removed text.
    */
  var removedText: String
  
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double
}
object ASPxClientRichEditContentRemovedEventArgs {
  
  inline def apply(interval: Interval, removedText: String, subDocumentId: Double): ASPxClientRichEditContentRemovedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], removedText = removedText.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditContentRemovedEventArgs]
  }
  
  extension [Self <: ASPxClientRichEditContentRemovedEventArgs](x: Self) {
    
    inline def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setRemovedText(value: String): Self = StObject.set(x, "removedText", value.asInstanceOf[js.Any])
    
    inline def setSubDocumentId(value: Double): Self = StObject.set(x, "subDocumentId", value.asInstanceOf[js.Any])
  }
}
