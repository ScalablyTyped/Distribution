package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stratifier criteria for the measure
  */
trait MeasureGroupStratifier extends BackboneElement {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * How the measure should be stratified
    */
  var criteria: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The identifier for the stratifier used to coordinate the reported data back to this stratifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Path to the stratifier
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object MeasureGroupStratifier {
  @scala.inline
  def apply(
    _criteria: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _path: Element = null,
    criteria: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    identifier: Identifier = null,
    modifierExtension: js.Array[Extension] = null,
    path: java.lang.String = null
  ): MeasureGroupStratifier = {
    val __obj = js.Dynamic.literal()
    if (_criteria != null) __obj.updateDynamic("_criteria")(_criteria)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_path != null) __obj.updateDynamic("_path")(_path)
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[MeasureGroupStratifier]
  }
}

