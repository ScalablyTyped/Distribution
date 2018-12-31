package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoHashGridAggregation")
@js.native
class GeoHashGridAggregation protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoHashGridAggregation {
  /*
    Aggregation that works on geo_point fields and groups points into buckets
    that represent cells in a grid.
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
  override def agg(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoHashGridAggregation = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  /* CompleteClass */
  override def aggregation(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoHashGridAggregation = js.native
  /*
    Sets the geo field to perform calculations from.
    */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoHashGridAggregation = js.native
  /*
    Sets the Geo Hash precision.  The precision value can be between 1 and 12
    where 12 is the highest precision.
    */
  /* CompleteClass */
  override def precision(p: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoHashGridAggregation = js.native
  /*
    Determines how many geohash_grid the coordinating node will request from
    each shard.
    */
  /* CompleteClass */
  override def shardSize(shardSize: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoHashGridAggregation = js.native
  /*
    Sets the number of aggregation entries that will be returned.
    */
  /* CompleteClass */
  override def size(size: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoHashGridAggregation = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

