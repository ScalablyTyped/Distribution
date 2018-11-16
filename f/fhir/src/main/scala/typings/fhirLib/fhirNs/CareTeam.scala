package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Planned participants in the coordination and delivery of care for a patient or group
     */

trait CareTeam extends DomainResource {
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Type of team
           */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Encounter or episode associated with CareTeam
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * External Ids for this team
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Organization responsible for the care team
           */
  var managingOrganization: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Name of the team, such as crisis assessment team
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Comments made about the CareTeam
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * Members of the team
           */
  var participant: js.UndefOr[js.Array[CareTeamParticipant]] = js.undefined
  /**
           * Time period team covers
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Why the care team exists
           */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Why the care team exists
           */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * proposed | active | suspended | inactive | entered-in-error
           */
  var status: js.UndefOr[code] = js.undefined
  /**
           * Who care team is for
           */
  var subject: js.UndefOr[Reference] = js.undefined
}

