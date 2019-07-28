package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action that is being or was performed on a patient
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait Procedure extends DomainResource {
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'performedDateTime'.
    */
  var _performedDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * A request for this procedure
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Target body sites
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Classification of the procedure
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Identification of the procedure
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Complication following the procedure
    */
  var complication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * A condition that is a result of the procedure
    */
  var complicationDetail: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Encounter or episode associated with the procedure
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Device changed in procedure
    */
  var focalDevice: js.UndefOr[js.Array[ProcedureFocalDevice]] = js.undefined
  /**
    * Instructions for follow up
    */
  var followUp: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * External Identifiers for this procedure
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Where the procedure happened
    */
  var location: js.UndefOr[Reference] = js.undefined
  /**
    * True if procedure was not performed as scheduled
    */
  var notDone: js.UndefOr[Boolean] = js.undefined
  /**
    * Reason procedure was not performed
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Additional information about the procedure
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * The result of procedure
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Date/Period the procedure was performed
    */
  var performedDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Date/Period the procedure was performed
    */
  var performedPeriod: js.UndefOr[Period] = js.undefined
  /**
    * The people who performed the procedure
    */
  var performer: js.UndefOr[js.Array[ProcedurePerformer]] = js.undefined
  /**
    * Coded reason procedure performed
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Condition that is the reason the procedure performed
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Any report resulting from the procedure
    */
  var report: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * preparation | in-progress | suspended | aborted | completed | entered-in-error | unknown
    */
  var status: code
  /**
    * Who the procedure was performed on
    */
  var subject: Reference
  /**
    * Coded items used during the procedure
    */
  var usedCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Items used during procedure
    */
  var usedReference: js.UndefOr[js.Array[Reference]] = js.undefined
}

object Procedure {
  @scala.inline
  def apply(
    status: code,
    subject: Reference,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _notDone: Element = null,
    _performedDateTime: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    basedOn: js.Array[Reference] = null,
    bodySite: js.Array[CodeableConcept] = null,
    category: CodeableConcept = null,
    code: CodeableConcept = null,
    complication: js.Array[CodeableConcept] = null,
    complicationDetail: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    focalDevice: js.Array[ProcedureFocalDevice] = null,
    followUp: js.Array[CodeableConcept] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    location: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    notDone: js.UndefOr[Boolean] = js.undefined,
    notDoneReason: CodeableConcept = null,
    note: js.Array[Annotation] = null,
    outcome: CodeableConcept = null,
    partOf: js.Array[Reference] = null,
    performedDateTime: dateTime = null,
    performedPeriod: Period = null,
    performer: js.Array[ProcedurePerformer] = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    report: js.Array[Reference] = null,
    resourceType: code = null,
    text: Narrative = null,
    usedCode: js.Array[CodeableConcept] = null,
    usedReference: js.Array[Reference] = null
  ): Procedure = {
    val __obj = js.Dynamic.literal(status = status, subject = subject)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_notDone != null) __obj.updateDynamic("_notDone")(_notDone)
    if (_performedDateTime != null) __obj.updateDynamic("_performedDateTime")(_performedDateTime)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn)
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite)
    if (category != null) __obj.updateDynamic("category")(category)
    if (code != null) __obj.updateDynamic("code")(code)
    if (complication != null) __obj.updateDynamic("complication")(complication)
    if (complicationDetail != null) __obj.updateDynamic("complicationDetail")(complicationDetail)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (focalDevice != null) __obj.updateDynamic("focalDevice")(focalDevice)
    if (followUp != null) __obj.updateDynamic("followUp")(followUp)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (location != null) __obj.updateDynamic("location")(location)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(notDone)) __obj.updateDynamic("notDone")(notDone)
    if (notDoneReason != null) __obj.updateDynamic("notDoneReason")(notDoneReason)
    if (note != null) __obj.updateDynamic("note")(note)
    if (outcome != null) __obj.updateDynamic("outcome")(outcome)
    if (partOf != null) __obj.updateDynamic("partOf")(partOf)
    if (performedDateTime != null) __obj.updateDynamic("performedDateTime")(performedDateTime)
    if (performedPeriod != null) __obj.updateDynamic("performedPeriod")(performedPeriod)
    if (performer != null) __obj.updateDynamic("performer")(performer)
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode)
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference)
    if (report != null) __obj.updateDynamic("report")(report)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (usedCode != null) __obj.updateDynamic("usedCode")(usedCode)
    if (usedReference != null) __obj.updateDynamic("usedReference")(usedReference)
    __obj.asInstanceOf[Procedure]
  }
}

