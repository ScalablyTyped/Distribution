package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gdal", "Geometry")
@js.native
abstract class Geometry () extends js.Object {
  
  def boundary(): Geometry = js.native
  
  def buffer(distance: Double, segments: Double): Geometry = js.native
  
  def centroid(): Point = js.native
  
  def closeRings(): Unit = js.native
  
  def contains(geometry: Geometry): Boolean = js.native
  
  def convexHull(): Geometry = js.native
  
  val coordinateDimension: Double = js.native
  
  def crosses(geometry: Geometry): Boolean = js.native
  
  def difference(geometry: Geometry): Geometry = js.native
  
  val dimension: Double = js.native
  
  def disjoint(geometry: Geometry): Boolean = js.native
  
  def distance(geometry: Geometry): Double = js.native
  
  def empty(): Unit = js.native
  
  def equals(geometry: Geometry): Boolean = js.native
  
  def getEnvelope(): Envelope = js.native
  
  def getEnvelope3D(): Envelope3D = js.native
  
  def intersection(geometry: Geometry): Geometry = js.native
  
  def intersects(geometry: Geometry): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isRing(): Boolean = js.native
  
  def isSimple(): Boolean = js.native
  
  def isValid(): Boolean = js.native
  
  val name: String = js.native
  
  def overlaps(geometry: Geometry): Boolean = js.native
  
  def segmentize(segment_length: Double): Double = js.native
  
  def simplify(tolerance: Double): Geometry = js.native
  
  def simplifyPreserveTopology(tolerance: Double): Geometry = js.native
  
  var srs: SpatialReference = js.native
  
  def swapXY(): Unit = js.native
  
  def symDifference(geometry: Geometry): Geometry = js.native
  
  def toGML(): Geometry = js.native
  
  def toJSON(): Geometry = js.native
  
  def toKML(): Geometry = js.native
  
  def toObject(): js.Object = js.native
  
  def toWKB(): Geometry = js.native
  def toWKB(byte_order: js.UndefOr[scala.Nothing], variant: String): Geometry = js.native
  def toWKB(byte_order: String): Geometry = js.native
  def toWKB(byte_order: String, variant: String): Geometry = js.native
  
  def toWKT(): Geometry = js.native
  
  def touches(geometry: Geometry): Boolean = js.native
  
  def transform(transformation: CoordinateTransformation): Unit = js.native
  
  def transformTo(srs: SpatialReference): Unit = js.native
  
  def union(geometry: Geometry): Geometry = js.native
  
  def within(geometry: Geometry): Boolean = js.native
  
  val wkbSize: Double = js.native
  
  val wkbType: Double = js.native
}
/* static members */
@JSImport("gdal", "Geometry")
@js.native
object Geometry extends js.Object {
  
  def create(`type`: Double): Geometry = js.native
  
  def fromWKB(wkb: Double): Geometry = js.native
  def fromWKB(wkb: Double, srs: SpatialReference): Geometry = js.native
  
  def fromWKT(wkt: String): Geometry = js.native
  def fromWKT(wkt: String, srs: SpatialReference): Geometry = js.native
  
  def getConstructor(`type`: Double): Geometry = js.native
  
  def getName(`type`: Double): String = js.native
}
