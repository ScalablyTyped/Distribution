package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exceptions, special considerations, the condition, situation, prior or concurrent issues
  */
@js.native
trait ClaimInformation extends BackboneElement {
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'timingDate'.
    */
  var _timingDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  /**
    * General class of information
    */
  var category: CodeableConcept = js.native
  /**
    * Type of information
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * Reason associated with the information
    */
  var reason: js.UndefOr[CodeableConcept] = js.native
  /**
    * Information instance identifier
    */
  var sequence: positiveInt = js.native
  /**
    * When it occurred
    */
  var timingDate: js.UndefOr[date] = js.native
  /**
    * When it occurred
    */
  var timingPeriod: js.UndefOr[Period] = js.native
  /**
    * Additional Data or supporting information
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Additional Data or supporting information
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Additional Data or supporting information
    */
  var valueReference: js.UndefOr[Reference] = js.native
  /**
    * Additional Data or supporting information
    */
  var valueString: js.UndefOr[String] = js.native
}

object ClaimInformation {
  @scala.inline
  def apply(category: CodeableConcept, sequence: positiveInt): ClaimInformation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimInformation]
  }
  @scala.inline
  implicit class ClaimInformationOps[Self <: ClaimInformation] (val x: Self) extends AnyVal {
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
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequence(value: positiveInt): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def set_sequence(value: Element): Self = this.set("_sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sequence: Self = this.set("_sequence", js.undefined)
    @scala.inline
    def set_timingDate(value: Element): Self = this.set("_timingDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_timingDate: Self = this.set("_timingDate", js.undefined)
    @scala.inline
    def set_valueString(value: Element): Self = this.set("_valueString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueString: Self = this.set("_valueString", js.undefined)
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setReason(value: CodeableConcept): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setTimingDate(value: date): Self = this.set("timingDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingDate: Self = this.set("timingDate", js.undefined)
    @scala.inline
    def setTimingPeriod(value: Period): Self = this.set("timingPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingPeriod: Self = this.set("timingPeriod", js.undefined)
    @scala.inline
    def setValueAttachment(value: Attachment): Self = this.set("valueAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueAttachment: Self = this.set("valueAttachment", js.undefined)
    @scala.inline
    def setValueQuantity(value: Quantity): Self = this.set("valueQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueQuantity: Self = this.set("valueQuantity", js.undefined)
    @scala.inline
    def setValueReference(value: Reference): Self = this.set("valueReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueReference: Self = this.set("valueReference", js.undefined)
    @scala.inline
    def setValueString(value: String): Self = this.set("valueString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueString: Self = this.set("valueString", js.undefined)
  }
  
}

