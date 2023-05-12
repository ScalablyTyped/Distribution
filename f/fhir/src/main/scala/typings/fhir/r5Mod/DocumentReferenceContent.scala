package typings.fhir.r5Mod

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
    * Note that IHE often issues URNs for formatCode codes, not all documents can be identified by a URI.
    * For FHIR content, .profile should indicate the structureDefinition profile canonical URI(s) that the content complies with.
    */
  var profile: js.UndefOr[js.Array[DocumentReferenceContentProfile]] = js.undefined
}
object DocumentReferenceContent {
  
  inline def apply(attachment: Attachment): DocumentReferenceContent = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReferenceContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentReferenceContent] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: js.Array[DocumentReferenceContentProfile]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setProfileVarargs(value: DocumentReferenceContentProfile*): Self = StObject.set(x, "profile", js.Array(value*))
  }
}
