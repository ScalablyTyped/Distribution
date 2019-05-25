package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es", JSImport.Namespace)
@js.native
object esMod extends js.Object {
  def computeDestinationPoint(start: geolibLib.esTypesMod.GeolibInputCoordinates, distance: scala.Double, bearing: scala.Double): geolibLib.Anon_Latitude = js.native
  def computeDestinationPoint(
    start: geolibLib.esTypesMod.GeolibInputCoordinates,
    distance: scala.Double,
    bearing: scala.Double,
    radius: scala.Double
  ): geolibLib.Anon_Latitude = js.native
  def convertSpeed(metersPerSecond: scala.Double): scala.Double = js.native
  def convertSpeed(metersPerSecond: scala.Double, targetUnit: java.lang.String): scala.Double = js.native
  def decimalToSexagesimal(decimal: scala.Double): java.lang.String = js.native
  def findNearest(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    coords: js.Array[geolibLib.esTypesMod.GeolibInputCoordinates]
  ): geolibLib.esTypesMod.GeolibInputCoordinates = js.native
  def getBounds(points: js.Array[_]): js.Any = js.native
  def getBoundsOfDistance(point: geolibLib.esTypesMod.GeolibInputCoordinates, distance: scala.Double): js.Array[geolibLib.Anon_Latitude] = js.native
  def getCenter(points: js.Array[geolibLib.esTypesMod.GeolibInputCoordinates]): geolibLib.geolibLibNumbers.`false` | geolibLib.Anon_LatitudeLongitude = js.native
  def getCenterOfBounds(coords: js.Array[geolibLib.esTypesMod.GeolibInputCoordinates]): geolibLib.Anon_Latitude = js.native
  def getCompassDirection(
    origin: geolibLib.esTypesMod.GeolibInputCoordinates,
    dest: geolibLib.esTypesMod.GeolibInputCoordinates
  ): geolibLib.geolibLibStrings.S | geolibLib.geolibLibStrings.W | geolibLib.geolibLibStrings.NNE | geolibLib.geolibLibStrings.NE | geolibLib.geolibLibStrings.ENE | geolibLib.geolibLibStrings.E | geolibLib.geolibLibStrings.ESE | geolibLib.geolibLibStrings.SE | geolibLib.geolibLibStrings.SSE | geolibLib.geolibLibStrings.SSW | geolibLib.geolibLibStrings.SW | geolibLib.geolibLibStrings.WSW | geolibLib.geolibLibStrings.WNW | geolibLib.geolibLibStrings.NW | geolibLib.geolibLibStrings.NNW | geolibLib.geolibLibStrings.N = js.native
  def getCompassDirection(
    origin: geolibLib.esTypesMod.GeolibInputCoordinates,
    dest: geolibLib.esTypesMod.GeolibInputCoordinates,
    bearingFn: geolibLib.esGetCompassDirectionMod.BearingFunction
  ): geolibLib.geolibLibStrings.S | geolibLib.geolibLibStrings.W | geolibLib.geolibLibStrings.NNE | geolibLib.geolibLibStrings.NE | geolibLib.geolibLibStrings.ENE | geolibLib.geolibLibStrings.E | geolibLib.geolibLibStrings.ESE | geolibLib.geolibLibStrings.SE | geolibLib.geolibLibStrings.SSE | geolibLib.geolibLibStrings.SSW | geolibLib.geolibLibStrings.SW | geolibLib.geolibLibStrings.WSW | geolibLib.geolibLibStrings.WNW | geolibLib.geolibLibStrings.NW | geolibLib.geolibLibStrings.NNW | geolibLib.geolibLibStrings.N = js.native
  def getCoordinateKey[Keys](point: geolibLib.esTypesMod.GeolibInputCoordinates, keysToLookup: js.Array[Keys]): js.UndefOr[Keys] = js.native
  def getCoordinateKeys(point: geolibLib.esTypesMod.GeolibInputCoordinates): geolibLib.Anon_0 | geolibLib.Anon_01 = js.native
  def getDistance(from: geolibLib.esTypesMod.GeolibInputCoordinates, to: geolibLib.esTypesMod.GeolibInputCoordinates): scala.Double = js.native
  def getDistance(
    from: geolibLib.esTypesMod.GeolibInputCoordinates,
    to: geolibLib.esTypesMod.GeolibInputCoordinates,
    accuracy: scala.Double
  ): scala.Double = js.native
  def getDistanceFromLine(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    lineStart: geolibLib.esTypesMod.GeolibInputCoordinates,
    lineEnd: geolibLib.esTypesMod.GeolibInputCoordinates
  ): scala.Double = js.native
  /**
    * Gets great circle bearing of two points. See description of getRhumbLineBearing for more information
    */
  def getGreatCircleBearing(
    origin: geolibLib.esTypesMod.GeolibInputCoordinates,
    dest: geolibLib.esTypesMod.GeolibInputCoordinates
  ): scala.Double = js.native
  def getLatitude(point: geolibLib.esTypesMod.GeolibInputCoordinates): js.Any = js.native
  def getLatitude(point: geolibLib.esTypesMod.GeolibInputCoordinates, raw: scala.Boolean): js.Any = js.native
  def getLongitude(point: geolibLib.esTypesMod.GeolibInputCoordinates): js.Any = js.native
  def getLongitude(point: geolibLib.esTypesMod.GeolibInputCoordinates, raw: scala.Boolean): js.Any = js.native
  def getPathLength(points: js.Array[geolibLib.esTypesMod.GeolibInputCoordinates]): scala.Double = js.native
  def getPathLength(
    points: js.Array[geolibLib.esTypesMod.GeolibInputCoordinates],
    distanceFn: geolibLib.esGetPathLengthMod.DistanceFn
  ): scala.Double = js.native
  def getPreciseDistance(
    start: geolibLib.esTypesMod.GeolibInputCoordinates,
    end: geolibLib.esTypesMod.GeolibInputCoordinates
  ): scala.Double = js.native
  def getPreciseDistance(
    start: geolibLib.esTypesMod.GeolibInputCoordinates,
    end: geolibLib.esTypesMod.GeolibInputCoordinates,
    accuracy: scala.Double
  ): scala.Double = js.native
  /**
    * Gets rhumb line bearing of two points. Find out about the difference between rhumb line and
    * great circle bearing on Wikipedia. It's quite complicated. Rhumb line should be fine in most cases:
    *
    * http://en.wikipedia.org/wiki/Rhumb_line#General_and_mathematical_description
    *
    * Function heavily based on Doug Vanderweide's great PHP version (licensed under GPL 3.0)
    * http://www.dougv.com/2009/07/13/calculating-the-bearing-and-compass-rose-direction-between-two-latitude-longitude-coordinates-in-php/
    */
  def getRhumbLineBearing(
    origin: geolibLib.esTypesMod.GeolibInputCoordinates,
    dest: geolibLib.esTypesMod.GeolibInputCoordinates
  ): scala.Double = js.native
  def getRoughCompassDirection(exact: java.lang.String): js.UndefOr[
    geolibLib.geolibLibStrings.S | geolibLib.geolibLibStrings.W | geolibLib.geolibLibStrings.E | geolibLib.geolibLibStrings.N
  ] = js.native
  def getSpeed(
    start: geolibLib.esTypesMod.GeolibInputCoordinatesWithTime,
    end: geolibLib.esTypesMod.GeolibInputCoordinatesWithTime
  ): scala.Double = js.native
  def getSpeed(
    start: geolibLib.esTypesMod.GeolibInputCoordinatesWithTime,
    end: geolibLib.esTypesMod.GeolibInputCoordinatesWithTime,
    distanceFn: geolibLib.esTypesMod.GeolibDistanceFn
  ): scala.Double = js.native
  def isDecimal(value: js.Any): scala.Boolean = js.native
  def isPointInLine(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    lineStart: geolibLib.esTypesMod.GeolibInputCoordinates,
    lineEnd: geolibLib.esTypesMod.GeolibInputCoordinates
  ): scala.Boolean = js.native
  def isPointInPolygon(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    polygon: js.Array[geolibLib.esTypesMod.GeolibInputCoordinates]
  ): scala.Boolean = js.native
  def isPointNearLine(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    start: geolibLib.esTypesMod.GeolibInputCoordinates,
    end: geolibLib.esTypesMod.GeolibInputCoordinates,
    distance: scala.Double
  ): scala.Boolean = js.native
  def isSexagesimal(value: js.Any): scala.Boolean = js.native
  def isValidCoordinate(point: geolibLib.esTypesMod.GeolibInputCoordinates): scala.Boolean = js.native
  def isValidLatitude(value: js.Any): scala.Boolean = js.native
  def isValidLongitude(value: js.Any): scala.Boolean = js.native
  def orderByDistance(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    coords: js.Array[geolibLib.esTypesMod.GeolibInputCoordinates]
  ): js.Array[geolibLib.esTypesMod.GeolibInputCoordinates] = js.native
  def orderByDistance(
    point: geolibLib.esTypesMod.GeolibInputCoordinates,
    coords: js.Array[geolibLib.esTypesMod.GeolibInputCoordinates],
    distanceFn: geolibLib.esOrderByDistanceMod.DistanceFn
  ): js.Array[geolibLib.esTypesMod.GeolibInputCoordinates] = js.native
  def sexagesimalToDecimal(sexagesimal: js.Any): scala.Double = js.native
  def toDecimal(value: js.Any): js.Any = js.native
  def toDeg(value: scala.Double): scala.Double = js.native
  def toRad(value: scala.Double): scala.Double = js.native
}

