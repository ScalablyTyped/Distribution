package typings.fhir.fhir

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
  var description: js.UndefOr[String] = js.undefined
  /**
    * Unique identifier
    */
  var identifier: Identifier
  /**
    * Short name
    */
  var name: js.UndefOr[String] = js.undefined
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
    description: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    population: js.Array[MeasureGroupPopulation] = null,
    stratifier: js.Array[MeasureGroupStratifier] = null
  ): MeasureGroup = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (population != null) __obj.updateDynamic("population")(population.asInstanceOf[js.Any])
    if (stratifier != null) __obj.updateDynamic("stratifier")(stratifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureGroup]
  }
}

