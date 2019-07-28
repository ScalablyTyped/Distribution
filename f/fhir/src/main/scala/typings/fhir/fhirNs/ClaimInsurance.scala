package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insurance or medical plan
  */
trait ClaimInsurance extends BackboneElement {
  /**
    * Contains extended information for property 'businessArrangement'.
    */
  var _businessArrangement: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'focal'.
    */
  var _focal: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'preAuthRef'.
    */
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
    * Business agreement
    */
  var businessArrangement: js.UndefOr[String] = js.undefined
  /**
    * Adjudication results
    */
  var claimResponse: js.UndefOr[Reference] = js.undefined
  /**
    * Insurance information
    */
  var coverage: Reference
  /**
    * Is the focal Coverage
    */
  var focal: Boolean
  /**
    * Pre-Authorization/Determination Reference
    */
  var preAuthRef: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Service instance identifier
    */
  var sequence: positiveInt
}

object ClaimInsurance {
  @scala.inline
  def apply(
    coverage: Reference,
    focal: Boolean,
    sequence: positiveInt,
    _businessArrangement: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _focal: Element = null,
    _id: Element = null,
    _preAuthRef: js.Array[Element] = null,
    _sequence: Element = null,
    businessArrangement: String = null,
    claimResponse: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    preAuthRef: js.Array[String] = null
  ): ClaimInsurance = {
    val __obj = js.Dynamic.literal(coverage = coverage, focal = focal, sequence = sequence)
    if (_businessArrangement != null) __obj.updateDynamic("_businessArrangement")(_businessArrangement)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_focal != null) __obj.updateDynamic("_focal")(_focal)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_preAuthRef != null) __obj.updateDynamic("_preAuthRef")(_preAuthRef)
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence)
    if (businessArrangement != null) __obj.updateDynamic("businessArrangement")(businessArrangement)
    if (claimResponse != null) __obj.updateDynamic("claimResponse")(claimResponse)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (preAuthRef != null) __obj.updateDynamic("preAuthRef")(preAuthRef)
    __obj.asInstanceOf[ClaimInsurance]
  }
}

