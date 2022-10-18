package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentManifestContent
  extends StObject
     with BackboneElement {
  
  /**
    * The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.
    */
  var pAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed.
    */
  var pReference: js.UndefOr[Reference] = js.undefined
}
object DocumentManifestContent {
  
  inline def apply(): DocumentManifestContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentManifestContent]
  }
  
  extension [Self <: DocumentManifestContent](x: Self) {
    
    inline def setPAttachment(value: Attachment): Self = StObject.set(x, "pAttachment", value.asInstanceOf[js.Any])
    
    inline def setPAttachmentUndefined: Self = StObject.set(x, "pAttachment", js.undefined)
    
    inline def setPReference(value: Reference): Self = StObject.set(x, "pReference", value.asInstanceOf[js.Any])
    
    inline def setPReferenceUndefined: Self = StObject.set(x, "pReference", js.undefined)
  }
}
