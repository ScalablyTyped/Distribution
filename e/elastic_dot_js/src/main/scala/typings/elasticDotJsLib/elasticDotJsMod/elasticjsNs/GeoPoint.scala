package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GeoPoint extends Geo {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Sets the GeoPoint from an array point.  The array must contain only
       2 values.  The first value is the lat and the 2nd value is the lon.
  
       Example:
       [41.12, -71.34]
       */
  def array(a: js.Array[_]): GeoPoint
  /*
       Sets the GeoPoint as a GeoHash.  The hash is a string of
       alpha-numeric characters with a precision length that defaults to 12.
  
       Example:
       "drm3btev3e86"
       */
  def geohash(hash: java.lang.String, precision: scala.Double): GeoPoint
  /*
       Sets the GeoPoint as properties on an object.  The object must have
       a 'lat' and 'lon' or a 'geohash' property.
  
       Example:
       {lat: 41.12, lon: -71.34} or {geohash: "drm3btev3e86"}
       */
  def properties(obj: js.Object): GeoPoint
  /*
       Sets the GeoPoint as a string.  The format is "lat,lon".
  
       Example:
  
       "41.12,-71.34"
       */
  def string(s: java.lang.String): GeoPoint
  /*
       Retrieves the internal script object. This is typically used by
       internal API functions so use with caution.
       */
  def toJSON(): js.Any
}

