package typings.ejWebAll.anon

import typings.ejWebAll.ej.PdfViewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPdfViewer extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: PdfViewer
}
object TypeofPdfViewer {
  
  inline def apply(Locale: Any, fn: PdfViewer): TypeofPdfViewer = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPdfViewer]
  }
  
  extension [Self <: TypeofPdfViewer](x: Self) {
    
    inline def setFn(value: PdfViewer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
