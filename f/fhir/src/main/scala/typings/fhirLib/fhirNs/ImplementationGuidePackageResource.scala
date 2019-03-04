package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource in the implementation guide
  */
trait ImplementationGuidePackageResource extends BackboneElement {
  /**
    * Contains extended information for property 'acronym'.
    */
  var _acronym: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'example'.
    */
  var _example: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sourceUri'.
    */
  var _sourceUri: js.UndefOr[Element] = js.undefined
  /**
    * Short code to identify the resource
    */
  var acronym: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Reason why included in guide
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If not an example, has its normal meaning
    */
  var example: scala.Boolean
  /**
    * Resource this is an example of (if applicable)
    */
  var exampleFor: js.UndefOr[Reference] = js.undefined
  /**
    * Human Name for the resource
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Location of the resource
    */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  /**
    * Location of the resource
    */
  var sourceUri: js.UndefOr[uri] = js.undefined
}

object ImplementationGuidePackageResource {
  @scala.inline
  def apply(
    example: scala.Boolean,
    _acronym: Element = null,
    _description: Element = null,
    _example: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _sourceUri: Element = null,
    acronym: java.lang.String = null,
    description: java.lang.String = null,
    exampleFor: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    name: java.lang.String = null,
    sourceReference: Reference = null,
    sourceUri: uri = null
  ): ImplementationGuidePackageResource = {
    val __obj = js.Dynamic.literal(example = example)
    if (_acronym != null) __obj.updateDynamic("_acronym")(_acronym)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_example != null) __obj.updateDynamic("_example")(_example)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_sourceUri != null) __obj.updateDynamic("_sourceUri")(_sourceUri)
    if (acronym != null) __obj.updateDynamic("acronym")(acronym)
    if (description != null) __obj.updateDynamic("description")(description)
    if (exampleFor != null) __obj.updateDynamic("exampleFor")(exampleFor)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference)
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    __obj.asInstanceOf[ImplementationGuidePackageResource]
  }
}

