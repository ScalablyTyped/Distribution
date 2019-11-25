package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Collection details
  */
trait SpecimenCollection extends BackboneElement {
  /**
    * Contains extended information for property 'collectedDateTime'.
    */
  var _collectedDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Anatomical collection site
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Collection time
    */
  var collectedDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Collection time
    */
  var collectedPeriod: js.UndefOr[Period] = js.undefined
  /**
    * Who collected the specimen
    */
  var collector: js.UndefOr[Reference] = js.undefined
  /**
    * Technique used to perform collection
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The quantity of specimen collected
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
}

object SpecimenCollection {
  @scala.inline
  def apply(
    _collectedDateTime: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    bodySite: CodeableConcept = null,
    collectedDateTime: dateTime = null,
    collectedPeriod: Period = null,
    collector: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    method: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null,
    quantity: Quantity = null
  ): SpecimenCollection = {
    val __obj = js.Dynamic.literal()
    if (_collectedDateTime != null) __obj.updateDynamic("_collectedDateTime")(_collectedDateTime.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (collectedDateTime != null) __obj.updateDynamic("collectedDateTime")(collectedDateTime.asInstanceOf[js.Any])
    if (collectedPeriod != null) __obj.updateDynamic("collectedPeriod")(collectedPeriod.asInstanceOf[js.Any])
    if (collector != null) __obj.updateDynamic("collector")(collector.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecimenCollection]
  }
}

