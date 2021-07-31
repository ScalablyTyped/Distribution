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
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double
}
object ASPxClientRichEditContentRemovedEventArgs {
  
  @scala.inline
  def apply(interval: Interval, subDocumentId: Double): ASPxClientRichEditContentRemovedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditContentRemovedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditContentRemovedEventArgsMutableBuilder[Self <: ASPxClientRichEditContentRemovedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDocumentId(value: Double): Self = StObject.set(x, "subDocumentId", value.asInstanceOf[js.Any])
  }
}
