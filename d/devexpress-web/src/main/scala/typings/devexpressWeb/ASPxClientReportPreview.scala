package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxClientReportPreview extends js.Object {
  
  var documentBuilding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  
  var pageIndex: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any = js.native
  
  var pages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ js.Any = js.native
  
  var showMultipagePreview: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  
  var zoom: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any = js.native
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
  implicit class ASPxClientReportPreviewOps[Self <: ASPxClientReportPreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocumentBuilding(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("documentBuilding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIndex(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
    ): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ js.Any
    ): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMultipagePreview(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("showMultipagePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ js.Any
    ): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
}
