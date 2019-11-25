package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about an accident
  */
trait ClaimAccident extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * When the accident occurred
    * see information codes
    * see information codes
    */
  var date: typings.fhir.fhir.date
  /**
    * Accident Place
    */
  var locationAddress: js.UndefOr[Address] = js.undefined
  /**
    * Accident Place
    */
  var locationReference: js.UndefOr[Reference] = js.undefined
  /**
    * The nature of the accident
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object ClaimAccident {
  @scala.inline
  def apply(
    date: date,
    _date: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    locationAddress: Address = null,
    locationReference: Reference = null,
    modifierExtension: js.Array[Extension] = null,
    `type`: CodeableConcept = null
  ): ClaimAccident = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (locationAddress != null) __obj.updateDynamic("locationAddress")(locationAddress.asInstanceOf[js.Any])
    if (locationReference != null) __obj.updateDynamic("locationReference")(locationReference.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimAccident]
  }
}

