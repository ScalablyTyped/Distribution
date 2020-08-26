package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Friendly Language
  */
@js.native
trait ContractFriendly extends BackboneElement {
  /**
    * Easily comprehended representation of this Contract
    */
  var contentAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Easily comprehended representation of this Contract
    */
  var contentReference: js.UndefOr[Reference] = js.native
}

object ContractFriendly {
  @scala.inline
  def apply(): ContractFriendly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractFriendly]
  }
  @scala.inline
  implicit class ContractFriendlyOps[Self <: ContractFriendly] (val x: Self) extends AnyVal {
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

