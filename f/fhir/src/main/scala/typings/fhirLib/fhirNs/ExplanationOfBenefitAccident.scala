package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Details of an accident
     */

trait ExplanationOfBenefitAccident extends BackboneElement {
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * When the accident occurred
           */
  var date: js.UndefOr[date] = js.undefined
  /**
           * Accident Place
           */
  var locationAddress: js.UndefOr[Address] = js.undefined
  /**
           * Accident Place
           */
  var locationReference: js.UndefOr[Reference] = js.undefined
  /**
           * The nature of the accident
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

