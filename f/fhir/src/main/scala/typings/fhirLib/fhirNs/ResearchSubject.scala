package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Investigation to increase healthcare-related patient-independent knowledge
     */

trait ResearchSubject extends DomainResource {
  /**
           * Contains extended information for property 'actualArm'.
           */
  var _actualArm: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'assignedArm'.
           */
  var _assignedArm: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * What path was followed
           */
  var actualArm: js.UndefOr[java.lang.String] = js.undefined
  /**
           * What path should be followed
           */
  var assignedArm: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Agreement to participate in study
           */
  var consent: js.UndefOr[Reference] = js.undefined
  /**
           * Business Identifier for research subject
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Who is part of study
           */
  var individual: Reference
  /**
           * Start and end of participation
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * candidate | enrolled | active | suspended | withdrawn | completed
           */
  var status: code
  /**
           * Study subject is part of
           */
  var study: Reference
}

