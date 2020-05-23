package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A measured or measurable amount
  */
trait Quantity extends Element {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'comparator'.
    */
  var _comparator: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'unit'.
    */
  var _unit: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Coded form of the unit
    */
  var code: js.UndefOr[typings.fhir.fhir.code] = js.undefined
  /**
    * < | <= | >= | > - how to understand the value
    */
  var comparator: js.UndefOr[code] = js.undefined
  /**
    * System that defines coded unit form
    */
  var system: js.UndefOr[uri] = js.undefined
  /**
    * Unit representation
    */
  var unit: js.UndefOr[String] = js.undefined
  /**
    * Numerical value (with implicit precision)
    */
  var value: js.UndefOr[decimal] = js.undefined
}

object Quantity {
  @scala.inline
  def apply(
    _code: Element = null,
    _comparator: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _system: Element = null,
    _unit: Element = null,
    _value: Element = null,
    code: code = null,
    comparator: code = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    system: uri = null,
    unit: String = null,
    value: js.UndefOr[decimal] = js.undefined
  ): Quantity = {
    val __obj = js.Dynamic.literal()
    if (_code != null) __obj.updateDynamic("_code")(_code.asInstanceOf[js.Any])
    if (_comparator != null) __obj.updateDynamic("_comparator")(_comparator.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_system != null) __obj.updateDynamic("_system")(_system.asInstanceOf[js.Any])
    if (_unit != null) __obj.updateDynamic("_unit")(_unit.asInstanceOf[js.Any])
    if (_value != null) __obj.updateDynamic("_value")(_value.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quantity]
  }
}

