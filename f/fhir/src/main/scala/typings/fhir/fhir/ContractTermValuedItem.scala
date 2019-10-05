package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Term Valued Item List
  */
trait ContractTermValuedItem extends BackboneElement {
  /**
    * Contains extended information for property 'effectiveTime'.
    */
  var _effectiveTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'points'.
    */
  var _points: js.UndefOr[Element] = js.undefined
  /**
    * Contract Term Valued Item Effective Tiem
    */
  var effectiveTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Contract Term Valued Item Type
    */
  var entityCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Contract Term Valued Item Type
    */
  var entityReference: js.UndefOr[Reference] = js.undefined
  /**
    * Contract Term Valued Item Price Scaling Factor
    */
  var factor: js.UndefOr[decimal] = js.undefined
  /**
    * Contract Term Valued Item Number
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Total Contract Term Valued Item Value
    */
  var net: js.UndefOr[Money] = js.undefined
  /**
    * Contract Term Valued Item Difficulty Scaling Factor
    */
  var points: js.UndefOr[decimal] = js.undefined
  /**
    * Contract Term Valued Item Count
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Contract Term Valued Item fee, charge, or cost
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}

object ContractTermValuedItem {
  @scala.inline
  def apply(
    _effectiveTime: Element = null,
    _factor: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _points: Element = null,
    effectiveTime: dateTime = null,
    entityCodeableConcept: CodeableConcept = null,
    entityReference: Reference = null,
    extension: js.Array[Extension] = null,
    factor: Int | Double = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: Identifier = null,
    modifierExtension: js.Array[Extension] = null,
    net: Money = null,
    points: Int | Double = null,
    quantity: Quantity = null,
    unitPrice: Money = null
  ): ContractTermValuedItem = {
    val __obj = js.Dynamic.literal()
    if (_effectiveTime != null) __obj.updateDynamic("_effectiveTime")(_effectiveTime)
    if (_factor != null) __obj.updateDynamic("_factor")(_factor)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_points != null) __obj.updateDynamic("_points")(_points)
    if (effectiveTime != null) __obj.updateDynamic("effectiveTime")(effectiveTime)
    if (entityCodeableConcept != null) __obj.updateDynamic("entityCodeableConcept")(entityCodeableConcept)
    if (entityReference != null) __obj.updateDynamic("entityReference")(entityReference)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (net != null) __obj.updateDynamic("net")(net)
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (unitPrice != null) __obj.updateDynamic("unitPrice")(unitPrice)
    __obj.asInstanceOf[ContractTermValuedItem]
  }
}

