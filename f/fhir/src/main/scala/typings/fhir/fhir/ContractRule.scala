package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ContractRuleOps[Self <: ContractRule] (val x: Self) extends AnyVal {
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

