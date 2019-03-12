package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingAggregation extends Aggregation {
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
  def agg(agg: Aggregation): MissingAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): MissingAggregation
  /*
    Sets the field to gather missing terms from.
    */
  def field(field: java.lang.String): MissingAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object MissingAggregation {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    agg: Aggregation => MissingAggregation,
    aggregation: Aggregation => MissingAggregation,
    field: java.lang.String => MissingAggregation,
    toJSON: () => js.Any
  ): MissingAggregation = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), agg = js.Any.fromFunction1(agg), aggregation = js.Any.fromFunction1(aggregation), field = js.Any.fromFunction1(field), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[MissingAggregation]
  }
}

