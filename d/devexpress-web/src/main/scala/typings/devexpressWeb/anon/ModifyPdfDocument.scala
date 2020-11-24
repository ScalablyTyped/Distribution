package typings.devexpressWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyPdfDocument extends js.Object {
  
  var modifyPdfDocument: js.UndefOr[js.Function1[/* pdfDocument */ js.Any, Unit]] = js.native
  
  var modifyPdfPage: js.UndefOr[js.Function1[/* pdfDocument */ js.Any, Unit]] = js.native
}
object ModifyPdfDocument {
  
  @scala.inline
  def apply(): ModifyPdfDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyPdfDocument]
  }
  
  @scala.inline
  implicit class ModifyPdfDocumentOps[Self <: ModifyPdfDocument] (val x: Self) extends AnyVal {
    
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
    def setModifyPdfDocument(value: /* pdfDocument */ js.Any => Unit): Self = this.set("modifyPdfDocument", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteModifyPdfDocument: Self = this.set("modifyPdfDocument", js.undefined)
    
    @scala.inline
    def setModifyPdfPage(value: /* pdfDocument */ js.Any => Unit): Self = this.set("modifyPdfPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteModifyPdfPage: Self = this.set("modifyPdfPage", js.undefined)
  }
}
