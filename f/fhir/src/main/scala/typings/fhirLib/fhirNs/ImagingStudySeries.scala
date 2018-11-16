package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Each study has one or more series of instances
     */

trait ImagingStudySeries extends BackboneElement {
  /**
           * Contains extended information for property 'availability'.
           */
  var _availability: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'number'.
           */
  var _number: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'numberOfInstances'.
           */
  var _numberOfInstances: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'started'.
           */
  var _started: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'uid'.
           */
  var _uid: js.UndefOr[Element] = js.undefined
  /**
           * ONLINE | OFFLINE | NEARLINE | UNAVAILABLE
           */
  var availability: js.UndefOr[code] = js.undefined
  /**
           * Body part examined
           */
  var bodySite: js.UndefOr[Coding] = js.undefined
  /**
           * A short human readable summary of the series
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Series access endpoint
           */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * A single SOP instance from the series
           */
  var instance: js.UndefOr[js.Array[ImagingStudySeriesInstance]] = js.undefined
  /**
           * Body part laterality
           */
  var laterality: js.UndefOr[Coding] = js.undefined
  /**
           * The modality of the instances in the series
           */
  var modality: Coding
  /**
           * Numeric identifier of this series
           */
  var number: js.UndefOr[unsignedInt] = js.undefined
  /**
           * Number of Series Related Instances
           */
  var numberOfInstances: js.UndefOr[unsignedInt] = js.undefined
  /**
           * Who performed the series
           */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * When the series started
           */
  var started: js.UndefOr[dateTime] = js.undefined
  /**
           * Formal DICOM identifier for this series
           */
  var uid: oid
}

