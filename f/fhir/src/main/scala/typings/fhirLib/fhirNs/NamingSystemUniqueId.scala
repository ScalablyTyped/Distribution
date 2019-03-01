package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unique identifiers used for system
  */
trait NamingSystemUniqueId extends BackboneElement {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'preferred'.
    */
  var _preferred: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Notes about identifier usage
    */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When is identifier valid?
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Is this the id that should be used for this type
    */
  var preferred: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * oid | uuid | uri | other
    */
  var `type`: code
  /**
    * The unique identifier
    */
  var value: java.lang.String
}

object NamingSystemUniqueId {
  @scala.inline
  def apply(
    `type`: code,
    value: java.lang.String,
    _comment: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _preferred: Element = null,
    _type: Element = null,
    _value: Element = null,
    comment: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    preferred: js.UndefOr[scala.Boolean] = js.undefined
  ): NamingSystemUniqueId = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_preferred != null) __obj.updateDynamic("_preferred")(_preferred)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_value != null) __obj.updateDynamic("_value")(_value)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (period != null) __obj.updateDynamic("period")(period)
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred)
    __obj.asInstanceOf[NamingSystemUniqueId]
  }
}

