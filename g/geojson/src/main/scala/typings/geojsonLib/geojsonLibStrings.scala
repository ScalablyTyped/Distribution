package typings
package geojsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object geojsonLibStrings {
  @js.native
  sealed trait Feature extends js.Object
  
  @js.native
  sealed trait FeatureCollection extends js.Object
  
  @js.native
  sealed trait GeometryCollection extends js.Object
  
  @js.native
  sealed trait LineString extends js.Object
  
  @js.native
  sealed trait MultiLineString extends js.Object
  
  @js.native
  sealed trait MultiPoint extends js.Object
  
  @js.native
  sealed trait MultiPolygon extends js.Object
  
  @js.native
  sealed trait Point extends js.Object
  
  @js.native
  sealed trait Polygon extends js.Object
  
  def Feature: Feature = "Feature".asInstanceOf[Feature]
  def FeatureCollection: FeatureCollection = "FeatureCollection".asInstanceOf[FeatureCollection]
  def GeometryCollection: GeometryCollection = "GeometryCollection".asInstanceOf[GeometryCollection]
  def LineString: LineString = "LineString".asInstanceOf[LineString]
  def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  def Point: Point = "Point".asInstanceOf[Point]
  def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
}

