package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Members of the team
  */
@js.native
trait CareTeamParticipant extends BackboneElement {
  /**
    * Who is involved
    */
  var member: js.UndefOr[Reference] = js.native
  /**
    * Organization of the practitioner
    */
  var onBehalfOf: js.UndefOr[Reference] = js.native
  /**
    * Time period of participant
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Type of involvement
    */
  var role: js.UndefOr[CodeableConcept] = js.native
}

object CareTeamParticipant {
  @scala.inline
  def apply(): CareTeamParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CareTeamParticipant]
  }
  @scala.inline
  implicit class CareTeamParticipantOps[Self <: CareTeamParticipant] (val x: Self) extends AnyVal {
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
    def setMember(value: Reference): Self = this.set("member", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMember: Self = this.set("member", js.undefined)
    @scala.inline
    def setOnBehalfOf(value: Reference): Self = this.set("onBehalfOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOf: Self = this.set("onBehalfOf", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setRole(value: CodeableConcept): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

