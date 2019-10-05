package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional rule -  addition or removal of permissions
  */
trait ConsentExcept extends BackboneElement {
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Actions controlled by this exception
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Who|what controlled by this exception (or group, by role)
    */
  var actor: js.UndefOr[js.Array[ConsentExceptActor]] = js.undefined
  /**
    * e.g. Resource Type, Profile, or CDA etc
    */
  var `class`: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * e.g. LOINC or SNOMED CT code, etc in the content
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Data controlled by this exception
    */
  var data: js.UndefOr[js.Array[ConsentExceptData]] = js.undefined
  /**
    * Timeframe for data controlled by this exception
    */
  var dataPeriod: js.UndefOr[Period] = js.undefined
  /**
    * Timeframe for this exception
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Context of activities covered by this exception
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * deny | permit
    */
  var `type`: code
}

object ConsentExcept {
  @scala.inline
  def apply(
    `type`: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    action: js.Array[CodeableConcept] = null,
    actor: js.Array[ConsentExceptActor] = null,
    `class`: js.Array[Coding] = null,
    code: js.Array[Coding] = null,
    data: js.Array[ConsentExceptData] = null,
    dataPeriod: Period = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    purpose: js.Array[Coding] = null,
    securityLabel: js.Array[Coding] = null
  ): ConsentExcept = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (action != null) __obj.updateDynamic("action")(action)
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (code != null) __obj.updateDynamic("code")(code)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataPeriod != null) __obj.updateDynamic("dataPeriod")(dataPeriod)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (period != null) __obj.updateDynamic("period")(period)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel)
    __obj.asInstanceOf[ConsentExcept]
  }
}

