package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Whether a substitution was performed on the dispense
  */
@js.native
trait MedicationDispenseSubstitution extends BackboneElement {
  /**
    * Contains extended information for property 'wasSubstituted'.
    */
  var _wasSubstituted: js.UndefOr[Element] = js.native
  /**
    * Why was substitution made
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Who is responsible for the substitution
    */
  var responsibleParty: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Code signifying whether a different drug was dispensed from what was prescribed
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  /**
    * Whether a substitution was or was not performed on the dispense
    */
  var wasSubstituted: Boolean = js.native
}

object MedicationDispenseSubstitution {
  @scala.inline
  def apply(wasSubstituted: Boolean): MedicationDispenseSubstitution = {
    val __obj = js.Dynamic.literal(wasSubstituted = wasSubstituted.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationDispenseSubstitution]
  }
  @scala.inline
  implicit class MedicationDispenseSubstitutionOps[Self <: MedicationDispenseSubstitution] (val x: Self) extends AnyVal {
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
    def setWasSubstituted(value: Boolean): Self = this.set("wasSubstituted", value.asInstanceOf[js.Any])
    @scala.inline
    def set_wasSubstituted(value: Element): Self = this.set("_wasSubstituted", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_wasSubstituted: Self = this.set("_wasSubstituted", js.undefined)
    @scala.inline
    def setReasonVarargs(value: CodeableConcept*): Self = this.set("reason", js.Array(value :_*))
    @scala.inline
    def setReason(value: js.Array[CodeableConcept]): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setResponsiblePartyVarargs(value: Reference*): Self = this.set("responsibleParty", js.Array(value :_*))
    @scala.inline
    def setResponsibleParty(value: js.Array[Reference]): Self = this.set("responsibleParty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsibleParty: Self = this.set("responsibleParty", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

