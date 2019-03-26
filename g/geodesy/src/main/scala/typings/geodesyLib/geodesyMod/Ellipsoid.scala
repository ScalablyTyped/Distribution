package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ellipsoid extends js.Object {
  var a: scala.Double
  var b: scala.Double
  var f: scala.Double
}

/* Rewritten from type alias, can be one of: 
  - geodesyLib.geodesyLibStrings.WGS84
  - geodesyLib.geodesyLibStrings.Airy1830
  - geodesyLib.geodesyLibStrings.AiryModified
  - geodesyLib.geodesyLibStrings.Bessel1841
  - geodesyLib.geodesyLibStrings.Clarke1866
  - geodesyLib.geodesyLibStrings.Clarke1880IGN
  - geodesyLib.geodesyLibStrings.GRS80
  - geodesyLib.geodesyLibStrings.Intl1924
  - geodesyLib.geodesyLibStrings.WGS72
*/
trait ellipsoid extends js.Object

object Ellipsoid {
  @scala.inline
  def apply(a: scala.Double, b: scala.Double, f: scala.Double): Ellipsoid = {
    val __obj = js.Dynamic.literal(a = a, b = b, f = f)
  
    __obj.asInstanceOf[Ellipsoid]
  }
}

