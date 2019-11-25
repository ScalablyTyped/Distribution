package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Not available during this time due to provided reason
  */
trait PractitionerRoleNotAvailable extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Reason presented to the user explaining why time not available
    */
  var description: String
  /**
    * Service not availablefrom this date
    */
  var during: js.UndefOr[Period] = js.undefined
}

object PractitionerRoleNotAvailable {
  @scala.inline
  def apply(
    description: String,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    during: Period = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): PractitionerRoleNotAvailable = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (during != null) __obj.updateDynamic("during")(during.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[PractitionerRoleNotAvailable]
  }
}

