package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageSize extends StObject {
  
  var pageHeight: js.UndefOr[String] = js.undefined
  
  var pageWidth: js.UndefOr[String] = js.undefined
}
object PageSize {
  
  inline def apply(): PageSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageSize] (val x: Self) extends AnyVal {
    
    inline def setPageHeight(value: String): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
    
    inline def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
    
    inline def setPageWidth(value: String): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
    
    inline def setPageWidthUndefined: Self = StObject.set(x, "pageWidth", js.undefined)
  }
}
