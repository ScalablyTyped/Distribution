package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional items
  */
trait ClaimItemDetailSubDetail extends BackboneElement {
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
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
    * Net additional item cost
    */
  var net: js.UndefOr[Money] = js.undefined
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
    * Unique Device Identifier
    */
  var udi: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Fee, charge or cost per point
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}

object ClaimItemDetailSubDetail {
  @scala.inline
  def apply(
    sequence: positiveInt,
    _factor: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _sequence: Element = null,
    category: CodeableConcept = null,
    extension: js.Array[Extension] = null,
    factor: js.UndefOr[decimal] = js.undefined,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifier: js.Array[CodeableConcept] = null,
    modifierExtension: js.Array[Extension] = null,
    net: Money = null,
    programCode: js.Array[CodeableConcept] = null,
    quantity: Quantity = null,
    revenue: CodeableConcept = null,
    service: CodeableConcept = null,
    udi: js.Array[Reference] = null,
    unitPrice: Money = null
  ): ClaimItemDetailSubDetail = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    if (_factor != null) __obj.updateDynamic("_factor")(_factor.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (net != null) __obj.updateDynamic("net")(net.asInstanceOf[js.Any])
    if (programCode != null) __obj.updateDynamic("programCode")(programCode.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (revenue != null) __obj.updateDynamic("revenue")(revenue.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (udi != null) __obj.updateDynamic("udi")(udi.asInstanceOf[js.Any])
    if (unitPrice != null) __obj.updateDynamic("unitPrice")(unitPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimItemDetailSubDetail]
  }
}

