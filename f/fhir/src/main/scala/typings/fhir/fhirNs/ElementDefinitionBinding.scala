package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ValueSet details if this is coded
  */
trait ElementDefinitionBinding extends Element {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'strength'.
    */
  var _strength: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueSetUri'.
    */
  var _valueSetUri: js.UndefOr[Element] = js.undefined
  /**
    * Human explanation of the value set
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * required | extensible | preferred | example
    */
  var strength: code
  /**
    * Source of value set
    */
  var valueSetReference: js.UndefOr[Reference] = js.undefined
  /**
    * Source of value set
    */
  var valueSetUri: js.UndefOr[uri] = js.undefined
}

object ElementDefinitionBinding {
  @scala.inline
  def apply(
    strength: code,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _strength: Element = null,
    _valueSetUri: Element = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    valueSetReference: Reference = null,
    valueSetUri: uri = null
  ): ElementDefinitionBinding = {
    val __obj = js.Dynamic.literal(strength = strength)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_strength != null) __obj.updateDynamic("_strength")(_strength)
    if (_valueSetUri != null) __obj.updateDynamic("_valueSetUri")(_valueSetUri)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (valueSetReference != null) __obj.updateDynamic("valueSetReference")(valueSetReference)
    if (valueSetUri != null) __obj.updateDynamic("valueSetUri")(valueSetUri)
    __obj.asInstanceOf[ElementDefinitionBinding]
  }
}

