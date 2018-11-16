package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * EligibilityResponse resource
     */

trait EligibilityResponse extends DomainResource {
  /**
           * Contains extended information for property 'created'.
           */
  var _created: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'disposition'.
           */
  var _disposition: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'inforce'.
           */
  var _inforce: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Creation date
           */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
           * Disposition Message
           */
  var disposition: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Processing errors
           */
  var error: js.UndefOr[js.Array[EligibilityResponseError]] = js.undefined
  /**
           * Printed Form Identifier
           */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Business Identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Coverage inforce indicator
           */
  var inforce: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Details by insurance coverage
           */
  var insurance: js.UndefOr[js.Array[EligibilityResponseInsurance]] = js.undefined
  /**
           * Insurer issuing the coverage
           */
  var insurer: js.UndefOr[Reference] = js.undefined
  /**
           * complete | error | partial
           */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Eligibility reference
           */
  var request: js.UndefOr[Reference] = js.undefined
  /**
           * Responsible organization
           */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  /**
           * Responsible practitioner
           */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  /**
           * active | cancelled | draft | entered-in-error
           */
  var status: js.UndefOr[code] = js.undefined
}

