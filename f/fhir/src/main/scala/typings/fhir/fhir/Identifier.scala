package typings.fhir.fhir

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
  var value: js.UndefOr[String] = js.undefined
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
    fhir_comments: js.Array[String] = null,
    id: String = null,
    period: Period = null,
    system: uri = null,
    `type`: CodeableConcept = null,
    use: code = null,
    value: String = null
  ): Identifier = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_system != null) __obj.updateDynamic("_system")(_system.asInstanceOf[js.Any])
    if (_use != null) __obj.updateDynamic("_use")(_use.asInstanceOf[js.Any])
    if (_value != null) __obj.updateDynamic("_value")(_value.asInstanceOf[js.Any])
    if (assigner != null) __obj.updateDynamic("assigner")(assigner.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

