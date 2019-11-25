package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Procedures performed
  */
trait ClaimProcedure extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
    * When the procedure was performed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Patient's list of procedures performed
    */
  var procedureCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Patient's list of procedures performed
    */
  var procedureReference: js.UndefOr[Reference] = js.undefined
  /**
    * Procedure sequence for reference
    */
  var sequence: positiveInt
}

object ClaimProcedure {
  @scala.inline
  def apply(
    sequence: positiveInt,
    _date: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _sequence: Element = null,
    date: dateTime = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    procedureCodeableConcept: CodeableConcept = null,
    procedureReference: Reference = null
  ): ClaimProcedure = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (procedureCodeableConcept != null) __obj.updateDynamic("procedureCodeableConcept")(procedureCodeableConcept.asInstanceOf[js.Any])
    if (procedureReference != null) __obj.updateDynamic("procedureReference")(procedureReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimProcedure]
  }
}

