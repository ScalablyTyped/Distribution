package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insurer added line items
  */
trait ClaimResponseAddItem extends BackboneElement {
  /**
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Added items adjudication
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  /**
    * Type of service or product
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Added items details
    */
  var detail: js.UndefOr[js.Array[ClaimResponseAddItemDetail]] = js.undefined
  /**
    * Professional fee or Product charge
    */
  var fee: js.UndefOr[Money] = js.undefined
  /**
    * Service/Product billing modifiers
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
    * Revenue or cost center code
    */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Service instances
    */
  var sequenceLinkId: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
    * Group, Service or Product
    */
  var service: js.UndefOr[CodeableConcept] = js.undefined
}

object ClaimResponseAddItem {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _noteNumber: js.Array[Element] = null,
    _sequenceLinkId: js.Array[Element] = null,
    adjudication: js.Array[ClaimResponseItemAdjudication] = null,
    category: CodeableConcept = null,
    detail: js.Array[ClaimResponseAddItemDetail] = null,
    extension: js.Array[Extension] = null,
    fee: Money = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifier: js.Array[CodeableConcept] = null,
    modifierExtension: js.Array[Extension] = null,
    noteNumber: js.Array[positiveInt] = null,
    revenue: CodeableConcept = null,
    sequenceLinkId: js.Array[positiveInt] = null,
    service: CodeableConcept = null
  ): ClaimResponseAddItem = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_noteNumber != null) __obj.updateDynamic("_noteNumber")(_noteNumber)
    if (_sequenceLinkId != null) __obj.updateDynamic("_sequenceLinkId")(_sequenceLinkId)
    if (adjudication != null) __obj.updateDynamic("adjudication")(adjudication)
    if (category != null) __obj.updateDynamic("category")(category)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fee != null) __obj.updateDynamic("fee")(fee)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (noteNumber != null) __obj.updateDynamic("noteNumber")(noteNumber)
    if (revenue != null) __obj.updateDynamic("revenue")(revenue)
    if (sequenceLinkId != null) __obj.updateDynamic("sequenceLinkId")(sequenceLinkId)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[ClaimResponseAddItem]
  }
}

