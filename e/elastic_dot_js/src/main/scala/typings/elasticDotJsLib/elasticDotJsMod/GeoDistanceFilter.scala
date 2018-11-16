package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoDistanceFilter")
@js.native
class GeoDistanceFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter {
  /*
       Filter results to those which fall within the given distance of the point of origin.
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
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter = js.native
  /*
       Sets the cache key.
       */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter = js.native
  /*
       Sets the numeric distance to be used.  The distance can be a
       numeric value, and then the unit (either mi or km can be set)
       controlling the unit. Or a single string with the unit as well.
       */
  /* CompleteClass */
  override def distance(numericDistance: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter = js.native
  /*
       How to compute the distance. Can either be arc (better precision)
       or plane (faster). Defaults to arc.
       */
  /* CompleteClass */
  override def distanceType(`type`: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter = js.native
  /*
       Sets the fields to filter against.
       */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter = js.native
  /*
       Sets the filter name.
       */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter = js.native
  /*
       If the lat/long points should be normalized to lie within their
       respective normalized ranges.
  
       Normalized ranges are:
       lon = -180 (exclusive) to 180 (inclusive) range
       lat = -90 to 90 (both inclusive) range
       */
  /* CompleteClass */
  override def normalize(trueFalse: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter = js.native
  /*
       Will an optimization of using first a bounding box check will be
       used. Defaults to memory which will do in memory checks. Can also
       have values of indexed to use indexed value check, or none which
       disables bounding box optimization.
       */
  /* CompleteClass */
  override def optimizeBbox(t: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter = js.native
  /*
       Sets the point of origin in which distance will be measured from
       */
  /* CompleteClass */
  override def point(p: elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter = js.native
  /*
       Returns the filter object.
       */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter = js.native
  /*
       Sets the distance unit.  Valid values are "mi" for miles or "km"
       for kilometers. Defaults to "km".
       */
  /* CompleteClass */
  override def unit(unit: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFilter = js.native
}

