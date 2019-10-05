package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Record of use of a device
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DeviceUseStatement extends DomainResource {
  /**
    * Contains extended information for property 'recordedOn'.
    */
  var _recordedOn: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'timingDateTime'.
    */
  var _timingDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Target body site
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Reference to device used
    */
  var device: Reference
  /**
    * External identifier for this record
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Why device was used
    */
  var indication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Addition details (comments, instructions)
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * When statement was recorded
    */
  var recordedOn: js.UndefOr[dateTime] = js.undefined
  /**
    * Who made the statement
    */
  var source: js.UndefOr[Reference] = js.undefined
  /**
    * active | completed | entered-in-error +
    */
  var status: code
  /**
    * Patient using device
    */
  var subject: Reference
  /**
    * How often  the device was used
    */
  var timingDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * How often  the device was used
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  /**
    * How often  the device was used
    */
  var timingTiming: js.UndefOr[Timing] = js.undefined
  /**
    * Period device was used
    */
  var whenUsed: js.UndefOr[Period] = js.undefined
}

object DeviceUseStatement {
  @scala.inline
  def apply(
    device: Reference,
    status: code,
    subject: Reference,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _recordedOn: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _timingDateTime: Element = null,
    bodySite: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    indication: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    recordedOn: dateTime = null,
    resourceType: code = null,
    source: Reference = null,
    text: Narrative = null,
    timingDateTime: dateTime = null,
    timingPeriod: Period = null,
    timingTiming: Timing = null,
    whenUsed: Period = null
  ): DeviceUseStatement = {
    val __obj = js.Dynamic.literal(device = device, status = status, subject = subject)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_recordedOn != null) __obj.updateDynamic("_recordedOn")(_recordedOn)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_timingDateTime != null) __obj.updateDynamic("_timingDateTime")(_timingDateTime)
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (indication != null) __obj.updateDynamic("indication")(indication)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (note != null) __obj.updateDynamic("note")(note)
    if (recordedOn != null) __obj.updateDynamic("recordedOn")(recordedOn)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (source != null) __obj.updateDynamic("source")(source)
    if (text != null) __obj.updateDynamic("text")(text)
    if (timingDateTime != null) __obj.updateDynamic("timingDateTime")(timingDateTime)
    if (timingPeriod != null) __obj.updateDynamic("timingPeriod")(timingPeriod)
    if (timingTiming != null) __obj.updateDynamic("timingTiming")(timingTiming)
    if (whenUsed != null) __obj.updateDynamic("whenUsed")(whenUsed)
    __obj.asInstanceOf[DeviceUseStatement]
  }
}

