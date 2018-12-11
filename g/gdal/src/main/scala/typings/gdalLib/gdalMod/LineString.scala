package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "LineString")
@js.native
class LineString () extends Geometry {
  val points: LineStringPoints = js.native
  def addSubLineString(line: LineString): scala.Unit = js.native
  def addSubLineString(line: LineString, start: scala.Double): scala.Unit = js.native
  def addSubLineString(line: LineString, start: scala.Double, end: scala.Double): scala.Unit = js.native
  def getLength(): scala.Double = js.native
  def value(distance: scala.Double): Point = js.native
}

