package typings.fhir.fhir

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
    detailSequenceLinkId: Int | Double = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    sequenceLinkId: Int | Double = null,
    subdetailSequenceLinkId: Int | Double = null
  ): ClaimResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (_detailSequenceLinkId != null) __obj.updateDynamic("_detailSequenceLinkId")(_detailSequenceLinkId.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_sequenceLinkId != null) __obj.updateDynamic("_sequenceLinkId")(_sequenceLinkId.asInstanceOf[js.Any])
    if (_subdetailSequenceLinkId != null) __obj.updateDynamic("_subdetailSequenceLinkId")(_subdetailSequenceLinkId.asInstanceOf[js.Any])
    if (detailSequenceLinkId != null) __obj.updateDynamic("detailSequenceLinkId")(detailSequenceLinkId.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (sequenceLinkId != null) __obj.updateDynamic("sequenceLinkId")(sequenceLinkId.asInstanceOf[js.Any])
    if (subdetailSequenceLinkId != null) __obj.updateDynamic("subdetailSequenceLinkId")(subdetailSequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseError]
  }
}

