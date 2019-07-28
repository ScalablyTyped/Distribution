package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of an operation or a custom query
  */
trait CapabilityStatementRestOperation extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * The defined operation/query
    */
  var definition: Reference
  /**
    * Name by which the operation/query is invoked
    */
  var name: String
}

object CapabilityStatementRestOperation {
  @scala.inline
  def apply(
    definition: Reference,
    name: String,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): CapabilityStatementRestOperation = {
    val __obj = js.Dynamic.literal(definition = definition, name = name)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[CapabilityStatementRestOperation]
  }
}

