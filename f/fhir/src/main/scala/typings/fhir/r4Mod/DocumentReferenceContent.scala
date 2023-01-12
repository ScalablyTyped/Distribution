package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReferenceContent
  extends StObject
     with BackboneElement {
  
  /**
    * The document or URL of the document along with critical metadata to prove content has integrity.
    */
  var attachment: Attachment
  
  /**
    * Note that while IHE mostly issues URNs for format types, not all documents can be identified by a URI.
    */
  var format: js.UndefOr[Coding] = js.undefined
}
object DocumentReferenceContent {
  
  inline def apply(attachment: Attachment): DocumentReferenceContent = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReferenceContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentReferenceContent] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Coding): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
