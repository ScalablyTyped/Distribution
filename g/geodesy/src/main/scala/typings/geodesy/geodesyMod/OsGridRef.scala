package typings.geodesy.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy", "OsGridRef")
@js.native
class OsGridRef protected () extends js.Object {
  def this(easting: Double, northing: Double) = this()
  var easting: Double = js.native
  var northing: Double = js.native
  def toString(digits: Double): String = js.native
}

/* static members */
@JSImport("geodesy", "OsGridRef")
@js.native
object OsGridRef extends js.Object {
  def latLonToOsGrid(p: LatLon): OsGridRef = js.native
  def osGridToLatLon(gridref: OsGridRef): LatLon = js.native
  def osGridToLatLon(gridref: OsGridRef, datum: Datum): LatLon = js.native
  def parse(gridref: String): OsGridRef = js.native
}

