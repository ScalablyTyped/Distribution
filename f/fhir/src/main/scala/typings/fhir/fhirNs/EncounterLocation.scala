package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of locations where the patient has been
  */
trait EncounterLocation extends BackboneElement {
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Location the encounter takes place
    */
  var location: Reference
  /**
    * Time period during which the patient was present at the location
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * planned | active | reserved | completed
    */
  var status: js.UndefOr[code] = js.undefined
}

object EncounterLocation {
  @scala.inline
  def apply(
    location: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _status: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    status: code = null
  ): EncounterLocation = {
    val __obj = js.Dynamic.literal(location = location)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (period != null) __obj.updateDynamic("period")(period)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[EncounterLocation]
  }
}

