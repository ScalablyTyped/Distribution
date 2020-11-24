package typings.geometric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geometric", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def angleReflect(incidenceAngle: Double, surfaceAngle: Double): Double = js.native
  
  def angleToDegrees(angle: Double): Double = js.native
  
  def angleToRadians(angle: Double): Double = js.native
  
  def lineAngle(line: Line): Double = js.native
  
  def lineInterpolate(line: Line): LineInterpolator = js.native
  
  def lineIntersectsLine(lineA: Line, lineB: Line): Boolean = js.native
  
  def lineIntersectsPolygon(line: Line, polygon: Polygon): Boolean = js.native
  
  def lineLength(line: Line): Double = js.native
  
  def lineMidpoint(line: Line): Point = js.native
  
  def pointInPolygon(point: Point, polygon: Polygon): Boolean = js.native
  
  def pointLeftofLine(point: Point, line: Line): Boolean = js.native
  
  def pointOnLine(point: Point, line: Line): Boolean = js.native
  
  def pointOnPolygon(point: Point, polygon: Polygon): Boolean = js.native
  
  def pointRightofLine(point: Point, line: Line): Boolean = js.native
  
  def pointRotate(point: Point, angle: Double): Point = js.native
  def pointRotate(point: Point, angle: Double, origin: Point): Point = js.native
  
  def pointTranslate(point: Point, angle: Double, distance: Double): Point = js.native
  
  def pointWithLine(point: Point, line: Line): Boolean = js.native
  
  def polygonArea(polygon: Polygon): Double = js.native
  def polygonArea(polygon: Polygon, signed: Boolean): Double = js.native
  
  def polygonBounds(polygon: Polygon): Null | (js.Tuple2[Point, Point]) = js.native
  
  def polygonCentroid(polygon: Polygon): Point = js.native
  
  def polygonHull(points: js.Array[Point]): Polygon = js.native
  
  def polygonInPolygon(polygonA: Polygon, polygonB: Polygon): Boolean = js.native
  
  def polygonIntersectsPolygon(polygonA: Polygon, polygonB: Polygon): Boolean = js.native
  
  def polygonLength(polygon: Polygon): Double = js.native
  
  def polygonMean(polygon: Polygon): Point = js.native
  
  def polygonRegular(): Polygon = js.native
  def polygonRegular(sides: js.UndefOr[scala.Nothing], area: js.UndefOr[scala.Nothing], center: Point): Polygon = js.native
  def polygonRegular(sides: js.UndefOr[scala.Nothing], area: Double): Polygon = js.native
  def polygonRegular(sides: js.UndefOr[scala.Nothing], area: Double, center: Point): Polygon = js.native
  def polygonRegular(sides: Double): Polygon = js.native
  def polygonRegular(sides: Double, area: js.UndefOr[scala.Nothing], center: Point): Polygon = js.native
  def polygonRegular(sides: Double, area: Double): Polygon = js.native
  def polygonRegular(sides: Double, area: Double, center: Point): Polygon = js.native
  
  def polygonRotate(polygon: Polygon, angle: Double): Polygon = js.native
  def polygonRotate(polygon: Polygon, angle: Double, origin: Point): Polygon = js.native
  
  def polygonScale(polygon: Polygon, scaleFactor: Double): Polygon = js.native
  def polygonScale(polygon: Polygon, scaleFactor: Double, origin: Point): Polygon = js.native
  
  def polygonTranslate(polygon: Polygon, angle: Double, distance: Double): Polygon = js.native
  
  type Line = js.Tuple2[Point, Point]
  
  type LineInterpolator = js.Function1[/* t */ Double, Point]
  
  type Point = js.Tuple2[Double, Double]
  
  type Polygon = js.Array[Point]
}
