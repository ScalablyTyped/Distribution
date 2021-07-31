package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateDocuments extends StObject {
  
  /**
    * An array of document objects that contain information about the documents associated with the template.
    */
  var templateDocuments: js.UndefOr[
    js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]
  ] = js.undefined
  
  /**
    * The id of the template. If a value is not provided, DocuSign generates a value.
    */
  var templateId: js.UndefOr[String] = js.undefined
}
object TemplateDocuments {
  
  @scala.inline
  def apply(): TemplateDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateDocuments]
  }
  
  @scala.inline
  implicit class TemplateDocumentsMutableBuilder[Self <: TemplateDocuments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateDocuments(value: js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]): Self = StObject.set(x, "templateDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateDocumentsUndefined: Self = StObject.set(x, "templateDocuments", js.undefined)
    
    @scala.inline
    def setTemplateDocumentsVarargs(value: (/* This object contains details about the envelope document. */ EnvelopeDocument)*): Self = StObject.set(x, "templateDocuments", js.Array(value :_*))
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
