package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Computable Contract Language
  */
trait ContractRule
  extends StObject
     with BackboneElement {
  
  /**
    * Computable Contract Rules
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Computable Contract Rules
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
