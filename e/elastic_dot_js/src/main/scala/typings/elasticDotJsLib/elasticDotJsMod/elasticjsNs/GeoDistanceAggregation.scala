package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoDistanceAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): GeoDistanceAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): GeoDistanceAggregation
  /*
    Sets the point of origin from where distances will be measured. Same as
    origin.
    */
  def center(p: GeoPoint): GeoDistanceAggregation
  /*
    How to compute the distance. Valid values are:
    plane, arc, sloppy_arc, and factor.
    */
  def distanceType(`type`: java.lang.String): GeoDistanceAggregation
  /*
    Sets the field to gather terms from.
    */
  def field(field: java.lang.String): GeoDistanceAggregation
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: scala.Boolean): GeoDistanceAggregation
  /*
    Sets the point of origin from where distances will be measured.
    */
  def origin(p: GeoPoint): GeoDistanceAggregation
  /*
    Sets the point of origin from where distances will be measured. Same as
    origin.
    */
  def point(p: GeoPoint): GeoDistanceAggregation
  /*
    Adds a range to the list of exsiting range expressions.
    */
  def range(from: java.lang.String, to: java.lang.String, key: java.lang.String): GeoDistanceAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Sets the distance unit.  Valid values are:
    in, yd, ft, km, NM, mm, cm, mi, and m.
    */
  def unit(unit: java.lang.String): GeoDistanceAggregation
}

object GeoDistanceAggregation {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    agg: js.Function1[Aggregation, GeoDistanceAggregation],
    aggregation: js.Function1[Aggregation, GeoDistanceAggregation],
    center: js.Function1[GeoPoint, GeoDistanceAggregation],
    distanceType: js.Function1[java.lang.String, GeoDistanceAggregation],
    field: js.Function1[java.lang.String, GeoDistanceAggregation],
    keyed: js.Function1[scala.Boolean, GeoDistanceAggregation],
    origin: js.Function1[GeoPoint, GeoDistanceAggregation],
    point: js.Function1[GeoPoint, GeoDistanceAggregation],
    range: js.Function3[java.lang.String, java.lang.String, java.lang.String, GeoDistanceAggregation],
    toJSON: js.Function0[js.Any],
    unit: js.Function1[java.lang.String, GeoDistanceAggregation]
  ): GeoDistanceAggregation = {
    val __obj = js.Dynamic.literal(_type = _type, agg = agg, aggregation = aggregation, center = center, distanceType = distanceType, field = field, keyed = keyed, origin = origin, point = point, range = range, toJSON = toJSON, unit = unit)
  
    __obj.asInstanceOf[GeoDistanceAggregation]
  }
}

