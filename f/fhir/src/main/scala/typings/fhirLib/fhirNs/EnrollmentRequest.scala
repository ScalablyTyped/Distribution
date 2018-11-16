package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Enrollment request
     */

trait EnrollmentRequest extends DomainResource {
  /**
           * Contains extended information for property 'created'.
           */
  var _created: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Insurance information
           */
  var coverage: js.UndefOr[Reference] = js.undefined
  /**
           * Creation date
           */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
           * Business Identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Target
           */
  var insurer: js.UndefOr[Reference] = js.undefined
  /**
           * Responsible organization
           */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
           * Responsible practitioner
           */
  var provider: js.UndefOr[Reference] = js.undefined
  /**
           * active | cancelled | draft | entered-in-error
           */
  var status: js.UndefOr[code] = js.undefined
  /**
           * The subject of the Products and Services
           */
  var subject: js.UndefOr[Reference] = js.undefined
}

