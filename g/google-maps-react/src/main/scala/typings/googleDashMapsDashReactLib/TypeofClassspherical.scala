package typings
package googleDashMapsDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassspherical
  extends org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.geometryNs.spherical] {
  def computeArea(path: googlemapsLib.googleNs.mapsNs.MVCArray[googlemapsLib.googleNs.mapsNs.LatLng]): scala.Double = js.native
  def computeArea(
    path: googlemapsLib.googleNs.mapsNs.MVCArray[googlemapsLib.googleNs.mapsNs.LatLng],
    radius: scala.Double
  ): scala.Double = js.native
  /**
    * Returns the area of a closed path.
    * The computed area uses the same units as the radius.
    * The radius defaults to the Earth's radius in meters,
    * in which case the area is in square meters.
    */
  def computeArea(path: js.Array[googlemapsLib.googleNs.mapsNs.LatLng]): scala.Double = js.native
  def computeArea(path: js.Array[googlemapsLib.googleNs.mapsNs.LatLng], radius: scala.Double): scala.Double = js.native
  /**
    * Returns the distance, in meters, between two LatLngs.
    * You can optionally specify a custom radius.
    * The radius defaults to the radius of the Earth.
    */
  def computeDistanceBetween(from: googlemapsLib.googleNs.mapsNs.LatLng, to: googlemapsLib.googleNs.mapsNs.LatLng): scala.Double = js.native
  def computeDistanceBetween(
    from: googlemapsLib.googleNs.mapsNs.LatLng,
    to: googlemapsLib.googleNs.mapsNs.LatLng,
    radius: scala.Double
  ): scala.Double = js.native
  /**
    * Returns the heading from one LatLng to another LatLng.
    * Headings are expressed in degrees clockwise from North within the range
    * [-180,180).
    */
  def computeHeading(from: googlemapsLib.googleNs.mapsNs.LatLng, to: googlemapsLib.googleNs.mapsNs.LatLng): scala.Double = js.native
  def computeLength(path: googlemapsLib.googleNs.mapsNs.MVCArray[googlemapsLib.googleNs.mapsNs.LatLng]): scala.Double = js.native
  def computeLength(
    path: googlemapsLib.googleNs.mapsNs.MVCArray[googlemapsLib.googleNs.mapsNs.LatLng],
    radius: scala.Double
  ): scala.Double = js.native
  /**
    * Returns the length of the given path.
    */
  def computeLength(path: js.Array[googlemapsLib.googleNs.mapsNs.LatLng]): scala.Double = js.native
  def computeLength(path: js.Array[googlemapsLib.googleNs.mapsNs.LatLng], radius: scala.Double): scala.Double = js.native
  /**
    * Returns the LatLng resulting from moving a distance from an origin in
    * the specified heading (expressed in degrees clockwise from north).
    */
  def computeOffset(from: googlemapsLib.googleNs.mapsNs.LatLng, distance: scala.Double, heading: scala.Double): googlemapsLib.googleNs.mapsNs.LatLng = js.native
  def computeOffset(
    from: googlemapsLib.googleNs.mapsNs.LatLng,
    distance: scala.Double,
    heading: scala.Double,
    radius: scala.Double
  ): googlemapsLib.googleNs.mapsNs.LatLng = js.native
  /**
    * Returns the location of origin when provided with a LatLng destination,
    * meters travelled and original heading. Headings are expressed in
    * degrees clockwise from North. This function returns null when no
    * solution is available.
    */
  def computeOffsetOrigin(to: googlemapsLib.googleNs.mapsNs.LatLng, distance: scala.Double, heading: scala.Double): googlemapsLib.googleNs.mapsNs.LatLng = js.native
  def computeOffsetOrigin(
    to: googlemapsLib.googleNs.mapsNs.LatLng,
    distance: scala.Double,
    heading: scala.Double,
    radius: scala.Double
  ): googlemapsLib.googleNs.mapsNs.LatLng = js.native
  def computeSignedArea(loop: googlemapsLib.googleNs.mapsNs.MVCArray[googlemapsLib.googleNs.mapsNs.LatLng]): scala.Double = js.native
  def computeSignedArea(
    loop: googlemapsLib.googleNs.mapsNs.MVCArray[googlemapsLib.googleNs.mapsNs.LatLng],
    radius: scala.Double
  ): scala.Double = js.native
  /**
    * Returns the signed area of a closed path. The signed area may be used
    * to determine the orientation of the path. The computed area uses the
    * same units as the radius. The radius defaults to the Earth's radius in
    * meters, in which case the area is in square meters.
    */
  def computeSignedArea(loop: js.Array[googlemapsLib.googleNs.mapsNs.LatLng]): scala.Double = js.native
  def computeSignedArea(loop: js.Array[googlemapsLib.googleNs.mapsNs.LatLng], radius: scala.Double): scala.Double = js.native
  /**
    * Returns the LatLng which lies the given fraction of the way between the
    * origin LatLng and the destination LatLng.
    */
  def interpolate(
    from: googlemapsLib.googleNs.mapsNs.LatLng,
    to: googlemapsLib.googleNs.mapsNs.LatLng,
    fraction: scala.Double
  ): googlemapsLib.googleNs.mapsNs.LatLng = js.native
}

