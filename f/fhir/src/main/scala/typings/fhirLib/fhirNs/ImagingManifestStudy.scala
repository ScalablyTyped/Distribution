package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Study identity of the selected instances
  */
trait ImagingManifestStudy extends BackboneElement {
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  /**
    * Study access service endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Reference to ImagingStudy
    */
  var imagingStudy: js.UndefOr[Reference] = js.undefined
  /**
    * Series identity of the selected instances
    */
  var series: js.Array[ImagingManifestStudySeries]
  /**
    * Study instance UID
    */
  var uid: oid
}

