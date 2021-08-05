package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The items included
  */
trait DocumentManifestContent
  extends StObject
     with BackboneElement {
  
  /**
    * Contents of this set of documents
    */
  var pAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Contents of this set of documents
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
