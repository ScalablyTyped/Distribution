package typings.geodesy.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ellipsoid extends js.Object {
  var a: Double
  var b: Double
  var f: Double
}

/* Rewritten from type alias, can be one of: 
  - typings.geodesy.geodesyStrings.WGS84
  - typings.geodesy.geodesyStrings.Airy1830
  - typings.geodesy.geodesyStrings.AiryModified
  - typings.geodesy.geodesyStrings.Bessel1841
  - typings.geodesy.geodesyStrings.Clarke1866
  - typings.geodesy.geodesyStrings.Clarke1880IGN
  - typings.geodesy.geodesyStrings.GRS80
  - typings.geodesy.geodesyStrings.Intl1924
  - typings.geodesy.geodesyStrings.WGS72
*/
trait ellipsoid extends js.Object

object Ellipsoid {
  @scala.inline
  def apply(a: Double, b: Double, f: Double): Ellipsoid = {
    val __obj = js.Dynamic.literal(a = a, b = b, f = f)
  
    __obj.asInstanceOf[Ellipsoid]
  }
}

