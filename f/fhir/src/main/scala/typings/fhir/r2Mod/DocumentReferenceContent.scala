package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReferenceContent
  extends StObject
     with BackboneElement {
  
  /**
    * The document or url of the document along with critical metadata to prove content has integrity.
    */
  var attachment: Attachment
  
  /**
    * An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.
    */
  var format: js.UndefOr[js.Array[Coding]] = js.undefined
}
object DocumentReferenceContent {
  
  inline def apply(attachment: Attachment): DocumentReferenceContent = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReferenceContent]
  }
  
  extension [Self <: DocumentReferenceContent](x: Self) {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: js.Array[Coding]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatVarargs(value: Coding*): Self = StObject.set(x, "format", js.Array(value*))
  }
}
