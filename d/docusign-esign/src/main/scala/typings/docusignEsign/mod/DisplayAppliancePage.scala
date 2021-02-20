package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayAppliancePage extends StObject {
  
  var documentId: js.UndefOr[String] = js.native
  
  var documentName: js.UndefOr[String] = js.native
  
  var externalDocumentId: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var isFirstPage: js.UndefOr[Boolean] = js.native
  
  var pageId: js.UndefOr[String] = js.native
  
  var pageNo: js.UndefOr[Double] = js.native
  
  var pageStatus: js.UndefOr[String] = js.native
  
  var pageType: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DisplayAppliancePage {
  
  @scala.inline
  def apply(): DisplayAppliancePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayAppliancePage]
  }
  
  @scala.inline
  implicit class DisplayAppliancePageMutableBuilder[Self <: DisplayAppliancePage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNameUndefined: Self = StObject.set(x, "documentName", js.undefined)
    
    @scala.inline
    def setExternalDocumentId(value: String): Self = StObject.set(x, "externalDocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocumentIdUndefined: Self = StObject.set(x, "externalDocumentId", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIsFirstPage(value: Boolean): Self = StObject.set(x, "isFirstPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFirstPageUndefined: Self = StObject.set(x, "isFirstPage", js.undefined)
    
    @scala.inline
    def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
    
    @scala.inline
    def setPageNo(value: Double): Self = StObject.set(x, "pageNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNoUndefined: Self = StObject.set(x, "pageNo", js.undefined)
    
    @scala.inline
    def setPageStatus(value: String): Self = StObject.set(x, "pageStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStatusUndefined: Self = StObject.set(x, "pageStatus", js.undefined)
    
    @scala.inline
    def setPageType(value: String): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTypeUndefined: Self = StObject.set(x, "pageType", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
