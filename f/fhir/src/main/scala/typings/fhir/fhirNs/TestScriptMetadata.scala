package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Required capability that is assumed to function correctly on the FHIR server being tested
  */
trait TestScriptMetadata extends BackboneElement {
  /**
    * Capabilities  that are assumed to function correctly on the FHIR server being tested
    */
  var capability: js.Array[TestScriptMetadataCapability]
  /**
    * Links to the FHIR specification
    */
  var link: js.UndefOr[js.Array[TestScriptMetadataLink]] = js.undefined
}

object TestScriptMetadata {
  @scala.inline
  def apply(
    capability: js.Array[TestScriptMetadataCapability],
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    link: js.Array[TestScriptMetadataLink] = null,
    modifierExtension: js.Array[Extension] = null
  ): TestScriptMetadata = {
    val __obj = js.Dynamic.literal(capability = capability)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (link != null) __obj.updateDynamic("link")(link)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[TestScriptMetadata]
  }
}

