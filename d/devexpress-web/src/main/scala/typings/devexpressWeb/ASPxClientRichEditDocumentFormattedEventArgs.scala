package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.DocumentFormatted event.
  */
@js.native
trait ASPxClientRichEditDocumentFormattedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the number of pages in the document.
    */
  var pageCount: Double = js.native
}
object ASPxClientRichEditDocumentFormattedEventArgs {
  
  @scala.inline
  def apply(pageCount: Double): ASPxClientRichEditDocumentFormattedEventArgs = {
    val __obj = js.Dynamic.literal(pageCount = pageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditDocumentFormattedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditDocumentFormattedEventArgsOps[Self <: ASPxClientRichEditDocumentFormattedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
  }
}
