package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Procedures performed
     */

trait ClaimProcedure extends BackboneElement {
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'sequence'.
           */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
           * When the procedure was performed
           */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
           * Patient's list of procedures performed
           */
  var procedureCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Patient's list of procedures performed
           */
  var procedureReference: js.UndefOr[Reference] = js.undefined
  /**
           * Procedure sequence for reference
           */
  var sequence: positiveInt
}

