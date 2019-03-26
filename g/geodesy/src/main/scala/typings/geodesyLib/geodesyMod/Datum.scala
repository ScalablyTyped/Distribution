package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datum extends js.Object {
  var ellipsoid: Ellipsoid
  var transform: js.Tuple7[
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
}

/* Rewritten from type alias, can be one of: 
  - geodesyLib.geodesyLibStrings.ED50
  - geodesyLib.geodesyLibStrings.Irl1975
  - geodesyLib.geodesyLibStrings.NAD27
  - geodesyLib.geodesyLibStrings.NAD83
  - geodesyLib.geodesyLibStrings.NTF
  - geodesyLib.geodesyLibStrings.OSGB36
  - geodesyLib.geodesyLibStrings.Potsdam
  - geodesyLib.geodesyLibStrings.TokyoJapan
  - geodesyLib.geodesyLibStrings.WGS72
  - geodesyLib.geodesyLibStrings.WGS84
*/
trait datum extends js.Object

object Datum {
  @scala.inline
  def apply(
    ellipsoid: Ellipsoid,
    transform: js.Tuple7[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ]
  ): Datum = {
    val __obj = js.Dynamic.literal(ellipsoid = ellipsoid, transform = transform)
  
    __obj.asInstanceOf[Datum]
  }
}

