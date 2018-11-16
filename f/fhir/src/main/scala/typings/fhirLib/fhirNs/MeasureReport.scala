package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Results of a measure evaluation
     */

trait MeasureReport extends DomainResource {
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * When the report was generated
           */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
           * What data was evaluated to produce the measure score
           */
  var evaluatedResources: js.UndefOr[Reference] = js.undefined
  /**
           * Measure results for each group
           */
  var group: js.UndefOr[js.Array[MeasureReportGroup]] = js.undefined
  /**
           * Additional identifier for the Report
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * What measure was evaluated
           */
  var measure: Reference
  /**
           * What patient the report is for
           */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
           * What period the report covers
           */
  var period: Period
  /**
           * Who is reporting the data
           */
  var reportingOrganization: js.UndefOr[Reference] = js.undefined
  /**
           * complete | pending | error
           */
  var status: code
  /**
           * individual | patient-list | summary
           */
  var `type`: code
}

