package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.DocumentFormatted event.
  */
trait ASPxClientRichEditDocumentFormattedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the number of pages in the document.
    */
  var pageCount: Double
}
object ASPxClientRichEditDocumentFormattedEventArgs {
  
  inline def apply(pageCount: Double): ASPxClientRichEditDocumentFormattedEventArgs = {
    val __obj = js.Dynamic.literal(pageCount = pageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditDocumentFormattedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientRichEditDocumentFormattedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
  }
}
