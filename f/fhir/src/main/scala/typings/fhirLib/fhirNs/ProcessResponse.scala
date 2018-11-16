package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * ProcessResponse resource
     */

trait ProcessResponse extends DomainResource {
  /**
           * Contains extended information for property 'created'.
           */
  var _created: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'disposition'.
           */
  var _disposition: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Request for additional information
           */
  var communicationRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Creation date
           */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
           * Disposition Message
           */
  var disposition: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Error code
           */
  var error: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Printed Form Identifier
           */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Business Identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Authoring Organization
           */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
           * Processing outcome
           */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Processing comments or additional requirements
           */
  var processNote: js.UndefOr[js.Array[ProcessResponseProcessNote]] = js.undefined
  /**
           * Request reference
           */
  var request: js.UndefOr[Reference] = js.undefined
  /**
           * Responsible organization
           */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  /**
           * Responsible Practitioner
           */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  /**
           * active | cancelled | draft | entered-in-error
           */
  var status: js.UndefOr[code] = js.undefined
}

