package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Investigation to increase healthcare-related patient-independent knowledge
  */
trait ResearchStudy extends DomainResource {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Defined path through the study for a subject
    */
  var arm: js.UndefOr[js.Array[ResearchStudyArm]] = js.undefined
  /**
    * Classifications for the study
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Contact details for the study
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * What this is study doing
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * Inclusion & exclusion criteria
    */
  var enrollment: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Drugs, devices, conditions, etc. under study
    */
  var focus: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Business Identifier for study
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Geographic region(s) for study
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Used to search for the study
    */
  var keyword: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Comments made about the event
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Part of larger study
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * When the study began and ended
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * The individual responsible for the study
    */
  var principalInvestigator: js.UndefOr[Reference] = js.undefined
  /**
    * Steps followed in executing study
    */
  var protocol: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Reason for terminating study early
    */
  var reasonStopped: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * References and dependencies
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  /**
    * Location involved in study execution
    */
  var site: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Organization responsible for the study
    */
  var sponsor: js.UndefOr[Reference] = js.undefined
  /**
    * draft | in-progress | suspended | stopped | completed | entered-in-error
    */
  var status: code
  /**
    * Name for this study
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

