package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Not available during this time due to provided reason
  */
trait HealthcareServiceNotAvailable extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Reason presented to the user explaining why time not available
    */
  var description: java.lang.String
  /**
    * Service not availablefrom this date
    */
  var during: js.UndefOr[Period] = js.undefined
}

object HealthcareServiceNotAvailable {
  @scala.inline
  def apply(
    description: java.lang.String,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    during: Period = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): HealthcareServiceNotAvailable = {
    val __obj = js.Dynamic.literal(description = description)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (during != null) __obj.updateDynamic("during")(during)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[HealthcareServiceNotAvailable]
  }
}

