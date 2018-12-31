package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoBboxFilter")
@js.native
class GeoBboxFilter protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoBboxFilter {
  /*
    Filter results to those which are contained within the defined bounding box.
    */
  def this(fieldName: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the bottom-right coordinate of the bounding box
    */
  /* CompleteClass */
  override def bottomRight(p: elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoBboxFilter = js.native
  /*
    Enable or disable caching of the filter
    */
  /* CompleteClass */
  override def cache(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoBboxFilter = js.native
  /*
    Sets the cache key.
    */
  /* CompleteClass */
  override def cacheKey(key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoBboxFilter = js.native
  /*
    Sets the fields to filter against.
    */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoBboxFilter = js.native
  /*
    Sets the filter name.
    */
  /* CompleteClass */
  override def name(name: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoBboxFilter = js.native
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  /* CompleteClass */
  override def normalize(trueFalse: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoBboxFilter = js.native
  /*
    Returns the filter object.
    */
  /* CompleteClass */
  override def toJSON(): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoBboxFilter = js.native
  /*
    Sets the top-left coordinate of the bounding box
    */
  /* CompleteClass */
  override def topLeft(p: elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoBboxFilter = js.native
  /*
    Sets the type of the bounding box execution. Valid values are
    "memory" and "indexed".  Default is memory.
    */
  /* CompleteClass */
  override def `type`(`type`: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoBboxFilter = js.native
}

