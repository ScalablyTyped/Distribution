package typings
package geodesyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object geodesyMod {
  type LatLon = LatLonEllipsoidal
  type datum = geodesyLib.geodesyLibStrings.ED50 | geodesyLib.geodesyLibStrings.Irl1975 | geodesyLib.geodesyLibStrings.NAD27 | geodesyLib.geodesyLibStrings.NAD83 | geodesyLib.geodesyLibStrings.NTF | geodesyLib.geodesyLibStrings.OSGB36 | geodesyLib.geodesyLibStrings.Potsdam | geodesyLib.geodesyLibStrings.TokyoJapan | geodesyLib.geodesyLibStrings.WGS72 | geodesyLib.geodesyLibStrings.WGS84
  type ellipsoid = geodesyLib.geodesyLibStrings.WGS84 | geodesyLib.geodesyLibStrings.Airy1830 | geodesyLib.geodesyLibStrings.AiryModified | geodesyLib.geodesyLibStrings.Bessel1841 | geodesyLib.geodesyLibStrings.Clarke1866 | geodesyLib.geodesyLibStrings.Clarke1880IGN | geodesyLib.geodesyLibStrings.GRS80 | geodesyLib.geodesyLibStrings.Intl1924 | geodesyLib.geodesyLibStrings.WGS72
  type format = geodesyLib.geodesyLibStrings.d | geodesyLib.geodesyLibStrings.dm | geodesyLib.geodesyLibStrings.dms
  type hemisphere = geodesyLib.geodesyLibStrings.N | geodesyLib.geodesyLibStrings.S
  type transform = js.Tuple7[
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
}
