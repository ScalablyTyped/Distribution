package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Series identity of the selected instances
     */

trait ImagingManifestStudySeries extends BackboneElement {
  /**
           * Contains extended information for property 'uid'.
           */
  var _uid: js.UndefOr[Element] = js.undefined
  /**
           * Series access endpoint
           */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * The selected instance
           */
  var instance: js.Array[ImagingManifestStudySeriesInstance]
  /**
           * Series instance UID
           */
  var uid: oid
}

