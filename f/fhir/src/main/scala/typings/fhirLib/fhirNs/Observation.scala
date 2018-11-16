package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Measurements and simple assertions
     */

trait Observation extends DomainResource {
  /**
           * Contains extended information for property 'comment'.
           */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'effectiveDateTime'.
           */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'issued'.
           */
  var _issued: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'valueBoolean'.
           */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
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
           * Fulfills plan, proposal or order
           */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Observed body part
           */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Classification of  type of observation
           */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Type of observation (code / type)
           */
  var code: CodeableConcept
  /**
           * Comments about result
           */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Component results
           */
  var component: js.UndefOr[js.Array[ObservationComponent]] = js.undefined
  /**
           * Healthcare event during which this observation is made
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * Why the result is missing
           */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * (Measurement) Device
           */
  var device: js.UndefOr[Reference] = js.undefined
  /**
           * Clinically relevant time/time-period for observation
           */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Clinically relevant time/time-period for observation
           */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
           * Business Identifier for observation
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * High, low, normal, etc.
           */
  var interpretation: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Date/Time this was made available
           */
  var issued: js.UndefOr[instant] = js.undefined
  /**
           * How it was done
           */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Who is responsible for the observation
           */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Provides guide for interpretation
           */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.undefined
  /**
           * Resource related to this observation
           */
  var related: js.UndefOr[js.Array[ObservationRelated]] = js.undefined
  /**
           * Specimen used for this observation
           */
  var specimen: js.UndefOr[Reference] = js.undefined
  /**
           * registered | preliminary | final | amended +
           */
  var status: code
  /**
           * Who and/or what this is about
           */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
           * Actual result
           */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
           * Actual result
           */
  var valueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Actual result
           */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Actual result
           */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Actual result
           */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  /**
           * Actual result
           */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Actual result
           */
  var valueRange: js.UndefOr[Range] = js.undefined
  /**
           * Actual result
           */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  /**
           * Actual result
           */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  /**
           * Actual result
           */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Actual result
           */
  var valueTime: js.UndefOr[time] = js.undefined
}

