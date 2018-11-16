package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Component results
     */

trait ObservationComponent extends BackboneElement {
  /**
           * Contains extended information for property 'valueDateTime'.
           */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueString'.
           */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueTime'.
           */
  var _valueTime: js.UndefOr[Element] = js.undefined
  /**
           * Type of component observation (code / type)
           */
  var code: CodeableConcept
  /**
           * Why the component result is missing
           */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * High, low, normal, etc.
           */
  var interpretation: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Provides guide for interpretation of component result
           */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.undefined
  /**
           * Actual component result
           */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
           * Actual component result
           */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Actual component result
           */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Actual component result
           */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  /**
           * Actual component result
           */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Actual component result
           */
  var valueRange: js.UndefOr[Range] = js.undefined
  /**
           * Actual component result
           */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  /**
           * Actual component result
           */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  /**
           * Actual component result
           */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Actual component result
           */
  var valueTime: js.UndefOr[time] = js.undefined
}

