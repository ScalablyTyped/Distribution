package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoShapeFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): GeoShapeFilter
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): GeoShapeFilter
  /*
    Sets the field to filter against.
    */
  def field(f: java.lang.String): GeoShapeFilter
  /*
    Sets the indexed shape.  Use this if you already have shape definitions
    already indexed.
    */
  def indexedShape(indexedShape: java.lang.String): GeoShapeFilter
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): GeoShapeFilter
  /*
    Sets the shape relation type.  A relationship between a Query Shape
    and indexed Shapes that will be used to determine if a Document
    should be matched or not.  Valid values are:  intersects, disjoint,
    and within.
    */
  def relation(indexedShape: java.lang.String): GeoShapeFilter
  /*
    Sets the shape
    */
  def shape(shape: java.lang.String): GeoShapeFilter
  /*
    Sets the spatial strategy.
    Valid values are:
    recursive - default, recursively traverse nodes in
    the spatial prefix tree.  This strategy has support for
    searching non-point shapes.
    term - uses a large TermsFilter on each node
    in the spatial prefix tree.  It only supports the search of
    indexed Point shapes.
    This is an advanced setting, use with care.
    */
  def strategy(strategy: java.lang.String): GeoShapeFilter
  /*
    Returns the filter object.
    */
  def toJSON(): GeoShapeFilter
}

object GeoShapeFilter {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    cache: js.Function1[scala.Boolean, GeoShapeFilter],
    cacheKey: js.Function1[java.lang.String, GeoShapeFilter],
    field: js.Function1[java.lang.String, GeoShapeFilter],
    indexedShape: js.Function1[java.lang.String, GeoShapeFilter],
    name: js.Function1[java.lang.String, GeoShapeFilter],
    relation: js.Function1[java.lang.String, GeoShapeFilter],
    shape: js.Function1[java.lang.String, GeoShapeFilter],
    strategy: js.Function1[java.lang.String, GeoShapeFilter],
    toJSON: js.Function0[GeoShapeFilter]
  ): GeoShapeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("indexedShape")(indexedShape)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("relation")(relation)
    __obj.updateDynamic("shape")(shape)
    __obj.updateDynamic("strategy")(strategy)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[GeoShapeFilter]
  }
}

