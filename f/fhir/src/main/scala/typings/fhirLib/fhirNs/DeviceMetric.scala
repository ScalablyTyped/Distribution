package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Measurement, calculation or setting capability of a medical device
     */

trait DeviceMetric extends DomainResource {
  /**
           * Contains extended information for property 'category'.
           */
  var _category: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'color'.
           */
  var _color: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'operationalStatus'.
           */
  var _operationalStatus: js.UndefOr[Element] = js.undefined
  /**
           * Describes the calibrations that have been performed or that are required to be performed
           */
  var calibration: js.UndefOr[js.Array[DeviceMetricCalibration]] = js.undefined
  /**
           * measurement | setting | calculation | unspecified
           */
  var category: code
  /**
           * black | red | green | yellow | blue | magenta | cyan | white
           */
  var color: js.UndefOr[code] = js.undefined
  /**
           * Unique identifier of this DeviceMetric
           */
  var identifier: Identifier
  /**
           * Describes the measurement repetition time
           */
  var measurementPeriod: js.UndefOr[Timing] = js.undefined
  /**
           * on | off | standby | entered-in-error
           */
  var operationalStatus: js.UndefOr[code] = js.undefined
  /**
           * Describes the link to the parent DeviceComponent
           */
  var parent: js.UndefOr[Reference] = js.undefined
  /**
           * Describes the link to the source Device
           */
  var source: js.UndefOr[Reference] = js.undefined
  /**
           * Identity of metric, for example Heart Rate or PEEP Setting
           */
  var `type`: CodeableConcept
  /**
           * Unit of Measure for the Metric
           */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}

