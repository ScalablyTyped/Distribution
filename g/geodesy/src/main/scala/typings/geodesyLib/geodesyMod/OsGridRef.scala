package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "OsGridRef")
@js.native
class OsGridRef protected () extends js.Object {
  def this(easting: scala.Double, northing: scala.Double) = this()
  var easting: scala.Double = js.native
  var northing: scala.Double = js.native
  def toString(digits: scala.Double): java.lang.String = js.native
}

@JSImport("geodesy", "OsGridRef")
@js.native
object OsGridRef extends js.Object {
  def latLonToOsGrid(p: geodesyLib.geodesyMod.LatLon): geodesyLib.geodesyMod.OsGridRef = js.native
  def osGridToLatLon(gridref: geodesyLib.geodesyMod.OsGridRef): geodesyLib.geodesyMod.LatLon = js.native
  def osGridToLatLon(gridref: geodesyLib.geodesyMod.OsGridRef, datum: geodesyLib.geodesyMod.Datum): geodesyLib.geodesyMod.LatLon = js.native
  def parse(gridref: java.lang.String): geodesyLib.geodesyMod.OsGridRef = js.native
}

