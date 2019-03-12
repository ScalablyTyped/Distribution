package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information supplied about each concept
  */
trait CodeSystemProperty extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.undefined
  /**
    * Identifies the property on the concepts, and when referred to in operations
    */
  var code: fhirLib.fhirNs.code
  /**
    * Why the property is defined, and/or what it conveys
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * code | Coding | string | integer | boolean | dateTime
    */
  var `type`: code
  /**
    * Formal identifier for the property
    */
  var uri: js.UndefOr[uri] = js.undefined
}

object CodeSystemProperty {
  @scala.inline
  def apply(
    code: code,
    `type`: code,
    _code: Element = null,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    _uri: Element = null,
    description: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    uri: uri = null
  ): CodeSystemProperty = {
    val __obj = js.Dynamic.literal(code = code)
    __obj.updateDynamic("type")(`type`)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_uri != null) __obj.updateDynamic("_uri")(_uri)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[CodeSystemProperty]
  }
}

