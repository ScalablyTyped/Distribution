package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Link to a resource that concerns the same actual person
  */
trait PersonLink extends BackboneElement {
  /**
    * Contains extended information for property 'assurance'.
    */
  var _assurance: js.UndefOr[Element] = js.undefined
  /**
    * level1 | level2 | level3 | level4
    */
  var assurance: js.UndefOr[code] = js.undefined
  /**
    * The resource to which this actual person is associated
    */
  var target: Reference
}

object PersonLink {
  @scala.inline
  def apply(
    target: Reference,
    _assurance: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    assurance: code = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): PersonLink = {
    val __obj = js.Dynamic.literal(target = target)
    if (_assurance != null) __obj.updateDynamic("_assurance")(_assurance)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (assurance != null) __obj.updateDynamic("assurance")(assurance)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[PersonLink]
  }
}

