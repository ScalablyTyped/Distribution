package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Computable Contract Language
  */
@js.native
trait ContractRule extends BackboneElement {
  
  /**
    * Computable Contract Rules
    */
  var contentAttachment: js.UndefOr[Attachment] = js.native
  
  /**
    * Computable Contract Rules
    */
  var contentReference: js.UndefOr[Reference] = js.native
}
object ContractRule {
  
  @scala.inline
  def apply(): ContractRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractRule]
  }
  
  @scala.inline
  implicit class ContractRuleMutableBuilder[Self <: ContractRule] (val x: Self) extends AnyVal {
    
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
