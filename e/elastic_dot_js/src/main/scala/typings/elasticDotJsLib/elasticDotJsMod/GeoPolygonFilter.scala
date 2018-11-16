package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoPolygonFilter")
@js.native
class GeoPolygonFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPolygonFilter {
  /*
       Filter results to those which are contained within the polygon of points.
       */
  def this(fieldName: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Enable or disable caching of the filter
       */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPolygonFilter = js.native
  /*
       Sets the cache key.
       */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPolygonFilter = js.native
  /*
       Sets the fields to filter against.
       */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPolygonFilter = js.native
  /*
       Sets the filter name.
       */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPolygonFilter = js.native
  /*
       If the lat/long points should be normalized to lie within their
       respective normalized ranges.
  
       Normalized ranges are:
       lon = -180 (exclusive) to 180 (inclusive) range
       lat = -90 to 90 (both inclusive) range
       */
  /* CompleteClass */
  override def normalize(trueFalse: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPolygonFilter = js.native
  /*
       Sets a series of points that represent a polygon.  If passed a
       single GeoPoint object, it is added to the current
       list of points.  If passed an array of GeoPoint
       objects it replaces all current values.
       */
  /* CompleteClass */
  override def points(pointsArray: js.Array[_]): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPolygonFilter = js.native
  /*
       Returns the filter object.
       */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPolygonFilter = js.native
}

