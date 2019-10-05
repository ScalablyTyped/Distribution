package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Line items
  */
trait ClaimResponseItem extends BackboneElement {
  /**
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.undefined
  /**
    * Adjudication details
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  /**
    * Detail line items
    */
  var detail: js.UndefOr[js.Array[ClaimResponseItemDetail]] = js.undefined
  /**
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
    * Service instance
    */
  var sequenceLinkId: positiveInt
}

object ClaimResponseItem {
  @scala.inline
  def apply(
    sequenceLinkId: positiveInt,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _noteNumber: js.Array[Element] = null,
    _sequenceLinkId: Element = null,
    adjudication: js.Array[ClaimResponseItemAdjudication] = null,
    detail: js.Array[ClaimResponseItemDetail] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    noteNumber: js.Array[positiveInt] = null
  ): ClaimResponseItem = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_noteNumber != null) __obj.updateDynamic("_noteNumber")(_noteNumber)
    if (_sequenceLinkId != null) __obj.updateDynamic("_sequenceLinkId")(_sequenceLinkId)
    if (adjudication != null) __obj.updateDynamic("adjudication")(adjudication)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (noteNumber != null) __obj.updateDynamic("noteNumber")(noteNumber)
    __obj.asInstanceOf[ClaimResponseItem]
  }
}

