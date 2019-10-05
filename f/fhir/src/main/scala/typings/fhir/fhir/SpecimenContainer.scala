package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Direct container of specimen (tube/slide, etc.)
  */
trait SpecimenContainer extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Additive associated with container
    */
  var additiveCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Additive associated with container
    */
  var additiveReference: js.UndefOr[Reference] = js.undefined
  /**
    * Container volume or size
    */
  var capacity: js.UndefOr[Quantity] = js.undefined
  /**
    * Textual description of the container
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Id for the container
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Quantity of specimen within container
    */
  var specimenQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Kind of container directly associated with specimen
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object SpecimenContainer {
  @scala.inline
  def apply(
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    additiveCodeableConcept: CodeableConcept = null,
    additiveReference: Reference = null,
    capacity: Quantity = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: js.Array[Identifier] = null,
    modifierExtension: js.Array[Extension] = null,
    specimenQuantity: Quantity = null,
    `type`: CodeableConcept = null
  ): SpecimenContainer = {
    val __obj = js.Dynamic.literal()
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (additiveCodeableConcept != null) __obj.updateDynamic("additiveCodeableConcept")(additiveCodeableConcept)
    if (additiveReference != null) __obj.updateDynamic("additiveReference")(additiveReference)
    if (capacity != null) __obj.updateDynamic("capacity")(capacity)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (specimenQuantity != null) __obj.updateDynamic("specimenQuantity")(specimenQuantity)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SpecimenContainer]
  }
}

