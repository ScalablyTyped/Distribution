package typings.elasticDotJs.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoHashGridAggregation")
@js.native
class GeoHashGridAggregation protected () extends Aggregation {
  /*
    Aggregation that works on geo_point fields and groups points into buckets
    that represent cells in a grid.
    */
  def this(name: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): GeoHashGridAggregation = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): GeoHashGridAggregation = js.native
  /*
    Sets the geo field to perform calculations from.
    */
  def field(field: String): GeoHashGridAggregation = js.native
  /*
    Sets the Geo Hash precision.  The precision value can be between 1 and 12
    where 12 is the highest precision.
    */
  def precision(p: Double): GeoHashGridAggregation = js.native
  /*
    Determines how many geohash_grid the coordinating node will request from
    each shard.
    */
  def shardSize(shardSize: Double): GeoHashGridAggregation = js.native
  /*
    Sets the number of aggregation entries that will be returned.
    */
  def size(size: Double): GeoHashGridAggregation = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

