package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "GeoPoint")
@js.native
open class GeoPoint protected ()
  extends StObject
     with Geo {
  /*
    Defines a point
    */
  def this(p: js.Array[Any]) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the GeoPoint from an array point.  The array must contain only
    2 values.  The first value is the lat and the 2nd value is the lon.
    Example:
    [41.12, -71.34]
    */
  def array(a: js.Array[Any]): GeoPoint = js.native
  
  /*
    Sets the GeoPoint as a GeoHash.  The hash is a string of
    alpha-numeric characters with a precision length that defaults to 12.
    Example:
    "drm3btev3e86"
    */
  def geohash(hash: String, precision: Double): GeoPoint = js.native
  
  /*
    Sets the GeoPoint as properties on an object.  The object must have
    a 'lat' and 'lon' or a 'geohash' property.
    Example:
    {lat: 41.12, lon: -71.34} or {geohash: "drm3btev3e86"}
    */
  def properties(obj: js.Object): GeoPoint = js.native
  
  /*
    Sets the GeoPoint as a string.  The format is "lat,lon".
    Example:
    "41.12,-71.34"
    */
  def string(s: String): GeoPoint = js.native
  
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): Any = js.native
}
