package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ModifyPdfDocument extends StObject {
    
    var modifyPdfDocument: js.UndefOr[js.Function1[/* pdfDocument */ Any, Unit]] = js.undefined
    
    var modifyPdfPage: js.UndefOr[js.Function1[/* pdfDocument */ Any, Unit]] = js.undefined
  }
  object ModifyPdfDocument {
    
    inline def apply(): ModifyPdfDocument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifyPdfDocument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModifyPdfDocument] (val x: Self) extends AnyVal {
      
      inline def setModifyPdfDocument(value: /* pdfDocument */ Any => Unit): Self = StObject.set(x, "modifyPdfDocument", js.Any.fromFunction1(value))
      
      inline def setModifyPdfDocumentUndefined: Self = StObject.set(x, "modifyPdfDocument", js.undefined)
      
      inline def setModifyPdfPage(value: /* pdfDocument */ Any => Unit): Self = StObject.set(x, "modifyPdfPage", js.Any.fromFunction1(value))
      
      inline def setModifyPdfPageUndefined: Self = StObject.set(x, "modifyPdfPage", js.undefined)
    }
  }
}
