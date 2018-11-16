package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A healthcare consumer's policy choices to permits or denies recipients or roles to perform actions for specific purposes and periods of time
     */

trait Consent extends DomainResource {
  /**
           * Contains extended information for property 'dateTime'.
           */
  var _dateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'policyRule'.
           */
  var _policyRule: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Actions controlled by this consent
           */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Who|what controlled by this consent (or group, by role)
           */
  var actor: js.UndefOr[js.Array[ConsentActor]] = js.undefined
  /**
           * Classification of the consent statement - for indexing/retrieval
           */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Who is agreeing to the policy and exceptions
           */
  var consentingParty: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Data controlled by this consent
           */
  var data: js.UndefOr[js.Array[ConsentData]] = js.undefined
  /**
           * Timeframe for data controlled by this consent
           */
  var dataPeriod: js.UndefOr[Period] = js.undefined
  /**
           * When this Consent was created or indexed
           */
  var dateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Additional rule -  addition or removal of permissions
           */
  var except: js.UndefOr[js.Array[ConsentExcept]] = js.undefined
  /**
           * Identifier for this record (external references)
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Custodian of the consent
           */
  var organization: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Who the consent applies to
           */
  var patient: Reference
  /**
           * Period that this consent applies
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Policies covered by this consent
           */
  var policy: js.UndefOr[js.Array[ConsentPolicy]] = js.undefined
  /**
           * Policy that this consents to
           */
  var policyRule: js.UndefOr[uri] = js.undefined
  /**
           * Context of activities for which the agreement is made
           */
  var purpose: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
           * Security Labels that define affected resources
           */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
           * Source from which this consent is taken
           */
  var sourceAttachment: js.UndefOr[Attachment] = js.undefined
  /**
           * Source from which this consent is taken
           */
  var sourceIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Source from which this consent is taken
           */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  /**
           * draft | proposed | active | rejected | inactive | entered-in-error
           */
  var status: code
}

