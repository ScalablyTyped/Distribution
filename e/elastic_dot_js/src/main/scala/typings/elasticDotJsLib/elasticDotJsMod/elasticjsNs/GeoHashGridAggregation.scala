package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoHashGridAggregation extends Aggregation {
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
  def agg(agg: Aggregation): GeoHashGridAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): GeoHashGridAggregation
  /*
    Sets the geo field to perform calculations from.
    */
  def field(field: java.lang.String): GeoHashGridAggregation
  /*
    Sets the Geo Hash precision.  The precision value can be between 1 and 12
    where 12 is the highest precision.
    */
  def precision(p: scala.Double): GeoHashGridAggregation
  /*
    Determines how many geohash_grid the coordinating node will request from
    each shard.
    */
  def shardSize(shardSize: scala.Double): GeoHashGridAggregation
  /*
    Sets the number of aggregation entries that will be returned.
    */
  def size(size: scala.Double): GeoHashGridAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object GeoHashGridAggregation {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    agg: js.Function1[Aggregation, GeoHashGridAggregation],
    aggregation: js.Function1[Aggregation, GeoHashGridAggregation],
    field: js.Function1[java.lang.String, GeoHashGridAggregation],
    precision: js.Function1[scala.Double, GeoHashGridAggregation],
    shardSize: js.Function1[scala.Double, GeoHashGridAggregation],
    size: js.Function1[scala.Double, GeoHashGridAggregation],
    toJSON: js.Function0[js.Any]
  ): GeoHashGridAggregation = {
    val __obj = js.Dynamic.literal(_type = _type, agg = agg, aggregation = aggregation, field = field, precision = precision, shardSize = shardSize, size = size, toJSON = toJSON)
  
    __obj.asInstanceOf[GeoHashGridAggregation]
  }
}

