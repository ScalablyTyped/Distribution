package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Population results in this stratum
  */
trait MeasureReportGroupStratifierStratumPopulation extends BackboneElement {
  /**
    * Contains extended information for property 'count'.
    */
  var _count: js.UndefOr[Element] = js.undefined
  /**
    * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-score
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Size of the population
    */
  var count: js.UndefOr[integer] = js.undefined
  /**
    * Population identifier as defined in the measure
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * For patient-list reports, the patients in this population
    */
  var patients: js.UndefOr[Reference] = js.undefined
}

object MeasureReportGroupStratifierStratumPopulation {
  @scala.inline
  def apply(
    _count: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    code: CodeableConcept = null,
    count: js.UndefOr[integer] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: Identifier = null,
    modifierExtension: js.Array[Extension] = null,
    patients: Reference = null
  ): MeasureReportGroupStratifierStratumPopulation = {
    val __obj = js.Dynamic.literal()
    if (_count != null) __obj.updateDynamic("_count")(_count.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (patients != null) __obj.updateDynamic("patients")(patients.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroupStratifierStratumPopulation]
  }
}

