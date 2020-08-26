package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of Diagnosis
  */
@js.native
trait ExplanationOfBenefitDiagnosis extends BackboneElement {
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Patient's diagnosis
    */
  var diagnosisCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Patient's diagnosis
    */
  var diagnosisReference: js.UndefOr[Reference] = js.native
  /**
    * Package billing code
    */
  var packageCode: js.UndefOr[CodeableConcept] = js.native
  /**
    * Number to covey order of diagnosis
    */
  var sequence: positiveInt = js.native
  /**
    * Timing or nature of the diagnosis
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object ExplanationOfBenefitDiagnosis {
  @scala.inline
  def apply(sequence: positiveInt): ExplanationOfBenefitDiagnosis = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitDiagnosis]
  }
  @scala.inline
  implicit class ExplanationOfBenefitDiagnosisOps[Self <: ExplanationOfBenefitDiagnosis] (val x: Self) extends AnyVal {
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
    def setSequence(value: positiveInt): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def set_sequence(value: Element): Self = this.set("_sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sequence: Self = this.set("_sequence", js.undefined)
    @scala.inline
    def setDiagnosisCodeableConcept(value: CodeableConcept): Self = this.set("diagnosisCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosisCodeableConcept: Self = this.set("diagnosisCodeableConcept", js.undefined)
    @scala.inline
    def setDiagnosisReference(value: Reference): Self = this.set("diagnosisReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosisReference: Self = this.set("diagnosisReference", js.undefined)
    @scala.inline
    def setPackageCode(value: CodeableConcept): Self = this.set("packageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageCode: Self = this.set("packageCode", js.undefined)
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

