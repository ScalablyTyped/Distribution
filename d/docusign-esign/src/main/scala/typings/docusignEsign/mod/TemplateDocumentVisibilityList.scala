package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateDocumentVisibilityList extends js.Object {
  
  /**
    * An array of `documentVisibility` objects that specifies which documents are visible to which recipients.
    */
  var documentVisibility: js.UndefOr[
    js.Array[
      /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
    ]
  ] = js.native
}
object TemplateDocumentVisibilityList {
  
  @scala.inline
  def apply(): TemplateDocumentVisibilityList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateDocumentVisibilityList]
  }
  
  @scala.inline
  implicit class TemplateDocumentVisibilityListOps[Self <: TemplateDocumentVisibilityList] (val x: Self) extends AnyVal {
    
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
    def setDocumentVisibilityVarargs(
      value: (/* This object configures a recipient's read/write access to a document. */ DocumentVisibility)*
    ): Self = this.set("documentVisibility", js.Array(value :_*))
    
    @scala.inline
    def setDocumentVisibility(
      value: js.Array[
          /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
        ]
    ): Self = this.set("documentVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVisibility: Self = this.set("documentVisibility", js.undefined)
  }
}
