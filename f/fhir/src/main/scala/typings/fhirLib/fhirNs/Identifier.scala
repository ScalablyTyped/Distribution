package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An identifier intended for computation
  */
trait Identifier extends Element {
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Organization that issued id (may be just text)
    */
  var assigner: js.UndefOr[Reference] = js.undefined
  /**
    * Time period when id is/was valid for use
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * The namespace for the identifier value
    */
  var system: js.UndefOr[uri] = js.undefined
  /**
    * Description of identifier
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * usual | official | temp | secondary (If known)
    */
  var use: js.UndefOr[code] = js.undefined
  /**
    * The value that is unique
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Identifier {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _system: Element = null,
    _use: Element = null,
    _value: Element = null,
    assigner: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    period: Period = null,
    system: uri = null,
    `type`: CodeableConcept = null,
    use: code = null,
    value: java.lang.String = null
  ): Identifier = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_system != null) __obj.updateDynamic("_system")(_system)
    if (_use != null) __obj.updateDynamic("_use")(_use)
    if (_value != null) __obj.updateDynamic("_value")(_value)
    if (assigner != null) __obj.updateDynamic("assigner")(assigner)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (period != null) __obj.updateDynamic("period")(period)
    if (system != null) __obj.updateDynamic("system")(system)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (use != null) __obj.updateDynamic("use")(use)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Identifier]
  }
}

