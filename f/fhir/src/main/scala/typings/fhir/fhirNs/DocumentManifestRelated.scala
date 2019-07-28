package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Related things
  */
trait DocumentManifestRelated extends BackboneElement {
  /**
    * Identifiers of things that are related
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Related Resource
    */
  var ref: js.UndefOr[Reference] = js.undefined
}

object DocumentManifestRelated {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: Identifier = null,
    modifierExtension: js.Array[Extension] = null,
    ref: Reference = null
  ): DocumentManifestRelated = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[DocumentManifestRelated]
  }
}

