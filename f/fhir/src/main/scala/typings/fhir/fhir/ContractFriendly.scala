package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contract Friendly Language
  */
trait ContractFriendly
  extends StObject
     with BackboneElement {
  
  /**
    * Easily comprehended representation of this Contract
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Easily comprehended representation of this Contract
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
