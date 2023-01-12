package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentManifestContent
  extends StObject
     with BackboneElement {
  
  /**
    * The intended focus of the DocumentManifest is for the reference to target either DocumentReference or Media Resources, and most implementation guides will restrict to these resources. The reference is to "Any" to support EN 13606 usage, where an extract is DocumentManifest that references  List and Composition resources.
    */
  var pAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * The intended focus of the DocumentManifest is for the reference to target either DocumentReference or Media Resources, and most implementation guides will restrict to these resources. The reference is to "Any" to support EN 13606 usage, where an extract is DocumentManifest that references  List and Composition resources.
    */
  var pReference: js.UndefOr[Reference] = js.undefined
}
object DocumentManifestContent {
  
  inline def apply(): DocumentManifestContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentManifestContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentManifestContent] (val x: Self) extends AnyVal {
    
    inline def setPAttachment(value: Attachment): Self = StObject.set(x, "pAttachment", value.asInstanceOf[js.Any])
    
    inline def setPAttachmentUndefined: Self = StObject.set(x, "pAttachment", js.undefined)
    
    inline def setPReference(value: Reference): Self = StObject.set(x, "pReference", value.asInstanceOf[js.Any])
    
    inline def setPReferenceUndefined: Self = StObject.set(x, "pReference", js.undefined)
  }
}
