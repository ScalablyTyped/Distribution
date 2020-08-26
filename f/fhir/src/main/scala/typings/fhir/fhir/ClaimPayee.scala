package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Party to be paid any benefits payable
  */
@js.native
trait ClaimPayee extends BackboneElement {
  /**
    * Party to receive the payable
    */
  var party: js.UndefOr[Reference] = js.native
  /**
    * organization | patient | practitioner | relatedperson
    */
  var resourceType: js.UndefOr[Coding] = js.native
  /**
    * Type of party: Subscriber, Provider, other
    */
  var `type`: CodeableConcept = js.native
}

object ClaimPayee {
  @scala.inline
  def apply(`type`: CodeableConcept): ClaimPayee = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimPayee]
  }
  @scala.inline
  implicit class ClaimPayeeOps[Self <: ClaimPayee] (val x: Self) extends AnyVal {
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
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setParty(value: Reference): Self = this.set("party", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParty: Self = this.set("party", js.undefined)
    @scala.inline
    def setResourceType(value: Coding): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

