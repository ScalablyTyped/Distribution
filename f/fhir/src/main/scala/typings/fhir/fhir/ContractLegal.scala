package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contract Legal Language
  */
trait ContractLegal
  extends StObject
     with BackboneElement {
  
  /**
    * Contract Legal Text
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Contract Legal Text
    */
  var contentReference: js.UndefOr[Reference] = js.undefined
}
object ContractLegal {
  
  @scala.inline
  def apply(): ContractLegal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractLegal]
  }
  
  @scala.inline
  implicit class ContractLegalMutableBuilder[Self <: ContractLegal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentAttachment(value: Attachment): Self = StObject.set(x, "contentAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentAttachmentUndefined: Self = StObject.set(x, "contentAttachment", js.undefined)
    
    @scala.inline
    def setContentReference(value: Reference): Self = StObject.set(x, "contentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentReferenceUndefined: Self = StObject.set(x, "contentReference", js.undefined)
  }
}
