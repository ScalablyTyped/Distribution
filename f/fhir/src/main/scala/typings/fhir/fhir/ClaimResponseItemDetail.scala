package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detail line items
  */
trait ClaimResponseItemDetail extends BackboneElement {
  /**
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.undefined
  /**
    * Detail level adjudication details
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  /**
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
    * Service instance
    */
  var sequenceLinkId: positiveInt
  /**
    * Subdetail line items
    */
  var subDetail: js.UndefOr[js.Array[ClaimResponseItemDetailSubDetail]] = js.undefined
}

object ClaimResponseItemDetail {
  @scala.inline
  def apply(
    sequenceLinkId: positiveInt,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _noteNumber: js.Array[Element] = null,
    _sequenceLinkId: Element = null,
    adjudication: js.Array[ClaimResponseItemAdjudication] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    noteNumber: js.Array[positiveInt] = null,
    subDetail: js.Array[ClaimResponseItemDetailSubDetail] = null
  ): ClaimResponseItemDetail = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_noteNumber != null) __obj.updateDynamic("_noteNumber")(_noteNumber.asInstanceOf[js.Any])
    if (_sequenceLinkId != null) __obj.updateDynamic("_sequenceLinkId")(_sequenceLinkId.asInstanceOf[js.Any])
    if (adjudication != null) __obj.updateDynamic("adjudication")(adjudication.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (noteNumber != null) __obj.updateDynamic("noteNumber")(noteNumber.asInstanceOf[js.Any])
    if (subDetail != null) __obj.updateDynamic("subDetail")(subDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemDetail]
  }
}

