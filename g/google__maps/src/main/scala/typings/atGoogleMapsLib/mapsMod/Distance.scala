package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Distance extends js.Object {
  /**
       * contains a human-readable representation of the distance, displayed in units as used at the origin
       * (or as overridden within the `units` parameter in the request).
       * (For example, miles and feet will be used for any origin within the United States.)
       */
  var text: java.lang.String
  /** indicates the distance in meters. */
  var value: scala.Double
}

