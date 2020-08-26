package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Procedures performed
  */
@js.native
trait ExplanationOfBenefitProcedure extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * When the procedure was performed
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Patient's list of procedures performed
    */
  var procedureCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Patient's list of procedures performed
    */
  var procedureReference: js.UndefOr[Reference] = js.native
  /**
    * Procedure sequence for reference
    */
  var sequence: positiveInt = js.native
}

object ExplanationOfBenefitProcedure {
  @scala.inline
  def apply(sequence: positiveInt): ExplanationOfBenefitProcedure = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitProcedure]
  }
  @scala.inline
  implicit class ExplanationOfBenefitProcedureOps[Self <: ExplanationOfBenefitProcedure] (val x: Self) extends AnyVal {
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
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_sequence(value: Element): Self = this.set("_sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sequence: Self = this.set("_sequence", js.undefined)
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setProcedureCodeableConcept(value: CodeableConcept): Self = this.set("procedureCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcedureCodeableConcept: Self = this.set("procedureCodeableConcept", js.undefined)
    @scala.inline
    def setProcedureReference(value: Reference): Self = this.set("procedureReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcedureReference: Self = this.set("procedureReference", js.undefined)
  }
  
}

