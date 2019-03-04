package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Profiles that apply globally
  */
trait ImplementationGuideGlobal extends BackboneElement {
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Profile that all resources must conform to
    */
  var profile: Reference
  /**
    * Type this profiles applies to
    */
  var `type`: code
}

object ImplementationGuideGlobal {
  @scala.inline
  def apply(
    profile: Reference,
    `type`: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): ImplementationGuideGlobal = {
    val __obj = js.Dynamic.literal(profile = profile)
    __obj.updateDynamic("type")(`type`)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ImplementationGuideGlobal]
  }
}

