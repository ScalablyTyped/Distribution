package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Languages which may be used to communicate with the patient about his or her health
  */
trait PatientCommunication extends BackboneElement {
  /**
    * Contains extended information for property 'preferred'.
    */
  var _preferred: js.UndefOr[Element] = js.undefined
  /**
    * The language which can be used to communicate with the patient about his or her health
    */
  var language: CodeableConcept
  /**
    * Language preference indicator
    */
  var preferred: js.UndefOr[Boolean] = js.undefined
}

object PatientCommunication {
  @scala.inline
  def apply(
    language: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _preferred: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    preferred: js.UndefOr[Boolean] = js.undefined
  ): PatientCommunication = {
    val __obj = js.Dynamic.literal(language = language)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_preferred != null) __obj.updateDynamic("_preferred")(_preferred)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred)
    __obj.asInstanceOf[PatientCommunication]
  }
}

