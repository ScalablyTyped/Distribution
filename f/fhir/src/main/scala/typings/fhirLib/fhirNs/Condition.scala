package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Detailed information about conditions, problems or diagnoses
     */

trait Condition extends DomainResource {
  /**
           * Contains extended information for property 'abatementBoolean'.
           */
  var _abatementBoolean: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'abatementDateTime'.
           */
  var _abatementDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'abatementString'.
           */
  var _abatementString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'assertedDate'.
           */
  var _assertedDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'clinicalStatus'.
           */
  var _clinicalStatus: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'onsetDateTime'.
           */
  var _onsetDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'onsetString'.
           */
  var _onsetString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'verificationStatus'.
           */
  var _verificationStatus: js.UndefOr[Element] = js.undefined
  /**
           * If/when in resolution/remission
           */
  var abatementAge: js.UndefOr[Age] = js.undefined
  /**
           * If/when in resolution/remission
           */
  var abatementBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If/when in resolution/remission
           */
  var abatementDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * If/when in resolution/remission
           */
  var abatementPeriod: js.UndefOr[Period] = js.undefined
  /**
           * If/when in resolution/remission
           */
  var abatementRange: js.UndefOr[Range] = js.undefined
  /**
           * If/when in resolution/remission
           */
  var abatementString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Date record was believed accurate
           */
  var assertedDate: js.UndefOr[dateTime] = js.undefined
  /**
           * Person who asserts this condition
           */
  var asserter: js.UndefOr[Reference] = js.undefined
  /**
           * Anatomical location, if relevant
           */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * problem-list-item | encounter-diagnosis
           */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * active | recurrence | inactive | remission | resolved
           */
  var clinicalStatus: js.UndefOr[code] = js.undefined
  /**
           * Identification of the condition, problem or diagnosis
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Encounter or episode when condition first asserted
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * Supporting evidence
           */
  var evidence: js.UndefOr[js.Array[ConditionEvidence]] = js.undefined
  /**
           * External Ids for this condition
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Additional information about the Condition
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * Estimated or actual date,  date-time, or age
           */
  var onsetAge: js.UndefOr[Age] = js.undefined
  /**
           * Estimated or actual date,  date-time, or age
           */
  var onsetDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Estimated or actual date,  date-time, or age
           */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  /**
           * Estimated or actual date,  date-time, or age
           */
  var onsetRange: js.UndefOr[Range] = js.undefined
  /**
           * Estimated or actual date,  date-time, or age
           */
  var onsetString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Subjective severity of condition
           */
  var severity: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Stage/grade, usually assessed formally
           */
  var stage: js.UndefOr[ConditionStage] = js.undefined
  /**
           * Who has the condition?
           */
  var subject: Reference
  /**
           * provisional | differential | confirmed | refuted | entered-in-error | unknown
           */
  var verificationStatus: js.UndefOr[code] = js.undefined
}

