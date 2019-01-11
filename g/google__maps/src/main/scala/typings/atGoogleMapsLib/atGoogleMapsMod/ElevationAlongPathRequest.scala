package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationAlongPathRequest extends js.Object {
  /**
    * defines a path on the earth for which to return elevation data.
    * This parameter defines a set of two or more ordered {latitude,longitude} pairs defining a path along the surface of the earth.
    */
  var path: js.Array[LatLng] | java.lang.String
  /**
    * specifies the number of sample points along a path for which to return elevation data.
    * The samples parameter divides the given path into an ordered set of equidistant points along the path.
    */
  var samples: scala.Double
}

