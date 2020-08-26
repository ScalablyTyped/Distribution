package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any restrictions on medication substitution
  */
@js.native
trait MedicationRequestSubstitution extends BackboneElement {
  /**
    * Contains extended information for property 'allowed'.
    */
  var _allowed: js.UndefOr[Element] = js.native
  /**
    * Whether substitution is allowed or not
    */
  var allowed: Boolean = js.native
  /**
    * Why should (not) substitution be made
    */
  var reason: js.UndefOr[CodeableConcept] = js.native
}

object MedicationRequestSubstitution {
  @scala.inline
  def apply(allowed: Boolean): MedicationRequestSubstitution = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationRequestSubstitution]
  }
  @scala.inline
  implicit class MedicationRequestSubstitutionOps[Self <: MedicationRequestSubstitution] (val x: Self) extends AnyVal {
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
    def setAllowed(value: Boolean): Self = this.set("allowed", value.asInstanceOf[js.Any])
    @scala.inline
    def set_allowed(value: Element): Self = this.set("_allowed", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_allowed: Self = this.set("_allowed", js.undefined)
    @scala.inline
    def setReason(value: CodeableConcept): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

