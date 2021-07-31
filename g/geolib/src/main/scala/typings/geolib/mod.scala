package typings.geolib

import typings.geolib.anon.Altitude
import typings.geolib.anon.AltitudeLatitude
import typings.geolib.anon.Latitude
import typings.geolib.anon.Longitude
import typings.geolib.constantsMod.unitObject
import typings.geolib.geolibBooleans.`false`
import typings.geolib.geolibStrings.E
import typings.geolib.geolibStrings.ENE
import typings.geolib.geolibStrings.ESE
import typings.geolib.geolibStrings.N
import typings.geolib.geolibStrings.NE
import typings.geolib.geolibStrings.NNE
import typings.geolib.geolibStrings.NNW
import typings.geolib.geolibStrings.NW
import typings.geolib.geolibStrings.S
import typings.geolib.geolibStrings.SE
import typings.geolib.geolibStrings.SSE
import typings.geolib.geolibStrings.SSW
import typings.geolib.geolibStrings.SW
import typings.geolib.geolibStrings.W
import typings.geolib.geolibStrings.WNW
import typings.geolib.geolibStrings.WSW
import typings.geolib.getCompassDirectionMod.BearingFunction
import typings.geolib.getPathLengthMod.DistanceFn
import typings.geolib.typesMod.AltitudeKeys
import typings.geolib.typesMod.GeolibDistanceFn
import typings.geolib.typesMod.GeolibInputCoordinates
import typings.geolib.typesMod.GeolibInputCoordinatesWithTime
import typings.geolib.typesMod.LatitudeKeys
import typings.geolib.typesMod.LongitudeKeys
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geolib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("geolib", "MAXLAT")
  @js.native
  val MAXLAT: /* 90 */ Double = js.native
  
  @JSImport("geolib", "MAXLON")
  @js.native
  val MAXLON: /* 180 */ Double = js.native
  
  @JSImport("geolib", "MINLAT")
  @js.native
  val MINLAT: /* -90 */ Double = js.native
  
  @JSImport("geolib", "MINLON")
  @js.native
  val MINLON: /* -180 */ Double = js.native
  
  @JSImport("geolib", "altitudeKeys")
  @js.native
  val altitudeKeys: js.Array[AltitudeKeys] = js.native
  
  @JSImport("geolib", "areaConversion")
  @js.native
  val areaConversion: unitObject = js.native
  
  @scala.inline
  def computeDestinationPoint(start: GeolibInputCoordinates, distance: Double, bearing: Double): Latitude = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDestinationPoint")(start.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], bearing.asInstanceOf[js.Any])).asInstanceOf[Latitude]
  @scala.inline
  def computeDestinationPoint(start: GeolibInputCoordinates, distance: Double, bearing: Double, radius: Double): Latitude = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDestinationPoint")(start.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], bearing.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Latitude]
  
  @scala.inline
  def convertArea(squareMeters: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertArea")(squareMeters.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def convertArea(squareMeters: Double, targetUnit: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertArea")(squareMeters.asInstanceOf[js.Any], targetUnit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def convertDistance(meters: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDistance")(meters.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def convertDistance(meters: Double, targetUnit: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDistance")(meters.asInstanceOf[js.Any], targetUnit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def convertSpeed(metersPerSecond: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSpeed")(metersPerSecond.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def convertSpeed(metersPerSecond: Double, targetUnit: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertSpeed")(metersPerSecond.asInstanceOf[js.Any], targetUnit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def decimalToSexagesimal(decimal: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decimalToSexagesimal")(decimal.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("geolib", "distanceConversion")
  @js.native
  val distanceConversion: unitObject = js.native
  
  @JSImport("geolib", "earthRadius")
  @js.native
  val earthRadius: /* 6378137 */ Double = js.native
  
  @scala.inline
  def findNearest(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates]): GeolibInputCoordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("findNearest")(point.asInstanceOf[js.Any], coords.asInstanceOf[js.Any])).asInstanceOf[GeolibInputCoordinates]
  
  @scala.inline
  def getAreaOfPolygon(points: js.Array[GeolibInputCoordinates]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAreaOfPolygon")(points.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getBounds(points: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(points.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getBoundsOfDistance(point: GeolibInputCoordinates, distance: Double): js.Array[Latitude] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsOfDistance")(point.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[js.Array[Latitude]]
  
  @scala.inline
  def getCenter(points: js.Array[GeolibInputCoordinates]): `false` | Longitude = ^.asInstanceOf[js.Dynamic].applyDynamic("getCenter")(points.asInstanceOf[js.Any]).asInstanceOf[`false` | Longitude]
  
  @scala.inline
  def getCenterOfBounds(coords: js.Array[GeolibInputCoordinates]): Latitude = ^.asInstanceOf[js.Dynamic].applyDynamic("getCenterOfBounds")(coords.asInstanceOf[js.Any]).asInstanceOf[Latitude]
  
  @scala.inline
  def getCompassDirection(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompassDirection")(origin.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N]
  @scala.inline
  def getCompassDirection(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates, bearingFn: BearingFunction): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompassDirection")(origin.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], bearingFn.asInstanceOf[js.Any])).asInstanceOf[S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N]
  
  @scala.inline
  def getCoordinateKey[Keys](point: GeolibInputCoordinates, keysToLookup: js.Array[Keys]): js.UndefOr[Keys] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCoordinateKey")(point.asInstanceOf[js.Any], keysToLookup.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Keys]]
  
  @scala.inline
  def getCoordinateKeys(point: GeolibInputCoordinates): AltitudeLatitude = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoordinateKeys")(point.asInstanceOf[js.Any]).asInstanceOf[AltitudeLatitude]
  @scala.inline
  def getCoordinateKeys(point: GeolibInputCoordinates, keysToLookup: Altitude): AltitudeLatitude = (^.asInstanceOf[js.Dynamic].applyDynamic("getCoordinateKeys")(point.asInstanceOf[js.Any], keysToLookup.asInstanceOf[js.Any])).asInstanceOf[AltitudeLatitude]
  
  @scala.inline
  def getDistance(from: GeolibInputCoordinates, to: GeolibInputCoordinates): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistance")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getDistance(from: GeolibInputCoordinates, to: GeolibInputCoordinates, accuracy: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistance")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getDistanceFromLine(point: GeolibInputCoordinates, lineStart: GeolibInputCoordinates, lineEnd: GeolibInputCoordinates): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceFromLine")(point.asInstanceOf[js.Any], lineStart.asInstanceOf[js.Any], lineEnd.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets great circle bearing of two points. See description of getRhumbLineBearing for more information
    */
  @scala.inline
  def getGreatCircleBearing(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getGreatCircleBearing")(origin.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getLatitude(point: GeolibInputCoordinates): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLatitude")(point.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getLatitude(point: GeolibInputCoordinates, raw: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLatitude")(point.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getLongitude(point: GeolibInputCoordinates): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLongitude")(point.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getLongitude(point: GeolibInputCoordinates, raw: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLongitude")(point.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getPathLength(points: js.Array[GeolibInputCoordinates]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathLength")(points.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getPathLength(points: js.Array[GeolibInputCoordinates], distanceFn: DistanceFn): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathLength")(points.asInstanceOf[js.Any], distanceFn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getPreciseDistance(start: GeolibInputCoordinates, end: GeolibInputCoordinates): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreciseDistance")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getPreciseDistance(start: GeolibInputCoordinates, end: GeolibInputCoordinates, accuracy: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreciseDistance")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets rhumb line bearing of two points. Find out about the difference between rhumb line and
    * great circle bearing on Wikipedia. It's quite complicated. Rhumb line should be fine in most cases:
    *
    * http://en.wikipedia.org/wiki/Rhumb_line#General_and_mathematical_description
    *
    * Function heavily based on Doug Vanderweide's great PHP version (licensed under GPL 3.0)
    * http://www.dougv.com/2009/07/13/calculating-the-bearing-and-compass-rose-direction-between-two-latitude-longitude-coordinates-in-php/
    */
  @scala.inline
  def getRhumbLineBearing(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRhumbLineBearing")(origin.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getRoughCompassDirection(exact: String): js.UndefOr[S | W | E | N] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoughCompassDirection")(exact.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S | W | E | N]]
  
  @scala.inline
  def getSpeed(start: GeolibInputCoordinatesWithTime, end: GeolibInputCoordinatesWithTime): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSpeed")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getSpeed(
    start: GeolibInputCoordinatesWithTime,
    end: GeolibInputCoordinatesWithTime,
    distanceFn: GeolibDistanceFn
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSpeed")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], distanceFn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isDecimal(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPointInLine(point: GeolibInputCoordinates, lineStart: GeolibInputCoordinates, lineEnd: GeolibInputCoordinates): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInLine")(point.asInstanceOf[js.Any], lineStart.asInstanceOf[js.Any], lineEnd.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isPointInPolygon(point: GeolibInputCoordinates, polygon: js.Array[GeolibInputCoordinates]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointInPolygon")(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isPointNearLine(
    point: GeolibInputCoordinates,
    start: GeolibInputCoordinates,
    end: GeolibInputCoordinates,
    distance: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointNearLine")(point.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isPointWithinRadius(point: GeolibInputCoordinates, center: GeolibInputCoordinates, radius: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointWithinRadius")(point.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSexagesimal(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSexagesimal")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidCoordinate(point: GeolibInputCoordinates): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCoordinate")(point.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidLatitude(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidLatitude")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidLongitude(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidLongitude")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("geolib", "latitudeKeys")
  @js.native
  val latitudeKeys: js.Array[LatitudeKeys] = js.native
  
  @JSImport("geolib", "longitudeKeys")
  @js.native
  val longitudeKeys: js.Array[LongitudeKeys] = js.native
  
  @scala.inline
  def orderByDistance(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates]): js.Array[GeolibInputCoordinates] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderByDistance")(point.asInstanceOf[js.Any], coords.asInstanceOf[js.Any])).asInstanceOf[js.Array[GeolibInputCoordinates]]
  @scala.inline
  def orderByDistance(
    point: GeolibInputCoordinates,
    coords: js.Array[GeolibInputCoordinates],
    distanceFn: typings.geolib.orderByDistanceMod.DistanceFn
  ): js.Array[GeolibInputCoordinates] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderByDistance")(point.asInstanceOf[js.Any], coords.asInstanceOf[js.Any], distanceFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[GeolibInputCoordinates]]
  
  @JSImport("geolib", "sexagesimalPattern")
  @js.native
  val sexagesimalPattern: RegExp = js.native
  
  @scala.inline
  def sexagesimalToDecimal(sexagesimal: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sexagesimalToDecimal")(sexagesimal.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("geolib", "timeConversion")
  @js.native
  val timeConversion: unitObject = js.native
  
  @scala.inline
  def toDecimal(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def toDeg(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDeg")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def toRad(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRad")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def wktToPolygon(wkt: String): js.Array[Longitude] = ^.asInstanceOf[js.Dynamic].applyDynamic("wktToPolygon")(wkt.asInstanceOf[js.Any]).asInstanceOf[js.Array[Longitude]]
}
