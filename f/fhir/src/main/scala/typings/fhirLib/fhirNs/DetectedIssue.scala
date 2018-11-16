package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Clinical issue with action
     */

trait DetectedIssue extends DomainResource {
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'detail'.
           */
  var _detail: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'reference'.
           */
  var _reference: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'severity'.
           */
  var _severity: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * The provider or device that identified the issue
           */
  var author: js.UndefOr[Reference] = js.undefined
  /**
           * Issue Category, e.g. drug-drug, duplicate therapy, etc.
           */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * When identified
           */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
           * Description and context
           */
  var detail: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Unique id for the detected issue
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Problem resource
           */
  var implicated: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Step taken to address
           */
  var mitigation: js.UndefOr[js.Array[DetectedIssueMitigation]] = js.undefined
  /**
           * Associated patient
           */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
           * Authority for issue
           */
  var reference: js.UndefOr[uri] = js.undefined
  /**
           * high | moderate | low
           */
  var severity: js.UndefOr[code] = js.undefined
  /**
           * registered | preliminary | final | amended +
           */
  var status: code
}

