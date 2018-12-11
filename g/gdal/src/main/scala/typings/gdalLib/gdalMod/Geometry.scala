package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "Geometry")
@js.native
abstract class Geometry () extends js.Object {
  val coordinateDimension: scala.Double = js.native
  val dimension: scala.Double = js.native
  val name: java.lang.String = js.native
  var srs: SpatialReference = js.native
  val wkbSize: scala.Double = js.native
  val wkbType: scala.Double = js.native
  def boundary(): Geometry = js.native
  def buffer(distance: scala.Double, segments: scala.Double): Geometry = js.native
  def centroid(): Point = js.native
  def closeRings(): scala.Unit = js.native
  def contains(geometry: Geometry): scala.Boolean = js.native
  def convexHull(): Geometry = js.native
  def crosses(geometry: Geometry): scala.Boolean = js.native
  def difference(geometry: Geometry): Geometry = js.native
  def disjoint(geometry: Geometry): scala.Boolean = js.native
  def distance(geometry: Geometry): scala.Double = js.native
  def empty(): scala.Unit = js.native
  def equals(geometry: Geometry): scala.Boolean = js.native
  def getEnvelope(): Envelope = js.native
  def getEnvelope3D(): Envelope3D = js.native
  def intersection(geometry: Geometry): Geometry = js.native
  def intersects(geometry: Geometry): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def isRing(): scala.Boolean = js.native
  def isSimple(): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def overlaps(geometry: Geometry): scala.Boolean = js.native
  def segmentize(segment_length: scala.Double): scala.Double = js.native
  def simplify(tolerance: scala.Double): Geometry = js.native
  def simplifyPreserveTopology(tolerance: scala.Double): Geometry = js.native
  def swapXY(): scala.Unit = js.native
  def symDifference(geometry: Geometry): Geometry = js.native
  def toGML(): Geometry = js.native
  def toJSON(): Geometry = js.native
  def toKML(): Geometry = js.native
  def toObject(): js.Object = js.native
  def toWKB(): Geometry = js.native
  def toWKB(byte_order: java.lang.String): Geometry = js.native
  def toWKB(byte_order: java.lang.String, variant: java.lang.String): Geometry = js.native
  def toWKT(): Geometry = js.native
  def touches(geometry: Geometry): scala.Boolean = js.native
  def transform(transformation: CoordinateTransformation): scala.Unit = js.native
  def transformTo(srs: SpatialReference): scala.Unit = js.native
  def union(geometry: Geometry): Geometry = js.native
  def within(geometry: Geometry): scala.Boolean = js.native
}

@JSImport("gdal", "Geometry")
@js.native
object Geometry extends js.Object {
  def create(`type`: scala.Double): gdalLib.gdalMod.Geometry = js.native
  def fromWKB(wkb: scala.Double): gdalLib.gdalMod.Geometry = js.native
  def fromWKB(wkb: scala.Double, srs: gdalLib.gdalMod.SpatialReference): gdalLib.gdalMod.Geometry = js.native
  def fromWKT(wkt: java.lang.String): gdalLib.gdalMod.Geometry = js.native
  def fromWKT(wkt: java.lang.String, srs: gdalLib.gdalMod.SpatialReference): gdalLib.gdalMod.Geometry = js.native
  def getConstructor(`type`: scala.Double): gdalLib.gdalMod.Geometry = js.native
  def getName(`type`: scala.Double): java.lang.String = js.native
}

