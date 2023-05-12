package typings.geometric

import typings.geometric.geometricStrings.ccw
import typings.geometric.geometricStrings.clockwise
import typings.geometric.geometricStrings.cw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geometric", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def angleReflect(incidenceAngle: Double, surfaceAngle: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleReflect")(incidenceAngle.asInstanceOf[js.Any], surfaceAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def angleToDegrees(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("angleToDegrees")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def angleToRadians(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("angleToRadians")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def lineAngle(line: Line): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lineAngle")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def lineInterpolate(line: Line): LineInterpolator = ^.asInstanceOf[js.Dynamic].applyDynamic("lineInterpolate")(line.asInstanceOf[js.Any]).asInstanceOf[LineInterpolator]
  
  inline def lineIntersectsLine(lineA: Line, lineB: Line): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lineIntersectsLine")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lineIntersectsPolygon(line: Line, polygon: Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lineIntersectsPolygon")(line.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lineLength(line: Line): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lineLength")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def lineMidpoint(line: Line): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("lineMidpoint")(line.asInstanceOf[js.Any]).asInstanceOf[Point]
  
  inline def lineRotate(line: Line, angle: Double): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("lineRotate")(line.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Line]
  inline def lineRotate(line: Line, angle: Double, origin: Point): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("lineRotate")(line.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Line]
  
  inline def lineTranslate(line: Line, angle: Double, distance: Double): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("lineTranslate")(line.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Line]
  
  inline def pointInPolygon(point: Point, polygon: Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInPolygon")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pointLeftofLine(point: Point, line: Line): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointLeftofLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pointOnLine(point: Point, line: Line): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOnLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def pointOnLine(point: Point, line: Line, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOnLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pointOnPolygon(point: Point, polygon: Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOnPolygon")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def pointOnPolygon(point: Point, polygon: Polygon, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOnPolygon")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pointRightofLine(point: Point, line: Line): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointRightofLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pointRotate(point: Point, angle: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointRotate")(point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def pointRotate(point: Point, angle: Double, origin: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointRotate")(point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def pointTranslate(point: Point, angle: Double, distance: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointTranslate")(point.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def pointWithLine(point: Point, line: Line): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointWithLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def pointWithLine(point: Point, line: Line, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointWithLine")(point.asInstanceOf[js.Any], line.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def polygonArea(polygon: Polygon): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonArea")(polygon.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def polygonArea(polygon: Polygon, signed: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonArea")(polygon.asInstanceOf[js.Any], signed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def polygonBounds(polygon: Polygon): Null | (js.Tuple2[Point, Point]) = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonBounds")(polygon.asInstanceOf[js.Any]).asInstanceOf[Null | (js.Tuple2[Point, Point])]
  
  inline def polygonCentroid(polygon: Polygon): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonCentroid")(polygon.asInstanceOf[js.Any]).asInstanceOf[Point]
  
  inline def polygonHull(points: js.Array[Point]): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonHull")(points.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  
  inline def polygonInPolygon(polygonA: Polygon, polygonB: Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonInPolygon")(polygonA.asInstanceOf[js.Any], polygonB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def polygonInterpolate(polygon: Polygon): PolygonInterpolator = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonInterpolate")(polygon.asInstanceOf[js.Any]).asInstanceOf[PolygonInterpolator]
  
  inline def polygonIntersectsPolygon(polygonA: Polygon, polygonB: Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonIntersectsPolygon")(polygonA.asInstanceOf[js.Any], polygonB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def polygonLength(polygon: Polygon): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonLength")(polygon.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def polygonMean(polygon: Polygon): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonMean")(polygon.asInstanceOf[js.Any]).asInstanceOf[Point]
  
  inline def polygonRandom(): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonRandom")().asInstanceOf[Polygon]
  inline def polygonRandom(sides: Double): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonRandom")(sides.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  inline def polygonRandom(sides: Double, area: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRandom")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonRandom(sides: Double, area: Double, centroid: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRandom")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any], centroid.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonRandom(sides: Double, area: Unit, centroid: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRandom")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any], centroid.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonRandom(sides: Unit, area: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRandom")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonRandom(sides: Unit, area: Double, centroid: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRandom")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any], centroid.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonRandom(sides: Unit, area: Unit, centroid: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRandom")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any], centroid.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def polygonReflectX(polygon: Polygon): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonReflectX")(polygon.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  inline def polygonReflectX(polygon: Polygon, reflectFactor: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonReflectX")(polygon.asInstanceOf[js.Any], reflectFactor.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def polygonReflectY(polygon: Polygon): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonReflectY")(polygon.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  inline def polygonReflectY(polygon: Polygon, reflectFactor: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonReflectY")(polygon.asInstanceOf[js.Any], reflectFactor.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def polygonRegular(): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonRegular")().asInstanceOf[Polygon]
  inline def polygonRegular(sides: Double): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonRegular")(sides.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  inline def polygonRegular(sides: Double, area: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRegular")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonRegular(sides: Double, area: Double, center: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRegular")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonRegular(sides: Double, area: Unit, center: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRegular")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonRegular(sides: Unit, area: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRegular")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonRegular(sides: Unit, area: Double, center: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRegular")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonRegular(sides: Unit, area: Unit, center: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRegular")(sides.asInstanceOf[js.Any], area.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def polygonRotate(polygon: Polygon, angle: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRotate")(polygon.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonRotate(polygon: Polygon, angle: Double, origin: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonRotate")(polygon.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def polygonScale(polygon: Polygon, scaleFactor: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonScale")(polygon.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonScale(polygon: Polygon, scaleFactor: Double, origin: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonScale")(polygon.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def polygonScaleArea(polygon: Polygon, scaleFactor: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonScaleArea")(polygon.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonScaleArea(polygon: Polygon, scaleFactor: Double, origin: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonScaleArea")(polygon.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def polygonScaleX(polygon: Polygon, scaleFactor: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonScaleX")(polygon.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonScaleX(polygon: Polygon, scaleFactor: Double, origin: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonScaleX")(polygon.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def polygonScaleY(polygon: Polygon, scaleFactor: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonScaleY")(polygon.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def polygonScaleY(polygon: Polygon, scaleFactor: Double, origin: Point): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonScaleY")(polygon.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def polygonTranslate(polygon: Polygon, angle: Double, distance: Double): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonTranslate")(polygon.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  inline def polygonWind(polygon: Polygon): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonWind")(polygon.asInstanceOf[js.Any]).asInstanceOf[Polygon]
  inline def polygonWind(polygon: Polygon, order: cw | ccw | clockwise): Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonWind")(polygon.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  type Line = js.Tuple2[Point, Point]
  
  type LineInterpolator = js.Function1[/* t */ Double, Point]
  
  type Point = js.Tuple2[Double, Double]
  
  type Polygon = js.Array[Point]
  
  type PolygonInterpolator = js.Function1[/* t */ Double, Point]
}
