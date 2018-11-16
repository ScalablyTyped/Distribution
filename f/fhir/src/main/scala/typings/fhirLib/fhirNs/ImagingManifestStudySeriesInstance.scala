package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The selected instance
     */

trait ImagingManifestStudySeriesInstance extends BackboneElement {
  /**
           * Contains extended information for property 'sopClass'.
           */
  var _sopClass: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'uid'.
           */
  var _uid: js.UndefOr[Element] = js.undefined
  /**
           * SOP class UID of instance
           */
  var sopClass: oid
  /**
           * Selected instance UID
           */
  var uid: oid
}

