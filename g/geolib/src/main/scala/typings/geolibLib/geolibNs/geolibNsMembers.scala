package typings
package geolibLib.geolibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("geolib")
@js.native
object geolibNsMembers extends js.Object {
  /** Computes the destination point given an initial point, a distance (in meters) and a bearing (in degrees). 
    * If no radius is given it defaults to the mean earth radius of 6371000 meter. 
    * 
    * Returns an object: `{"latitude": destLat, "longitude": destLng}` 
    * (Attention: this formula is not *100%* accurate (but very close though)) 
    */
  def computeDestinationPoint(start: PositionAsDecimal, distance: scala.Double, bearing: scala.Double): PositionAsDecimal = js.native
  /** Computes the destination point given an initial point, a distance (in meters) and a bearing (in degrees). 
    * If no radius is given it defaults to the mean earth radius of 6371000 meter. 
    * 
    * Returns an object: `{"latitude": destLat, "longitude": destLng}` 
    * (Attention: this formula is not *100%* accurate (but very close though)) 
    */
  def computeDestinationPoint(start: PositionAsDecimal, distance: scala.Double, bearing: scala.Double, radius: scala.Double): PositionAsDecimal = js.native
  /** Converts a given distance (in meters) to another unit. 
    * distance distance to be converted (source must be in meter). unit can be one of:
    * - m (meter)
    * - km (kilometers)
    * - cm (centimeters)
    * - mm (millimeters)
    * - mi (miles)
    * - sm (seamiles)
    * - ft (foot)
    * - in (inch)
    * - yd (yards)
    */
  def convertUnit(unit: java.lang.String, distance: scala.Double): scala.Double = js.native
  /** Converts a given distance (in meters) to another unit. 
    * distance distance to be converted (source must be in meter). unit can be one of:
    * - m (meter)
    * - km (kilometers)
    * - cm (centimeters)
    * - mm (millimeters)
    * - mi (miles)
    * - sm (seamiles)
    * - ft (foot)
    * - in (inch)
    * - yd (yards)
    */
  def convertUnit(unit: java.lang.String, distance: scala.Double, round: scala.Double): scala.Double = js.native
  /** Converts a decimal coordinate to sexagesimal format */
  def decimal2sexagesimal(coord: scala.Double): java.lang.String = js.native
  /** Returns the elevation for a given point and converts it to decimal. 
    * Works with: elevation, elev, alt, altitude, 2 (GeoJSON array) 
    */
  def elevation(latlng: js.Any): scala.Double = js.native
  /** Finds the nearest coordinate to a reference coordinate. */
  def findNearest(latlng: PositionAsDecimal, coords: js.Array[PositionAsDecimal]): js.Array[Distance] = js.native
  /** Gets great circle bearing of two points. See description of getRhumbLineBearing for more information. 
    * 
    * Returns calculated bearing as integer 
    */
  def getBearing(originLL: PositionAsDecimal, destLL: PositionAsDecimal): scala.Double = js.native
  /** Calculates the bounds of geo coordinates.
    * 
    * Returns maximum and minimum, latitude, longitude, and elevation (if provided) in form of an object 
    */
  def getBounds(coords: js.Array[PositionWithElevation]): Bound = js.native
  /** Calculates the geographical center of all points in a collection of geo coordinates 
    * Takes an object or array of coordinates and calculates the center of it. 
    */
  def getCenter(coords: js.Array[PositionAsDecimal]): PositionAsDecimal = js.native
  /** Calculates the center of the bounds of geo coordinates. Takes an array of coordinates, 
    * calculate the border of those, and gives back the center of that rectangle. On polygons 
    * like political borders (eg. states), this may gives a closer result to human expectation, 
    * than getCenter, because that function can be disturbed by uneven distribution of point in 
    * different sides. Imagine the US state Oklahoma: getCenter on that gives a southern point, 
    * because the southern border contains a lot more nodes, than the others. 
    */
  def getCenterOfBounds(coords: js.Array[PositionAsDecimal]): PositionAsDecimal = js.native
  /** Gets the compass direction from an origin coordinate (originLL) to a destination coordinate (destLL). 
    * Bearing mode. Can be either circle or rhumbline (default). 
    * 
    * Returns an object with a rough (NESW) and an exact direction (NNE, NE, ENE, E, ESE, etc).
    */
  def getCompassDirection(originLL: PositionAsDecimal, destLL: PositionAsDecimal): CompassDirection = js.native
  /** Gets the compass direction from an origin coordinate (originLL) to a destination coordinate (destLL). 
    * Bearing mode. Can be either circle or rhumbline (default). 
    * 
    * Returns an object with a rough (NESW) and an exact direction (NNE, NE, ENE, E, ESE, etc).
    */
  def getCompassDirection(originLL: PositionAsDecimal, destLL: PositionAsDecimal, bearingMode: java.lang.String): CompassDirection = js.native
  /** Calculates the distance between two geo coordinates
    * 
    * Return value is always float and represents the distance in meters.
    */
  def getDistance(start: PositionAsDecimal, end: PositionAsDecimal): scala.Double = js.native
  /** Calculates the distance between two geo coordinates
    * 
    * Return value is always float and represents the distance in meters.
    */
  def getDistance(start: PositionAsDecimal, end: PositionAsDecimal, accuracy: scala.Double, precision: scala.Double): scala.Double = js.native
  def getDistance(start: PositionAsDecimal, end: PositionAsSexadecimal): scala.Double = js.native
  def getDistance(
    start: PositionAsDecimal,
    end: PositionAsSexadecimal,
    accuracy: scala.Double,
    precision: scala.Double
  ): scala.Double = js.native
  def getDistance(start: PositionAsSexadecimal, end: PositionAsDecimal): scala.Double = js.native
  def getDistance(
    start: PositionAsSexadecimal,
    end: PositionAsDecimal,
    accuracy: scala.Double,
    precision: scala.Double
  ): scala.Double = js.native
  def getDistance(start: PositionAsSexadecimal, end: PositionAsSexadecimal): scala.Double = js.native
  def getDistance(
    start: PositionAsSexadecimal,
    end: PositionAsSexadecimal,
    accuracy: scala.Double,
    precision: scala.Double
  ): scala.Double = js.native
  /** Calculates the distance between two geo coordinates but this method is far more inaccurate as compared to getDistance.
    * It can take up 2 to 3 arguments. start, end and accuracy can be defined in the same as in getDistance.
    * 
    * Return value is always float that represents the distance in meters.
    */
  def getDistanceSimple(start: PositionAsDecimal, end: PositionAsDecimal): scala.Double = js.native
  /** Calculates the distance between two geo coordinates but this method is far more inaccurate as compared to getDistance.
    * It can take up 2 to 3 arguments. start, end and accuracy can be defined in the same as in getDistance.
    * 
    * Return value is always float that represents the distance in meters. 
    */
  def getDistanceSimple(start: PositionAsDecimal, end: PositionAsDecimal, accuracy: scala.Double): scala.Double = js.native
  def getDistanceSimple(start: PositionAsDecimal, end: PositionAsSexadecimal): scala.Double = js.native
  def getDistanceSimple(start: PositionAsDecimal, end: PositionAsSexadecimal, accuracy: scala.Double): scala.Double = js.native
  def getDistanceSimple(start: PositionAsSexadecimal, end: PositionAsDecimal): scala.Double = js.native
  def getDistanceSimple(start: PositionAsSexadecimal, end: PositionAsDecimal, accuracy: scala.Double): scala.Double = js.native
  def getDistanceSimple(start: PositionAsSexadecimal, end: PositionAsSexadecimal): scala.Double = js.native
  def getDistanceSimple(start: PositionAsSexadecimal, end: PositionAsSexadecimal, accuracy: scala.Double): scala.Double = js.native
  /** Calculates the length of a collection of coordinates.
    * 
    * Returns the length of the path in meters */
  def getPathLength(coords: js.Array[PositionAsDecimal]): scala.Double = js.native
  /** Gets rhumb line bearing of two points. Find out about the difference between rhumb line and great circle bearing on Wikipedia. 
    * Rhumb line should be fine in most cases: http://en.wikipedia.org/wiki/Rhumb_line#General_and_mathematical_description Function 
    * is heavily based on Doug Vanderweide's great PHP version (licensed under GPL 3.0) 
    * http://www.dougv.com/2009/07/13/calculating-the-bearing-and-compass-rose-direction-between-two-latitude-longitude-coordinates-in-php/ 
    * 
    * Returns calculated bearing as integer. 
    */
  def getRhumbLineBearing(originLL: PositionAsDecimal, destLL: PositionAsDecimal): scala.Double = js.native
  /** Calculates the speed between two points within a given time span. 
    * 
    * Returns the speed in options.unit (default is km/h). 
    */
  def getSpeed(coords: js.Array[PositionInTime]): scala.Double = js.native
  /** Calculates the speed between two points within a given time span. 
    * 
    * Returns the speed in options.unit (default is km/h). 
    */
  def getSpeed(coords: js.Array[PositionInTime], option: SpeedOption): scala.Double = js.native
  /** Similar to is point inside: checks whether a point is inside of a circle or not. 
    * 
    * Returns true or false 
    */
  def isPointInCircle(latlng: PositionAsDecimal, center: PositionAsDecimal, radius: scala.Double): scala.Boolean = js.native
  /** Calculates if given point lies in a line formed by start and end */
  def isPointInLine(point: PositionAsDecimal, start: PositionAsDecimal, end: PositionAsDecimal): scala.Boolean = js.native
  /** Checks whether a point is inside of a polygon or not. Note: the polygon coords must be in correct order! 
    * 
    * Returns true or false 
    */
  def isPointInside(latlng: PositionAsDecimal, polygon: js.Array[PositionAsDecimal]): scala.Boolean = js.native
  /** Returns the latitude for a given point and converts it to decimal. 
    * Works with: latitude, lat, 1 (GeoJSON array) 
    */
  def latitude(latlng: js.Any): scala.Double = js.native
  /** Returns the longitude for a given point and converts it to decimal. 
    * Works with: longitude, lng, lon, 0 (GeoJSON array) 
    */
  def longitude(latlng: js.Any): scala.Double = js.native
  /** Sorts an object or array of coords by distance from a reference coordinate */
  def orderByDistance(latlng: PositionAsDecimal, coords: js.Array[PositionAsDecimal]): js.Array[Distance] = js.native
  /** Converts a sexagesimal coordinate to decimal format */
  def sexagesimal2decimal(coord: java.lang.String): scala.Double = js.native
  /** Checks if a coordinate is already in decimal format and, if not, converts it to */
  def useDecimal(latlng: java.lang.String): scala.Double = js.native
  def useDecimal(latlng: scala.Double): scala.Double = js.native
}

