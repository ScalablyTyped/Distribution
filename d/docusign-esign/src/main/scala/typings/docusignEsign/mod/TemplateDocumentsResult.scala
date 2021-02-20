package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateDocumentsResult extends StObject {
  
  /**
    * An array of document objects that contain information about the documents associated with the template.
    */
  var templateDocuments: js.UndefOr[
    js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]
  ] = js.native
  
  /**
    * The id of the template.
    */
  var templateId: js.UndefOr[String] = js.native
}
object TemplateDocumentsResult {
  
  @scala.inline
  def apply(): TemplateDocumentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateDocumentsResult]
  }
  
  @scala.inline
  implicit class TemplateDocumentsResultMutableBuilder[Self <: TemplateDocumentsResult] (val x: Self) extends AnyVal {
    
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
