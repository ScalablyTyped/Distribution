package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterAggregation extends Aggregation {
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
  def agg(agg: Aggregation): FilterAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): FilterAggregation
  /*
    Sets the filter to be used for this aggregation.
    */
  def filter(oFilter: Filter): FilterAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object FilterAggregation {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    agg: js.Function1[Aggregation, FilterAggregation],
    aggregation: js.Function1[Aggregation, FilterAggregation],
    filter: js.Function1[Filter, FilterAggregation],
    toJSON: js.Function0[js.Any]
  ): FilterAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("agg")(agg)
    __obj.updateDynamic("aggregation")(aggregation)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[FilterAggregation]
  }
}

