package typings.dojo.dojox.geo.openlayers.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.GreatCircle.html
  *
  *
  */
trait GreatCircle extends js.Object {
  /**
    *
    */
  var DEG2RAD: Double
  /**
    *
    */
  var RAD2DEG: Double
  /**
    *
    */
  var TOLERANCE: Double
  /**
    * Create a geodetic line as an array of dojox.geo.openlayers.GeometryFeature.
    * Create a geodetic line as a dojox.geo.openlayers.GeometryFeature between the point p1
    * ant the point p2. Result is a polyline approximation for which a new point is
    * calculated every increment degrees.
    *
    * @param p1 The first point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param p2 The second point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param increment The value at which a new point is computed.
    */
  def toGeometryFeature(
    p1: typings.dojo.dojox.geo.openlayers.Point,
    p2: typings.dojo.dojox.geo.openlayers.Point,
    increment: Double
  ): js.Any
  /**
    * Create a geodetic line as an array of OpenLayers.Geometry.LineString.
    * Create a geodetic line as a OpenLayers.Geometry.LineString between the point p1
    * and the point p2. Result is a polyline approximation for which a new point is
    * calculated every increment degrees.
    *
    * @param p1 The first point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param p2 The second point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param increment The value at which a new point is computed.
    */
  def toLineString(
    p1: typings.dojo.dojox.geo.openlayers.Point,
    p2: typings.dojo.dojox.geo.openlayers.Point,
    increment: Double
  ): js.Any
  /**
    * Create a geodetic line as an array of OpenLayers.Point.
    * Create a geodetic line as an array of OpenLayers.Point between the point p1
    * and the point p2. Result is a polyline approximation for which a new point is
    * calculated every increment degrees.
    *
    * @param p1 The first point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param p2 The second point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param increment The value at which a new point is computed.
    */
  def toPointArray(
    p1: typings.dojo.dojox.geo.openlayers.Point,
    p2: typings.dojo.dojox.geo.openlayers.Point,
    increment: Double
  ): js.Array[_]
}

object GreatCircle {
  @scala.inline
  def apply(
    DEG2RAD: Double,
    RAD2DEG: Double,
    TOLERANCE: Double,
    toGeometryFeature: (typings.dojo.dojox.geo.openlayers.Point, typings.dojo.dojox.geo.openlayers.Point, Double) => js.Any,
    toLineString: (typings.dojo.dojox.geo.openlayers.Point, typings.dojo.dojox.geo.openlayers.Point, Double) => js.Any,
    toPointArray: (typings.dojo.dojox.geo.openlayers.Point, typings.dojo.dojox.geo.openlayers.Point, Double) => js.Array[_]
  ): GreatCircle = {
    val __obj = js.Dynamic.literal(DEG2RAD = DEG2RAD.asInstanceOf[js.Any], RAD2DEG = RAD2DEG.asInstanceOf[js.Any], TOLERANCE = TOLERANCE.asInstanceOf[js.Any], toGeometryFeature = js.Any.fromFunction3(toGeometryFeature), toLineString = js.Any.fromFunction3(toLineString), toPointArray = js.Any.fromFunction3(toPointArray))
    __obj.asInstanceOf[GreatCircle]
  }
}

