package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractFriendly
  extends StObject
     with BackboneElement {
  
  /**
    * Human readable rendering of this Contract in a format and representation intended to enhance comprehension and ensure understandability.
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Human readable rendering of this Contract in a format and representation intended to enhance comprehension and ensure understandability.
    */
  var contentReference: js.UndefOr[Reference] = js.undefined
}
object ContractFriendly {
  
  inline def apply(): ContractFriendly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractFriendly]
  }
  
  extension [Self <: ContractFriendly](x: Self) {
    
    inline def setContentAttachment(value: Attachment): Self = StObject.set(x, "contentAttachment", value.asInstanceOf[js.Any])
    
    inline def setContentAttachmentUndefined: Self = StObject.set(x, "contentAttachment", js.undefined)
    
    inline def setContentReference(value: Reference): Self = StObject.set(x, "contentReference", value.asInstanceOf[js.Any])
    
    inline def setContentReferenceUndefined: Self = StObject.set(x, "contentReference", js.undefined)
  }
}
