package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The absolute geographic location
     */

trait LocationPosition extends BackboneElement {
  /**
           * Contains extended information for property 'altitude'.
           */
  var _altitude: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'latitude'.
           */
  var _latitude: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'longitude'.
           */
  var _longitude: js.UndefOr[Element] = js.undefined
  /**
           * Altitude with WGS84 datum
           */
  var altitude: js.UndefOr[decimal] = js.undefined
  /**
           * Latitude with WGS84 datum
           */
  var latitude: decimal
  /**
           * Longitude with WGS84 datum
           */
  var longitude: decimal
}

