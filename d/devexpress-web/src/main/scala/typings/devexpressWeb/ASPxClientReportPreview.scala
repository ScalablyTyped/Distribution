package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientReportPreview extends StObject {
  
  var documentBuilding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  
  var pageIndex: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
  
  var pages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ js.Any
  
  var showMultipagePreview: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  
  var zoom: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
}
object ASPxClientReportPreview {
  
  @scala.inline
  def apply(
    documentBuilding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    pageIndex: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any,
    pages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ js.Any,
    showMultipagePreview: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    zoom: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
  ): ASPxClientReportPreview = {
    val __obj = js.Dynamic.literal(documentBuilding = documentBuilding.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], showMultipagePreview = showMultipagePreview.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportPreview]
  }
  
  @scala.inline
  implicit class ASPxClientReportPreviewMutableBuilder[Self <: ASPxClientReportPreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentBuilding(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "documentBuilding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIndex(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
    ): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ js.Any
    ): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMultipagePreview(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "showMultipagePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
    ): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
