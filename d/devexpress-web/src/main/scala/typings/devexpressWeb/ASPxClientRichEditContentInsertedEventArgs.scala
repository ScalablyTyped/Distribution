package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.ContentInserted event.
  */
trait ASPxClientRichEditContentInsertedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the text buffer interval related to the inserted content.
    */
  var interval: Interval
  
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double
}
object ASPxClientRichEditContentInsertedEventArgs {
  
  inline def apply(interval: Interval, subDocumentId: Double): ASPxClientRichEditContentInsertedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditContentInsertedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientRichEditContentInsertedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setSubDocumentId(value: Double): Self = StObject.set(x, "subDocumentId", value.asInstanceOf[js.Any])
  }
}
