package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Trait of group members
  */
trait GroupCharacteristic extends BackboneElement {
  /**
    * Contains extended information for property 'exclude'.
    */
  var _exclude: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Kind of characteristic
    */
  var code: CodeableConcept
  /**
    * Group includes or excludes
    */
  var exclude: Boolean
  /**
    * Period over which characteristic is tested
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Value held by characteristic
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * Value held by characteristic
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Value held by characteristic
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Value held by characteristic
    */
  var valueRange: js.UndefOr[Range] = js.undefined
}

object GroupCharacteristic {
  @scala.inline
  def apply(
    code: CodeableConcept,
    exclude: Boolean,
    _exclude: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _valueBoolean: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    valueBoolean: js.UndefOr[Boolean] = js.undefined,
    valueCodeableConcept: CodeableConcept = null,
    valueQuantity: Quantity = null,
    valueRange: Range = null
  ): GroupCharacteristic = {
    val __obj = js.Dynamic.literal(code = code, exclude = exclude)
    if (_exclude != null) __obj.updateDynamic("_exclude")(_exclude)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_valueBoolean != null) __obj.updateDynamic("_valueBoolean")(_valueBoolean)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (period != null) __obj.updateDynamic("period")(period)
    if (!js.isUndefined(valueBoolean)) __obj.updateDynamic("valueBoolean")(valueBoolean)
    if (valueCodeableConcept != null) __obj.updateDynamic("valueCodeableConcept")(valueCodeableConcept)
    if (valueQuantity != null) __obj.updateDynamic("valueQuantity")(valueQuantity)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[GroupCharacteristic]
  }
}

