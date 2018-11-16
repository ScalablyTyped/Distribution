package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A clinical assessment performed when planning treatments and management strategies for a patient
     */

trait ClinicalImpression extends DomainResource {
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'effectiveDateTime'.
           */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'protocol'.
           */
  var _protocol: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'summary'.
           */
  var _summary: js.UndefOr[Element] = js.undefined
  /**
           * Action taken as part of assessment procedure
           */
  var action: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * The clinician performing the assessment
           */
  var assessor: js.UndefOr[Reference] = js.undefined
  /**
           * Kind of assessment performed
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Encounter or Episode created from
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * When the assessment was documented
           */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
           * Why/how the assessment was performed
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Time of assessment
           */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Time of assessment
           */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
           * Possible or likely findings and diagnoses
           */
  var finding: js.UndefOr[js.Array[ClinicalImpressionFinding]] = js.undefined
  /**
           * Business identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * One or more sets of investigations (signs, symptions, etc.)
           */
  var investigation: js.UndefOr[js.Array[ClinicalImpressionInvestigation]] = js.undefined
  /**
           * Comments made about the ClinicalImpression
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * Reference to last assessment
           */
  var previous: js.UndefOr[Reference] = js.undefined
  /**
           * Relevant impressions of patient state
           */
  var problem: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Estimate of likely outcome
           */
  var prognosisCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * RiskAssessment expressing likely outcome
           */
  var prognosisReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Clinical Protocol followed
           */
  var protocol: js.UndefOr[js.Array[uri]] = js.undefined
  /**
           * draft | completed | entered-in-error
           */
  var status: code
  /**
           * Patient or group assessed
           */
  var subject: Reference
  /**
           * Summary of the assessment
           */
  var summary: js.UndefOr[java.lang.String] = js.undefined
}

