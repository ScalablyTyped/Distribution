package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageSize extends StObject {
  
  var pageHeight: js.UndefOr[String] = js.native
  
  var pageWidth: js.UndefOr[String] = js.native
}
object PageSize {
  
  @scala.inline
  def apply(): PageSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSize]
  }
  
  @scala.inline
  implicit class PageSizeMutableBuilder[Self <: PageSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageHeight(value: String): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
    
    @scala.inline
    def setPageWidth(value: String): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageWidthUndefined: Self = StObject.set(x, "pageWidth", js.undefined)
  }
}
