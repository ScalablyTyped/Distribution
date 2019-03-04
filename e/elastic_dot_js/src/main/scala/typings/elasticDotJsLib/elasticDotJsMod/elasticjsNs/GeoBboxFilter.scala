package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoBboxFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the bottom-right coordinate of the bounding box
    */
  def bottomRight(p: GeoPoint): GeoBboxFilter
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): GeoBboxFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): GeoBboxFilter
  /*
    Sets the fields to filter against.
    */
  def field(f: java.lang.String): GeoBboxFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): GeoBboxFilter
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  def normalize(trueFalse: java.lang.String): GeoBboxFilter
  /*
    Returns the filter object.
    */
  def toJSON(): GeoBboxFilter
  /*
    Sets the top-left coordinate of the bounding box
    */
  def topLeft(p: GeoPoint): GeoBboxFilter
  /*
    Sets the type of the bounding box execution. Valid values are
    "memory" and "indexed".  Default is memory.
    */
  def `type`(`type`: java.lang.String): GeoBboxFilter
}

object GeoBboxFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    bottomRight: js.Function1[GeoPoint, GeoBboxFilter],
    cache: js.Function1[scala.Boolean, GeoBboxFilter],
    cacheKey: js.Function1[java.lang.String, GeoBboxFilter],
    field: js.Function1[java.lang.String, GeoBboxFilter],
    name: js.Function1[java.lang.String, GeoBboxFilter],
    normalize: js.Function1[java.lang.String, GeoBboxFilter],
    toJSON: js.Function0[GeoBboxFilter],
    topLeft: js.Function1[GeoPoint, GeoBboxFilter],
    `type`: js.Function1[java.lang.String, GeoBboxFilter]
  ): GeoBboxFilter = {
    val __obj = js.Dynamic.literal(_type = _type, bottomRight = bottomRight, cache = cache, cacheKey = cacheKey, field = field, name = name, normalize = normalize, toJSON = toJSON, topLeft = topLeft)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GeoBboxFilter]
  }
}

