package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Population criteria
  */
trait MeasureGroupPopulation extends BackboneElement {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion | measure-observation
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The name of a valid referenced CQL expression (may be namespaced) that defines this population criteria
    */
  var criteria: String
  /**
    * The human readable description of this population criteria
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Short name
    */
  var name: js.UndefOr[String] = js.undefined
}

object MeasureGroupPopulation {
  @scala.inline
  def apply(
    criteria: String,
    _criteria: Element = null,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    code: CodeableConcept = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: Identifier = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null
  ): MeasureGroupPopulation = {
    val __obj = js.Dynamic.literal(criteria = criteria)
    if (_criteria != null) __obj.updateDynamic("_criteria")(_criteria)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (code != null) __obj.updateDynamic("code")(code)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MeasureGroupPopulation]
  }
}

