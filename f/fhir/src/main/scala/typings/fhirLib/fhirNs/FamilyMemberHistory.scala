package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Information about patient's relatives, relevant for patient
     */

trait FamilyMemberHistory extends DomainResource {
  /**
           * Contains extended information for property 'ageString'.
           */
  var _ageString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'bornDate'.
           */
  var _bornDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'bornString'.
           */
  var _bornString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'deceasedBoolean'.
           */
  var _deceasedBoolean: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'deceasedDate'.
           */
  var _deceasedDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'deceasedString'.
           */
  var _deceasedString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'estimatedAge'.
           */
  var _estimatedAge: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'gender'.
           */
  var _gender: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'notDone'.
           */
  var _notDone: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * (approximate) age
           */
  var ageAge: js.UndefOr[Age] = js.undefined
  /**
           * (approximate) age
           */
  var ageRange: js.UndefOr[Range] = js.undefined
  /**
           * (approximate) age
           */
  var ageString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * (approximate) date of birth
           */
  var bornDate: js.UndefOr[date] = js.undefined
  /**
           * (approximate) date of birth
           */
  var bornPeriod: js.UndefOr[Period] = js.undefined
  /**
           * (approximate) date of birth
           */
  var bornString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Condition that the related person had
           */
  var condition: js.UndefOr[js.Array[FamilyMemberHistoryCondition]] = js.undefined
  /**
           * When history was captured/updated
           */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
           * Dead? How old/when?
           */
  var deceasedAge: js.UndefOr[Age] = js.undefined
  /**
           * Dead? How old/when?
           */
  var deceasedBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Dead? How old/when?
           */
  var deceasedDate: js.UndefOr[date] = js.undefined
  /**
           * Dead? How old/when?
           */
  var deceasedRange: js.UndefOr[Range] = js.undefined
  /**
           * Dead? How old/when?
           */
  var deceasedString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Instantiates protocol or definition
           */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Age is estimated?
           */
  var estimatedAge: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * male | female | other | unknown
           */
  var gender: js.UndefOr[code] = js.undefined
  /**
           * External Id(s) for this record
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * The family member described
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The taking of a family member's history did not occur
           */
  var notDone: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * subject-unknown | withheld | unable-to-obtain | deferred
           */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * General note about related person
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * Patient history is about
           */
  var patient: Reference
  /**
           * Why was family member history performed?
           */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Why was family member history performed?
           */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Relationship to the subject
           */
  var relationship: CodeableConcept
  /**
           * partial | completed | entered-in-error | health-unknown
           */
  var status: code
}

