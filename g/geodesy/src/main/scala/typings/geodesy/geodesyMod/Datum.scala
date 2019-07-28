package typings.geodesy.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datum extends js.Object {
  var ellipsoid: Ellipsoid
  var transform: js.Tuple7[Double, Double, Double, Double, Double, Double, Double]
}

/* Rewritten from type alias, can be one of: 
  - typings.geodesy.geodesyStrings.ED50
  - typings.geodesy.geodesyStrings.Irl1975
  - typings.geodesy.geodesyStrings.NAD27
  - typings.geodesy.geodesyStrings.NAD83
  - typings.geodesy.geodesyStrings.NTF
  - typings.geodesy.geodesyStrings.OSGB36
  - typings.geodesy.geodesyStrings.Potsdam
  - typings.geodesy.geodesyStrings.TokyoJapan
  - typings.geodesy.geodesyStrings.WGS72
  - typings.geodesy.geodesyStrings.WGS84
*/
trait datum extends js.Object

object Datum {
  @scala.inline
  def apply(ellipsoid: Ellipsoid, transform: js.Tuple7[Double, Double, Double, Double, Double, Double, Double]): Datum = {
    val __obj = js.Dynamic.literal(ellipsoid = ellipsoid, transform = transform)
  
    __obj.asInstanceOf[Datum]
  }
}

