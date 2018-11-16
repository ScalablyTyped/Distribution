package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A series of measurements taken by a device
     */

trait SampledData extends Element {
  /**
           * Contains extended information for property 'data'.
           */
  var _data: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'dimensions'.
           */
  var _dimensions: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'factor'.
           */
  var _factor: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'lowerLimit'.
           */
  var _lowerLimit: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'period'.
           */
  var _period: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'upperLimit'.
           */
  var _upperLimit: js.UndefOr[Element] = js.undefined
  /**
           * Decimal values with spaces, or "E" | "U" | "L"
           */
  var data: java.lang.String
  /**
           * Number of sample points at each time point
           */
  var dimensions: positiveInt
  /**
           * Multiply data by this before adding to origin
           */
  var factor: js.UndefOr[decimal] = js.undefined
  /**
           * Lower limit of detection
           */
  var lowerLimit: js.UndefOr[decimal] = js.undefined
  /**
           * Zero value and units
           */
  var origin: Quantity
  /**
           * Number of milliseconds between samples
           */
  var period: decimal
  /**
           * Upper limit of detection
           */
  var upperLimit: js.UndefOr[decimal] = js.undefined
}

