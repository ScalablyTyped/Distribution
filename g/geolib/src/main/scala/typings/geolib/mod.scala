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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("geolib", "computeDestinationPoint")
  @js.native
  def computeDestinationPoint(start: GeolibInputCoordinates, distance: Double, bearing: Double): Latitude = js.native
  @JSImport("geolib", "computeDestinationPoint")
  @js.native
  def computeDestinationPoint(start: GeolibInputCoordinates, distance: Double, bearing: Double, radius: Double): Latitude = js.native
  
  @JSImport("geolib", "convertArea")
  @js.native
  def convertArea(squareMeters: Double): Double = js.native
  @JSImport("geolib", "convertArea")
  @js.native
  def convertArea(squareMeters: Double, targetUnit: String): Double = js.native
  
  @JSImport("geolib", "convertDistance")
  @js.native
  def convertDistance(meters: Double): Double = js.native
  @JSImport("geolib", "convertDistance")
  @js.native
  def convertDistance(meters: Double, targetUnit: String): Double = js.native
  
  @JSImport("geolib", "convertSpeed")
  @js.native
  def convertSpeed(metersPerSecond: Double): Double = js.native
  @JSImport("geolib", "convertSpeed")
  @js.native
  def convertSpeed(metersPerSecond: Double, targetUnit: String): Double = js.native
  
  @JSImport("geolib", "decimalToSexagesimal")
  @js.native
  def decimalToSexagesimal(decimal: Double): String = js.native
  
  @JSImport("geolib", "distanceConversion")
  @js.native
  val distanceConversion: unitObject = js.native
  
  @JSImport("geolib", "earthRadius")
  @js.native
  val earthRadius: /* 6378137 */ Double = js.native
  
  @JSImport("geolib", "findNearest")
  @js.native
  def findNearest(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates]): GeolibInputCoordinates = js.native
  
  @JSImport("geolib", "getAreaOfPolygon")
  @js.native
  def getAreaOfPolygon(points: js.Array[GeolibInputCoordinates]): Double = js.native
  
  @JSImport("geolib", "getBounds")
  @js.native
  def getBounds(points: js.Array[_]): js.Any = js.native
  
  @JSImport("geolib", "getBoundsOfDistance")
  @js.native
  def getBoundsOfDistance(point: GeolibInputCoordinates, distance: Double): js.Array[Latitude] = js.native
  
  @JSImport("geolib", "getCenter")
  @js.native
  def getCenter(points: js.Array[GeolibInputCoordinates]): `false` | Longitude = js.native
  
  @JSImport("geolib", "getCenterOfBounds")
  @js.native
  def getCenterOfBounds(coords: js.Array[GeolibInputCoordinates]): Latitude = js.native
  
  @JSImport("geolib", "getCompassDirection")
  @js.native
  def getCompassDirection(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = js.native
  @JSImport("geolib", "getCompassDirection")
  @js.native
  def getCompassDirection(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates, bearingFn: BearingFunction): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = js.native
  
  @JSImport("geolib", "getCoordinateKey")
  @js.native
  def getCoordinateKey[Keys](point: GeolibInputCoordinates, keysToLookup: js.Array[Keys]): js.UndefOr[Keys] = js.native
  
  @JSImport("geolib", "getCoordinateKeys")
  @js.native
  def getCoordinateKeys(point: GeolibInputCoordinates): AltitudeLatitude = js.native
  @JSImport("geolib", "getCoordinateKeys")
  @js.native
  def getCoordinateKeys(point: GeolibInputCoordinates, keysToLookup: Altitude): AltitudeLatitude = js.native
  
  @JSImport("geolib", "getDistance")
  @js.native
  def getDistance(from: GeolibInputCoordinates, to: GeolibInputCoordinates): Double = js.native
  @JSImport("geolib", "getDistance")
  @js.native
  def getDistance(from: GeolibInputCoordinates, to: GeolibInputCoordinates, accuracy: Double): Double = js.native
  
  @JSImport("geolib", "getDistanceFromLine")
  @js.native
  def getDistanceFromLine(point: GeolibInputCoordinates, lineStart: GeolibInputCoordinates, lineEnd: GeolibInputCoordinates): Double = js.native
  
  /**
    * Gets great circle bearing of two points. See description of getRhumbLineBearing for more information
    */
  @JSImport("geolib", "getGreatCircleBearing")
  @js.native
  def getGreatCircleBearing(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): Double = js.native
  
  @JSImport("geolib", "getLatitude")
  @js.native
  def getLatitude(point: GeolibInputCoordinates): js.Any = js.native
  @JSImport("geolib", "getLatitude")
  @js.native
  def getLatitude(point: GeolibInputCoordinates, raw: Boolean): js.Any = js.native
  
  @JSImport("geolib", "getLongitude")
  @js.native
  def getLongitude(point: GeolibInputCoordinates): js.Any = js.native
  @JSImport("geolib", "getLongitude")
  @js.native
  def getLongitude(point: GeolibInputCoordinates, raw: Boolean): js.Any = js.native
  
  @JSImport("geolib", "getPathLength")
  @js.native
  def getPathLength(points: js.Array[GeolibInputCoordinates]): Double = js.native
  @JSImport("geolib", "getPathLength")
  @js.native
  def getPathLength(points: js.Array[GeolibInputCoordinates], distanceFn: DistanceFn): Double = js.native
  
  @JSImport("geolib", "getPreciseDistance")
  @js.native
  def getPreciseDistance(start: GeolibInputCoordinates, end: GeolibInputCoordinates): Double = js.native
  @JSImport("geolib", "getPreciseDistance")
  @js.native
  def getPreciseDistance(start: GeolibInputCoordinates, end: GeolibInputCoordinates, accuracy: Double): Double = js.native
  
  /**
    * Gets rhumb line bearing of two points. Find out about the difference between rhumb line and
    * great circle bearing on Wikipedia. It's quite complicated. Rhumb line should be fine in most cases:
    *
    * http://en.wikipedia.org/wiki/Rhumb_line#General_and_mathematical_description
    *
    * Function heavily based on Doug Vanderweide's great PHP version (licensed under GPL 3.0)
    * http://www.dougv.com/2009/07/13/calculating-the-bearing-and-compass-rose-direction-between-two-latitude-longitude-coordinates-in-php/
    */
  @JSImport("geolib", "getRhumbLineBearing")
  @js.native
  def getRhumbLineBearing(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): Double = js.native
  
  @JSImport("geolib", "getRoughCompassDirection")
  @js.native
  def getRoughCompassDirection(exact: String): js.UndefOr[S | W | E | N] = js.native
  
  @JSImport("geolib", "getSpeed")
  @js.native
  def getSpeed(start: GeolibInputCoordinatesWithTime, end: GeolibInputCoordinatesWithTime): Double = js.native
  @JSImport("geolib", "getSpeed")
  @js.native
  def getSpeed(
    start: GeolibInputCoordinatesWithTime,
    end: GeolibInputCoordinatesWithTime,
    distanceFn: GeolibDistanceFn
  ): Double = js.native
  
  @JSImport("geolib", "isDecimal")
  @js.native
  def isDecimal(value: js.Any): Boolean = js.native
  
  @JSImport("geolib", "isPointInLine")
  @js.native
  def isPointInLine(point: GeolibInputCoordinates, lineStart: GeolibInputCoordinates, lineEnd: GeolibInputCoordinates): Boolean = js.native
  
  @JSImport("geolib", "isPointInPolygon")
  @js.native
  def isPointInPolygon(point: GeolibInputCoordinates, polygon: js.Array[GeolibInputCoordinates]): Boolean = js.native
  
  @JSImport("geolib", "isPointNearLine")
  @js.native
  def isPointNearLine(
    point: GeolibInputCoordinates,
    start: GeolibInputCoordinates,
    end: GeolibInputCoordinates,
    distance: Double
  ): Boolean = js.native
  
  @JSImport("geolib", "isPointWithinRadius")
  @js.native
  def isPointWithinRadius(point: GeolibInputCoordinates, center: GeolibInputCoordinates, radius: Double): Boolean = js.native
  
  @JSImport("geolib", "isSexagesimal")
  @js.native
  def isSexagesimal(value: js.Any): Boolean = js.native
  
  @JSImport("geolib", "isValidCoordinate")
  @js.native
  def isValidCoordinate(point: GeolibInputCoordinates): Boolean = js.native
  
  @JSImport("geolib", "isValidLatitude")
  @js.native
  def isValidLatitude(value: js.Any): Boolean = js.native
  
  @JSImport("geolib", "isValidLongitude")
  @js.native
  def isValidLongitude(value: js.Any): Boolean = js.native
  
  @JSImport("geolib", "latitudeKeys")
  @js.native
  val latitudeKeys: js.Array[LatitudeKeys] = js.native
  
  @JSImport("geolib", "longitudeKeys")
  @js.native
  val longitudeKeys: js.Array[LongitudeKeys] = js.native
  
  @JSImport("geolib", "orderByDistance")
  @js.native
  def orderByDistance(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates]): js.Array[GeolibInputCoordinates] = js.native
  @JSImport("geolib", "orderByDistance")
  @js.native
  def orderByDistance(
    point: GeolibInputCoordinates,
    coords: js.Array[GeolibInputCoordinates],
    distanceFn: typings.geolib.orderByDistanceMod.DistanceFn
  ): js.Array[GeolibInputCoordinates] = js.native
  
  @JSImport("geolib", "sexagesimalPattern")
  @js.native
  val sexagesimalPattern: RegExp = js.native
  
  @JSImport("geolib", "sexagesimalToDecimal")
  @js.native
  def sexagesimalToDecimal(sexagesimal: js.Any): Double = js.native
  
  @JSImport("geolib", "timeConversion")
  @js.native
  val timeConversion: unitObject = js.native
  
  @JSImport("geolib", "toDecimal")
  @js.native
  def toDecimal(value: js.Any): js.Any = js.native
  
  @JSImport("geolib", "toDeg")
  @js.native
  def toDeg(value: Double): Double = js.native
  
  @JSImport("geolib", "toRad")
  @js.native
  def toRad(value: Double): Double = js.native
  
  @JSImport("geolib", "wktToPolygon")
  @js.native
  def wktToPolygon(wkt: String): js.Array[Longitude] = js.native
}
