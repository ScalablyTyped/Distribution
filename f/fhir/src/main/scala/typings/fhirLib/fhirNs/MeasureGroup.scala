package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Population criteria group
  */
trait MeasureGroup extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Summary description
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unique identifier
    */
  var identifier: Identifier
  /**
    * Short name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Population criteria
    */
  var population: js.UndefOr[js.Array[MeasureGroupPopulation]] = js.undefined
  /**
    * Stratifier criteria for the measure
    */
  var stratifier: js.UndefOr[js.Array[MeasureGroupStratifier]] = js.undefined
}

object MeasureGroup {
  @scala.inline
  def apply(
    identifier: Identifier,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    description: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    name: java.lang.String = null,
    population: js.Array[MeasureGroupPopulation] = null,
    stratifier: js.Array[MeasureGroupStratifier] = null
  ): MeasureGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identifier")(identifier)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (population != null) __obj.updateDynamic("population")(population)
    if (stratifier != null) __obj.updateDynamic("stratifier")(stratifier)
    __obj.asInstanceOf[MeasureGroup]
  }
}

