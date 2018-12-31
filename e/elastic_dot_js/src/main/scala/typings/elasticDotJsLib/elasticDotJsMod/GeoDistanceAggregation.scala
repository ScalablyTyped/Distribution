package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoDistanceAggregation")
@js.native
class GeoDistanceAggregation protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceAggregation {
  /*
    Aggregation that works on geo_point fields and conceptually works very
    similar to the range aggregation.
    */
  def this(name: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  /* CompleteClass */
  override def agg(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceAggregation = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  /* CompleteClass */
  override def aggregation(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceAggregation = js.native
  /*
    Sets the point of origin from where distances will be measured. Same as
    origin.
    */
  /* CompleteClass */
  override def center(p: elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceAggregation = js.native
  /*
    How to compute the distance. Valid values are:
    plane, arc, sloppy_arc, and factor.
    */
  /* CompleteClass */
  override def distanceType(`type`: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceAggregation = js.native
  /*
    Sets the field to gather terms from.
    */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceAggregation = js.native
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  /* CompleteClass */
  override def keyed(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceAggregation = js.native
  /*
    Sets the point of origin from where distances will be measured.
    */
  /* CompleteClass */
  override def origin(p: elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceAggregation = js.native
  /*
    Sets the point of origin from where distances will be measured. Same as
    origin.
    */
  /* CompleteClass */
  override def point(p: elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceAggregation = js.native
  /*
    Adds a range to the list of exsiting range expressions.
    */
  /* CompleteClass */
  override def range(from: java.lang.String, to: java.lang.String, key: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceAggregation = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /*
    Sets the distance unit.  Valid values are:
    in, yd, ft, km, NM, mm, cm, mi, and m.
    */
  /* CompleteClass */
  override def unit(unit: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceAggregation = js.native
}

