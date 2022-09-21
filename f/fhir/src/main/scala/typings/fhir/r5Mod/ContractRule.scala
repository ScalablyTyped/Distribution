package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractRule
  extends StObject
     with BackboneElement {
  
  /**
    * Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Computable Contract conveyed using a policy rule language (e.g. XACML, DKAL, SecPal).
    */
  var contentReference: js.UndefOr[Reference] = js.undefined
}
object ContractRule {
  
  inline def apply(): ContractRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractRule]
  }
  
  extension [Self <: ContractRule](x: Self) {
    
    inline def setContentAttachment(value: Attachment): Self = StObject.set(x, "contentAttachment", value.asInstanceOf[js.Any])
    
    inline def setContentAttachmentUndefined: Self = StObject.set(x, "contentAttachment", js.undefined)
    
    inline def setContentReference(value: Reference): Self = StObject.set(x, "contentReference", value.asInstanceOf[js.Any])
    
    inline def setContentReferenceUndefined: Self = StObject.set(x, "contentReference", js.undefined)
  }
}
