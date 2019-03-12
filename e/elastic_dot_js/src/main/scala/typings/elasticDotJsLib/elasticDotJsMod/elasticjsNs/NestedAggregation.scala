package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedAggregation extends Aggregation {
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
  def agg(agg: Aggregation): NestedAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): NestedAggregation
  /*
    Sets the nested path.
    */
  def path(path: java.lang.String): NestedAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object NestedAggregation {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    agg: Aggregation => NestedAggregation,
    aggregation: Aggregation => NestedAggregation,
    path: java.lang.String => NestedAggregation,
    toJSON: () => js.Any
  ): NestedAggregation = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), agg = js.Any.fromFunction1(agg), aggregation = js.Any.fromFunction1(aggregation), path = js.Any.fromFunction1(path), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[NestedAggregation]
  }
}

