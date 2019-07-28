package typings.geodesy.geodesyMod

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
    val __obj = js.Dynamic.literal(Airy1830 = Airy1830, AiryModified = AiryModified, Bessel1841 = Bessel1841, GRS80 = GRS80, Intl1924 = Intl1924, WGS84 = WGS84)
  
    __obj.asInstanceOf[Ellipsoids]
  }
}

