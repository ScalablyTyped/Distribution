package typings.ejWebAll.anon

import typings.ejWebAll.ej.PdfViewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPdfViewer extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: PdfViewer
}
object TypeofPdfViewer {
  
  @scala.inline
  def apply(Locale: js.Any, fn: PdfViewer): TypeofPdfViewer = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPdfViewer]
  }
  
  @scala.inline
  implicit class TypeofPdfViewerMutableBuilder[Self <: TypeofPdfViewer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: PdfViewer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
