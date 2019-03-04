package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adverse Reaction Events linked to exposure to substance
  */
trait AllergyIntoleranceReaction extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'onset'.
    */
  var _onset: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.undefined
  /**
    * Description of the event as a whole
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How the subject was exposed to the substance
    */
  var exposureRoute: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Clinical symptoms/signs associated with the Event
    */
  var manifestation: js.Array[CodeableConcept]
  /**
    * Text about event not captured in other fields
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Date(/time) when manifestations showed
    */
  var onset: js.UndefOr[dateTime] = js.undefined
  /**
    * mild | moderate | severe (of event as a whole)
    */
  var severity: js.UndefOr[code] = js.undefined
  /**
    * Specific substance or pharmaceutical product considered to be responsible for event
    */
  var substance: js.UndefOr[CodeableConcept] = js.undefined
}

object AllergyIntoleranceReaction {
  @scala.inline
  def apply(
    manifestation: js.Array[CodeableConcept],
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _onset: Element = null,
    _severity: Element = null,
    description: java.lang.String = null,
    exposureRoute: CodeableConcept = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    onset: dateTime = null,
    severity: code = null,
    substance: CodeableConcept = null
  ): AllergyIntoleranceReaction = {
    val __obj = js.Dynamic.literal(manifestation = manifestation)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_onset != null) __obj.updateDynamic("_onset")(_onset)
    if (_severity != null) __obj.updateDynamic("_severity")(_severity)
    if (description != null) __obj.updateDynamic("description")(description)
    if (exposureRoute != null) __obj.updateDynamic("exposureRoute")(exposureRoute)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (note != null) __obj.updateDynamic("note")(note)
    if (onset != null) __obj.updateDynamic("onset")(onset)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (substance != null) __obj.updateDynamic("substance")(substance)
    __obj.asInstanceOf[AllergyIntoleranceReaction]
  }
}

