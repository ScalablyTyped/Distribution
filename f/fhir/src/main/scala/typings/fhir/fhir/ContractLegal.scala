package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contract Legal Language
  */
@js.native
trait ContractLegal extends BackboneElement {
  
  /**
    * Contract Legal Text
    */
  var contentAttachment: js.UndefOr[Attachment] = js.native
  
  /**
    * Contract Legal Text
    */
  var contentReference: js.UndefOr[Reference] = js.native
}
object ContractLegal {
  
  @scala.inline
  def apply(): ContractLegal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractLegal]
  }
  
  @scala.inline
  implicit class ContractLegalOps[Self <: ContractLegal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentAttachment(value: Attachment): Self = this.set("contentAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentAttachment: Self = this.set("contentAttachment", js.undefined)
    
    @scala.inline
    def setContentReference(value: Reference): Self = this.set("contentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentReference: Self = this.set("contentReference", js.undefined)
  }
}
