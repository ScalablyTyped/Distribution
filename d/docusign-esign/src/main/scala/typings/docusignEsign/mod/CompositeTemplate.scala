package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositeTemplate extends js.Object {
  
  /**
    * The id of this composite template. This id is used as a reference when adding document object information. If used, the document's `content-disposition`
    * must include the composite template ID to which the document should be added. If a composite template ID is not specified in the content-disposition,
    * the document is applied based on the value of the `documentId` property only. If no document object is specified, the composite template inherits the first document.
    */
  var compositeTemplateId: js.UndefOr[String] = js.native
  
  /**
    * An optional document object that will act as the primary document in the composite template object. If the document node is present, it will take
    * precedence over any server template or inline template documents. It always comes first. Only use this when you want to supply the document dynamically.
    */
  var document: js.UndefOr[/* A document object. */ Document] = js.native
  
  /**
    *  Zero or more inline templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value.
    */
  var inlineTemplates: js.UndefOr[js.Array[InlineTemplate]] = js.native
  
  /**
    * A number representing the sequence in which to apply the template that contains the PDF metadata.
    *
    * Example: `4`
    */
  var pdfMetaDataTemplateSequence: js.UndefOr[String] = js.native
  
  /**
    * Zero or more server-side templates and their position in the overlay. If supplied, they are overlaid into the envelope in the order of their Sequence value
    */
  var serverTemplates: js.UndefOr[js.Array[ServerTemplate]] = js.native
}
object CompositeTemplate {
  
  @scala.inline
  def apply(): CompositeTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeTemplate]
  }
  
  @scala.inline
  implicit class CompositeTemplateOps[Self <: CompositeTemplate] (val x: Self) extends AnyVal {
    
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
    def setCompositeTemplateId(value: String): Self = this.set("compositeTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompositeTemplateId: Self = this.set("compositeTemplateId", js.undefined)
    
    @scala.inline
    def setDocument(value: /* A document object. */ Document): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    
    @scala.inline
    def setInlineTemplatesVarargs(value: InlineTemplate*): Self = this.set("inlineTemplates", js.Array(value :_*))
    
    @scala.inline
    def setInlineTemplates(value: js.Array[InlineTemplate]): Self = this.set("inlineTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineTemplates: Self = this.set("inlineTemplates", js.undefined)
    
    @scala.inline
    def setPdfMetaDataTemplateSequence(value: String): Self = this.set("pdfMetaDataTemplateSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfMetaDataTemplateSequence: Self = this.set("pdfMetaDataTemplateSequence", js.undefined)
    
    @scala.inline
    def setServerTemplatesVarargs(value: ServerTemplate*): Self = this.set("serverTemplates", js.Array(value :_*))
    
    @scala.inline
    def setServerTemplates(value: js.Array[ServerTemplate]): Self = this.set("serverTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerTemplates: Self = this.set("serverTemplates", js.undefined)
  }
}
