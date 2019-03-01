package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Valued Item List
  */
trait ContractValuedItem extends BackboneElement {
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
    * Contract Valued Item Effective Tiem
    */
  var effectiveTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Contract Valued Item Type
    */
  var entityCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Contract Valued Item Type
    */
  var entityReference: js.UndefOr[Reference] = js.undefined
  /**
    * Contract Valued Item Price Scaling Factor
    */
  var factor: js.UndefOr[decimal] = js.undefined
  /**
    * Contract Valued Item Number
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Total Contract Valued Item Value
    */
  var net: js.UndefOr[Money] = js.undefined
  /**
    * Contract Valued Item Difficulty Scaling Factor
    */
  var points: js.UndefOr[decimal] = js.undefined
  /**
    * Count of Contract Valued Items
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Contract Valued Item fee, charge, or cost
    */
  var unitPrice: js.UndefOr[Money] = js.undefined
}

object ContractValuedItem {
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
    factor: js.UndefOr[decimal] = js.undefined,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    identifier: Identifier = null,
    modifierExtension: js.Array[Extension] = null,
    net: Money = null,
    points: js.UndefOr[decimal] = js.undefined,
    quantity: Quantity = null,
    unitPrice: Money = null
  ): ContractValuedItem = {
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
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (net != null) __obj.updateDynamic("net")(net)
    if (!js.isUndefined(points)) __obj.updateDynamic("points")(points)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (unitPrice != null) __obj.updateDynamic("unitPrice")(unitPrice)
    __obj.asInstanceOf[ContractValuedItem]
  }
}

