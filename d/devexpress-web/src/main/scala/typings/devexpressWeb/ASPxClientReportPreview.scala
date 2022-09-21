package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientReportPreview extends StObject {
  
  var documentBuilding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  var pageIndex: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any
  
  var pages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ Any
  
  var showMultipagePreview: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  var zoom: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any
}
object ASPxClientReportPreview {
  
  inline def apply(
    documentBuilding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    pageIndex: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any,
    pages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ Any,
    showMultipagePreview: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    zoom: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any
  ): ASPxClientReportPreview = {
    val __obj = js.Dynamic.literal(documentBuilding = documentBuilding.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], showMultipagePreview = showMultipagePreview.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportPreview]
  }
  
  extension [Self <: ASPxClientReportPreview](x: Self) {
    
    inline def setDocumentBuilding(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "documentBuilding", value.asInstanceOf[js.Any])
    
    inline def setPageIndex(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any
    ): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setPages(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ Any
    ): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setShowMultipagePreview(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "showMultipagePreview", value.asInstanceOf[js.Any])
    
    inline def setZoom(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any
    ): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
