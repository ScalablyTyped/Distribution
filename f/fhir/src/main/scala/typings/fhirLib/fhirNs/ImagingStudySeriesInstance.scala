package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A single SOP instance from the series
     */

trait ImagingStudySeriesInstance extends BackboneElement {
  /**
           * Contains extended information for property 'number'.
           */
  var _number: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'sopClass'.
           */
  var _sopClass: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'title'.
           */
  var _title: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'uid'.
           */
  var _uid: js.UndefOr[Element] = js.undefined
  /**
           * The number of this instance in the series
           */
  var number: js.UndefOr[unsignedInt] = js.undefined
  /**
           * DICOM class type
           */
  var sopClass: oid
  /**
           * Description of instance
           */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Formal DICOM identifier for this instance
           */
  var uid: oid
}

