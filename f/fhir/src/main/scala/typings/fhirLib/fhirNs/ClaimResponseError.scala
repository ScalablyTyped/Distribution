package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Processing errors
  */
trait ClaimResponseError extends BackboneElement {
  /**
    * Contains extended information for property 'detailSequenceLinkId'.
    */
  var _detailSequenceLinkId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'subdetailSequenceLinkId'.
    */
  var _subdetailSequenceLinkId: js.UndefOr[Element] = js.undefined
  /**
    * Error code detailing processing issues
    */
  var code: CodeableConcept
  /**
    * Detail sequence number
    */
  var detailSequenceLinkId: js.UndefOr[positiveInt] = js.undefined
  /**
    * Item sequence number
    */
  var sequenceLinkId: js.UndefOr[positiveInt] = js.undefined
  /**
    * Subdetail sequence number
    */
  var subdetailSequenceLinkId: js.UndefOr[positiveInt] = js.undefined
}

object ClaimResponseError {
  @scala.inline
  def apply(
    code: CodeableConcept,
    _detailSequenceLinkId: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _sequenceLinkId: Element = null,
    _subdetailSequenceLinkId: Element = null,
    detailSequenceLinkId: js.UndefOr[positiveInt] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    sequenceLinkId: js.UndefOr[positiveInt] = js.undefined,
    subdetailSequenceLinkId: js.UndefOr[positiveInt] = js.undefined
  ): ClaimResponseError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    if (_detailSequenceLinkId != null) __obj.updateDynamic("_detailSequenceLinkId")(_detailSequenceLinkId)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_sequenceLinkId != null) __obj.updateDynamic("_sequenceLinkId")(_sequenceLinkId)
    if (_subdetailSequenceLinkId != null) __obj.updateDynamic("_subdetailSequenceLinkId")(_subdetailSequenceLinkId)
    if (!js.isUndefined(detailSequenceLinkId)) __obj.updateDynamic("detailSequenceLinkId")(detailSequenceLinkId)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(sequenceLinkId)) __obj.updateDynamic("sequenceLinkId")(sequenceLinkId)
    if (!js.isUndefined(subdetailSequenceLinkId)) __obj.updateDynamic("subdetailSequenceLinkId")(subdetailSequenceLinkId)
    __obj.asInstanceOf[ClaimResponseError]
  }
}

