package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ellipsoids extends js.Object {
  var Airy1830: Ellipsoid
  var AiryModified: Ellipsoid
  var Bessel1841: Ellipsoid
  var GRS80: Ellipsoid
  var Intl1924: Ellipsoid
  var WGS84: Ellipsoid
}

object Ellipsoids {
  @scala.inline
  def apply(
    Airy1830: Ellipsoid,
    AiryModified: Ellipsoid,
    Bessel1841: Ellipsoid,
    GRS80: Ellipsoid,
    Intl1924: Ellipsoid,
    WGS84: Ellipsoid
  ): Ellipsoids = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Airy1830")(Airy1830)
    __obj.updateDynamic("AiryModified")(AiryModified)
    __obj.updateDynamic("Bessel1841")(Bessel1841)
    __obj.updateDynamic("GRS80")(GRS80)
    __obj.updateDynamic("Intl1924")(Intl1924)
    __obj.updateDynamic("WGS84")(WGS84)
    __obj.asInstanceOf[Ellipsoids]
  }
}

