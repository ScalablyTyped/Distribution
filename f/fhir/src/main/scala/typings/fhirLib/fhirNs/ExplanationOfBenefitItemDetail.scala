package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional items
  */
trait ExplanationOfBenefitItemDetail extends BackboneElement {
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
    * Detail level adjudication details
    */
  var adjudication: js.UndefOr[js.Array[ExplanationOfBenefitItemAdjudication]] = js.undefined
  /**
    * Type of service or product
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Price scaling factor
    */
  var factor: js.UndefOr[decimal] = js.undefined
  /**
    * Service/Product billing modifiers
    */
  var modifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Total additional item cost
    */
  var net: js.UndefOr[Money] = js.undefined
  /**
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
    * Program specific reason for item inclusion
    */
  var programCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Count of Products or Services
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Revenue or cost center code
    */
  var revenue: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Service instance
    */
  var sequence: positiveInt
  /**
    * Billing Code
    */
  var service: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Additional items
    */
  var subDetail: js.UndefOr[js.Array[ExplanationOfBenefitItemDetailSubDetail]] = js.undefined
  /**
    * Group or type of product or service
    */
  var `type`: CodeableConcept
  /**
    * Unique Device Identifier
    */
  var udi: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Fee, charge or cost per point
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}

object ExplanationOfBenefitItemDetail {
  @scala.inline
  def apply(
    sequence: positiveInt,
    `type`: CodeableConcept,
    _factor: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _noteNumber: js.Array[Element] = null,
    _sequence: Element = null,
    adjudication: js.Array[ExplanationOfBenefitItemAdjudication] = null,
    category: CodeableConcept = null,
    extension: js.Array[Extension] = null,
    factor: js.UndefOr[decimal] = js.undefined,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifier: js.Array[CodeableConcept] = null,
    modifierExtension: js.Array[Extension] = null,
    net: Money = null,
    noteNumber: js.Array[positiveInt] = null,
    programCode: js.Array[CodeableConcept] = null,
    quantity: Quantity = null,
    revenue: CodeableConcept = null,
    service: CodeableConcept = null,
    subDetail: js.Array[ExplanationOfBenefitItemDetailSubDetail] = null,
    udi: js.Array[Reference] = null,
    unitPrice: Money = null
  ): ExplanationOfBenefitItemDetail = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("sequence")(sequence)
    if (_factor != null) __obj.updateDynamic("_factor")(_factor)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_noteNumber != null) __obj.updateDynamic("_noteNumber")(_noteNumber)
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence)
    if (adjudication != null) __obj.updateDynamic("adjudication")(adjudication)
    if (category != null) __obj.updateDynamic("category")(category)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (net != null) __obj.updateDynamic("net")(net)
    if (noteNumber != null) __obj.updateDynamic("noteNumber")(noteNumber)
    if (programCode != null) __obj.updateDynamic("programCode")(programCode)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (revenue != null) __obj.updateDynamic("revenue")(revenue)
    if (service != null) __obj.updateDynamic("service")(service)
    if (subDetail != null) __obj.updateDynamic("subDetail")(subDetail)
    if (udi != null) __obj.updateDynamic("udi")(udi)
    if (unitPrice != null) __obj.updateDynamic("unitPrice")(unitPrice)
    __obj.asInstanceOf[ExplanationOfBenefitItemDetail]
  }
}

