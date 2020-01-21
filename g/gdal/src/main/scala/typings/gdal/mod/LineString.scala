package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "LineString")
@js.native
class LineString () extends Geometry {
  val points: LineStringPoints = js.native
  def addSubLineString(line: LineString): Unit = js.native
  def addSubLineString(line: LineString, start: Double): Unit = js.native
  def addSubLineString(line: LineString, start: Double, end: Double): Unit = js.native
  def getLength(): Double = js.native
  def value(distance: Double): Point = js.native
}

