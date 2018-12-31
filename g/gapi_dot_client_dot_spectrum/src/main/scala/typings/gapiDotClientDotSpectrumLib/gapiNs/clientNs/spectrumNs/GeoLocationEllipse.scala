package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoLocationEllipse extends js.Object {
  /** A required geo-spatial point representing the center of the ellipse. */
  var center: js.UndefOr[GeoLocationPoint] = js.undefined
  /**
    * A floating-point number that expresses the orientation of the ellipse, representing the rotation, in degrees, of the semi-major axis from North towards
    * the East. For example, when the uncertainty is greatest along the North-South direction, orientation is 0 degrees; conversely, if the uncertainty is
    * greatest along the East-West direction, orientation is 90 degrees. When orientation is not present, the orientation is assumed to be 0.
    */
  var orientation: js.UndefOr[scala.Double] = js.undefined
  /**
    * A floating-point number that expresses the location uncertainty along the major axis of the ellipse. May be required by the regulatory domain. When the
    * uncertainty is optional, the default value is 0.
    */
  var semiMajorAxis: js.UndefOr[scala.Double] = js.undefined
  /**
    * A floating-point number that expresses the location uncertainty along the minor axis of the ellipse. May be required by the regulatory domain. When the
    * uncertainty is optional, the default value is 0.
    */
  var semiMinorAxis: js.UndefOr[scala.Double] = js.undefined
}

