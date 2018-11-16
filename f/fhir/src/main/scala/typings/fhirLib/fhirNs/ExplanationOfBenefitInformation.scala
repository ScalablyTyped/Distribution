package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Exceptions, special considerations, the condition, situation, prior or concurrent issues
     */

trait ExplanationOfBenefitInformation extends BackboneElement {
  /**
           * Contains extended information for property 'sequence'.
           */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'timingDate'.
           */
  var _timingDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueString'.
           */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
           * General class of information
           */
  var category: CodeableConcept
  /**
           * Type of information
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Reason associated with the information
           */
  var reason: js.UndefOr[Coding] = js.undefined
  /**
           * Information instance identifier
           */
  var sequence: positiveInt
  /**
           * When it occurred
           */
  var timingDate: js.UndefOr[date] = js.undefined
  /**
           * When it occurred
           */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  /**
           * Additional Data or supporting information
           */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
           * Additional Data or supporting information
           */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Additional Data or supporting information
           */
  var valueReference: js.UndefOr[Reference] = js.undefined
  /**
           * Additional Data or supporting information
           */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
}

