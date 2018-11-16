package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as formatted reports
     */

trait DiagnosticReport extends DomainResource {
  /**
           * Contains extended information for property 'conclusion'.
           */
  var _conclusion: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'effectiveDateTime'.
           */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'issued'.
           */
  var _issued: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * What was requested
           */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Service category
           */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Name/Code for this diagnostic report
           */
  var code: CodeableConcept
  /**
           * Codes for the conclusion
           */
  var codedDiagnosis: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Clinical Interpretation of test results
           */
  var conclusion: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Health care event when test ordered
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * Clinically relevant time/time-period for report
           */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Clinically relevant time/time-period for report
           */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
           * Business identifier for report
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Key images associated with this report
           */
  var image: js.UndefOr[js.Array[DiagnosticReportImage]] = js.undefined
  /**
           * Reference to full details of imaging associated with the diagnostic report
           */
  var imagingStudy: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * DateTime this version was released
           */
  var issued: js.UndefOr[instant] = js.undefined
  /**
           * Participants in producing the report
           */
  var performer: js.UndefOr[js.Array[DiagnosticReportPerformer]] = js.undefined
  /**
           * Entire report as issued
           */
  var presentedForm: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
           * Observations - simple, or complex nested groups
           */
  var result: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Specimens this report is based on
           */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * registered | partial | preliminary | final +
           */
  var status: code
  /**
           * The subject of the report - usually, but not always, the patient
           */
  var subject: js.UndefOr[Reference] = js.undefined
}

