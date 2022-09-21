package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractLegal
  extends StObject
     with BackboneElement {
  
  /**
    * Contract legal text in human renderable form.
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Contract legal text in human renderable form.
    */
  var contentReference: js.UndefOr[Reference] = js.undefined
}
object ContractLegal {
  
  inline def apply(): ContractLegal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractLegal]
  }
  
  extension [Self <: ContractLegal](x: Self) {
    
    inline def setContentAttachment(value: Attachment): Self = StObject.set(x, "contentAttachment", value.asInstanceOf[js.Any])
    
    inline def setContentAttachmentUndefined: Self = StObject.set(x, "contentAttachment", js.undefined)
    
    inline def setContentReference(value: Reference): Self = StObject.set(x, "contentReference", value.asInstanceOf[js.Any])
    
    inline def setContentReferenceUndefined: Self = StObject.set(x, "contentReference", js.undefined)
  }
}
