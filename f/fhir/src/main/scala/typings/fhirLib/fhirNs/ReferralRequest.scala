package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A request for referral or transfer of care
     */

trait ReferralRequest extends DomainResource {
  /**
           * Contains extended information for property 'authoredOn'.
           */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'intent'.
           */
  var _intent: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'occurrenceDateTime'.
           */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'priority'.
           */
  var _priority: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Date of creation/activation
           */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  /**
           * Request fulfilled by this request
           */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Originating encounter
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * Instantiates protocol or definition
           */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * A textual description of the referral
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Composite request this is part of
           */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Business identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * proposal | plan | order
           */
  var intent: code
  /**
           * Comments made about referral request
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * When the service(s) requested in the referral should occur
           */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * When the service(s) requested in the referral should occur
           */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
           * Urgency of referral / transfer of care request
           */
  var priority: js.UndefOr[code] = js.undefined
  /**
           * Reason for referral / transfer of care request
           */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Why is service needed?
           */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Receiver of referral / transfer of care request
           */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Key events in history of request
           */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Request(s) replaced by this request
           */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Who/what is requesting service
           */
  var requester: js.UndefOr[ReferralRequestRequester] = js.undefined
  /**
           * Actions requested as part of the referral
           */
  var serviceRequested: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * The clinical specialty (discipline) that the referral is requested for
           */
  var specialty: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * draft | active | suspended | cancelled | completed | entered-in-error | unknown
           */
  var status: code
  /**
           * Patient referred to care or transfer
           */
  var subject: Reference
  /**
           * Additonal information to support referral or transfer of care request
           */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Referral/Transition of care request type
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

