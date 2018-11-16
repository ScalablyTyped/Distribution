package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Allergy or Intolerance (generally: Risk of adverse reaction to a substance)
     */

trait AllergyIntolerance extends DomainResource {
  /**
           * Contains extended information for property 'assertedDate'.
           */
  var _assertedDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'category'.
           */
  var _category: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'clinicalStatus'.
           */
  var _clinicalStatus: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'criticality'.
           */
  var _criticality: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'lastOccurrence'.
           */
  var _lastOccurrence: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'onsetDateTime'.
           */
  var _onsetDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'onsetString'.
           */
  var _onsetString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'verificationStatus'.
           */
  var _verificationStatus: js.UndefOr[Element] = js.undefined
  /**
           * Date record was believed accurate
           */
  var assertedDate: js.UndefOr[dateTime] = js.undefined
  /**
           * Source of the information about the allergy
           */
  var asserter: js.UndefOr[Reference] = js.undefined
  /**
           * food | medication | environment | biologic
           */
  var category: js.UndefOr[js.Array[code]] = js.undefined
  /**
           * active | inactive | resolved
           */
  var clinicalStatus: js.UndefOr[code] = js.undefined
  /**
           * Code that identifies the allergy or intolerance
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * low | high | unable-to-assess
           */
  var criticality: js.UndefOr[code] = js.undefined
  /**
           * External ids for this item
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Date(/time) of last known occurrence of a reaction
           */
  var lastOccurrence: js.UndefOr[dateTime] = js.undefined
  /**
           * Additional text not captured in other fields
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * When allergy or intolerance was identified
           */
  var onsetAge: js.UndefOr[Age] = js.undefined
  /**
           * When allergy or intolerance was identified
           */
  var onsetDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * When allergy or intolerance was identified
           */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  /**
           * When allergy or intolerance was identified
           */
  var onsetRange: js.UndefOr[Range] = js.undefined
  /**
           * When allergy or intolerance was identified
           */
  var onsetString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Who the sensitivity is for
           */
  var patient: Reference
  /**
           * Adverse Reaction Events linked to exposure to substance
           */
  var reaction: js.UndefOr[js.Array[AllergyIntoleranceReaction]] = js.undefined
  /**
           * Who recorded the sensitivity
           */
  var recorder: js.UndefOr[Reference] = js.undefined
  /**
           * allergy | intolerance - Underlying mechanism (if known)
           */
  var `type`: js.UndefOr[code] = js.undefined
  /**
           * unconfirmed | confirmed | refuted | entered-in-error
           */
  var verificationStatus: code
}

