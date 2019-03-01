package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Designations to be excluded
  */
trait ExpansionProfileDesignationExclude extends BackboneElement {
  /**
    * The designation to be excluded
    */
  var designation: js.UndefOr[js.Array[ExpansionProfileDesignationExcludeDesignation]] = js.undefined
}

object ExpansionProfileDesignationExclude {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    designation: js.Array[ExpansionProfileDesignationExcludeDesignation] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): ExpansionProfileDesignationExclude = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (designation != null) __obj.updateDynamic("designation")(designation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ExpansionProfileDesignationExclude]
  }
}

