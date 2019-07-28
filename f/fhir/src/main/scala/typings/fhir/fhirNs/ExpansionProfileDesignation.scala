package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When the expansion profile imposes designation contraints
  */
trait ExpansionProfileDesignation extends BackboneElement {
  /**
    * Designations to be excluded
    */
  var exclude: js.UndefOr[ExpansionProfileDesignationExclude] = js.undefined
  /**
    * Designations to be included
    */
  var include: js.UndefOr[ExpansionProfileDesignationInclude] = js.undefined
}

object ExpansionProfileDesignation {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    exclude: ExpansionProfileDesignationExclude = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    include: ExpansionProfileDesignationInclude = null,
    modifierExtension: js.Array[Extension] = null
  ): ExpansionProfileDesignation = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (include != null) __obj.updateDynamic("include")(include)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ExpansionProfileDesignation]
  }
}

