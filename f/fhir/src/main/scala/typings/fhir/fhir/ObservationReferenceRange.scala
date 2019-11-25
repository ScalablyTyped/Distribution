package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides guide for interpretation
  */
trait ObservationReferenceRange extends BackboneElement {
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Applicable age range, if relevant
    */
  var age: js.UndefOr[Range] = js.undefined
  /**
    * Reference range population
    */
  var appliesTo: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * High Range, if relevant
    */
  var high: js.UndefOr[Quantity] = js.undefined
  /**
    * Low Range, if relevant
    */
  var low: js.UndefOr[Quantity] = js.undefined
  /**
    * Text based reference range in an observation
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Reference range qualifier
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object ObservationReferenceRange {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _text: Element = null,
    age: Range = null,
    appliesTo: js.Array[CodeableConcept] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    high: Quantity = null,
    id: String = null,
    low: Quantity = null,
    modifierExtension: js.Array[Extension] = null,
    text: String = null,
    `type`: CodeableConcept = null
  ): ObservationReferenceRange = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_text != null) __obj.updateDynamic("_text")(_text.asInstanceOf[js.Any])
    if (age != null) __obj.updateDynamic("age")(age.asInstanceOf[js.Any])
    if (appliesTo != null) __obj.updateDynamic("appliesTo")(appliesTo.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservationReferenceRange]
  }
}

