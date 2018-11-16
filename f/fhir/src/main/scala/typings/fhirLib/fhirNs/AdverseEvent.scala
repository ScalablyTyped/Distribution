package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Medical care, research study or other healthcare event causing physical injury
     */

trait AdverseEvent extends DomainResource {
  /**
           * Contains extended information for property 'category'.
           */
  var _category: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * AE | PAE An adverse event is an event that caused harm to a patient,  an adverse reaction is a something that is a subject-specific event that is a result of an exposure to a medication, food, device or environmental substance, a potential adverse event is something that occurred and that could have caused harm to a patient but did not
           */
  var category: js.UndefOr[code] = js.undefined
  /**
           * When the event occurred
           */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
           * Description of the adverse event
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Who  was involved in the adverse event or the potential adverse event
           */
  var eventParticipant: js.UndefOr[Reference] = js.undefined
  /**
           * Business identifier for the event
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Location where adverse event occurred
           */
  var location: js.UndefOr[Reference] = js.undefined
  /**
           * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
           */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Adverse Reaction Events linked to exposure to substance
           */
  var reaction: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Who recorded the adverse event
           */
  var recorder: js.UndefOr[Reference] = js.undefined
  /**
           * AdverseEvent.referenceDocument
           */
  var referenceDocument: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Mild | Moderate | Severe
           */
  var seriousness: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * AdverseEvent.study
           */
  var study: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Subject or group impacted by event
           */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
           * AdverseEvent.subjectMedicalHistory
           */
  var subjectMedicalHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * The suspected agent causing the adverse event
           */
  var suspectEntity: js.UndefOr[js.Array[AdverseEventSuspectEntity]] = js.undefined
  /**
           * actual | potential
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

